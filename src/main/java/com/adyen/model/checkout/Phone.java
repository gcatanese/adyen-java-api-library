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

import com.adyen.model.checkout.JSON;

/**
 * Phone
 */

public class Phone {
  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private String cc;

  public static final String SERIALIZED_NAME_SUBSCRIBER = "subscriber";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER)
  private String subscriber;

  public Phone() { 
  }

  public Phone cc(String cc) {
    
    this.cc = cc;
    return this;
  }

   /**
   * Country code. Length: 1–3 characters.
   * @return cc
  **/
  @ApiModelProperty(value = "Country code. Length: 1–3 characters.")

  public String getCc() {
    return cc;
  }


  public void setCc(String cc) {
    this.cc = cc;
  }


  public Phone subscriber(String subscriber) {
    
    this.subscriber = subscriber;
    return this;
  }

   /**
   * Subscriber number. Maximum length: 15 characters.
   * @return subscriber
  **/
  @ApiModelProperty(value = "Subscriber number. Maximum length: 15 characters.")

  public String getSubscriber() {
    return subscriber;
  }


  public void setSubscriber(String subscriber) {
    this.subscriber = subscriber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return Objects.equals(this.cc, phone.cc) &&
        Objects.equals(this.subscriber, phone.subscriber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cc, subscriber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
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
    openapiFields.add("cc");
    openapiFields.add("subscriber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Phone
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Phone.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Phone is not found in the empty JSON string", Phone.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Phone.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Phone` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field cc
      if (jsonObj.get("cc") != null && !jsonObj.get("cc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cc").toString()));
      }
      // validate the optional field subscriber
      if (jsonObj.get("subscriber") != null && !jsonObj.get("subscriber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Phone.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Phone' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Phone> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Phone.class));

       return (TypeAdapter<T>) new TypeAdapter<Phone>() {
           @Override
           public void write(JsonWriter out, Phone value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Phone read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Phone given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Phone
  * @throws IOException if the JSON string is invalid with respect to Phone
  */
  public static Phone fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Phone.class);
  }

 /**
  * Convert an instance of Phone to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

