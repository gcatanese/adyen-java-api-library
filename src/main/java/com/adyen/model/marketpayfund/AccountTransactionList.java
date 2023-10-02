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
import com.adyen.model.marketpayfund.Transaction;
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
 * AccountTransactionList
 */
@JsonPropertyOrder({
  AccountTransactionList.JSON_PROPERTY_ACCOUNT_CODE,
  AccountTransactionList.JSON_PROPERTY_HAS_NEXT_PAGE,
  AccountTransactionList.JSON_PROPERTY_TRANSACTIONS
})

public class AccountTransactionList {
  public static final String JSON_PROPERTY_ACCOUNT_CODE = "accountCode";
  private String accountCode;

  public static final String JSON_PROPERTY_HAS_NEXT_PAGE = "hasNextPage";
  private Boolean hasNextPage;

  public static final String JSON_PROPERTY_TRANSACTIONS = "transactions";
  private List<Transaction> transactions = null;

  public AccountTransactionList() { 
  }

  public AccountTransactionList accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * The code of the account.
   * @return accountCode
  **/
  @ApiModelProperty(value = "The code of the account.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountCode() {
    return accountCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }


  public AccountTransactionList hasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }

   /**
   * Indicates whether there is a next page of transactions available.
   * @return hasNextPage
  **/
  @ApiModelProperty(value = "Indicates whether there is a next page of transactions available.")
  @JsonProperty(JSON_PROPERTY_HAS_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasNextPage() {
    return hasNextPage;
  }


  @JsonProperty(JSON_PROPERTY_HAS_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }


  public AccountTransactionList transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public AccountTransactionList addTransactionsItem(Transaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * The list of transactions.
   * @return transactions
  **/
  @ApiModelProperty(value = "The list of transactions.")
  @JsonProperty(JSON_PROPERTY_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Transaction> getTransactions() {
    return transactions;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  /**
   * Return true if this AccountTransactionList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTransactionList accountTransactionList = (AccountTransactionList) o;
    return Objects.equals(this.accountCode, accountTransactionList.accountCode) &&
        Objects.equals(this.hasNextPage, accountTransactionList.hasNextPage) &&
        Objects.equals(this.transactions, accountTransactionList.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, hasNextPage, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTransactionList {\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
   * Create an instance of AccountTransactionList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountTransactionList
   * @throws JsonProcessingException if the JSON string is invalid with respect to AccountTransactionList
   */
  public static AccountTransactionList fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AccountTransactionList.class);
  }
/**
  * Convert an instance of AccountTransactionList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

