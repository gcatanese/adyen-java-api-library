/*
 * Account API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Account API provides endpoints for managing account-related entities on your platform. These related entities include account holders, accounts, bank accounts, shareholders, and verification-related documents. The management operations include actions such as creation, retrieval, updating, and deletion of them.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Account API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Account/v6/createAccountHolder ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayaccount;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpayaccount.KYCCheckStatusData;
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
 * KYCLegalArrangementCheckResult
 */
@JsonPropertyOrder({
  KYCLegalArrangementCheckResult.JSON_PROPERTY_CHECKS,
  KYCLegalArrangementCheckResult.JSON_PROPERTY_LEGAL_ARRANGEMENT_CODE
})

public class KYCLegalArrangementCheckResult {
  public static final String JSON_PROPERTY_CHECKS = "checks";
  private List<KYCCheckStatusData> checks = null;

  public static final String JSON_PROPERTY_LEGAL_ARRANGEMENT_CODE = "legalArrangementCode";
  private String legalArrangementCode;

  public KYCLegalArrangementCheckResult() { 
  }

  public KYCLegalArrangementCheckResult checks(List<KYCCheckStatusData> checks) {
    this.checks = checks;
    return this;
  }

  public KYCLegalArrangementCheckResult addChecksItem(KYCCheckStatusData checksItem) {
    if (this.checks == null) {
      this.checks = new ArrayList<>();
    }
    this.checks.add(checksItem);
    return this;
  }

   /**
   * A list of the checks and their statuses.
   * @return checks
  **/
  @ApiModelProperty(value = "A list of the checks and their statuses.")
  @JsonProperty(JSON_PROPERTY_CHECKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<KYCCheckStatusData> getChecks() {
    return checks;
  }


  @JsonProperty(JSON_PROPERTY_CHECKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChecks(List<KYCCheckStatusData> checks) {
    this.checks = checks;
  }


  public KYCLegalArrangementCheckResult legalArrangementCode(String legalArrangementCode) {
    this.legalArrangementCode = legalArrangementCode;
    return this;
  }

   /**
   * The unique ID of the legal arrangement to which the check applies.
   * @return legalArrangementCode
  **/
  @ApiModelProperty(value = "The unique ID of the legal arrangement to which the check applies.")
  @JsonProperty(JSON_PROPERTY_LEGAL_ARRANGEMENT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegalArrangementCode() {
    return legalArrangementCode;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_ARRANGEMENT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalArrangementCode(String legalArrangementCode) {
    this.legalArrangementCode = legalArrangementCode;
  }


  /**
   * Return true if this KYCLegalArrangementCheckResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KYCLegalArrangementCheckResult kyCLegalArrangementCheckResult = (KYCLegalArrangementCheckResult) o;
    return Objects.equals(this.checks, kyCLegalArrangementCheckResult.checks) &&
        Objects.equals(this.legalArrangementCode, kyCLegalArrangementCheckResult.legalArrangementCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checks, legalArrangementCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KYCLegalArrangementCheckResult {\n");
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
    sb.append("    legalArrangementCode: ").append(toIndentedString(legalArrangementCode)).append("\n");
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
   * Create an instance of KYCLegalArrangementCheckResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KYCLegalArrangementCheckResult
   * @throws JsonProcessingException if the JSON string is invalid with respect to KYCLegalArrangementCheckResult
   */
  public static KYCLegalArrangementCheckResult fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, KYCLegalArrangementCheckResult.class);
  }
/**
  * Convert an instance of KYCLegalArrangementCheckResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

