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
 * ViasAddress
 */
@JsonPropertyOrder({
  ViasAddress.JSON_PROPERTY_CITY,
  ViasAddress.JSON_PROPERTY_COUNTRY,
  ViasAddress.JSON_PROPERTY_HOUSE_NUMBER_OR_NAME,
  ViasAddress.JSON_PROPERTY_POSTAL_CODE,
  ViasAddress.JSON_PROPERTY_STATE_OR_PROVINCE,
  ViasAddress.JSON_PROPERTY_STREET
})

public class ViasAddress {
  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_HOUSE_NUMBER_OR_NAME = "houseNumberOrName";
  private String houseNumberOrName;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_STATE_OR_PROVINCE = "stateOrProvince";
  private String stateOrProvince;

  public static final String JSON_PROPERTY_STREET = "street";
  private String street;

  public ViasAddress() { 
  }

  public ViasAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The name of the city. Required if the &#x60;houseNumberOrName&#x60;, &#x60;street&#x60;, &#x60;postalCode&#x60;, or &#x60;stateOrProvince&#x60; are provided.
   * @return city
  **/
  @ApiModelProperty(value = "The name of the city. Required if the `houseNumberOrName`, `street`, `postalCode`, or `stateOrProvince` are provided.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public ViasAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The two-character country code of the address in ISO-3166-1 alpha-2 format. For example, **NL**.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "The two-character country code of the address in ISO-3166-1 alpha-2 format. For example, **NL**.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public ViasAddress houseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
    return this;
  }

   /**
   * The number or name of the house.
   * @return houseNumberOrName
  **/
  @ApiModelProperty(value = "The number or name of the house.")
  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER_OR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHouseNumberOrName() {
    return houseNumberOrName;
  }


  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER_OR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHouseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
  }


  public ViasAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code. Required if the &#x60;houseNumberOrName&#x60;, &#x60;street&#x60;, &#x60;city&#x60;, or &#x60;stateOrProvince&#x60; are provided.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.
   * @return postalCode
  **/
  @ApiModelProperty(value = "The postal code. Required if the `houseNumberOrName`, `street`, `city`, or `stateOrProvince` are provided.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public ViasAddress stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * The abbreviation of the state or province. Required if the &#x60;houseNumberOrName&#x60;, &#x60;street&#x60;, &#x60;city&#x60;, or &#x60;postalCode&#x60; are provided.   Maximum length:  * 2 characters for addresses in the US or Canada.  * 3 characters for all other countries. 
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "The abbreviation of the state or province. Required if the `houseNumberOrName`, `street`, `city`, or `postalCode` are provided.   Maximum length:  * 2 characters for addresses in the US or Canada.  * 3 characters for all other countries. ")
  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateOrProvince() {
    return stateOrProvince;
  }


  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  public ViasAddress street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The name of the street. Required if the &#x60;houseNumberOrName&#x60;, &#x60;city&#x60;, &#x60;postalCode&#x60;, or &#x60;stateOrProvince&#x60; are provided.
   * @return street
  **/
  @ApiModelProperty(value = "The name of the street. Required if the `houseNumberOrName`, `city`, `postalCode`, or `stateOrProvince` are provided.")
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }


  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(String street) {
    this.street = street;
  }


  /**
   * Return true if this ViasAddress object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViasAddress viasAddress = (ViasAddress) o;
    return Objects.equals(this.city, viasAddress.city) &&
        Objects.equals(this.country, viasAddress.country) &&
        Objects.equals(this.houseNumberOrName, viasAddress.houseNumberOrName) &&
        Objects.equals(this.postalCode, viasAddress.postalCode) &&
        Objects.equals(this.stateOrProvince, viasAddress.stateOrProvince) &&
        Objects.equals(this.street, viasAddress.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, houseNumberOrName, postalCode, stateOrProvince, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViasAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    houseNumberOrName: ").append(toIndentedString(houseNumberOrName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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
   * Create an instance of ViasAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ViasAddress
   * @throws JsonProcessingException if the JSON string is invalid with respect to ViasAddress
   */
  public static ViasAddress fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ViasAddress.class);
  }
/**
  * Convert an instance of ViasAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

