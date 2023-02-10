/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.checkout.JSON;

/**
 * AdditionalDataWallets
 */

public class AdditionalDataWallets {
  public static final String SERIALIZED_NAME_ANDROIDPAY_TOKEN = "androidpay.token";
  @SerializedName(SERIALIZED_NAME_ANDROIDPAY_TOKEN)
  private String androidpayToken;

  public static final String SERIALIZED_NAME_MASTERPASS_TRANSACTION_ID = "masterpass.transactionId";
  @SerializedName(SERIALIZED_NAME_MASTERPASS_TRANSACTION_ID)
  private String masterpassTransactionId;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "payment.token";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  public static final String SERIALIZED_NAME_PAYWITHGOOGLE_TOKEN = "paywithgoogle.token";
  @SerializedName(SERIALIZED_NAME_PAYWITHGOOGLE_TOKEN)
  private String paywithgoogleToken;

  public static final String SERIALIZED_NAME_SAMSUNGPAY_TOKEN = "samsungpay.token";
  @SerializedName(SERIALIZED_NAME_SAMSUNGPAY_TOKEN)
  private String samsungpayToken;

  public static final String SERIALIZED_NAME_VISACHECKOUT_CALL_ID = "visacheckout.callId";
  @SerializedName(SERIALIZED_NAME_VISACHECKOUT_CALL_ID)
  private String visacheckoutCallId;

  public AdditionalDataWallets() { 
  }

  public AdditionalDataWallets androidpayToken(String androidpayToken) {
    
    this.androidpayToken = androidpayToken;
    return this;
  }

   /**
   * The Android Pay token retrieved from the SDK.
   * @return androidpayToken
  **/
  @ApiModelProperty(value = "The Android Pay token retrieved from the SDK.")

  public String getAndroidpayToken() {
    return androidpayToken;
  }


  public void setAndroidpayToken(String androidpayToken) {
    this.androidpayToken = androidpayToken;
  }


  public AdditionalDataWallets masterpassTransactionId(String masterpassTransactionId) {
    
    this.masterpassTransactionId = masterpassTransactionId;
    return this;
  }

   /**
   * The Mastercard Masterpass Transaction ID retrieved from the SDK.
   * @return masterpassTransactionId
  **/
  @ApiModelProperty(value = "The Mastercard Masterpass Transaction ID retrieved from the SDK.")

  public String getMasterpassTransactionId() {
    return masterpassTransactionId;
  }


  public void setMasterpassTransactionId(String masterpassTransactionId) {
    this.masterpassTransactionId = masterpassTransactionId;
  }


  public AdditionalDataWallets paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The Apple Pay token retrieved from the SDK.
   * @return paymentToken
  **/
  @ApiModelProperty(value = "The Apple Pay token retrieved from the SDK.")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public AdditionalDataWallets paywithgoogleToken(String paywithgoogleToken) {
    
    this.paywithgoogleToken = paywithgoogleToken;
    return this;
  }

   /**
   * The Google Pay token retrieved from the SDK.
   * @return paywithgoogleToken
  **/
  @ApiModelProperty(value = "The Google Pay token retrieved from the SDK.")

  public String getPaywithgoogleToken() {
    return paywithgoogleToken;
  }


  public void setPaywithgoogleToken(String paywithgoogleToken) {
    this.paywithgoogleToken = paywithgoogleToken;
  }


  public AdditionalDataWallets samsungpayToken(String samsungpayToken) {
    
    this.samsungpayToken = samsungpayToken;
    return this;
  }

   /**
   * The Samsung Pay token retrieved from the SDK.
   * @return samsungpayToken
  **/
  @ApiModelProperty(value = "The Samsung Pay token retrieved from the SDK.")

  public String getSamsungpayToken() {
    return samsungpayToken;
  }


  public void setSamsungpayToken(String samsungpayToken) {
    this.samsungpayToken = samsungpayToken;
  }


