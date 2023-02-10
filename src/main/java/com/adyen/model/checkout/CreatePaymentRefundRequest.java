/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.checkout.Amount;
import com.adyen.model.checkout.LineItem;
import com.adyen.model.checkout.Split;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.checkout.JSON;

/**
 * CreatePaymentRefundRequest
 */

public class CreatePaymentRefundRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "lineItems";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<LineItem> lineItems = null;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  /**
   * Your reason for the refund request
   */
  @JsonAdapter(MerchantRefundReasonEnum.Adapter.class)
  public enum MerchantRefundReasonEnum {
    FRAUD("FRAUD"),
    
    CUSTOMER_REQUEST("CUSTOMER REQUEST"),
    
    RETURN("RETURN"),
    
    DUPLICATE("DUPLICATE"),
    
    OTHER("OTHER");

    private String value;

    MerchantRefundReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MerchantRefundReasonEnum fromValue(String value) {
      for (MerchantRefundReasonEnum b : MerchantRefundReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MerchantRefundReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MerchantRefundReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MerchantRefundReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MerchantRefundReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MERCHANT_REFUND_REASON = "merchantRefundReason";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFUND_REASON)
  private MerchantRefundReasonEnum merchantRefundReason;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SPLITS = "splits";
  @SerializedName(SERIALIZED_NAME_SPLITS)
  private List<Split> splits = null;

  public CreatePaymentRefundRequest() { 
  }

  public CreatePaymentRefundRequest amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public CreatePaymentRefundRequest lineItems(List<LineItem> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public CreatePaymentRefundRequest addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Price and product information of the refunded items, required for [partial refunds](https://docs.adyen.com/online-payments/refund#refund-a-payment). &gt; This field is required for partial refunds with 3x 4x Oney, Affirm, Afterpay, Clearpay, Klarna, Ratepay, Zip and Atome.
   * @return lineItems
  **/
  @ApiModelProperty(value = "Price and product information of the refunded items, required for [partial refunds](https://docs.adyen.com/online-payments/refund#refund-a-payment). > This field is required for partial refunds with 3x 4x Oney, Affirm, Afterpay, Clearpay, Klarna, Ratepay, Zip and Atome.")

  public List<LineItem> getLineItems() {
    return lineItems;
  }


  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }


  public CreatePaymentRefundRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public CreatePaymentRefundRequest merchantRefundReason(MerchantRefundReasonEnum merchantRefundReason) {
    
    this.merchantRefundReason = merchantRefundReason;
    return this;
  }

   /**
   * Your reason for the refund request
   * @return merchantRefundReason
  **/
  @ApiModelProperty(value = "Your reason for the refund request")

  public MerchantRefundReasonEnum getMerchantRefundReason() {
    return merchantRefundReason;
  }


  public void setMerchantRefundReason(MerchantRefundReasonEnum merchantRefundReason) {
    this.merchantRefundReason = merchantRefundReason;
  }


  public CreatePaymentRefundRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the refund request. Maximum length: 80 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the refund request. Maximum length: 80 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public CreatePaymentRefundRequest splits(List<Split> splits) {
    
    this.splits = splits;
    return this;
  }

  public CreatePaymentRefundRequest addSplitsItem(Split splitsItem) {
    if (this.splits == null) {
      this.splits = new ArrayList<>();
    }
    this.splits.add(splitsItem);
    return this;
  }

   /**
   * An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information).
   * @return splits
  **/
  @ApiModelProperty(value = "An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information).")

  public List<Split> getSplits() {
    return splits;
  }


  public void setSplits(List<Split> splits) {
    this.splits = splits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaymentRefundRequest createPaymentRefundRequest = (CreatePaymentRefundRequest) o;
    return Objects.equals(this.amount, createPaymentRefundRequest.amount) &&
        Objects.equals(this.lineItems, createPaymentRefundRequest.lineItems) &&
        Objects.equals(this.merchantAccount, createPaymentRefundRequest.merchantAccount) &&
        Objects.equals(this.merchantRefundReason, createPaymentRefundRequest.merchantRefundReason) &&
        Objects.equals(this.reference, createPaymentRefundRequest.reference) &&
        Objects.equals(this.splits, createPaymentRefundRequest.splits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, lineItems, merchantAccount, merchantRefundReason, reference, splits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentRefundRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    merchantRefundReason: ").append(toIndentedString(merchantRefundReason)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    splits: ").append(toIndentedString(splits)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("amount");
    openapiFields.add("lineItems");
    openapiFields.add("merchantAccount");
    openapiFields.add("merchantRefundReason");
    openapiFields.add("reference");
    openapiFields.add("splits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("merchantAccount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreatePaymentRefundRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreatePaymentRefundRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePaymentRefundRequest is not found in the empty JSON string", CreatePaymentRefundRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreatePaymentRefundRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePaymentRefundRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePaymentRefundRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      JsonArray jsonArraylineItems = jsonObj.getAsJsonArray("lineItems");
      if (jsonArraylineItems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("lineItems").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `lineItems` to be an array in the JSON string but got `%s`", jsonObj.get("lineItems").toString()));
        }

        // validate the optional field `lineItems` (array)
        for (int i = 0; i < jsonArraylineItems.size(); i++) {
          LineItem.validateJsonObject(jsonArraylineItems.get(i).getAsJsonObject());
        };
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // ensure the field merchantRefundReason can be parsed to an enum value
      if (jsonObj.get("merchantRefundReason") != null) {
        if(!jsonObj.get("merchantRefundReason").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `merchantRefundReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantRefundReason").toString()));
        }
        MerchantRefundReasonEnum.fromValue(jsonObj.get("merchantRefundReason").getAsString());
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      JsonArray jsonArraysplits = jsonObj.getAsJsonArray("splits");
      if (jsonArraysplits != null) {
        // ensure the json data is an array
        if (!jsonObj.get("splits").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `splits` to be an array in the JSON string but got `%s`", jsonObj.get("splits").toString()));
        }

        // validate the optional field `splits` (array)
        for (int i = 0; i < jsonArraysplits.size(); i++) {
          Split.validateJsonObject(jsonArraysplits.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePaymentRefundRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePaymentRefundRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePaymentRefundRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePaymentRefundRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePaymentRefundRequest>() {
           @Override
           public void write(JsonWriter out, CreatePaymentRefundRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePaymentRefundRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePaymentRefundRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePaymentRefundRequest
  * @throws IOException if the JSON string is invalid with respect to CreatePaymentRefundRequest
  */
  public static CreatePaymentRefundRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePaymentRefundRequest.class);
  }

 /**
  * Convert an instance of CreatePaymentRefundRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

