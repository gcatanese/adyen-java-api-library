/*
 * Adyen Recurring API (deprecated)
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.recurring.Recurring;
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
 * RecurringDetailsRequest
 */
@JsonPropertyOrder({
  RecurringDetailsRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  RecurringDetailsRequest.JSON_PROPERTY_RECURRING,
  RecurringDetailsRequest.JSON_PROPERTY_SHOPPER_REFERENCE
})

public class RecurringDetailsRequest {
  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_RECURRING = "recurring";
  private Recurring recurring;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public RecurringDetailsRequest() { 
  }

  /**
   * The merchant account identifier you want to process the (transaction) request with.
   *
   * @param merchantAccount
   * @return the current {@code RecurringDetailsRequest} instance, allowing for method chaining
   */
  public RecurringDetailsRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account identifier you want to process the (transaction) request with.
   * @return merchantAccount
   */
  @ApiModelProperty(required = true, value = "The merchant account identifier you want to process the (transaction) request with.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account identifier you want to process the (transaction) request with.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * recurring
   *
   * @param recurring
   * @return the current {@code RecurringDetailsRequest} instance, allowing for method chaining
   */
  public RecurringDetailsRequest recurring(Recurring recurring) {
    this.recurring = recurring;
    return this;
  }

  /**
   * recurring
   * @return recurring
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Recurring getRecurring() {
    return recurring;
  }

  /**
   * recurring
   *
   * @param recurring
   */ 
  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }

  /**
   * The reference you use to uniquely identify the shopper (e.g. user ID or account ID).
   *
   * @param shopperReference
   * @return the current {@code RecurringDetailsRequest} instance, allowing for method chaining
   */
  public RecurringDetailsRequest shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

  /**
   * The reference you use to uniquely identify the shopper (e.g. user ID or account ID).
   * @return shopperReference
   */
  @ApiModelProperty(required = true, value = "The reference you use to uniquely identify the shopper (e.g. user ID or account ID).")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperReference() {
    return shopperReference;
  }

  /**
   * The reference you use to uniquely identify the shopper (e.g. user ID or account ID).
   *
   * @param shopperReference
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }

  /**
   * Return true if this RecurringDetailsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDetailsRequest recurringDetailsRequest = (RecurringDetailsRequest) o;
    return Objects.equals(this.merchantAccount, recurringDetailsRequest.merchantAccount) &&
        Objects.equals(this.recurring, recurringDetailsRequest.recurring) &&
        Objects.equals(this.shopperReference, recurringDetailsRequest.shopperReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, recurring, shopperReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDetailsRequest {\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
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
   * Create an instance of RecurringDetailsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecurringDetailsRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to RecurringDetailsRequest
   */
  public static RecurringDetailsRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RecurringDetailsRequest.class);
  }
/**
  * Convert an instance of RecurringDetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
