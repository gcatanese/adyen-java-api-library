/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

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
 * AdditionalDataTemporaryServices
 */
@JsonPropertyOrder({
  AdditionalDataTemporaryServices.JSON_PROPERTY_ENHANCED_SCHEME_DATA_CUSTOMER_REFERENCE,
  AdditionalDataTemporaryServices.JSON_PROPERTY_ENHANCED_SCHEME_DATA_EMPLOYEE_NAME,
  AdditionalDataTemporaryServices.JSON_PROPERTY_ENHANCED_SCHEME_DATA_JOB_DESCRIPTION,
  AdditionalDataTemporaryServices.JSON_PROPERTY_ENHANCED_SCHEME_DATA_REGULAR_HOURS_RATE,
  AdditionalDataTemporaryServices.JSON_PROPERTY_ENHANCED_SCHEME_DATA_REGULAR_HOURS_WORKED,
  AdditionalDataTemporaryServices.JSON_PROPERTY_ENHANCED_SCHEME_DATA_REQUEST_NAME,
  AdditionalDataTemporaryServices.JSON_PROPERTY_ENHANCED_SCHEME_DATA_TEMP_START_DATE,
  AdditionalDataTemporaryServices.JSON_PROPERTY_ENHANCED_SCHEME_DATA_TEMP_WEEK_ENDING,
  AdditionalDataTemporaryServices.JSON_PROPERTY_ENHANCED_SCHEME_DATA_TOTAL_TAX_AMOUNT
})

public class AdditionalDataTemporaryServices {
  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_CUSTOMER_REFERENCE = "enhancedSchemeData.customerReference";
  private String enhancedSchemeDataCustomerReference;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_EMPLOYEE_NAME = "enhancedSchemeData.employeeName";
  private String enhancedSchemeDataEmployeeName;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_JOB_DESCRIPTION = "enhancedSchemeData.jobDescription";
  private String enhancedSchemeDataJobDescription;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_REGULAR_HOURS_RATE = "enhancedSchemeData.regularHoursRate";
  private String enhancedSchemeDataRegularHoursRate;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_REGULAR_HOURS_WORKED = "enhancedSchemeData.regularHoursWorked";
  private String enhancedSchemeDataRegularHoursWorked;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_REQUEST_NAME = "enhancedSchemeData.requestName";
  private String enhancedSchemeDataRequestName;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_TEMP_START_DATE = "enhancedSchemeData.tempStartDate";
  private String enhancedSchemeDataTempStartDate;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_TEMP_WEEK_ENDING = "enhancedSchemeData.tempWeekEnding";
  private String enhancedSchemeDataTempWeekEnding;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_TOTAL_TAX_AMOUNT = "enhancedSchemeData.totalTaxAmount";
  private String enhancedSchemeDataTotalTaxAmount;

  public AdditionalDataTemporaryServices() { 
  }

  public AdditionalDataTemporaryServices enhancedSchemeDataCustomerReference(String enhancedSchemeDataCustomerReference) {
    this.enhancedSchemeDataCustomerReference = enhancedSchemeDataCustomerReference;
    return this;
  }

   /**
   * The customer code, if supplied by a customer. * Encoding: ASCII * maxLength: 25
   * @return enhancedSchemeDataCustomerReference
  **/
  @ApiModelProperty(value = "The customer code, if supplied by a customer. * Encoding: ASCII * maxLength: 25")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataCustomerReference() {
    return enhancedSchemeDataCustomerReference;
  }


 /**
  * The customer code, if supplied by a customer. * Encoding: ASCII * maxLength: 25
  *
  * @param enhancedSchemeDataCustomerReference
  */ 
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataCustomerReference(String enhancedSchemeDataCustomerReference) {
    this.enhancedSchemeDataCustomerReference = enhancedSchemeDataCustomerReference;
  }


  public AdditionalDataTemporaryServices enhancedSchemeDataEmployeeName(String enhancedSchemeDataEmployeeName) {
    this.enhancedSchemeDataEmployeeName = enhancedSchemeDataEmployeeName;
    return this;
  }

