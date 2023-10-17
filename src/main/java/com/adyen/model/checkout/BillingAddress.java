/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
 * BillingAddress
 */
@JsonPropertyOrder({
  BillingAddress.JSON_PROPERTY_CITY,
  BillingAddress.JSON_PROPERTY_COUNTRY,
  BillingAddress.JSON_PROPERTY_HOUSE_NUMBER_OR_NAME,
  BillingAddress.JSON_PROPERTY_POSTAL_CODE,
  BillingAddress.JSON_PROPERTY_STATE_OR_PROVINCE,
  BillingAddress.JSON_PROPERTY_STREET
})

public class BillingAddress {
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

  public BillingAddress() { 
  }

  public BillingAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The name of the city. Maximum length: 3000 characters.
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The name of the city. Maximum length: 3000 characters.")
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


  public BillingAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The two-character ISO-3166-1 alpha-2 country code. For example, **US**. &gt; If you don&#39;t know the country or are not collecting the country from the shopper, provide &#x60;country&#x60; as &#x60;ZZ&#x60;.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "The two-character ISO-3166-1 alpha-2 country code. For example, **US**. > If you don't know the country or are not collecting the country from the shopper, provide `country` as `ZZ`.")
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


  public BillingAddress houseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
    return this;
  }

   /**
   * The number or name of the house. Maximum length: 3000 characters.
   * @return houseNumberOrName
  **/
  @ApiModelProperty(required = true, value = "The number or name of the house. Maximum length: 3000 characters.")
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


  public BillingAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * A maximum of five digits for an address in the US, or a maximum of ten characters for an address in all other countries.
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "A maximum of five digits for an address in the US, or a maximum of ten characters for an address in all other countries.")
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


  public BillingAddress stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * The two-character ISO 3166-2 state or province code. For example, **CA** in the US or **ON** in Canada. &gt; Required for the US and Canada.
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "The two-character ISO 3166-2 state or province code. For example, **CA** in the US or **ON** in Canada. > Required for the US and Canada.")
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


  public BillingAddress street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The name of the street. Maximum length: 3000 characters. &gt; The house number should not be included in this field; it should be separately provided via &#x60;houseNumberOrName&#x60;.
   * @return street
  **/
  @ApiModelProperty(required = true, value = "The name of the street. Maximum length: 3000 characters. > The house number should not be included in this field; it should be separately provided via `houseNumberOrName`.")
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
   * Return true if this BillingAddress object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingAddress billingAddress = (BillingAddress) o;
    return Objects.equals(this.city, billingAddress.city) &&
        Objects.equals(this.country, billingAddress.country) &&
        Objects.equals(this.houseNumberOrName, billingAddress.houseNumberOrName) &&
        Objects.equals(this.postalCode, billingAddress.postalCode) &&
        Objects.equals(this.stateOrProvince, billingAddress.stateOrProvince) &&
        Objects.equals(this.street, billingAddress.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, houseNumberOrName, postalCode, stateOrProvince, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAddress {\n");
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
   * Create an instance of BillingAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BillingAddress
   * @throws JsonProcessingException if the JSON string is invalid with respect to BillingAddress
   */
  public static BillingAddress fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BillingAddress.class);
  }
/**
  * Convert an instance of BillingAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

