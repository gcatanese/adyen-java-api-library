/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

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
 * Balance
 */
@JsonPropertyOrder({
  Balance.JSON_PROPERTY_AVAILABLE,
  Balance.JSON_PROPERTY_BALANCE,
  Balance.JSON_PROPERTY_CURRENCY,
  Balance.JSON_PROPERTY_PENDING,
  Balance.JSON_PROPERTY_RESERVED
})

public class Balance {
  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private Long available;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Long balance;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PENDING = "pending";
  private Long pending;

  public static final String JSON_PROPERTY_RESERVED = "reserved";
  private Long reserved;

  public Balance() { 
  }

  /**
   * The balance available for use.
   *
   * @param available
   * @return the current {@code Balance} instance, allowing for method chaining
   */
  public Balance available(Long available) {
    this.available = available;
    return this;
  }

  /**
   * The balance available for use.
   * @return available
   */
  @ApiModelProperty(required = true, value = "The balance available for use.")
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvailable() {
    return available;
  }

  /**
   * The balance available for use.
   *
   * @param available
   */ 
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailable(Long available) {
    this.available = available;
  }

  /**
   * The sum of the transactions that have already been settled.
   *
   * @param balance
   * @return the current {@code Balance} instance, allowing for method chaining
   */
  public Balance balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The sum of the transactions that have already been settled.
   * @return balance
   */
  @ApiModelProperty(required = true, value = "The sum of the transactions that have already been settled.")
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBalance() {
    return balance;
  }

  /**
   * The sum of the transactions that have already been settled.
   *
   * @param balance
   */ 
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalance(Long balance) {
    this.balance = balance;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance.
   *
   * @param currency
   * @return the current {@code Balance} instance, allowing for method chaining
   */
  public Balance currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance.
   * @return currency
   */
  @ApiModelProperty(required = true, value = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrency() {
    return currency;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance.
   *
   * @param currency
   */ 
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The sum of the transactions that will be settled in the future.
   *
   * @param pending
   * @return the current {@code Balance} instance, allowing for method chaining
   */
  public Balance pending(Long pending) {
    this.pending = pending;
    return this;
  }

  /**
   * The sum of the transactions that will be settled in the future.
   * @return pending
   */
  @ApiModelProperty(value = "The sum of the transactions that will be settled in the future.")
  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPending() {
    return pending;
  }

  /**
   * The sum of the transactions that will be settled in the future.
   *
   * @param pending
   */ 
  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPending(Long pending) {
    this.pending = pending;
  }

  /**
   * The balance currently held in reserve.
   *
   * @param reserved
   * @return the current {@code Balance} instance, allowing for method chaining
   */
  public Balance reserved(Long reserved) {
    this.reserved = reserved;
    return this;
  }

  /**
   * The balance currently held in reserve.
   * @return reserved
   */
  @ApiModelProperty(required = true, value = "The balance currently held in reserve.")
  @JsonProperty(JSON_PROPERTY_RESERVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getReserved() {
    return reserved;
  }

  /**
   * The balance currently held in reserve.
   *
   * @param reserved
   */ 
  @JsonProperty(JSON_PROPERTY_RESERVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReserved(Long reserved) {
    this.reserved = reserved;
  }

  /**
   * Return true if this Balance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.available, balance.available) &&
        Objects.equals(this.balance, balance.balance) &&
        Objects.equals(this.currency, balance.currency) &&
        Objects.equals(this.pending, balance.pending) &&
        Objects.equals(this.reserved, balance.reserved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, balance, currency, pending, reserved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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
   * Create an instance of Balance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Balance
   * @throws JsonProcessingException if the JSON string is invalid with respect to Balance
   */
  public static Balance fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Balance.class);
  }
/**
  * Convert an instance of Balance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