   /**
   * The name or ID of the person working in a temporary capacity. * maxLength: 40.   * Must not be all spaces.  *Must not be all zeros.
   * @return enhancedSchemeDataEmployeeName
  **/
  @ApiModelProperty(value = "The name or ID of the person working in a temporary capacity. * maxLength: 40.   * Must not be all spaces.  *Must not be all zeros.")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_EMPLOYEE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataEmployeeName() {
    return enhancedSchemeDataEmployeeName;
  }


 /**
  * The name or ID of the person working in a temporary capacity. * maxLength: 40.   * Must not be all spaces.  *Must not be all zeros.
  *
  * @param enhancedSchemeDataEmployeeName
  */ 
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_EMPLOYEE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataEmployeeName(String enhancedSchemeDataEmployeeName) {
    this.enhancedSchemeDataEmployeeName = enhancedSchemeDataEmployeeName;
  }


  public AdditionalDataTemporaryServices enhancedSchemeDataJobDescription(String enhancedSchemeDataJobDescription) {
    this.enhancedSchemeDataJobDescription = enhancedSchemeDataJobDescription;
    return this;
  }

   /**
   * The job description of the person working in a temporary capacity. * maxLength: 40  * Must not be all spaces.  *Must not be all zeros.
   * @return enhancedSchemeDataJobDescription
  **/
  @ApiModelProperty(value = "The job description of the person working in a temporary capacity. * maxLength: 40  * Must not be all spaces.  *Must not be all zeros.")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_JOB_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataJobDescription() {
    return enhancedSchemeDataJobDescription;
  }


 /**
  * The job description of the person working in a temporary capacity. * maxLength: 40  * Must not be all spaces.  *Must not be all zeros.
  *
  * @param enhancedSchemeDataJobDescription
  */ 
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_JOB_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataJobDescription(String enhancedSchemeDataJobDescription) {
    this.enhancedSchemeDataJobDescription = enhancedSchemeDataJobDescription;
  }


  public AdditionalDataTemporaryServices enhancedSchemeDataRegularHoursRate(String enhancedSchemeDataRegularHoursRate) {
    this.enhancedSchemeDataRegularHoursRate = enhancedSchemeDataRegularHoursRate;
    return this;
  }

   /**
   * The amount paid for regular hours worked, [minor units](https://docs.adyen.com/development-resources/currency-codes). * maxLength: 7 * Must not be empty * Can be all zeros
   * @return enhancedSchemeDataRegularHoursRate
  **/
  @ApiModelProperty(value = "The amount paid for regular hours worked, [minor units](https://docs.adyen.com/development-resources/currency-codes). * maxLength: 7 * Must not be empty * Can be all zeros")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_REGULAR_HOURS_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataRegularHoursRate() {
    return enhancedSchemeDataRegularHoursRate;
  }


 /**
  * The amount paid for regular hours worked, [minor units](https://docs.adyen.com/development-resources/currency-codes). * maxLength: 7 * Must not be empty * Can be all zeros
  *
  * @param enhancedSchemeDataRegularHoursRate
  */ 
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_REGULAR_HOURS_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataRegularHoursRate(String enhancedSchemeDataRegularHoursRate) {
    this.enhancedSchemeDataRegularHoursRate = enhancedSchemeDataRegularHoursRate;
  }


  public AdditionalDataTemporaryServices enhancedSchemeDataRegularHoursWorked(String enhancedSchemeDataRegularHoursWorked) {
    this.enhancedSchemeDataRegularHoursWorked = enhancedSchemeDataRegularHoursWorked;
    return this;
  }

   /**
   * The hours worked. * maxLength: 7 * Must not be empty * Can be all zeros
   * @return enhancedSchemeDataRegularHoursWorked
  **/
  @ApiModelProperty(value = "The hours worked. * maxLength: 7 * Must not be empty * Can be all zeros")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_REGULAR_HOURS_WORKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataRegularHoursWorked() {
    return enhancedSchemeDataRegularHoursWorked;
  }


