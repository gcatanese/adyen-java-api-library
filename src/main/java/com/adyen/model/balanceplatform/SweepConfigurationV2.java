/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.balanceplatform.Amount;
import com.adyen.model.balanceplatform.SweepConfigurationV2Schedule;
import com.adyen.model.balanceplatform.SweepCounterparty;
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

import com.adyen.model.balanceplatform.JSON;

/**
 * SweepConfigurationV2
 */

public class SweepConfigurationV2 {
  /**
   * The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting &#x60;priorities&#x60;.
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    BANK("bank"),
    
    INTERNAL("internal"),
    
    PLATFORMPAYMENT("platformPayment");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private SweepCounterparty counterparty;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Gets or Sets priorities
   */
  @JsonAdapter(PrioritiesEnum.Adapter.class)
  public enum PrioritiesEnum {
    CROSSBORDER("crossBorder"),
    
    DIRECTDEBIT("directDebit"),
    
    FAST("fast"),
    
    INSTANT("instant"),
    
    INTERNAL("internal"),
    
    REGULAR("regular"),
    
    WIRE("wire");

    private String value;

    PrioritiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrioritiesEnum fromValue(String value) {
      for (PrioritiesEnum b : PrioritiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PrioritiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrioritiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrioritiesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PrioritiesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIORITIES = "priorities";
  @SerializedName(SERIALIZED_NAME_PRIORITIES)
  private List<PrioritiesEnum> priorities = null;

  /**
   * The reason for disabling the sweep.
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    AMOUNTLIMITEXCEEDED("amountLimitExceeded"),
    
    APPROVED("approved"),
    
    COUNTERPARTYACCOUNTBLOCKED("counterpartyAccountBlocked"),
    
    COUNTERPARTYACCOUNTCLOSED("counterpartyAccountClosed"),
    
    COUNTERPARTYACCOUNTNOTFOUND("counterpartyAccountNotFound"),
    
    COUNTERPARTYADDRESSREQUIRED("counterpartyAddressRequired"),
    
    COUNTERPARTYBANKTIMEDOUT("counterpartyBankTimedOut"),
    
    COUNTERPARTYBANKUNAVAILABLE("counterpartyBankUnavailable"),
    
    ERROR("error"),
    
    NOTENOUGHBALANCE("notEnoughBalance"),
    
    REFUSEDBYCOUNTERPARTYBANK("refusedByCounterpartyBank"),
    
    ROUTENOTFOUND("routeNotFound"),
    
    UNKNOWN("unknown");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReasonEnum reason;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private SweepConfigurationV2Schedule schedule;

  /**
   * The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SWEEP_AMOUNT = "sweepAmount";
  @SerializedName(SERIALIZED_NAME_SWEEP_AMOUNT)
  private Amount sweepAmount;

  public static final String SERIALIZED_NAME_TARGET_AMOUNT = "targetAmount";
  @SerializedName(SERIALIZED_NAME_TARGET_AMOUNT)
  private Amount targetAmount;

  public static final String SERIALIZED_NAME_TRIGGER_AMOUNT = "triggerAmount";
  @SerializedName(SERIALIZED_NAME_TRIGGER_AMOUNT)
  private Amount triggerAmount;

  /**
   * The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PULL("pull"),
    
    PUSH("push");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.PUSH;

  public SweepConfigurationV2() { 
  }

  
  public SweepConfigurationV2(
     String id, 
     ReasonEnum reason
  ) {
    this();
    this.id = id;
    this.reason = reason;
  }

  public SweepConfigurationV2 category(CategoryEnum category) {
    
    this.category = category;
    return this;
  }

   /**
   * The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting &#x60;priorities&#x60;.
   * @return category
  **/
  @ApiModelProperty(value = "The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting `priorities`.")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public SweepConfigurationV2 counterparty(SweepCounterparty counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @ApiModelProperty(required = true, value = "")

  public SweepCounterparty getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(SweepCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public SweepConfigurationV2 currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances).
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances).")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public SweepConfigurationV2 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The message that will be used in the sweep transfer&#39;s description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters.
   * @return description
  **/
  @ApiModelProperty(value = "The message that will be used in the sweep transfer's description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * The unique identifier of the sweep.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the sweep.")

  public String getId() {
    return id;
  }




  public SweepConfigurationV2 priorities(List<PrioritiesEnum> priorities) {
    
    this.priorities = priorities;
    return this;
  }

  public SweepConfigurationV2 addPrioritiesItem(PrioritiesEnum prioritiesItem) {
    if (this.priorities == null) {
      this.priorities = new ArrayList<>();
    }
    this.priorities.add(prioritiesItem);
    return this;
  }

   /**
   * The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority listed first, and if that&#39;s not possible, it moves on to the next option in the order of provided priorities.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN).  Set &#x60;category&#x60; to **bank**. For more details, see [optional priorities setup](https://docs.adyen.com/marketplaces-and-platforms/payout-to-users/scheduled-payouts#optional-priorities-setup).
   * @return priorities
  **/
  @ApiModelProperty(value = "The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority listed first, and if that's not possible, it moves on to the next option in the order of provided priorities.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN).  Set `category` to **bank**. For more details, see [optional priorities setup](https://docs.adyen.com/marketplaces-and-platforms/payout-to-users/scheduled-payouts#optional-priorities-setup).")

  public List<PrioritiesEnum> getPriorities() {
    return priorities;
  }


  public void setPriorities(List<PrioritiesEnum> priorities) {
    this.priorities = priorities;
  }


   /**
   * The reason for disabling the sweep.
   * @return reason
  **/
  @ApiModelProperty(value = "The reason for disabling the sweep.")

  public ReasonEnum getReason() {
    return reason;
  }




  public SweepConfigurationV2 schedule(SweepConfigurationV2Schedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(required = true, value = "")

  public SweepConfigurationV2Schedule getSchedule() {
    return schedule;
  }


  public void setSchedule(SweepConfigurationV2Schedule schedule) {
    this.schedule = schedule;
  }


  public SweepConfigurationV2 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
   * @return status
  **/
  @ApiModelProperty(value = "The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SweepConfigurationV2 sweepAmount(Amount sweepAmount) {
    
    this.sweepAmount = sweepAmount;
    return this;
  }

   /**
   * Get sweepAmount
   * @return sweepAmount
  **/
  @ApiModelProperty(value = "")

  public Amount getSweepAmount() {
    return sweepAmount;
  }


  public void setSweepAmount(Amount sweepAmount) {
    this.sweepAmount = sweepAmount;
  }


  public SweepConfigurationV2 targetAmount(Amount targetAmount) {
    
    this.targetAmount = targetAmount;
    return this;
  }

   /**
   * Get targetAmount
   * @return targetAmount
  **/
  @ApiModelProperty(value = "")

  public Amount getTargetAmount() {
    return targetAmount;
  }


  public void setTargetAmount(Amount targetAmount) {
    this.targetAmount = targetAmount;
  }


  public SweepConfigurationV2 triggerAmount(Amount triggerAmount) {
    
    this.triggerAmount = triggerAmount;
    return this;
  }

   /**
   * Get triggerAmount
   * @return triggerAmount
  **/
  @ApiModelProperty(value = "")

  public Amount getTriggerAmount() {
    return triggerAmount;
  }


  public void setTriggerAmount(Amount triggerAmount) {
    this.triggerAmount = triggerAmount;
  }


  public SweepConfigurationV2 type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
   * @return type
  **/
  @ApiModelProperty(value = "The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepConfigurationV2 sweepConfigurationV2 = (SweepConfigurationV2) o;
    return Objects.equals(this.category, sweepConfigurationV2.category) &&
        Objects.equals(this.counterparty, sweepConfigurationV2.counterparty) &&
        Objects.equals(this.currency, sweepConfigurationV2.currency) &&
        Objects.equals(this.description, sweepConfigurationV2.description) &&
        Objects.equals(this.id, sweepConfigurationV2.id) &&
        Objects.equals(this.priorities, sweepConfigurationV2.priorities) &&
        Objects.equals(this.reason, sweepConfigurationV2.reason) &&
        Objects.equals(this.schedule, sweepConfigurationV2.schedule) &&
        Objects.equals(this.status, sweepConfigurationV2.status) &&
        Objects.equals(this.sweepAmount, sweepConfigurationV2.sweepAmount) &&
        Objects.equals(this.targetAmount, sweepConfigurationV2.targetAmount) &&
        Objects.equals(this.triggerAmount, sweepConfigurationV2.triggerAmount) &&
        Objects.equals(this.type, sweepConfigurationV2.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, counterparty, currency, description, id, priorities, reason, schedule, status, sweepAmount, targetAmount, triggerAmount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepConfigurationV2 {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sweepAmount: ").append(toIndentedString(sweepAmount)).append("\n");
    sb.append("    targetAmount: ").append(toIndentedString(targetAmount)).append("\n");
    sb.append("    triggerAmount: ").append(toIndentedString(triggerAmount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("category");
    openapiFields.add("counterparty");
    openapiFields.add("currency");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("priorities");
    openapiFields.add("reason");
    openapiFields.add("schedule");
    openapiFields.add("status");
    openapiFields.add("sweepAmount");
    openapiFields.add("targetAmount");
    openapiFields.add("triggerAmount");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("counterparty");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schedule");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SweepConfigurationV2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SweepConfigurationV2.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SweepConfigurationV2 is not found in the empty JSON string", SweepConfigurationV2.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SweepConfigurationV2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SweepConfigurationV2` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SweepConfigurationV2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the field category can be parsed to an enum value
      if (jsonObj.get("category") != null) {
        if(!jsonObj.get("category").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
        }
        CategoryEnum.fromValue(jsonObj.get("category").getAsString());
      }
      // validate the optional field `counterparty`
      if (jsonObj.getAsJsonObject("counterparty") != null) {
        SweepCounterparty.validateJsonObject(jsonObj.getAsJsonObject("counterparty"));
      }
      // validate the optional field currency
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("priorities") != null && !jsonObj.get("priorities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `priorities` to be an array in the JSON string but got `%s`", jsonObj.get("priorities").toString()));
      }
      // ensure the field reason can be parsed to an enum value
      if (jsonObj.get("reason") != null) {
        if(!jsonObj.get("reason").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
        }
        ReasonEnum.fromValue(jsonObj.get("reason").getAsString());
      }
      // validate the optional field `schedule`
      if (jsonObj.getAsJsonObject("schedule") != null) {
        SweepConfigurationV2Schedule.validateJsonObject(jsonObj.getAsJsonObject("schedule"));
      }
      // ensure the field status can be parsed to an enum value
      if (jsonObj.get("status") != null) {
        if(!jsonObj.get("status").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
        }
        StatusEnum.fromValue(jsonObj.get("status").getAsString());
      }
      // validate the optional field `sweepAmount`
      if (jsonObj.getAsJsonObject("sweepAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("sweepAmount"));
      }
      // validate the optional field `targetAmount`
      if (jsonObj.getAsJsonObject("targetAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("targetAmount"));
      }
      // validate the optional field `triggerAmount`
      if (jsonObj.getAsJsonObject("triggerAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("triggerAmount"));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SweepConfigurationV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SweepConfigurationV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SweepConfigurationV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SweepConfigurationV2.class));

       return (TypeAdapter<T>) new TypeAdapter<SweepConfigurationV2>() {
           @Override
           public void write(JsonWriter out, SweepConfigurationV2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SweepConfigurationV2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SweepConfigurationV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SweepConfigurationV2
  * @throws IOException if the JSON string is invalid with respect to SweepConfigurationV2
  */
  public static SweepConfigurationV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SweepConfigurationV2.class);
  }

 /**
  * Convert an instance of SweepConfigurationV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

