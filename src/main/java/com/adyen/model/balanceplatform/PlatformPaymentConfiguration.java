/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
 * PlatformPaymentConfiguration
 */
@JsonPropertyOrder({
  PlatformPaymentConfiguration.JSON_PROPERTY_SALES_DAY_CLOSING_TIME,
  PlatformPaymentConfiguration.JSON_PROPERTY_SETTLEMENT_DELAY_DAYS
})

public class PlatformPaymentConfiguration {
  public static final String JSON_PROPERTY_SALES_DAY_CLOSING_TIME = "salesDayClosingTime";
  private String salesDayClosingTime;

  public static final String JSON_PROPERTY_SETTLEMENT_DELAY_DAYS = "settlementDelayDays";
  private Integer settlementDelayDays;

  public PlatformPaymentConfiguration() { 
  }

  public PlatformPaymentConfiguration salesDayClosingTime(String salesDayClosingTime) {
    this.salesDayClosingTime = salesDayClosingTime;
    return this;
  }

   /**
   * Specifies at what time a [sales day](https://docs.adyen.com/platforms/settle-funds/sales-day-settlement#sales-day) ends for this account.  Possible values: Time in **\&quot;HH:MM\&quot;** format. **HH** ranges from **00** to **07**. **MM** must be **00**.  Default value: **\&quot;00:00\&quot;**.
   * @return salesDayClosingTime
  **/
  @ApiModelProperty(value = "Specifies at what time a [sales day](https://docs.adyen.com/platforms/settle-funds/sales-day-settlement#sales-day) ends for this account.  Possible values: Time in **\"HH:MM\"** format. **HH** ranges from **00** to **07**. **MM** must be **00**.  Default value: **\"00:00\"**.")
  @JsonProperty(JSON_PROPERTY_SALES_DAY_CLOSING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSalesDayClosingTime() {
    return salesDayClosingTime;
  }


 /**
  * Specifies at what time a [sales day](https://docs.adyen.com/platforms/settle-funds/sales-day-settlement#sales-day) ends for this account.  Possible values: Time in **\&quot;HH:MM\&quot;** format. **HH** ranges from **00** to **07**. **MM** must be **00**.  Default value: **\&quot;00:00\&quot;**.
  *
  * @param salesDayClosingTime
  */ 
  @JsonProperty(JSON_PROPERTY_SALES_DAY_CLOSING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalesDayClosingTime(String salesDayClosingTime) {
    this.salesDayClosingTime = salesDayClosingTime;
  }


  public PlatformPaymentConfiguration settlementDelayDays(Integer settlementDelayDays) {
    this.settlementDelayDays = settlementDelayDays;
    return this;
  }

   /**
   * Specifies after how many business days the funds in a [settlement batch](https://docs.adyen.com/platforms/settle-funds/sales-day-settlement#settlement-batch) are made available in this balance account.  Possible values: **0** to **10**, or **null**. * Setting this value to an integer enables Sales day settlement in this balance account. See how Sales day settlement works in your [marketplace](https://docs.adyen.com/marketplaces/settle-funds/sales-day-settlement) or [platform](https://docs.adyen.com/platforms/settle-funds/sales-day-settlement). * Setting this value to **null** enables Pass-through settlement in this balance account. See how Pass-through settlement works in your [marketplace](https://docs.adyen.com/marketplaces/settle-funds/pass-through-settlement) or [platform](https://docs.adyen.com/platforms/settle-funds/pass-through-settlement).  Default value: **null**.
   * @return settlementDelayDays
  **/
  @ApiModelProperty(value = "Specifies after how many business days the funds in a [settlement batch](https://docs.adyen.com/platforms/settle-funds/sales-day-settlement#settlement-batch) are made available in this balance account.  Possible values: **0** to **10**, or **null**. * Setting this value to an integer enables Sales day settlement in this balance account. See how Sales day settlement works in your [marketplace](https://docs.adyen.com/marketplaces/settle-funds/sales-day-settlement) or [platform](https://docs.adyen.com/platforms/settle-funds/sales-day-settlement). * Setting this value to **null** enables Pass-through settlement in this balance account. See how Pass-through settlement works in your [marketplace](https://docs.adyen.com/marketplaces/settle-funds/pass-through-settlement) or [platform](https://docs.adyen.com/platforms/settle-funds/pass-through-settlement).  Default value: **null**.")
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_DELAY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSettlementDelayDays() {
    return settlementDelayDays;
  }


 /**
  * Specifies after how many business days the funds in a [settlement batch](https://docs.adyen.com/platforms/settle-funds/sales-day-settlement#settlement-batch) are made available in this balance account.  Possible values: **0** to **10**, or **null**. * Setting this value to an integer enables Sales day settlement in this balance account. See how Sales day settlement works in your [marketplace](https://docs.adyen.com/marketplaces/settle-funds/sales-day-settlement) or [platform](https://docs.adyen.com/platforms/settle-funds/sales-day-settlement). * Setting this value to **null** enables Pass-through settlement in this balance account. See how Pass-through settlement works in your [marketplace](https://docs.adyen.com/marketplaces/settle-funds/pass-through-settlement) or [platform](https://docs.adyen.com/platforms/settle-funds/pass-through-settlement).  Default value: **null**.
  *
  * @param settlementDelayDays
  */ 
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_DELAY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettlementDelayDays(Integer settlementDelayDays) {
    this.settlementDelayDays = settlementDelayDays;
  }


  /**
   * Return true if this PlatformPaymentConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformPaymentConfiguration platformPaymentConfiguration = (PlatformPaymentConfiguration) o;
    return Objects.equals(this.salesDayClosingTime, platformPaymentConfiguration.salesDayClosingTime) &&
        Objects.equals(this.settlementDelayDays, platformPaymentConfiguration.settlementDelayDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesDayClosingTime, settlementDelayDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformPaymentConfiguration {\n");
    sb.append("    salesDayClosingTime: ").append(toIndentedString(salesDayClosingTime)).append("\n");
    sb.append("    settlementDelayDays: ").append(toIndentedString(settlementDelayDays)).append("\n");
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
   * Create an instance of PlatformPaymentConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PlatformPaymentConfiguration
   * @throws JsonProcessingException if the JSON string is invalid with respect to PlatformPaymentConfiguration
   */
  public static PlatformPaymentConfiguration fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PlatformPaymentConfiguration.class);
  }
/**
  * Convert an instance of PlatformPaymentConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

