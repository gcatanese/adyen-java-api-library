/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.configurationwebhooks.BalanceAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.configurationwebhooks.JSON;

/**
 * BalanceAccountNotificationData
 */

public class BalanceAccountNotificationData {
  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT = "balanceAccount";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT)
  private BalanceAccount balanceAccount;

  public static final String SERIALIZED_NAME_BALANCE_PLATFORM = "balancePlatform";
  @SerializedName(SERIALIZED_NAME_BALANCE_PLATFORM)
  private String balancePlatform;

  public BalanceAccountNotificationData() { 
  }

  public BalanceAccountNotificationData balanceAccount(BalanceAccount balanceAccount) {
    
    this.balanceAccount = balanceAccount;
    return this;
  }

   /**
   * Get balanceAccount
   * @return balanceAccount
  **/
  @ApiModelProperty(value = "")

  public BalanceAccount getBalanceAccount() {
    return balanceAccount;
  }


  public void setBalanceAccount(BalanceAccount balanceAccount) {
    this.balanceAccount = balanceAccount;
  }


  public BalanceAccountNotificationData balancePlatform(String balancePlatform) {
    
    this.balancePlatform = balancePlatform;
    return this;
  }

   /**
   * The unique identifier of the balance platform.
   * @return balancePlatform
  **/
  @ApiModelProperty(value = "The unique identifier of the balance platform.")

  public String getBalancePlatform() {
    return balancePlatform;
  }


  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceAccountNotificationData balanceAccountNotificationData = (BalanceAccountNotificationData) o;
    return Objects.equals(this.balanceAccount, balanceAccountNotificationData.balanceAccount) &&
        Objects.equals(this.balancePlatform, balanceAccountNotificationData.balancePlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccount, balancePlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccountNotificationData {\n");
    sb.append("    balanceAccount: ").append(toIndentedString(balanceAccount)).append("\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
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
    openapiFields.add("balanceAccount");
    openapiFields.add("balancePlatform");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(BalanceAccountNotificationData.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BalanceAccountNotificationData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BalanceAccountNotificationData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BalanceAccountNotificationData is not found in the empty JSON string", BalanceAccountNotificationData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BalanceAccountNotificationData.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `BalanceAccountNotificationData` properties.", entry.getKey()));
        }
      }
      // validate the optional field `balanceAccount`
      if (jsonObj.getAsJsonObject("balanceAccount") != null) {
        BalanceAccount.validateJsonObject(jsonObj.getAsJsonObject("balanceAccount"));
      }
      // validate the optional field balancePlatform
      if (jsonObj.get("balancePlatform") != null && !jsonObj.get("balancePlatform").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `balancePlatform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balancePlatform").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BalanceAccountNotificationData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalanceAccountNotificationData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalanceAccountNotificationData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalanceAccountNotificationData.class));

       return (TypeAdapter<T>) new TypeAdapter<BalanceAccountNotificationData>() {
           @Override
           public void write(JsonWriter out, BalanceAccountNotificationData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BalanceAccountNotificationData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BalanceAccountNotificationData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BalanceAccountNotificationData
  * @throws IOException if the JSON string is invalid with respect to BalanceAccountNotificationData
  */
  public static BalanceAccountNotificationData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalanceAccountNotificationData.class);
  }

 /**
  * Convert an instance of BalanceAccountNotificationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

