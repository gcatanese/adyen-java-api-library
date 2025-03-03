/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
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
import com.adyen.model.checkout.Amount;
import com.adyen.model.checkout.EncryptedOrderData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PaymentMethodsRequest
 */
@JsonPropertyOrder({
  PaymentMethodsRequest.JSON_PROPERTY_ADDITIONAL_DATA,
  PaymentMethodsRequest.JSON_PROPERTY_ALLOWED_PAYMENT_METHODS,
  PaymentMethodsRequest.JSON_PROPERTY_AMOUNT,
  PaymentMethodsRequest.JSON_PROPERTY_BLOCKED_PAYMENT_METHODS,
  PaymentMethodsRequest.JSON_PROPERTY_CHANNEL,
  PaymentMethodsRequest.JSON_PROPERTY_COUNTRY_CODE,
  PaymentMethodsRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  PaymentMethodsRequest.JSON_PROPERTY_ORDER,
  PaymentMethodsRequest.JSON_PROPERTY_SHOPPER_CONVERSION_ID,
  PaymentMethodsRequest.JSON_PROPERTY_SHOPPER_LOCALE,
  PaymentMethodsRequest.JSON_PROPERTY_SHOPPER_REFERENCE,
  PaymentMethodsRequest.JSON_PROPERTY_SPLIT_CARD_FUNDING_SOURCES,
  PaymentMethodsRequest.JSON_PROPERTY_STORE,
  PaymentMethodsRequest.JSON_PROPERTY_STORE_FILTRATION_MODE
})

public class PaymentMethodsRequest {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHODS = "allowedPaymentMethods";
  private List<String> allowedPaymentMethods = null;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_BLOCKED_PAYMENT_METHODS = "blockedPaymentMethods";
  private List<String> blockedPaymentMethods = null;

  /**
   * The platform where a payment transaction takes place. This field can be used for filtering out payment methods that are only available on specific platforms. Possible values: * iOS * Android * Web
   */
  public enum ChannelEnum {
    IOS("iOS"),
    
    ANDROID("Android"),
    
    WEB("Web");

    private String value;

