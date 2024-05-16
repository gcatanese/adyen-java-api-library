/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.DelegatedAuthenticationData;
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
 * RegisterSCARequest
 */
@JsonPropertyOrder({
  RegisterSCARequest.JSON_PROPERTY_PAYMENT_INSTRUMENT_ID,
  RegisterSCARequest.JSON_PROPERTY_STRONG_CUSTOMER_AUTHENTICATION
})

public class RegisterSCARequest {
  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  private String paymentInstrumentId;

  public static final String JSON_PROPERTY_STRONG_CUSTOMER_AUTHENTICATION = "strongCustomerAuthentication";
  private DelegatedAuthenticationData strongCustomerAuthentication;

  public RegisterSCARequest() { 
  }

  public RegisterSCARequest paymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The unique identifier of the payment instrument for which you are registering the SCA device.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the payment instrument for which you are registering the SCA device.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


 /**
  * The unique identifier of the payment instrument for which you are registering the SCA device.
  *
  * @param paymentInstrumentId
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public RegisterSCARequest strongCustomerAuthentication(DelegatedAuthenticationData strongCustomerAuthentication) {
    this.strongCustomerAuthentication = strongCustomerAuthentication;
    return this;
  }

   /**
   * Get strongCustomerAuthentication
   * @return strongCustomerAuthentication
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STRONG_CUSTOMER_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DelegatedAuthenticationData getStrongCustomerAuthentication() {
    return strongCustomerAuthentication;
  }


 /**
  * strongCustomerAuthentication
  *
  * @param strongCustomerAuthentication
  */ 
  @JsonProperty(JSON_PROPERTY_STRONG_CUSTOMER_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrongCustomerAuthentication(DelegatedAuthenticationData strongCustomerAuthentication) {
    this.strongCustomerAuthentication = strongCustomerAuthentication;
  }


  /**
   * Return true if this RegisterSCARequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterSCARequest registerSCARequest = (RegisterSCARequest) o;
    return Objects.equals(this.paymentInstrumentId, registerSCARequest.paymentInstrumentId) &&
        Objects.equals(this.strongCustomerAuthentication, registerSCARequest.strongCustomerAuthentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, strongCustomerAuthentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterSCARequest {\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    strongCustomerAuthentication: ").append(toIndentedString(strongCustomerAuthentication)).append("\n");
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
   * Create an instance of RegisterSCARequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RegisterSCARequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to RegisterSCARequest
   */
  public static RegisterSCARequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RegisterSCARequest.class);
  }
/**
  * Convert an instance of RegisterSCARequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

