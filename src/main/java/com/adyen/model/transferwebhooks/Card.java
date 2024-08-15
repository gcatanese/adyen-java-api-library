/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transferwebhooks.CardIdentification;
import com.adyen.model.transferwebhooks.PartyIdentification;
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
 * Card
 */
@JsonPropertyOrder({
  Card.JSON_PROPERTY_CARD_HOLDER,
  Card.JSON_PROPERTY_CARD_IDENTIFICATION
})

public class Card {
  public static final String JSON_PROPERTY_CARD_HOLDER = "cardHolder";
  private PartyIdentification cardHolder;

  public static final String JSON_PROPERTY_CARD_IDENTIFICATION = "cardIdentification";
  private CardIdentification cardIdentification;

  public Card() { 
  }

  public Card cardHolder(PartyIdentification cardHolder) {
    this.cardHolder = cardHolder;
    return this;
  }

   /**
   * Get cardHolder
   * @return cardHolder
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PartyIdentification getCardHolder() {
    return cardHolder;
  }


 /**
  * cardHolder
  *
  * @param cardHolder
  */ 
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardHolder(PartyIdentification cardHolder) {
    this.cardHolder = cardHolder;
  }


  public Card cardIdentification(CardIdentification cardIdentification) {
    this.cardIdentification = cardIdentification;
    return this;
  }

   /**
   * Get cardIdentification
   * @return cardIdentification
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CARD_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardIdentification getCardIdentification() {
    return cardIdentification;
  }


 /**
  * cardIdentification
  *
  * @param cardIdentification
  */ 
  @JsonProperty(JSON_PROPERTY_CARD_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardIdentification(CardIdentification cardIdentification) {
    this.cardIdentification = cardIdentification;
  }


  /**
   * Return true if this Card object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.cardHolder, card.cardHolder) &&
        Objects.equals(this.cardIdentification, card.cardIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardHolder, cardIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    cardHolder: ").append(toIndentedString(cardHolder)).append("\n");
    sb.append("    cardIdentification: ").append(toIndentedString(cardIdentification)).append("\n");
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
   * Create an instance of Card given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Card
   * @throws JsonProcessingException if the JSON string is invalid with respect to Card
   */
  public static Card fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Card.class);
  }
/**
  * Convert an instance of Card to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