 /**
  * The hours worked. * maxLength: 7 * Must not be empty * Can be all zeros
  *
  * @param enhancedSchemeDataRegularHoursWorked
  */ 
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_REGULAR_HOURS_WORKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataRegularHoursWorked(String enhancedSchemeDataRegularHoursWorked) {
    this.enhancedSchemeDataRegularHoursWorked = enhancedSchemeDataRegularHoursWorked;
  }


  public AdditionalDataTemporaryServices enhancedSchemeDataRequestName(String enhancedSchemeDataRequestName) {
    this.enhancedSchemeDataRequestName = enhancedSchemeDataRequestName;
    return this;
  }

   /**
   * The name of the person requesting temporary services. * maxLength: 40 * Must not be all zeros * Must not be all spaces
   * @return enhancedSchemeDataRequestName
  **/
  @ApiModelProperty(value = "The name of the person requesting temporary services. * maxLength: 40 * Must not be all zeros * Must not be all spaces")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_REQUEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataRequestName() {
    return enhancedSchemeDataRequestName;
  }


 /**
  * The name of the person requesting temporary services. * maxLength: 40 * Must not be all zeros * Must not be all spaces
  *
  * @param enhancedSchemeDataRequestName
  */ 
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_REQUEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataRequestName(String enhancedSchemeDataRequestName) {
    this.enhancedSchemeDataRequestName = enhancedSchemeDataRequestName;
  }


  public AdditionalDataTemporaryServices enhancedSchemeDataTempStartDate(String enhancedSchemeDataTempStartDate) {
    this.enhancedSchemeDataTempStartDate = enhancedSchemeDataTempStartDate;
    return this;
  }

   /**
   * The billing period start date. * Format: ddMMyy * maxLength: 6
   * @return enhancedSchemeDataTempStartDate
  **/
  @ApiModelProperty(value = "The billing period start date. * Format: ddMMyy * maxLength: 6")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_TEMP_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataTempStartDate() {
    return enhancedSchemeDataTempStartDate;
  }


 /**
  * The billing period start date. * Format: ddMMyy * maxLength: 6
  *
  * @param enhancedSchemeDataTempStartDate
  */ 
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_TEMP_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataTempStartDate(String enhancedSchemeDataTempStartDate) {
    this.enhancedSchemeDataTempStartDate = enhancedSchemeDataTempStartDate;
  }


  public AdditionalDataTemporaryServices enhancedSchemeDataTempWeekEnding(String enhancedSchemeDataTempWeekEnding) {
    this.enhancedSchemeDataTempWeekEnding = enhancedSchemeDataTempWeekEnding;
    return this;
  }

   /**
   * The billing period end date. * Format: ddMMyy * maxLength: 6
   * @return enhancedSchemeDataTempWeekEnding
  **/
  @ApiModelProperty(value = "The billing period end date. * Format: ddMMyy * maxLength: 6")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_TEMP_WEEK_ENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataTempWeekEnding() {
    return enhancedSchemeDataTempWeekEnding;
  }


 /**
  * The billing period end date. * Format: ddMMyy * maxLength: 6
  *
  * @param enhancedSchemeDataTempWeekEnding
  */ 
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_TEMP_WEEK_ENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataTempWeekEnding(String enhancedSchemeDataTempWeekEnding) {
    this.enhancedSchemeDataTempWeekEnding = enhancedSchemeDataTempWeekEnding;
  }


  public AdditionalDataTemporaryServices enhancedSchemeDataTotalTaxAmount(String enhancedSchemeDataTotalTaxAmount) {
    this.enhancedSchemeDataTotalTaxAmount = enhancedSchemeDataTotalTaxAmount;
    return this;
  }

   /**
   * The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). For example, 2000 means USD 20.00 * maxLength: 12
   * @return enhancedSchemeDataTotalTaxAmount
  **/
  @ApiModelProperty(value = "The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). For example, 2000 means USD 20.00 * maxLength: 12")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_TOTAL_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataTotalTaxAmount() {
    return enhancedSchemeDataTotalTaxAmount;
  }


