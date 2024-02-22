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
 * AdditionalDataModifications
 */
@JsonPropertyOrder({
  AdditionalDataModifications.JSON_PROPERTY_INSTALLMENT_PAYMENT_DATA_SELECTED_INSTALLMENT_OPTION
})

public class AdditionalDataModifications {
  public static final String JSON_PROPERTY_INSTALLMENT_PAYMENT_DATA_SELECTED_INSTALLMENT_OPTION = "installmentPaymentData.selectedInstallmentOption";
  private String installmentPaymentDataSelectedInstallmentOption;

  public AdditionalDataModifications() { 
  }

  public AdditionalDataModifications installmentPaymentDataSelectedInstallmentOption(String installmentPaymentDataSelectedInstallmentOption) {
    this.installmentPaymentDataSelectedInstallmentOption = installmentPaymentDataSelectedInstallmentOption;
    return this;
  }

   /**
   * This is the installment option selected by the shopper. It is required only if specified by the user.
   * @return installmentPaymentDataSelectedInstallmentOption
  **/
  @ApiModelProperty(value = "This is the installment option selected by the shopper. It is required only if specified by the user.")
  @JsonProperty(JSON_PROPERTY_INSTALLMENT_PAYMENT_DATA_SELECTED_INSTALLMENT_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstallmentPaymentDataSelectedInstallmentOption() {
    return installmentPaymentDataSelectedInstallmentOption;
  }


 /**
  * This is the installment option selected by the shopper. It is required only if specified by the user.
  *
  * @param installmentPaymentDataSelectedInstallmentOption
  */ 
  @JsonProperty(JSON_PROPERTY_INSTALLMENT_PAYMENT_DATA_SELECTED_INSTALLMENT_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallmentPaymentDataSelectedInstallmentOption(String installmentPaymentDataSelectedInstallmentOption) {
    this.installmentPaymentDataSelectedInstallmentOption = installmentPaymentDataSelectedInstallmentOption;
  }


  /**
   * Return true if this AdditionalDataModifications object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataModifications additionalDataModifications = (AdditionalDataModifications) o;
    return Objects.equals(this.installmentPaymentDataSelectedInstallmentOption, additionalDataModifications.installmentPaymentDataSelectedInstallmentOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPaymentDataSelectedInstallmentOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataModifications {\n");
    sb.append("    installmentPaymentDataSelectedInstallmentOption: ").append(toIndentedString(installmentPaymentDataSelectedInstallmentOption)).append("\n");
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
   * Create an instance of AdditionalDataModifications given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalDataModifications
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalDataModifications
   */
  public static AdditionalDataModifications fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalDataModifications.class);
  }
/**
  * Convert an instance of AdditionalDataModifications to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

