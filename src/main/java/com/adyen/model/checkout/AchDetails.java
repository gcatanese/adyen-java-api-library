/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * AchDetails
 */
@JsonPropertyOrder({
  AchDetails.JSON_PROPERTY_BANK_ACCOUNT_NUMBER,
  AchDetails.JSON_PROPERTY_BANK_ACCOUNT_TYPE,
  AchDetails.JSON_PROPERTY_BANK_LOCATION_ID,
  AchDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  AchDetails.JSON_PROPERTY_ENCRYPTED_BANK_ACCOUNT_NUMBER,
  AchDetails.JSON_PROPERTY_ENCRYPTED_BANK_LOCATION_ID,
  AchDetails.JSON_PROPERTY_OWNER_NAME,
  AchDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  AchDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  AchDetails.JSON_PROPERTY_TRANSFER_INSTRUMENT_ID,
  AchDetails.JSON_PROPERTY_TYPE
})

public class AchDetails {
  public static final String JSON_PROPERTY_BANK_ACCOUNT_NUMBER = "bankAccountNumber";
  private String bankAccountNumber;

  /**
   * The bank account type (checking, savings...).
   */
  public enum BankAccountTypeEnum {
    BALANCE("balance"),
    
    CHECKING("checking"),
    
    DEPOSIT("deposit"),
    
    GENERAL("general"),
    
    OTHER("other"),
    
    PAYMENT("payment"),
    
    SAVINGS("savings");

    private String value;

    BankAccountTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BankAccountTypeEnum fromValue(String value) {
      for (BankAccountTypeEnum b : BankAccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BANK_ACCOUNT_TYPE = "bankAccountType";
  private BankAccountTypeEnum bankAccountType;

  public static final String JSON_PROPERTY_BANK_LOCATION_ID = "bankLocationId";
  private String bankLocationId;

  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_ENCRYPTED_BANK_ACCOUNT_NUMBER = "encryptedBankAccountNumber";
  private String encryptedBankAccountNumber;

  public static final String JSON_PROPERTY_ENCRYPTED_BANK_LOCATION_ID = "encryptedBankLocationId";
  private String encryptedBankLocationId;

  public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
  private String ownerName;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @Deprecated
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  public static final String JSON_PROPERTY_TRANSFER_INSTRUMENT_ID = "transferInstrumentId";
  private String transferInstrumentId;

  /**
   * **ach**
   */
  public enum TypeEnum {
    ACH("ach"),
    
    ACH_PLAID("ach_plaid");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public AchDetails() { 
  }

  public AchDetails bankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * The bank account number (without separators).
   * @return bankAccountNumber
  **/
  @ApiModelProperty(value = "The bank account number (without separators).")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankAccountNumber() {
    return bankAccountNumber;
  }


 /**
  * The bank account number (without separators).
  *
  * @param bankAccountNumber
  */ 
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }


  public AchDetails bankAccountType(BankAccountTypeEnum bankAccountType) {
    this.bankAccountType = bankAccountType;
    return this;
  }

   /**
   * The bank account type (checking, savings...).
   * @return bankAccountType
  **/
  @ApiModelProperty(value = "The bank account type (checking, savings...).")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankAccountTypeEnum getBankAccountType() {
    return bankAccountType;
  }


 /**
  * The bank account type (checking, savings...).
  *
  * @param bankAccountType
  */ 
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccountType(BankAccountTypeEnum bankAccountType) {
    this.bankAccountType = bankAccountType;
  }


  public AchDetails bankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
    return this;
  }

   /**
   * The bank routing number of the account. The field value is &#x60;nil&#x60; in most cases.
   * @return bankLocationId
  **/
  @ApiModelProperty(value = "The bank routing number of the account. The field value is `nil` in most cases.")
  @JsonProperty(JSON_PROPERTY_BANK_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankLocationId() {
    return bankLocationId;
  }


 /**
  * The bank routing number of the account. The field value is &#x60;nil&#x60; in most cases.
  *
  * @param bankLocationId
  */ 
  @JsonProperty(JSON_PROPERTY_BANK_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
  }


  public AchDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


 /**
  * The checkout attempt identifier.
  *
  * @param checkoutAttemptId
  */ 
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public AchDetails encryptedBankAccountNumber(String encryptedBankAccountNumber) {
    this.encryptedBankAccountNumber = encryptedBankAccountNumber;
    return this;
  }

   /**
   * Encrypted bank account number. The bank account number (without separators).
   * @return encryptedBankAccountNumber
  **/
  @ApiModelProperty(value = "Encrypted bank account number. The bank account number (without separators).")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedBankAccountNumber() {
    return encryptedBankAccountNumber;
  }


 /**
  * Encrypted bank account number. The bank account number (without separators).
  *
  * @param encryptedBankAccountNumber
  */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedBankAccountNumber(String encryptedBankAccountNumber) {
    this.encryptedBankAccountNumber = encryptedBankAccountNumber;
  }


  public AchDetails encryptedBankLocationId(String encryptedBankLocationId) {
    this.encryptedBankLocationId = encryptedBankLocationId;
    return this;
  }

   /**
   * Encrypted location id. The bank routing number of the account. The field value is &#x60;nil&#x60; in most cases.
   * @return encryptedBankLocationId
  **/
  @ApiModelProperty(value = "Encrypted location id. The bank routing number of the account. The field value is `nil` in most cases.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_BANK_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedBankLocationId() {
    return encryptedBankLocationId;
  }


 /**
  * Encrypted location id. The bank routing number of the account. The field value is &#x60;nil&#x60; in most cases.
  *
  * @param encryptedBankLocationId
  */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_BANK_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedBankLocationId(String encryptedBankLocationId) {
    this.encryptedBankLocationId = encryptedBankLocationId;
  }


  public AchDetails ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don&#39;t accept &#39;ø&#39;. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. &gt; If provided details don&#39;t match the required format, the response returns the error message: 203 &#39;Invalid bank account holder name&#39;.
   * @return ownerName
  **/
  @ApiModelProperty(value = "The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don't accept 'ø'. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. > If provided details don't match the required format, the response returns the error message: 203 'Invalid bank account holder name'.")
  @JsonProperty(JSON_PROPERTY_OWNER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwnerName() {
    return ownerName;
  }


 /**
  * The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don&#39;t accept &#39;ø&#39;. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. &gt; If provided details don&#39;t match the required format, the response returns the error message: 203 &#39;Invalid bank account holder name&#39;.
  *
  * @param ownerName
  */ 
  @JsonProperty(JSON_PROPERTY_OWNER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  @Deprecated
  public AchDetails recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


 /**
  * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
  *
  * @param recurringDetailReference
  */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public AchDetails storedPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
  **/
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


 /**
  * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
  *
  * @param storedPaymentMethodId
  */ 
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public AchDetails transferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
    return this;
  }

   /**
   * The unique identifier of your user&#39;s verified transfer instrument, which you can use to top up their balance accounts.
   * @return transferInstrumentId
  **/
  @ApiModelProperty(value = "The unique identifier of your user's verified transfer instrument, which you can use to top up their balance accounts.")
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransferInstrumentId() {
    return transferInstrumentId;
  }


 /**
  * The unique identifier of your user&#39;s verified transfer instrument, which you can use to top up their balance accounts.
  *
  * @param transferInstrumentId
  */ 
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
  }


  public AchDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **ach**
   * @return type
  **/
  @ApiModelProperty(value = "**ach**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * **ach**
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this AchDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchDetails achDetails = (AchDetails) o;
    return Objects.equals(this.bankAccountNumber, achDetails.bankAccountNumber) &&
        Objects.equals(this.bankAccountType, achDetails.bankAccountType) &&
        Objects.equals(this.bankLocationId, achDetails.bankLocationId) &&
        Objects.equals(this.checkoutAttemptId, achDetails.checkoutAttemptId) &&
        Objects.equals(this.encryptedBankAccountNumber, achDetails.encryptedBankAccountNumber) &&
        Objects.equals(this.encryptedBankLocationId, achDetails.encryptedBankLocationId) &&
        Objects.equals(this.ownerName, achDetails.ownerName) &&
        Objects.equals(this.recurringDetailReference, achDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, achDetails.storedPaymentMethodId) &&
        Objects.equals(this.transferInstrumentId, achDetails.transferInstrumentId) &&
        Objects.equals(this.type, achDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountNumber, bankAccountType, bankLocationId, checkoutAttemptId, encryptedBankAccountNumber, encryptedBankLocationId, ownerName, recurringDetailReference, storedPaymentMethodId, transferInstrumentId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchDetails {\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankAccountType: ").append(toIndentedString(bankAccountType)).append("\n");
    sb.append("    bankLocationId: ").append(toIndentedString(bankLocationId)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    encryptedBankAccountNumber: ").append(toIndentedString(encryptedBankAccountNumber)).append("\n");
    sb.append("    encryptedBankLocationId: ").append(toIndentedString(encryptedBankLocationId)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
    sb.append("    transferInstrumentId: ").append(toIndentedString(transferInstrumentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

/**
   * Create an instance of AchDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AchDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to AchDetails
   */
  public static AchDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AchDetails.class);
  }
/**
  * Convert an instance of AchDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

