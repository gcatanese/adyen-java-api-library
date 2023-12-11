/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

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
 * TransferInstrumentReference
 */
@JsonPropertyOrder({
  TransferInstrumentReference.JSON_PROPERTY_ACCOUNT_IDENTIFIER,
  TransferInstrumentReference.JSON_PROPERTY_ID,
  TransferInstrumentReference.JSON_PROPERTY_REAL_LAST_FOUR,
  TransferInstrumentReference.JSON_PROPERTY_TRUSTED_SOURCE
})

public class TransferInstrumentReference {
  public static final String JSON_PROPERTY_ACCOUNT_IDENTIFIER = "accountIdentifier";
  private String accountIdentifier;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REAL_LAST_FOUR = "realLastFour";
  private String realLastFour;

  public static final String JSON_PROPERTY_TRUSTED_SOURCE = "trustedSource";
  private Boolean trustedSource;

  public TransferInstrumentReference() { 
  }

  public TransferInstrumentReference accountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

   /**
   * The masked IBAN or bank account number.
   * @return accountIdentifier
  **/
  @ApiModelProperty(required = true, value = "The masked IBAN or bank account number.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountIdentifier() {
    return accountIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }


  public TransferInstrumentReference id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public TransferInstrumentReference realLastFour(String realLastFour) {
    this.realLastFour = realLastFour;
    return this;
  }

   /**
   * Four last digits of the bank account number. If the transfer instrument is created using [instant bank account verification](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-08-hosted-onboarding), and it is a virtual bank account, these digits may be different from the last four digits of the masked account number.
   * @return realLastFour
  **/
  @ApiModelProperty(value = "Four last digits of the bank account number. If the transfer instrument is created using [instant bank account verification](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote=2023-05-08-hosted-onboarding), and it is a virtual bank account, these digits may be different from the last four digits of the masked account number.")
  @JsonProperty(JSON_PROPERTY_REAL_LAST_FOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRealLastFour() {
    return realLastFour;
  }


  @JsonProperty(JSON_PROPERTY_REAL_LAST_FOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRealLastFour(String realLastFour) {
    this.realLastFour = realLastFour;
  }


  public TransferInstrumentReference trustedSource(Boolean trustedSource) {
    this.trustedSource = trustedSource;
    return this;
  }

   /**
   * Identifies if the bank account was created through [instant bank verification](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote&#x3D;2023-05-08-hosted-onboarding).
   * @return trustedSource
  **/
  @ApiModelProperty(value = "Identifies if the bank account was created through [instant bank verification](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote=2023-05-08-hosted-onboarding).")
  @JsonProperty(JSON_PROPERTY_TRUSTED_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrustedSource() {
    return trustedSource;
  }


  @JsonProperty(JSON_PROPERTY_TRUSTED_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrustedSource(Boolean trustedSource) {
    this.trustedSource = trustedSource;
  }


  /**
   * Return true if this TransferInstrumentReference object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferInstrumentReference transferInstrumentReference = (TransferInstrumentReference) o;
    return Objects.equals(this.accountIdentifier, transferInstrumentReference.accountIdentifier) &&
        Objects.equals(this.id, transferInstrumentReference.id) &&
        Objects.equals(this.realLastFour, transferInstrumentReference.realLastFour) &&
        Objects.equals(this.trustedSource, transferInstrumentReference.trustedSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentifier, id, realLastFour, trustedSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferInstrumentReference {\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    realLastFour: ").append(toIndentedString(realLastFour)).append("\n");
    sb.append("    trustedSource: ").append(toIndentedString(trustedSource)).append("\n");
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
   * Create an instance of TransferInstrumentReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferInstrumentReference
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransferInstrumentReference
   */
  public static TransferInstrumentReference fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransferInstrumentReference.class);
  }
/**
  * Convert an instance of TransferInstrumentReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