    ChannelEnum(String value) {
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
    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private ChannelEnum channel;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_ORDER = "order";
  private EncryptedOrderData order;

  public static final String JSON_PROPERTY_SHOPPER_CONVERSION_ID = "shopperConversionId";
  private String shopperConversionId;

  public static final String JSON_PROPERTY_SHOPPER_LOCALE = "shopperLocale";
  private String shopperLocale;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public static final String JSON_PROPERTY_SPLIT_CARD_FUNDING_SOURCES = "splitCardFundingSources";
  private Boolean splitCardFundingSources;

  public static final String JSON_PROPERTY_STORE = "store";
  private String store;

  /**
   * Specifies how payment methods should be filtered based on the &#39;store&#39; parameter:   - &#39;exclusive&#39;: Only payment methods belonging to the specified &#39;store&#39; are returned.   - &#39;inclusive&#39;: Payment methods from the &#39;store&#39; and those not associated with any other store are returned.
   */
  public enum StoreFiltrationModeEnum {
    EXCLUSIVE("exclusive"),
    
    INCLUSIVE("inclusive"),
    
    SKIPFILTER("skipFilter");

    private String value;

    StoreFiltrationModeEnum(String value) {
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
    public static StoreFiltrationModeEnum fromValue(String value) {
      for (StoreFiltrationModeEnum b : StoreFiltrationModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STORE_FILTRATION_MODE = "storeFiltrationMode";
  private StoreFiltrationModeEnum storeFiltrationMode;

  public PaymentMethodsRequest() { 
  }

  /**
   * This field contains additional data, which may be required for a particular payment request.  The &#x60;additionalData&#x60; object consists of entries, each of which includes the key and value.
   *
   * @param additionalData
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public PaymentMethodsRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

  /**
   * This field contains additional data, which may be required for a particular payment request.  The &#x60;additionalData&#x60; object consists of entries, each of which includes the key and value.
   * @return additionalData
   */
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular payment request.  The `additionalData` object consists of entries, each of which includes the key and value.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getAdditionalData() {
    return additionalData;
  }

  /**
   * This field contains additional data, which may be required for a particular payment request.  The &#x60;additionalData&#x60; object consists of entries, each of which includes the key and value.
   *
   * @param additionalData
   */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }

  /**
   * List of payment methods to be presented to the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;allowedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60;
   *
   * @param allowedPaymentMethods
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest allowedPaymentMethods(List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
    return this;
  }

  public PaymentMethodsRequest addAllowedPaymentMethodsItem(String allowedPaymentMethodsItem) {
    if (this.allowedPaymentMethods == null) {
      this.allowedPaymentMethods = new ArrayList<>();
    }
    this.allowedPaymentMethods.add(allowedPaymentMethodsItem);
    return this;
  }

  /**
   * List of payment methods to be presented to the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;allowedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60;
   * @return allowedPaymentMethods
   */
  @ApiModelProperty(value = "List of payment methods to be presented to the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: `\"allowedPaymentMethods\":[\"ideal\",\"giropay\"]`")
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }

  /**
   * List of payment methods to be presented to the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;allowedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60;
   *
   * @param allowedPaymentMethods
   */ 
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPaymentMethods(List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount
   * @return amount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getAmount() {
    return amount;
  }

  /**
   * amount
   *
   * @param amount
   */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * List of payment methods to be hidden from the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;blockedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60;
   *
   * @param blockedPaymentMethods
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest blockedPaymentMethods(List<String> blockedPaymentMethods) {
    this.blockedPaymentMethods = blockedPaymentMethods;
    return this;
  }

  public PaymentMethodsRequest addBlockedPaymentMethodsItem(String blockedPaymentMethodsItem) {
    if (this.blockedPaymentMethods == null) {
      this.blockedPaymentMethods = new ArrayList<>();
    }
    this.blockedPaymentMethods.add(blockedPaymentMethodsItem);
    return this;
  }

  /**
   * List of payment methods to be hidden from the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;blockedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60;
   * @return blockedPaymentMethods
   */
  @ApiModelProperty(value = "List of payment methods to be hidden from the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: `\"blockedPaymentMethods\":[\"ideal\",\"giropay\"]`")
  @JsonProperty(JSON_PROPERTY_BLOCKED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getBlockedPaymentMethods() {
    return blockedPaymentMethods;
  }

  /**
   * List of payment methods to be hidden from the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;blockedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60;
   *
   * @param blockedPaymentMethods
   */ 
  @JsonProperty(JSON_PROPERTY_BLOCKED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockedPaymentMethods(List<String> blockedPaymentMethods) {
    this.blockedPaymentMethods = blockedPaymentMethods;
  }

  /**
   * The platform where a payment transaction takes place. This field can be used for filtering out payment methods that are only available on specific platforms. Possible values: * iOS * Android * Web
   *
   * @param channel
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest channel(ChannelEnum channel) {
    this.channel = channel;
    return this;
  }

  /**
   * The platform where a payment transaction takes place. This field can be used for filtering out payment methods that are only available on specific platforms. Possible values: * iOS * Android * Web
   * @return channel
   */
  @ApiModelProperty(value = "The platform where a payment transaction takes place. This field can be used for filtering out payment methods that are only available on specific platforms. Possible values: * iOS * Android * Web")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChannelEnum getChannel() {
    return channel;
  }

  /**
   * The platform where a payment transaction takes place. This field can be used for filtering out payment methods that are only available on specific platforms. Possible values: * iOS * Android * Web
   *
   * @param channel
   */ 
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }

  /**
   * The shopper&#39;s country code.
   *
   * @param countryCode
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The shopper&#39;s country code.
   * @return countryCode
   */
  @ApiModelProperty(value = "The shopper's country code.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountryCode() {
    return countryCode;
  }

  /**
   * The shopper&#39;s country code.
   *
   * @param countryCode
   */ 
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
   */
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account identifier, with which you want to process the transaction.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * order
   *
   * @param order
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest order(EncryptedOrderData order) {
    this.order = order;
    return this;
  }

  /**
   * order
   * @return order
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EncryptedOrderData getOrder() {
    return order;
  }

  /**
   * order
   *
   * @param order
   */ 
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(EncryptedOrderData order) {
    this.order = order;
  }

  /**
   * A unique ID that can be used to associate &#x60;/paymentMethods&#x60; and &#x60;/payments&#x60; requests with the same shopper transaction, offering insights into conversion rates.
   *
   * @param shopperConversionId
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest shopperConversionId(String shopperConversionId) {
    this.shopperConversionId = shopperConversionId;
    return this;
  }

  /**
   * A unique ID that can be used to associate &#x60;/paymentMethods&#x60; and &#x60;/payments&#x60; requests with the same shopper transaction, offering insights into conversion rates.
   * @return shopperConversionId
   */
  @ApiModelProperty(value = "A unique ID that can be used to associate `/paymentMethods` and `/payments` requests with the same shopper transaction, offering insights into conversion rates.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_CONVERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperConversionId() {
    return shopperConversionId;
  }

  /**
   * A unique ID that can be used to associate &#x60;/paymentMethods&#x60; and &#x60;/payments&#x60; requests with the same shopper transaction, offering insights into conversion rates.
   *
   * @param shopperConversionId
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_CONVERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperConversionId(String shopperConversionId) {
    this.shopperConversionId = shopperConversionId;
  }

  /**
   * The combination of a language code and a country code to specify the language to be used in the payment.
   *
   * @param shopperLocale
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest shopperLocale(String shopperLocale) {
    this.shopperLocale = shopperLocale;
    return this;
  }

  /**
   * The combination of a language code and a country code to specify the language to be used in the payment.
   * @return shopperLocale
   */
  @ApiModelProperty(value = "The combination of a language code and a country code to specify the language to be used in the payment.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperLocale() {
    return shopperLocale;
  }

  /**
   * The combination of a language code and a country code to specify the language to be used in the payment.
   *
   * @param shopperLocale
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperLocale(String shopperLocale) {
    this.shopperLocale = shopperLocale;
  }

  /**
   * Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. The value is case-sensitive and must be at least three characters. &gt; Your reference must not include personally identifiable information (PII) such as name or email address.
   *
   * @param shopperReference
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

  /**
   * Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. The value is case-sensitive and must be at least three characters. &gt; Your reference must not include personally identifiable information (PII) such as name or email address.
   * @return shopperReference
   */
  @ApiModelProperty(value = "Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. The value is case-sensitive and must be at least three characters. > Your reference must not include personally identifiable information (PII) such as name or email address.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperReference() {
    return shopperReference;
  }

  /**
   * Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. The value is case-sensitive and must be at least three characters. &gt; Your reference must not include personally identifiable information (PII) such as name or email address.
   *
   * @param shopperReference
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }

  /**
   * Boolean value indicating whether the card payment method should be split into separate debit and credit options.
   *
   * @param splitCardFundingSources
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest splitCardFundingSources(Boolean splitCardFundingSources) {
    this.splitCardFundingSources = splitCardFundingSources;
    return this;
  }

  /**
   * Boolean value indicating whether the card payment method should be split into separate debit and credit options.
   * @return splitCardFundingSources
   */
  @ApiModelProperty(value = "Boolean value indicating whether the card payment method should be split into separate debit and credit options.")
  @JsonProperty(JSON_PROPERTY_SPLIT_CARD_FUNDING_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSplitCardFundingSources() {
    return splitCardFundingSources;
  }

  /**
   * Boolean value indicating whether the card payment method should be split into separate debit and credit options.
   *
   * @param splitCardFundingSources
   */ 
  @JsonProperty(JSON_PROPERTY_SPLIT_CARD_FUNDING_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplitCardFundingSources(Boolean splitCardFundingSources) {
    this.splitCardFundingSources = splitCardFundingSources;
  }

  /**
   * Required for Adyen for Platforms integrations if you are a platform model. This is your [reference](https://docs.adyen.com/api-explorer/Management/3/post/merchants/(merchantId)/stores#request-reference) (on [balance platform](https://docs.adyen.com/platforms)) or the [storeReference](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccountHolder#request-accountHolderDetails-storeDetails-storeReference) (in the [classic integration](https://docs.adyen.com/classic-platforms/processing-payments/route-payment-to-store/#route-a-payment-to-a-store)) for the ecommerce or point-of-sale store that is processing the payment.
   *
   * @param store
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest store(String store) {
    this.store = store;
    return this;
  }

  /**
   * Required for Adyen for Platforms integrations if you are a platform model. This is your [reference](https://docs.adyen.com/api-explorer/Management/3/post/merchants/(merchantId)/stores#request-reference) (on [balance platform](https://docs.adyen.com/platforms)) or the [storeReference](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccountHolder#request-accountHolderDetails-storeDetails-storeReference) (in the [classic integration](https://docs.adyen.com/classic-platforms/processing-payments/route-payment-to-store/#route-a-payment-to-a-store)) for the ecommerce or point-of-sale store that is processing the payment.
   * @return store
   */
  @ApiModelProperty(value = "Required for Adyen for Platforms integrations if you are a platform model. This is your [reference](https://docs.adyen.com/api-explorer/Management/3/post/merchants/(merchantId)/stores#request-reference) (on [balance platform](https://docs.adyen.com/platforms)) or the [storeReference](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccountHolder#request-accountHolderDetails-storeDetails-storeReference) (in the [classic integration](https://docs.adyen.com/classic-platforms/processing-payments/route-payment-to-store/#route-a-payment-to-a-store)) for the ecommerce or point-of-sale store that is processing the payment.")
  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStore() {
    return store;
  }

  /**
   * Required for Adyen for Platforms integrations if you are a platform model. This is your [reference](https://docs.adyen.com/api-explorer/Management/3/post/merchants/(merchantId)/stores#request-reference) (on [balance platform](https://docs.adyen.com/platforms)) or the [storeReference](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccountHolder#request-accountHolderDetails-storeDetails-storeReference) (in the [classic integration](https://docs.adyen.com/classic-platforms/processing-payments/route-payment-to-store/#route-a-payment-to-a-store)) for the ecommerce or point-of-sale store that is processing the payment.
   *
   * @param store
   */ 
  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStore(String store) {
    this.store = store;
  }

  /**
   * Specifies how payment methods should be filtered based on the &#39;store&#39; parameter:   - &#39;exclusive&#39;: Only payment methods belonging to the specified &#39;store&#39; are returned.   - &#39;inclusive&#39;: Payment methods from the &#39;store&#39; and those not associated with any other store are returned.
   *
   * @param storeFiltrationMode
   * @return the current {@code PaymentMethodsRequest} instance, allowing for method chaining
   */
  public PaymentMethodsRequest storeFiltrationMode(StoreFiltrationModeEnum storeFiltrationMode) {
    this.storeFiltrationMode = storeFiltrationMode;
    return this;
  }

  /**
   * Specifies how payment methods should be filtered based on the &#39;store&#39; parameter:   - &#39;exclusive&#39;: Only payment methods belonging to the specified &#39;store&#39; are returned.   - &#39;inclusive&#39;: Payment methods from the &#39;store&#39; and those not associated with any other store are returned.
   * @return storeFiltrationMode
   */
  @ApiModelProperty(value = "Specifies how payment methods should be filtered based on the 'store' parameter:   - 'exclusive': Only payment methods belonging to the specified 'store' are returned.   - 'inclusive': Payment methods from the 'store' and those not associated with any other store are returned.")
  @JsonProperty(JSON_PROPERTY_STORE_FILTRATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StoreFiltrationModeEnum getStoreFiltrationMode() {
    return storeFiltrationMode;
  }

  /**
   * Specifies how payment methods should be filtered based on the &#39;store&#39; parameter:   - &#39;exclusive&#39;: Only payment methods belonging to the specified &#39;store&#39; are returned.   - &#39;inclusive&#39;: Payment methods from the &#39;store&#39; and those not associated with any other store are returned.
   *
   * @param storeFiltrationMode
   */ 
  @JsonProperty(JSON_PROPERTY_STORE_FILTRATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreFiltrationMode(StoreFiltrationModeEnum storeFiltrationMode) {
    this.storeFiltrationMode = storeFiltrationMode;
  }

  /**
   * Return true if this PaymentMethodsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodsRequest paymentMethodsRequest = (PaymentMethodsRequest) o;
    return Objects.equals(this.additionalData, paymentMethodsRequest.additionalData) &&
        Objects.equals(this.allowedPaymentMethods, paymentMethodsRequest.allowedPaymentMethods) &&
        Objects.equals(this.amount, paymentMethodsRequest.amount) &&
        Objects.equals(this.blockedPaymentMethods, paymentMethodsRequest.blockedPaymentMethods) &&
        Objects.equals(this.channel, paymentMethodsRequest.channel) &&
        Objects.equals(this.countryCode, paymentMethodsRequest.countryCode) &&
        Objects.equals(this.merchantAccount, paymentMethodsRequest.merchantAccount) &&
        Objects.equals(this.order, paymentMethodsRequest.order) &&
        Objects.equals(this.shopperConversionId, paymentMethodsRequest.shopperConversionId) &&
        Objects.equals(this.shopperLocale, paymentMethodsRequest.shopperLocale) &&
        Objects.equals(this.shopperReference, paymentMethodsRequest.shopperReference) &&
        Objects.equals(this.splitCardFundingSources, paymentMethodsRequest.splitCardFundingSources) &&
        Objects.equals(this.store, paymentMethodsRequest.store) &&
        Objects.equals(this.storeFiltrationMode, paymentMethodsRequest.storeFiltrationMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, allowedPaymentMethods, amount, blockedPaymentMethods, channel, countryCode, merchantAccount, order, shopperConversionId, shopperLocale, shopperReference, splitCardFundingSources, store, storeFiltrationMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodsRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    allowedPaymentMethods: ").append(toIndentedString(allowedPaymentMethods)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    blockedPaymentMethods: ").append(toIndentedString(blockedPaymentMethods)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    shopperConversionId: ").append(toIndentedString(shopperConversionId)).append("\n");
    sb.append("    shopperLocale: ").append(toIndentedString(shopperLocale)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    splitCardFundingSources: ").append(toIndentedString(splitCardFundingSources)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    storeFiltrationMode: ").append(toIndentedString(storeFiltrationMode)).append("\n");
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
   * Create an instance of PaymentMethodsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentMethodsRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentMethodsRequest
   */
  public static PaymentMethodsRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentMethodsRequest.class);
  }
/**
  * Convert an instance of PaymentMethodsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
