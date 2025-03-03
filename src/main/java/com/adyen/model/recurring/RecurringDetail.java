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
import com.adyen.model.recurring.Address;
import com.adyen.model.recurring.BankAccount;
import com.adyen.model.recurring.Card;
import com.adyen.model.recurring.Name;
import com.adyen.model.recurring.TokenDetails;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * RecurringDetail
 */
@JsonPropertyOrder({
  RecurringDetail.JSON_PROPERTY_ADDITIONAL_DATA,
  RecurringDetail.JSON_PROPERTY_ALIAS,
  RecurringDetail.JSON_PROPERTY_ALIAS_TYPE,
  RecurringDetail.JSON_PROPERTY_BANK,
  RecurringDetail.JSON_PROPERTY_BILLING_ADDRESS,
  RecurringDetail.JSON_PROPERTY_CARD,
  RecurringDetail.JSON_PROPERTY_CONTRACT_TYPES,
  RecurringDetail.JSON_PROPERTY_CREATION_DATE,
  RecurringDetail.JSON_PROPERTY_FIRST_PSP_REFERENCE,
  RecurringDetail.JSON_PROPERTY_NAME,
  RecurringDetail.JSON_PROPERTY_NETWORK_TX_REFERENCE,
  RecurringDetail.JSON_PROPERTY_PAYMENT_METHOD_VARIANT,
  RecurringDetail.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  RecurringDetail.JSON_PROPERTY_SHOPPER_NAME,
  RecurringDetail.JSON_PROPERTY_SOCIAL_SECURITY_NUMBER,
  RecurringDetail.JSON_PROPERTY_TOKEN_DETAILS,
  RecurringDetail.JSON_PROPERTY_VARIANT
})

public class RecurringDetail {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_ALIAS_TYPE = "aliasType";
  private String aliasType;

  public static final String JSON_PROPERTY_BANK = "bank";
  private BankAccount bank;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_CARD = "card";
  private Card card;

  public static final String JSON_PROPERTY_CONTRACT_TYPES = "contractTypes";
  private List<String> contractTypes = null;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_FIRST_PSP_REFERENCE = "firstPspReference";
  private String firstPspReference;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NETWORK_TX_REFERENCE = "networkTxReference";
  private String networkTxReference;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_VARIANT = "paymentMethodVariant";
  private String paymentMethodVariant;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_SHOPPER_NAME = "shopperName";
  private Name shopperName;

  public static final String JSON_PROPERTY_SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
  private String socialSecurityNumber;

  public static final String JSON_PROPERTY_TOKEN_DETAILS = "tokenDetails";
  private TokenDetails tokenDetails;

  public static final String JSON_PROPERTY_VARIANT = "variant";
  private String variant;

  public RecurringDetail() { 
  }

  /**
   * This field contains additional data, which may be returned in a particular response.  The additionalData object consists of entries, each of which includes the key and value.
   *
   * @param additionalData
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public RecurringDetail putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

  /**
   * This field contains additional data, which may be returned in a particular response.  The additionalData object consists of entries, each of which includes the key and value.
   * @return additionalData
   */
  @ApiModelProperty(value = "This field contains additional data, which may be returned in a particular response.  The additionalData object consists of entries, each of which includes the key and value.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getAdditionalData() {
    return additionalData;
  }

