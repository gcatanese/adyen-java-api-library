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
 * BacsDirectDebitDetails
 */
@JsonPropertyOrder({
  BacsDirectDebitDetails.JSON_PROPERTY_BANK_ACCOUNT_NUMBER,
  BacsDirectDebitDetails.JSON_PROPERTY_BANK_LOCATION_ID,
  BacsDirectDebitDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  BacsDirectDebitDetails.JSON_PROPERTY_HOLDER_NAME,
  BacsDirectDebitDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  BacsDirectDebitDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  BacsDirectDebitDetails.JSON_PROPERTY_TRANSFER_INSTRUMENT_ID,
  BacsDirectDebitDetails.JSON_PROPERTY_TYPE
})

public class BacsDirectDebitDetails {
  public static final String JSON_PROPERTY_BANK_ACCOUNT_NUMBER = "bankAccountNumber";
  private String bankAccountNumber;

  public static final String JSON_PROPERTY_BANK_LOCATION_ID = "bankLocationId";
  private String bankLocationId;

  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_HOLDER_NAME = "holderName";
  private String holderName;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @Deprecated
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  public static final String JSON_PROPERTY_TRANSFER_INSTRUMENT_ID = "transferInstrumentId";
  private String transferInstrumentId;

  /**
   * **directdebit_GB**
   */
  public enum TypeEnum {
    DIRECTDEBIT_GB("directdebit_GB");

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

  public BacsDirectDebitDetails() { 
  }

  public BacsDirectDebitDetails bankAccountNumber(String bankAccountNumber) {
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


  public BacsDirectDebitDetails bankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
    return this;
  }

   /**
   * The bank routing number of the account.
   * @return bankLocationId
  **/
  @ApiModelProperty(value = "The bank routing number of the account.")
  @JsonProperty(JSON_PROPERTY_BANK_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankLocationId() {
    return bankLocationId;
  }


 /**
  * The bank routing number of the account.
  *
  * @param bankLocationId
  */ 
  @JsonProperty(JSON_PROPERTY_BANK_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
  }


  public BacsDirectDebitDetails checkoutAttemptId(String checkoutAttemptId) {
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


  public BacsDirectDebitDetails holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

   /**
   * The name of the bank account holder.
   * @return holderName
  **/
  @ApiModelProperty(value = "The name of the bank account holder.")
  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHolderName() {
    return holderName;
  }


 /**
  * The name of the bank account holder.
  *
  * @param holderName
  */ 
  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  @Deprecated
  public BacsDirectDebitDetails recurringDetailReference(String recurringDetailReference) {
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


  public BacsDirectDebitDetails storedPaymentMethodId(String storedPaymentMethodId) {
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


  public BacsDirectDebitDetails transferInstrumentId(String transferInstrumentId) {
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


  public BacsDirectDebitDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **directdebit_GB**
   * @return type
  **/
  @ApiModelProperty(value = "**directdebit_GB**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * **directdebit_GB**
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this BacsDirectDebitDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BacsDirectDebitDetails bacsDirectDebitDetails = (BacsDirectDebitDetails) o;
    return Objects.equals(this.bankAccountNumber, bacsDirectDebitDetails.bankAccountNumber) &&
        Objects.equals(this.bankLocationId, bacsDirectDebitDetails.bankLocationId) &&
        Objects.equals(this.checkoutAttemptId, bacsDirectDebitDetails.checkoutAttemptId) &&
        Objects.equals(this.holderName, bacsDirectDebitDetails.holderName) &&
        Objects.equals(this.recurringDetailReference, bacsDirectDebitDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, bacsDirectDebitDetails.storedPaymentMethodId) &&
        Objects.equals(this.transferInstrumentId, bacsDirectDebitDetails.transferInstrumentId) &&
        Objects.equals(this.type, bacsDirectDebitDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountNumber, bankLocationId, checkoutAttemptId, holderName, recurringDetailReference, storedPaymentMethodId, transferInstrumentId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BacsDirectDebitDetails {\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankLocationId: ").append(toIndentedString(bankLocationId)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
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
   * Create an instance of BacsDirectDebitDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BacsDirectDebitDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to BacsDirectDebitDetails
   */
  public static BacsDirectDebitDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BacsDirectDebitDetails.class);
  }
/**
  * Convert an instance of BacsDirectDebitDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

