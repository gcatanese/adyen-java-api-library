/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.SourceOfFunds;
import com.adyen.model.legalentitymanagement.WebData;
import com.adyen.model.legalentitymanagement.WebDataExemption;
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
 * BusinessLineInfoUpdate
 */
@JsonPropertyOrder({
  BusinessLineInfoUpdate.JSON_PROPERTY_CAPABILITY,
  BusinessLineInfoUpdate.JSON_PROPERTY_INDUSTRY_CODE,
  BusinessLineInfoUpdate.JSON_PROPERTY_LEGAL_ENTITY_ID,
  BusinessLineInfoUpdate.JSON_PROPERTY_SALES_CHANNELS,
  BusinessLineInfoUpdate.JSON_PROPERTY_SERVICE,
  BusinessLineInfoUpdate.JSON_PROPERTY_SOURCE_OF_FUNDS,
  BusinessLineInfoUpdate.JSON_PROPERTY_WEB_DATA,
  BusinessLineInfoUpdate.JSON_PROPERTY_WEB_DATA_EXEMPTION
})

public class BusinessLineInfoUpdate {
  /**
   * The capability for which you are creating the business line. For example, **receivePayments**.
   */
  public enum CapabilityEnum {
    RECEIVEPAYMENTS("receivePayments"),
    
    RECEIVEFROMPLATFORMPAYMENTS("receiveFromPlatformPayments"),
    
    ISSUEBANKACCOUNT("issueBankAccount");

    private String value;

    CapabilityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CapabilityEnum fromValue(String value) {
      for (CapabilityEnum b : CapabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CAPABILITY = "capability";
  private CapabilityEnum capability;

  public static final String JSON_PROPERTY_INDUSTRY_CODE = "industryCode";
  private String industryCode;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_ID = "legalEntityId";
  private String legalEntityId;

  public static final String JSON_PROPERTY_SALES_CHANNELS = "salesChannels";
  private List<String> salesChannels = null;

  /**
   * The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**  
   */
  public enum ServiceEnum {
    PAYMENTPROCESSING("paymentProcessing"),
    
    BANKING("banking");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceEnum fromValue(String value) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SERVICE = "service";
  private ServiceEnum service;

  public static final String JSON_PROPERTY_SOURCE_OF_FUNDS = "sourceOfFunds";
  private SourceOfFunds sourceOfFunds;

  public static final String JSON_PROPERTY_WEB_DATA = "webData";
  private List<WebData> webData = null;

  public static final String JSON_PROPERTY_WEB_DATA_EXEMPTION = "webDataExemption";
  private WebDataExemption webDataExemption;

  public BusinessLineInfoUpdate() { 
  }

  public BusinessLineInfoUpdate capability(CapabilityEnum capability) {
    this.capability = capability;
    return this;
  }

   /**
   * The capability for which you are creating the business line. For example, **receivePayments**.
   * @return capability
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The capability for which you are creating the business line. For example, **receivePayments**.")
  @JsonProperty(JSON_PROPERTY_CAPABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CapabilityEnum getCapability() {
    return capability;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_CAPABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapability(CapabilityEnum capability) {
    this.capability = capability;
  }


  public BusinessLineInfoUpdate industryCode(String industryCode) {
    this.industryCode = industryCode;
    return this;
  }

   /**
   * A code that represents the industry of your legal entity. For example, **4431A** for computer software stores.
   * @return industryCode
  **/
  @ApiModelProperty(value = "A code that represents the industry of your legal entity. For example, **4431A** for computer software stores.")
  @JsonProperty(JSON_PROPERTY_INDUSTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndustryCode() {
    return industryCode;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }


  public BusinessLineInfoUpdate legalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.
   * @return legalEntityId
  **/
  @ApiModelProperty(value = "Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegalEntityId() {
    return legalEntityId;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public BusinessLineInfoUpdate salesChannels(List<String> salesChannels) {
    this.salesChannels = salesChannels;
    return this;
  }

  public BusinessLineInfoUpdate addSalesChannelsItem(String salesChannelsItem) {
    if (this.salesChannels == null) {
      this.salesChannels = new ArrayList<>();
    }
    this.salesChannels.add(salesChannelsItem);
    return this;
  }

   /**
   * A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the &#x60;service&#x60; **paymentProcessing**.
   * @return salesChannels
  **/
  @ApiModelProperty(value = "A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the `service` **paymentProcessing**.")
  @JsonProperty(JSON_PROPERTY_SALES_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSalesChannels() {
    return salesChannels;
  }


  @JsonProperty(JSON_PROPERTY_SALES_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalesChannels(List<String> salesChannels) {
    this.salesChannels = salesChannels;
  }


  public BusinessLineInfoUpdate service(ServiceEnum service) {
    this.service = service;
    return this;
  }

   /**
   * The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**  
   * @return service
  **/
  @ApiModelProperty(value = "The service for which you are creating the business line.    Possible values: *  **paymentProcessing** *  **banking**  ")
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceEnum getService() {
    return service;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(ServiceEnum service) {
    this.service = service;
  }


  public BusinessLineInfoUpdate sourceOfFunds(SourceOfFunds sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

   /**
   * Get sourceOfFunds
   * @return sourceOfFunds
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_OF_FUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceOfFunds getSourceOfFunds() {
    return sourceOfFunds;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_OF_FUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceOfFunds(SourceOfFunds sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }


  public BusinessLineInfoUpdate webData(List<WebData> webData) {
    this.webData = webData;
    return this;
  }

  public BusinessLineInfoUpdate addWebDataItem(WebData webDataItem) {
    if (this.webData == null) {
      this.webData = new ArrayList<>();
    }
    this.webData.add(webDataItem);
    return this;
  }

   /**
   * List of website URLs where your user&#39;s goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the &#x60;webDataExemption&#x60; object.
   * @return webData
  **/
  @ApiModelProperty(value = "List of website URLs where your user's goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the `webDataExemption` object.")
  @JsonProperty(JSON_PROPERTY_WEB_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WebData> getWebData() {
    return webData;
  }


  @JsonProperty(JSON_PROPERTY_WEB_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebData(List<WebData> webData) {
    this.webData = webData;
  }


  public BusinessLineInfoUpdate webDataExemption(WebDataExemption webDataExemption) {
    this.webDataExemption = webDataExemption;
    return this;
  }

   /**
   * Get webDataExemption
   * @return webDataExemption
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEB_DATA_EXEMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebDataExemption getWebDataExemption() {
    return webDataExemption;
  }


  @JsonProperty(JSON_PROPERTY_WEB_DATA_EXEMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebDataExemption(WebDataExemption webDataExemption) {
    this.webDataExemption = webDataExemption;
  }


  /**
   * Return true if this BusinessLineInfoUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessLineInfoUpdate businessLineInfoUpdate = (BusinessLineInfoUpdate) o;
    return Objects.equals(this.capability, businessLineInfoUpdate.capability) &&
        Objects.equals(this.industryCode, businessLineInfoUpdate.industryCode) &&
        Objects.equals(this.legalEntityId, businessLineInfoUpdate.legalEntityId) &&
        Objects.equals(this.salesChannels, businessLineInfoUpdate.salesChannels) &&
        Objects.equals(this.service, businessLineInfoUpdate.service) &&
        Objects.equals(this.sourceOfFunds, businessLineInfoUpdate.sourceOfFunds) &&
        Objects.equals(this.webData, businessLineInfoUpdate.webData) &&
        Objects.equals(this.webDataExemption, businessLineInfoUpdate.webDataExemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, industryCode, legalEntityId, salesChannels, service, sourceOfFunds, webData, webDataExemption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessLineInfoUpdate {\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    salesChannels: ").append(toIndentedString(salesChannels)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    webData: ").append(toIndentedString(webData)).append("\n");
    sb.append("    webDataExemption: ").append(toIndentedString(webDataExemption)).append("\n");
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
   * Create an instance of BusinessLineInfoUpdate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BusinessLineInfoUpdate
   * @throws JsonProcessingException if the JSON string is invalid with respect to BusinessLineInfoUpdate
   */
  public static BusinessLineInfoUpdate fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BusinessLineInfoUpdate.class);
  }
/**
  * Convert an instance of BusinessLineInfoUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

