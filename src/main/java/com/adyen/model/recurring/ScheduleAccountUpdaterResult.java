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
 * ScheduleAccountUpdaterResult
 */
@JsonPropertyOrder({
  ScheduleAccountUpdaterResult.JSON_PROPERTY_PSP_REFERENCE,
  ScheduleAccountUpdaterResult.JSON_PROPERTY_RESULT
})

public class ScheduleAccountUpdaterResult {
  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public ScheduleAccountUpdaterResult() { 
  }

  /**
   * Adyen&#39;s 16-character unique reference associated with the transaction. This value is globally unique; quote it when communicating with us about this request.
   *
   * @param pspReference
   * @return the current {@code ScheduleAccountUpdaterResult} instance, allowing for method chaining
   */
  public ScheduleAccountUpdaterResult pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

  /**
   * Adyen&#39;s 16-character unique reference associated with the transaction. This value is globally unique; quote it when communicating with us about this request.
   * @return pspReference
   */
  @ApiModelProperty(required = true, value = "Adyen's 16-character unique reference associated with the transaction. This value is globally unique; quote it when communicating with us about this request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPspReference() {
    return pspReference;
  }

  /**
   * Adyen&#39;s 16-character unique reference associated with the transaction. This value is globally unique; quote it when communicating with us about this request.
   *
   * @param pspReference
   */ 
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }

  /**
   * The result of scheduling an Account Updater. If scheduling was successful, this field returns **Success**; otherwise it contains the error message.
   *
   * @param result
   * @return the current {@code ScheduleAccountUpdaterResult} instance, allowing for method chaining
   */
  public ScheduleAccountUpdaterResult result(String result) {
    this.result = result;
    return this;
  }

  /**
   * The result of scheduling an Account Updater. If scheduling was successful, this field returns **Success**; otherwise it contains the error message.
   * @return result
   */
  @ApiModelProperty(required = true, value = "The result of scheduling an Account Updater. If scheduling was successful, this field returns **Success**; otherwise it contains the error message.")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResult() {
    return result;
  }

  /**
   * The result of scheduling an Account Updater. If scheduling was successful, this field returns **Success**; otherwise it contains the error message.
   *
   * @param result
   */ 
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(String result) {
    this.result = result;
  }

  /**
   * Return true if this ScheduleAccountUpdaterResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleAccountUpdaterResult scheduleAccountUpdaterResult = (ScheduleAccountUpdaterResult) o;
    return Objects.equals(this.pspReference, scheduleAccountUpdaterResult.pspReference) &&
        Objects.equals(this.result, scheduleAccountUpdaterResult.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pspReference, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleAccountUpdaterResult {\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
   * Create an instance of ScheduleAccountUpdaterResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScheduleAccountUpdaterResult
   * @throws JsonProcessingException if the JSON string is invalid with respect to ScheduleAccountUpdaterResult
   */
  public static ScheduleAccountUpdaterResult fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ScheduleAccountUpdaterResult.class);
  }
/**
  * Convert an instance of ScheduleAccountUpdaterResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