 /**
  * The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). For example, 2000 means USD 20.00 * maxLength: 12
  *
  * @param enhancedSchemeDataTotalTaxAmount
  */ 
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_TOTAL_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataTotalTaxAmount(String enhancedSchemeDataTotalTaxAmount) {
    this.enhancedSchemeDataTotalTaxAmount = enhancedSchemeDataTotalTaxAmount;
  }


  /**
   * Return true if this AdditionalDataTemporaryServices object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataTemporaryServices additionalDataTemporaryServices = (AdditionalDataTemporaryServices) o;
    return Objects.equals(this.enhancedSchemeDataCustomerReference, additionalDataTemporaryServices.enhancedSchemeDataCustomerReference) &&
        Objects.equals(this.enhancedSchemeDataEmployeeName, additionalDataTemporaryServices.enhancedSchemeDataEmployeeName) &&
        Objects.equals(this.enhancedSchemeDataJobDescription, additionalDataTemporaryServices.enhancedSchemeDataJobDescription) &&
        Objects.equals(this.enhancedSchemeDataRegularHoursRate, additionalDataTemporaryServices.enhancedSchemeDataRegularHoursRate) &&
        Objects.equals(this.enhancedSchemeDataRegularHoursWorked, additionalDataTemporaryServices.enhancedSchemeDataRegularHoursWorked) &&
        Objects.equals(this.enhancedSchemeDataRequestName, additionalDataTemporaryServices.enhancedSchemeDataRequestName) &&
        Objects.equals(this.enhancedSchemeDataTempStartDate, additionalDataTemporaryServices.enhancedSchemeDataTempStartDate) &&
        Objects.equals(this.enhancedSchemeDataTempWeekEnding, additionalDataTemporaryServices.enhancedSchemeDataTempWeekEnding) &&
        Objects.equals(this.enhancedSchemeDataTotalTaxAmount, additionalDataTemporaryServices.enhancedSchemeDataTotalTaxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enhancedSchemeDataCustomerReference, enhancedSchemeDataEmployeeName, enhancedSchemeDataJobDescription, enhancedSchemeDataRegularHoursRate, enhancedSchemeDataRegularHoursWorked, enhancedSchemeDataRequestName, enhancedSchemeDataTempStartDate, enhancedSchemeDataTempWeekEnding, enhancedSchemeDataTotalTaxAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataTemporaryServices {\n");
    sb.append("    enhancedSchemeDataCustomerReference: ").append(toIndentedString(enhancedSchemeDataCustomerReference)).append("\n");
    sb.append("    enhancedSchemeDataEmployeeName: ").append(toIndentedString(enhancedSchemeDataEmployeeName)).append("\n");
    sb.append("    enhancedSchemeDataJobDescription: ").append(toIndentedString(enhancedSchemeDataJobDescription)).append("\n");
    sb.append("    enhancedSchemeDataRegularHoursRate: ").append(toIndentedString(enhancedSchemeDataRegularHoursRate)).append("\n");
    sb.append("    enhancedSchemeDataRegularHoursWorked: ").append(toIndentedString(enhancedSchemeDataRegularHoursWorked)).append("\n");
    sb.append("    enhancedSchemeDataRequestName: ").append(toIndentedString(enhancedSchemeDataRequestName)).append("\n");
    sb.append("    enhancedSchemeDataTempStartDate: ").append(toIndentedString(enhancedSchemeDataTempStartDate)).append("\n");
    sb.append("    enhancedSchemeDataTempWeekEnding: ").append(toIndentedString(enhancedSchemeDataTempWeekEnding)).append("\n");
    sb.append("    enhancedSchemeDataTotalTaxAmount: ").append(toIndentedString(enhancedSchemeDataTotalTaxAmount)).append("\n");
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
   * Create an instance of AdditionalDataTemporaryServices given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalDataTemporaryServices
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalDataTemporaryServices
   */
  public static AdditionalDataTemporaryServices fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalDataTemporaryServices.class);
  }
/**
  * Convert an instance of AdditionalDataTemporaryServices to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

