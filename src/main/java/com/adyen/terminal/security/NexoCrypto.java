/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2019 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */

package com.adyen.terminal.security;

import com.adyen.model.nexo.MessageHeader;
import com.adyen.model.terminal.security.NexoDerivedKey;
import com.adyen.model.terminal.security.SaleToPOISecuredMessage;
import com.adyen.model.terminal.security.SecurityKey;
import com.adyen.model.terminal.security.SecurityTrailer;
import com.adyen.terminal.security.exception.NexoCryptoException;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import static com.adyen.model.terminal.security.NexoDerivedKey.NEXO_IV_LENGTH;

public class NexoCrypto {

    private final SecurityKey securityKey;
    private volatile NexoDerivedKey nexoDerivedKey;

    public NexoCrypto(SecurityKey securityKey) throws NexoCryptoException {
        validateSecurityKey(securityKey);
        this.securityKey = securityKey;
    }

    public SaleToPOISecuredMessage encrypt(String saleToPoiMessageJson, MessageHeader messageHeader) throws GeneralSecurityException {
        NexoDerivedKey derivedKey = getNexoDerivedKey();
        byte[] saleToPoiMessageByteArray = saleToPoiMessageJson.getBytes(StandardCharsets.UTF_8);
        byte[] ivNonce = generateRandomIvNonce();
        byte[] encryptedSaleToPoiMessage = crypt(saleToPoiMessageByteArray, derivedKey, ivNonce, Cipher.ENCRYPT_MODE);
        byte[] encryptedSaleToPoiMessageHmac = hmac(saleToPoiMessageByteArray, derivedKey);

        SecurityTrailer securityTrailer = new SecurityTrailer();
        securityTrailer.setKeyVersion(securityKey.getKeyVersion());
        securityTrailer.setKeyIdentifier(securityKey.getKeyIdentifier());
        securityTrailer.setHmac(encryptedSaleToPoiMessageHmac);
        securityTrailer.setNonce(ivNonce);
        securityTrailer.setAdyenCryptoVersion(securityKey.getAdyenCryptoVersion());

        SaleToPOISecuredMessage saleToPoiSecuredMessage = new SaleToPOISecuredMessage();
        saleToPoiSecuredMessage.setMessageHeader(messageHeader);
        saleToPoiSecuredMessage.setNexoBlob(new String(Base64.encodeBase64(encryptedSaleToPoiMessage)));
        saleToPoiSecuredMessage.setSecurityTrailer(securityTrailer);

        return saleToPoiSecuredMessage;
    }

    public String decrypt(SaleToPOISecuredMessage saleToPoiSecuredMessage) throws GeneralSecurityException, NexoCryptoException {
        NexoDerivedKey derivedKey = getNexoDerivedKey();
        byte[] encryptedSaleToPoiMessageByteArray = Base64.decodeBase64(saleToPoiSecuredMessage.getNexoBlob().getBytes());
        byte[] ivNonce = saleToPoiSecuredMessage.getSecurityTrailer().getNonce();
        byte[] decryptedSaleToPoiMessageByteArray = crypt(encryptedSaleToPoiMessageByteArray, derivedKey, ivNonce, Cipher.DECRYPT_MODE);

        byte[] receivedHmac = saleToPoiSecuredMessage.getSecurityTrailer().getHmac();
        validateHmac(receivedHmac, decryptedSaleToPoiMessageByteArray, derivedKey);

        return new String(decryptedSaleToPoiMessageByteArray, StandardCharsets.UTF_8);
    }

    private void validateSecurityKey(SecurityKey securityKey) throws NexoCryptoException {
        if (securityKey == null
                || securityKey.getPassphrase() == null
                || securityKey.getPassphrase().isEmpty()
                || securityKey.getKeyIdentifier() == null
                || securityKey.getKeyVersion() == null
                || securityKey.getAdyenCryptoVersion() == null) {
            throw new NexoCryptoException("Invalid Security Key");
        }
    }

    private NexoDerivedKey getNexoDerivedKey() throws GeneralSecurityException {
        if (nexoDerivedKey == null) {
            synchronized (this) {
                if (nexoDerivedKey == null) {
                    nexoDerivedKey = NexoDerivedKeyGenerator.deriveKeyMaterial(securityKey.getPassphrase());
                }
            }
        }
        return nexoDerivedKey;
    }

    private byte[] crypt(byte[] bytes, NexoDerivedKey dk, byte[] ivNonce, int mode)
            throws NoSuchAlgorithmException, NoSuchPaddingException,
            IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(dk.getCipherKey(), "AES");

        byte[] iv = dk.getIv();
        byte[] actualIV = new byte[NEXO_IV_LENGTH];
        for (int i = 0; i < NEXO_IV_LENGTH; i++) {
            actualIV[i] = (byte) (iv[i] ^ ivNonce[i]);
        }

        IvParameterSpec ivParameterSpec = new IvParameterSpec(actualIV);
        cipher.init(mode, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bytes);
    }

    private byte[] hmac(byte[] bytes, NexoDerivedKey derivedKey) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec s = new SecretKeySpec(derivedKey.getHmacKey(), "HmacSHA256");

        mac.init(s);
        return mac.doFinal(bytes);
    }

    private void validateHmac(byte[] receivedHmac, byte[] decryptedMessage, NexoDerivedKey derivedKey) throws NexoCryptoException, InvalidKeyException, NoSuchAlgorithmException {
        byte[] hmac = hmac(decryptedMessage, derivedKey);
        boolean valid = MessageDigest.isEqual(hmac, receivedHmac);

        if (!valid) {
            throw new NexoCryptoException("HMAC validation failed");
        }
    }

    private byte[] generateRandomIvNonce() {
        byte[] ivNonce = new byte[NEXO_IV_LENGTH];
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("NativePRNGNonBlocking");
        } catch (NoSuchAlgorithmException e) {
            secureRandom = new SecureRandom();
        }
        secureRandom.nextBytes(ivNonce);
        return ivNonce;
    }
}