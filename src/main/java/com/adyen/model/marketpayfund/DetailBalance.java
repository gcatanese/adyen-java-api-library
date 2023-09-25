/*
 * Fund API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Fund API provides endpoints for managing the funds in the accounts on your platform. These management operations include, for example, the transfer of funds from one account to another, the payout of funds to an account holder, and the retrieval of balances in an account.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic/). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Fund API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Fund/v6/accountHolderBalance ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayfund;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpayfund.Amount;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * DetailBalance
 */
@JsonPropertyOrder({
  DetailBalance.JSON_PROPERTY_BALANCE,
  DetailBalance.JSON_PROPERTY_ON_HOLD_BALANCE,
  DetailBalance.JSON_PROPERTY_PENDING_BALANCE
})

public class DetailBalance {
  public static final String JSON_PROPERTY_BALANCE = "balance";
  private List<Amount> balance = null;

  public static final String JSON_PROPERTY_ON_HOLD_BALANCE = "onHoldBalance";
  private List<Amount> onHoldBalance = null;

  public static final String JSON_PROPERTY_PENDING_BALANCE = "pendingBalance";
  private List<Amount> pendingBalance = null;

  public DetailBalance() { 
  }

  public DetailBalance balance(List<Amount> balance) {
    this.balance = balance;
    return this;
  }

  public DetailBalance addBalanceItem(Amount balanceItem) {
    if (this.balance == null) {
      this.balance = new ArrayList<>();
    }
    this.balance.add(balanceItem);
    return this;
  }

   /**
   * The list of balances held by the account.
   * @return balance
  **/
  @ApiModelProperty(value = "The list of balances held by the account.")
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Amount> getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalance(List<Amount> balance) {
    this.balance = balance;
  }


  public DetailBalance onHoldBalance(List<Amount> onHoldBalance) {
    this.onHoldBalance = onHoldBalance;
    return this;
  }

  public DetailBalance addOnHoldBalanceItem(Amount onHoldBalanceItem) {
    if (this.onHoldBalance == null) {
      this.onHoldBalance = new ArrayList<>();
    }
    this.onHoldBalance.add(onHoldBalanceItem);
    return this;
  }

   /**
   * The list of on hold balances held by the account.
   * @return onHoldBalance
  **/
  @ApiModelProperty(value = "The list of on hold balances held by the account.")
  @JsonProperty(JSON_PROPERTY_ON_HOLD_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Amount> getOnHoldBalance() {
    return onHoldBalance;
  }


  @JsonProperty(JSON_PROPERTY_ON_HOLD_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnHoldBalance(List<Amount> onHoldBalance) {
    this.onHoldBalance = onHoldBalance;
  }


  public DetailBalance pendingBalance(List<Amount> pendingBalance) {
    this.pendingBalance = pendingBalance;
    return this;
  }

  public DetailBalance addPendingBalanceItem(Amount pendingBalanceItem) {
    if (this.pendingBalance == null) {
      this.pendingBalance = new ArrayList<>();
    }
    this.pendingBalance.add(pendingBalanceItem);
    return this;
  }

   /**
   * The list of pending balances held by the account.
   * @return pendingBalance
  **/
  @ApiModelProperty(value = "The list of pending balances held by the account.")
  @JsonProperty(JSON_PROPERTY_PENDING_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Amount> getPendingBalance() {
    return pendingBalance;
  }


  @JsonProperty(JSON_PROPERTY_PENDING_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPendingBalance(List<Amount> pendingBalance) {
    this.pendingBalance = pendingBalance;
  }


  /**
   * Return true if this DetailBalance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailBalance detailBalance = (DetailBalance) o;
    return Objects.equals(this.balance, detailBalance.balance) &&
        Objects.equals(this.onHoldBalance, detailBalance.onHoldBalance) &&
        Objects.equals(this.pendingBalance, detailBalance.pendingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, onHoldBalance, pendingBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailBalance {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    onHoldBalance: ").append(toIndentedString(onHoldBalance)).append("\n");
    sb.append("    pendingBalance: ").append(toIndentedString(pendingBalance)).append("\n");
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
   * Create an instance of DetailBalance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DetailBalance
   * @throws JsonProcessingException if the JSON string is invalid with respect to DetailBalance
   */
  public static DetailBalance fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DetailBalance.class);
  }
/**
  * Convert an instance of DetailBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

