/*
 * Classic Platforms - Notifications
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpaywebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpaywebhooks.ErrorFieldType;
import com.adyen.model.marketpaywebhooks.RefundResult;
import com.adyen.model.marketpaywebhooks.Transaction;
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
 * ScheduledRefundsNotificationContent
 */
@JsonPropertyOrder({
  ScheduledRefundsNotificationContent.JSON_PROPERTY_ACCOUNT_CODE,
  ScheduledRefundsNotificationContent.JSON_PROPERTY_ACCOUNT_HOLDER_CODE,
  ScheduledRefundsNotificationContent.JSON_PROPERTY_INVALID_FIELDS,
  ScheduledRefundsNotificationContent.JSON_PROPERTY_LAST_PAYOUT,
  ScheduledRefundsNotificationContent.JSON_PROPERTY_REFUND_RESULTS
})

public class ScheduledRefundsNotificationContent {
  public static final String JSON_PROPERTY_ACCOUNT_CODE = "accountCode";
  private String accountCode;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_CODE = "accountHolderCode";
  private String accountHolderCode;

  public static final String JSON_PROPERTY_INVALID_FIELDS = "invalidFields";
  private List<ErrorFieldType> invalidFields = null;

  public static final String JSON_PROPERTY_LAST_PAYOUT = "lastPayout";
  private Transaction lastPayout;

  public static final String JSON_PROPERTY_REFUND_RESULTS = "refundResults";
  private List<RefundResult> refundResults = null;

  public ScheduledRefundsNotificationContent() { 
  }

  public ScheduledRefundsNotificationContent accountCode(String accountCode) {
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


  public ScheduledRefundsNotificationContent accountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
    return this;
  }

   /**
   * The code of the Account Holder.
   * @return accountHolderCode
  **/
  @ApiModelProperty(value = "The code of the Account Holder.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderCode() {
    return accountHolderCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
  }


  public ScheduledRefundsNotificationContent invalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public ScheduledRefundsNotificationContent addInvalidFieldsItem(ErrorFieldType invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

   /**
   * Invalid fields list.
   * @return invalidFields
  **/
  @ApiModelProperty(value = "Invalid fields list.")
  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ErrorFieldType> getInvalidFields() {
    return invalidFields;
  }


  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
  }


  public ScheduledRefundsNotificationContent lastPayout(Transaction lastPayout) {
    this.lastPayout = lastPayout;
    return this;
  }

   /**
   * Get lastPayout
   * @return lastPayout
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_PAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Transaction getLastPayout() {
    return lastPayout;
  }


  @JsonProperty(JSON_PROPERTY_LAST_PAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastPayout(Transaction lastPayout) {
    this.lastPayout = lastPayout;
  }


  public ScheduledRefundsNotificationContent refundResults(List<RefundResult> refundResults) {
    this.refundResults = refundResults;
    return this;
  }

  public ScheduledRefundsNotificationContent addRefundResultsItem(RefundResult refundResultsItem) {
    if (this.refundResults == null) {
      this.refundResults = new ArrayList<>();
    }
    this.refundResults.add(refundResultsItem);
    return this;
  }

   /**
   * A list of the refunds that have been scheduled and their results.
   * @return refundResults
  **/
  @ApiModelProperty(value = "A list of the refunds that have been scheduled and their results.")
  @JsonProperty(JSON_PROPERTY_REFUND_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RefundResult> getRefundResults() {
    return refundResults;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundResults(List<RefundResult> refundResults) {
    this.refundResults = refundResults;
  }


  /**
   * Return true if this ScheduledRefundsNotificationContent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledRefundsNotificationContent scheduledRefundsNotificationContent = (ScheduledRefundsNotificationContent) o;
    return Objects.equals(this.accountCode, scheduledRefundsNotificationContent.accountCode) &&
        Objects.equals(this.accountHolderCode, scheduledRefundsNotificationContent.accountHolderCode) &&
        Objects.equals(this.invalidFields, scheduledRefundsNotificationContent.invalidFields) &&
        Objects.equals(this.lastPayout, scheduledRefundsNotificationContent.lastPayout) &&
        Objects.equals(this.refundResults, scheduledRefundsNotificationContent.refundResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, accountHolderCode, invalidFields, lastPayout, refundResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledRefundsNotificationContent {\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    lastPayout: ").append(toIndentedString(lastPayout)).append("\n");
    sb.append("    refundResults: ").append(toIndentedString(refundResults)).append("\n");
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
   * Create an instance of ScheduledRefundsNotificationContent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScheduledRefundsNotificationContent
   * @throws JsonProcessingException if the JSON string is invalid with respect to ScheduledRefundsNotificationContent
   */
  public static ScheduledRefundsNotificationContent fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ScheduledRefundsNotificationContent.class);
  }
/**
  * Convert an instance of ScheduledRefundsNotificationContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