  /**
   * This field contains additional data, which may be returned in a particular response.  The additionalData object consists of entries, each of which includes the key and value.
   *
   * @param additionalData
   */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }

  /**
   * The alias of the credit card number.  Applies only to recurring contracts storing credit card details
   *
   * @param alias
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * The alias of the credit card number.  Applies only to recurring contracts storing credit card details
   * @return alias
   */
  @ApiModelProperty(value = "The alias of the credit card number.  Applies only to recurring contracts storing credit card details")
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  /**
   * The alias of the credit card number.  Applies only to recurring contracts storing credit card details
   *
   * @param alias
   */ 
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   * The alias type of the credit card number.  Applies only to recurring contracts storing credit card details.
   *
   * @param aliasType
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail aliasType(String aliasType) {
    this.aliasType = aliasType;
    return this;
  }

  /**
   * The alias type of the credit card number.  Applies only to recurring contracts storing credit card details.
   * @return aliasType
   */
  @ApiModelProperty(value = "The alias type of the credit card number.  Applies only to recurring contracts storing credit card details.")
  @JsonProperty(JSON_PROPERTY_ALIAS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAliasType() {
    return aliasType;
  }

  /**
   * The alias type of the credit card number.  Applies only to recurring contracts storing credit card details.
   *
   * @param aliasType
   */ 
  @JsonProperty(JSON_PROPERTY_ALIAS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAliasType(String aliasType) {
    this.aliasType = aliasType;
  }

  /**
   * bank
   *
   * @param bank
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail bank(BankAccount bank) {
    this.bank = bank;
    return this;
  }

  /**
   * bank
   * @return bank
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BankAccount getBank() {
    return bank;
  }

  /**
   * bank
   *
   * @param bank
   */ 
  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBank(BankAccount bank) {
    this.bank = bank;
  }

  /**
   * billingAddress
   *
   * @param billingAddress
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * billingAddress
   * @return billingAddress
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getBillingAddress() {
    return billingAddress;
  }

  /**
   * billingAddress
   *
   * @param billingAddress
   */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * card
   *
   * @param card
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * card
   * @return card
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Card getCard() {
    return card;
  }

  /**
   * card
   *
   * @param card
   */ 
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCard(Card card) {
    this.card = card;
  }

  /**
   * Types of recurring contracts.
   *
   * @param contractTypes
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail contractTypes(List<String> contractTypes) {
    this.contractTypes = contractTypes;
    return this;
  }

  public RecurringDetail addContractTypesItem(String contractTypesItem) {
    if (this.contractTypes == null) {
      this.contractTypes = new ArrayList<>();
    }
    this.contractTypes.add(contractTypesItem);
    return this;
  }

  /**
   * Types of recurring contracts.
   * @return contractTypes
   */
  @ApiModelProperty(value = "Types of recurring contracts.")
  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getContractTypes() {
    return contractTypes;
  }

  /**
   * Types of recurring contracts.
   *
   * @param contractTypes
   */ 
  @JsonProperty(JSON_PROPERTY_CONTRACT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractTypes(List<String> contractTypes) {
    this.contractTypes = contractTypes;
  }

  /**
   * The date when the recurring details were created.
   *
   * @param creationDate
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date when the recurring details were created.
   * @return creationDate
   */
  @ApiModelProperty(value = "The date when the recurring details were created.")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * The date when the recurring details were created.
   *
   * @param creationDate
   */ 
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * The &#x60;pspReference&#x60; of the first recurring payment that created the recurring detail.
   *
   * @param firstPspReference
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail firstPspReference(String firstPspReference) {
    this.firstPspReference = firstPspReference;
    return this;
  }

  /**
   * The &#x60;pspReference&#x60; of the first recurring payment that created the recurring detail.
   * @return firstPspReference
   */
  @ApiModelProperty(value = "The `pspReference` of the first recurring payment that created the recurring detail.")
  @JsonProperty(JSON_PROPERTY_FIRST_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirstPspReference() {
    return firstPspReference;
  }

  /**
   * The &#x60;pspReference&#x60; of the first recurring payment that created the recurring detail.
   *
   * @param firstPspReference
   */ 
  @JsonProperty(JSON_PROPERTY_FIRST_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstPspReference(String firstPspReference) {
    this.firstPspReference = firstPspReference;
  }

  /**
   * An optional descriptive name for this recurring detail.
   *
   * @param name
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * An optional descriptive name for this recurring detail.
   * @return name
   */
  @ApiModelProperty(value = "An optional descriptive name for this recurring detail.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  /**
   * An optional descriptive name for this recurring detail.
   *
   * @param name
   */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID.
   *
   * @param networkTxReference
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail networkTxReference(String networkTxReference) {
    this.networkTxReference = networkTxReference;
    return this;
  }

  /**
   * Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID.
   * @return networkTxReference
   */
  @ApiModelProperty(value = "Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID.")
  @JsonProperty(JSON_PROPERTY_NETWORK_TX_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNetworkTxReference() {
    return networkTxReference;
  }

  /**
   * Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID.
   *
   * @param networkTxReference
   */ 
  @JsonProperty(JSON_PROPERTY_NETWORK_TX_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkTxReference(String networkTxReference) {
    this.networkTxReference = networkTxReference;
  }

  /**
   * The  type or sub-brand of a payment method used, e.g. Visa Debit, Visa Corporate, etc. For more information, refer to [PaymentMethodVariant](https://docs.adyen.com/development-resources/paymentmethodvariant).
   *
   * @param paymentMethodVariant
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail paymentMethodVariant(String paymentMethodVariant) {
    this.paymentMethodVariant = paymentMethodVariant;
    return this;
  }

  /**
   * The  type or sub-brand of a payment method used, e.g. Visa Debit, Visa Corporate, etc. For more information, refer to [PaymentMethodVariant](https://docs.adyen.com/development-resources/paymentmethodvariant).
   * @return paymentMethodVariant
   */
  @ApiModelProperty(value = "The  type or sub-brand of a payment method used, e.g. Visa Debit, Visa Corporate, etc. For more information, refer to [PaymentMethodVariant](https://docs.adyen.com/development-resources/paymentmethodvariant).")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentMethodVariant() {
    return paymentMethodVariant;
  }

  /**
   * The  type or sub-brand of a payment method used, e.g. Visa Debit, Visa Corporate, etc. For more information, refer to [PaymentMethodVariant](https://docs.adyen.com/development-resources/paymentmethodvariant).
   *
   * @param paymentMethodVariant
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodVariant(String paymentMethodVariant) {
    this.paymentMethodVariant = paymentMethodVariant;
  }

  /**
   * The reference that uniquely identifies the recurring detail.
   *
   * @param recurringDetailReference
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

  /**
   * The reference that uniquely identifies the recurring detail.
   * @return recurringDetailReference
   */
  @ApiModelProperty(required = true, value = "The reference that uniquely identifies the recurring detail.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }

  /**
   * The reference that uniquely identifies the recurring detail.
   *
   * @param recurringDetailReference
   */ 
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }

  /**
   * shopperName
   *
   * @param shopperName
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail shopperName(Name shopperName) {
    this.shopperName = shopperName;
    return this;
  }

  /**
   * shopperName
   * @return shopperName
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Name getShopperName() {
    return shopperName;
  }

  /**
   * shopperName
   *
   * @param shopperName
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperName(Name shopperName) {
    this.shopperName = shopperName;
  }

  /**
   * A shopper&#39;s social security number (only in countries where it is legal to collect).
   *
   * @param socialSecurityNumber
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

  /**
   * A shopper&#39;s social security number (only in countries where it is legal to collect).
   * @return socialSecurityNumber
   */
  @ApiModelProperty(value = "A shopper's social security number (only in countries where it is legal to collect).")
  @JsonProperty(JSON_PROPERTY_SOCIAL_SECURITY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  /**
   * A shopper&#39;s social security number (only in countries where it is legal to collect).
   *
   * @param socialSecurityNumber
   */ 
  @JsonProperty(JSON_PROPERTY_SOCIAL_SECURITY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  /**
   * tokenDetails
   *
   * @param tokenDetails
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail tokenDetails(TokenDetails tokenDetails) {
    this.tokenDetails = tokenDetails;
    return this;
  }

  /**
   * tokenDetails
   * @return tokenDetails
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TokenDetails getTokenDetails() {
    return tokenDetails;
  }

  /**
   * tokenDetails
   *
   * @param tokenDetails
   */ 
  @JsonProperty(JSON_PROPERTY_TOKEN_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenDetails(TokenDetails tokenDetails) {
    this.tokenDetails = tokenDetails;
  }

  /**
   * The payment method, such as “mc\&quot;, \&quot;visa\&quot;, \&quot;ideal\&quot;, \&quot;paypal\&quot;.
   *
   * @param variant
   * @return the current {@code RecurringDetail} instance, allowing for method chaining
   */
  public RecurringDetail variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * The payment method, such as “mc\&quot;, \&quot;visa\&quot;, \&quot;ideal\&quot;, \&quot;paypal\&quot;.
   * @return variant
   */
  @ApiModelProperty(required = true, value = "The payment method, such as “mc\", \"visa\", \"ideal\", \"paypal\".")
  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariant() {
    return variant;
  }

  /**
   * The payment method, such as “mc\&quot;, \&quot;visa\&quot;, \&quot;ideal\&quot;, \&quot;paypal\&quot;.
   *
   * @param variant
   */ 
  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariant(String variant) {
    this.variant = variant;
  }

  /**
   * Return true if this RecurringDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDetail recurringDetail = (RecurringDetail) o;
    return Objects.equals(this.additionalData, recurringDetail.additionalData) &&
        Objects.equals(this.alias, recurringDetail.alias) &&
        Objects.equals(this.aliasType, recurringDetail.aliasType) &&
        Objects.equals(this.bank, recurringDetail.bank) &&
        Objects.equals(this.billingAddress, recurringDetail.billingAddress) &&
        Objects.equals(this.card, recurringDetail.card) &&
        Objects.equals(this.contractTypes, recurringDetail.contractTypes) &&
        Objects.equals(this.creationDate, recurringDetail.creationDate) &&
        Objects.equals(this.firstPspReference, recurringDetail.firstPspReference) &&
        Objects.equals(this.name, recurringDetail.name) &&
        Objects.equals(this.networkTxReference, recurringDetail.networkTxReference) &&
        Objects.equals(this.paymentMethodVariant, recurringDetail.paymentMethodVariant) &&
        Objects.equals(this.recurringDetailReference, recurringDetail.recurringDetailReference) &&
        Objects.equals(this.shopperName, recurringDetail.shopperName) &&
        Objects.equals(this.socialSecurityNumber, recurringDetail.socialSecurityNumber) &&
        Objects.equals(this.tokenDetails, recurringDetail.tokenDetails) &&
        Objects.equals(this.variant, recurringDetail.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, alias, aliasType, bank, billingAddress, card, contractTypes, creationDate, firstPspReference, name, networkTxReference, paymentMethodVariant, recurringDetailReference, shopperName, socialSecurityNumber, tokenDetails, variant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDetail {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    aliasType: ").append(toIndentedString(aliasType)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    contractTypes: ").append(toIndentedString(contractTypes)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    firstPspReference: ").append(toIndentedString(firstPspReference)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkTxReference: ").append(toIndentedString(networkTxReference)).append("\n");
    sb.append("    paymentMethodVariant: ").append(toIndentedString(paymentMethodVariant)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    tokenDetails: ").append(toIndentedString(tokenDetails)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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
   * Create an instance of RecurringDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecurringDetail
   * @throws JsonProcessingException if the JSON string is invalid with respect to RecurringDetail
   */
  public static RecurringDetail fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RecurringDetail.class);
  }
/**
  * Convert an instance of RecurringDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
