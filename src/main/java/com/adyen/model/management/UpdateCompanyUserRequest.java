/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.management.Name2;
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

import com.adyen.model.management.JSON;

/**
 * UpdateCompanyUserRequest
 */

public class UpdateCompanyUserRequest {
  public static final String SERIALIZED_NAME_ACCOUNT_GROUPS = "accountGroups";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUPS)
  private List<String> accountGroups = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ASSOCIATED_MERCHANT_ACCOUNTS = "associatedMerchantAccounts";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_MERCHANT_ACCOUNTS)
  private List<String> associatedMerchantAccounts = null;

  public static final String SERIALIZED_NAME_AUTHN_APPS_TO_ADD = "authnAppsToAdd";
  @SerializedName(SERIALIZED_NAME_AUTHN_APPS_TO_ADD)
  private List<String> authnAppsToAdd = null;

  public static final String SERIALIZED_NAME_AUTHN_APPS_TO_REMOVE = "authnAppsToRemove";
  @SerializedName(SERIALIZED_NAME_AUTHN_APPS_TO_REMOVE)
  private List<String> authnAppsToRemove = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name2 name;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = null;

  public static final String SERIALIZED_NAME_TIME_ZONE_CODE = "timeZoneCode";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_CODE)
  private String timeZoneCode;

  public UpdateCompanyUserRequest() { 
  }

  public UpdateCompanyUserRequest accountGroups(List<String> accountGroups) {
    
    this.accountGroups = accountGroups;
    return this;
  }

  public UpdateCompanyUserRequest addAccountGroupsItem(String accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.
   * @return accountGroups
  **/
  @ApiModelProperty(value = "The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.")

  public List<String> getAccountGroups() {
    return accountGroups;
  }


  public void setAccountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
  }


  public UpdateCompanyUserRequest active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Indicates whether this user is active.
   * @return active
  **/
  @ApiModelProperty(value = "Indicates whether this user is active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public UpdateCompanyUserRequest associatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    
    this.associatedMerchantAccounts = associatedMerchantAccounts;
    return this;
  }

  public UpdateCompanyUserRequest addAssociatedMerchantAccountsItem(String associatedMerchantAccountsItem) {
    if (this.associatedMerchantAccounts == null) {
      this.associatedMerchantAccounts = new ArrayList<>();
    }
    this.associatedMerchantAccounts.add(associatedMerchantAccountsItem);
    return this;
  }

   /**
   * The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) to associate the user with.
   * @return associatedMerchantAccounts
  **/
  @ApiModelProperty(value = "The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) to associate the user with.")

  public List<String> getAssociatedMerchantAccounts() {
    return associatedMerchantAccounts;
  }


  public void setAssociatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    this.associatedMerchantAccounts = associatedMerchantAccounts;
  }


  public UpdateCompanyUserRequest authnAppsToAdd(List<String> authnAppsToAdd) {
    
    this.authnAppsToAdd = authnAppsToAdd;
    return this;
  }

  public UpdateCompanyUserRequest addAuthnAppsToAddItem(String authnAppsToAddItem) {
    if (this.authnAppsToAdd == null) {
      this.authnAppsToAdd = new ArrayList<>();
    }
    this.authnAppsToAdd.add(authnAppsToAddItem);
    return this;
  }

   /**
   * Set of authn apps to add to this user
   * @return authnAppsToAdd
  **/
  @ApiModelProperty(value = "Set of authn apps to add to this user")

  public List<String> getAuthnAppsToAdd() {
    return authnAppsToAdd;
  }


  public void setAuthnAppsToAdd(List<String> authnAppsToAdd) {
    this.authnAppsToAdd = authnAppsToAdd;
  }


  public UpdateCompanyUserRequest authnAppsToRemove(List<String> authnAppsToRemove) {
    
    this.authnAppsToRemove = authnAppsToRemove;
    return this;
  }

  public UpdateCompanyUserRequest addAuthnAppsToRemoveItem(String authnAppsToRemoveItem) {
    if (this.authnAppsToRemove == null) {
      this.authnAppsToRemove = new ArrayList<>();
    }
    this.authnAppsToRemove.add(authnAppsToRemoveItem);
    return this;
  }

   /**
   * Set of authn apps to remove from this user
   * @return authnAppsToRemove
  **/
  @ApiModelProperty(value = "Set of authn apps to remove from this user")

  public List<String> getAuthnAppsToRemove() {
    return authnAppsToRemove;
  }


  public void setAuthnAppsToRemove(List<String> authnAppsToRemove) {
    this.authnAppsToRemove = authnAppsToRemove;
  }


  public UpdateCompanyUserRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateCompanyUserRequest name(Name2 name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  public Name2 getName() {
    return name;
  }


  public void setName(Name2 name) {
    this.name = name;
  }


  public UpdateCompanyUserRequest roles(List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public UpdateCompanyUserRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
   * @return roles
  **/
  @ApiModelProperty(value = "The list of [roles](https://docs.adyen.com/account/user-roles) for this user.")

  public List<String> getRoles() {
    return roles;
  }


  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public UpdateCompanyUserRequest timeZoneCode(String timeZoneCode) {
    
    this.timeZoneCode = timeZoneCode;
    return this;
  }

   /**
   * The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
   * @return timeZoneCode
  **/
  @ApiModelProperty(value = "The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.")

  public String getTimeZoneCode() {
    return timeZoneCode;
  }


  public void setTimeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCompanyUserRequest updateCompanyUserRequest = (UpdateCompanyUserRequest) o;
    return Objects.equals(this.accountGroups, updateCompanyUserRequest.accountGroups) &&
        Objects.equals(this.active, updateCompanyUserRequest.active) &&
        Objects.equals(this.associatedMerchantAccounts, updateCompanyUserRequest.associatedMerchantAccounts) &&
        Objects.equals(this.authnAppsToAdd, updateCompanyUserRequest.authnAppsToAdd) &&
        Objects.equals(this.authnAppsToRemove, updateCompanyUserRequest.authnAppsToRemove) &&
        Objects.equals(this.email, updateCompanyUserRequest.email) &&
        Objects.equals(this.name, updateCompanyUserRequest.name) &&
        Objects.equals(this.roles, updateCompanyUserRequest.roles) &&
        Objects.equals(this.timeZoneCode, updateCompanyUserRequest.timeZoneCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroups, active, associatedMerchantAccounts, authnAppsToAdd, authnAppsToRemove, email, name, roles, timeZoneCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCompanyUserRequest {\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    associatedMerchantAccounts: ").append(toIndentedString(associatedMerchantAccounts)).append("\n");
    sb.append("    authnAppsToAdd: ").append(toIndentedString(authnAppsToAdd)).append("\n");
    sb.append("    authnAppsToRemove: ").append(toIndentedString(authnAppsToRemove)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
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
    openapiFields.add("accountGroups");
    openapiFields.add("active");
    openapiFields.add("associatedMerchantAccounts");
    openapiFields.add("authnAppsToAdd");
    openapiFields.add("authnAppsToRemove");
    openapiFields.add("email");
    openapiFields.add("name");
    openapiFields.add("roles");
    openapiFields.add("timeZoneCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateCompanyUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateCompanyUserRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateCompanyUserRequest is not found in the empty JSON string", UpdateCompanyUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateCompanyUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateCompanyUserRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("accountGroups") != null && !jsonObj.get("accountGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountGroups` to be an array in the JSON string but got `%s`", jsonObj.get("accountGroups").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("associatedMerchantAccounts") != null && !jsonObj.get("associatedMerchantAccounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associatedMerchantAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("associatedMerchantAccounts").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("authnAppsToAdd") != null && !jsonObj.get("authnAppsToAdd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `authnAppsToAdd` to be an array in the JSON string but got `%s`", jsonObj.get("authnAppsToAdd").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("authnAppsToRemove") != null && !jsonObj.get("authnAppsToRemove").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `authnAppsToRemove` to be an array in the JSON string but got `%s`", jsonObj.get("authnAppsToRemove").toString()));
      }
      // validate the optional field email
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.getAsJsonObject("name") != null) {
        Name2.validateJsonObject(jsonObj.getAsJsonObject("name"));
      }
      // ensure the json data is an array
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      // validate the optional field timeZoneCode
      if (jsonObj.get("timeZoneCode") != null && !jsonObj.get("timeZoneCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZoneCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZoneCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateCompanyUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateCompanyUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateCompanyUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateCompanyUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateCompanyUserRequest>() {
           @Override
           public void write(JsonWriter out, UpdateCompanyUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateCompanyUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateCompanyUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateCompanyUserRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateCompanyUserRequest
  */
  public static UpdateCompanyUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateCompanyUserRequest.class);
  }

 /**
  * Convert an instance of UpdateCompanyUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