  public AdditionalDataWallets visacheckoutCallId(String visacheckoutCallId) {
    
    this.visacheckoutCallId = visacheckoutCallId;
    return this;
  }

   /**
   * The Visa Checkout Call ID retrieved from the SDK.
   * @return visacheckoutCallId
  **/
  @ApiModelProperty(value = "The Visa Checkout Call ID retrieved from the SDK.")

  public String getVisacheckoutCallId() {
    return visacheckoutCallId;
  }


  public void setVisacheckoutCallId(String visacheckoutCallId) {
    this.visacheckoutCallId = visacheckoutCallId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataWallets additionalDataWallets = (AdditionalDataWallets) o;
    return Objects.equals(this.androidpayToken, additionalDataWallets.androidpayToken) &&
        Objects.equals(this.masterpassTransactionId, additionalDataWallets.masterpassTransactionId) &&
        Objects.equals(this.paymentToken, additionalDataWallets.paymentToken) &&
        Objects.equals(this.paywithgoogleToken, additionalDataWallets.paywithgoogleToken) &&
        Objects.equals(this.samsungpayToken, additionalDataWallets.samsungpayToken) &&
        Objects.equals(this.visacheckoutCallId, additionalDataWallets.visacheckoutCallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidpayToken, masterpassTransactionId, paymentToken, paywithgoogleToken, samsungpayToken, visacheckoutCallId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataWallets {\n");
    sb.append("    androidpayToken: ").append(toIndentedString(androidpayToken)).append("\n");
    sb.append("    masterpassTransactionId: ").append(toIndentedString(masterpassTransactionId)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paywithgoogleToken: ").append(toIndentedString(paywithgoogleToken)).append("\n");
    sb.append("    samsungpayToken: ").append(toIndentedString(samsungpayToken)).append("\n");
    sb.append("    visacheckoutCallId: ").append(toIndentedString(visacheckoutCallId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("androidpay.token");
    openapiFields.add("masterpass.transactionId");
    openapiFields.add("payment.token");
    openapiFields.add("paywithgoogle.token");
    openapiFields.add("samsungpay.token");
    openapiFields.add("visacheckout.callId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalDataWallets
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalDataWallets.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalDataWallets is not found in the empty JSON string", AdditionalDataWallets.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalDataWallets.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalDataWallets` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field androidpay.token
      if (jsonObj.get("androidpay.token") != null && !jsonObj.get("androidpay.token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `androidpay.token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("androidpay.token").toString()));
      }
      // validate the optional field masterpass.transactionId
      if (jsonObj.get("masterpass.transactionId") != null && !jsonObj.get("masterpass.transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masterpass.transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masterpass.transactionId").toString()));
      }
      // validate the optional field payment.token
      if (jsonObj.get("payment.token") != null && !jsonObj.get("payment.token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment.token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment.token").toString()));
      }
      // validate the optional field paywithgoogle.token
      if (jsonObj.get("paywithgoogle.token") != null && !jsonObj.get("paywithgoogle.token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paywithgoogle.token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paywithgoogle.token").toString()));
      }
      // validate the optional field samsungpay.token
      if (jsonObj.get("samsungpay.token") != null && !jsonObj.get("samsungpay.token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `samsungpay.token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("samsungpay.token").toString()));
      }
      // validate the optional field visacheckout.callId
      if (jsonObj.get("visacheckout.callId") != null && !jsonObj.get("visacheckout.callId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visacheckout.callId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visacheckout.callId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalDataWallets.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalDataWallets' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalDataWallets> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalDataWallets.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalDataWallets>() {
           @Override
           public void write(JsonWriter out, AdditionalDataWallets value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalDataWallets read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalDataWallets given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalDataWallets
  * @throws IOException if the JSON string is invalid with respect to AdditionalDataWallets
  */
  public static AdditionalDataWallets fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalDataWallets.class);
  }

 /**
  * Convert an instance of AdditionalDataWallets to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

