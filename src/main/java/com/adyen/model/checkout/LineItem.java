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
 * LineItem
 */
@JsonPropertyOrder({
  LineItem.JSON_PROPERTY_AMOUNT_EXCLUDING_TAX,
  LineItem.JSON_PROPERTY_AMOUNT_INCLUDING_TAX,
  LineItem.JSON_PROPERTY_BRAND,
  LineItem.JSON_PROPERTY_COLOR,
  LineItem.JSON_PROPERTY_DESCRIPTION,
  LineItem.JSON_PROPERTY_ID,
  LineItem.JSON_PROPERTY_IMAGE_URL,
  LineItem.JSON_PROPERTY_ITEM_CATEGORY,
  LineItem.JSON_PROPERTY_MANUFACTURER,
  LineItem.JSON_PROPERTY_MARKETPLACE_SELLER_ID,
  LineItem.JSON_PROPERTY_PRODUCT_URL,
  LineItem.JSON_PROPERTY_QUANTITY,
  LineItem.JSON_PROPERTY_RECEIVER_EMAIL,
  LineItem.JSON_PROPERTY_SIZE,
  LineItem.JSON_PROPERTY_SKU,
  LineItem.JSON_PROPERTY_TAX_AMOUNT,
  LineItem.JSON_PROPERTY_TAX_PERCENTAGE,
  LineItem.JSON_PROPERTY_UPC
})

public class LineItem {
  public static final String JSON_PROPERTY_AMOUNT_EXCLUDING_TAX = "amountExcludingTax";
  private Long amountExcludingTax;

  public static final String JSON_PROPERTY_AMOUNT_INCLUDING_TAX = "amountIncludingTax";
  private Long amountIncludingTax;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  private String imageUrl;

  public static final String JSON_PROPERTY_ITEM_CATEGORY = "itemCategory";
  private String itemCategory;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_MARKETPLACE_SELLER_ID = "marketplaceSellerId";
  private String marketplaceSellerId;

  public static final String JSON_PROPERTY_PRODUCT_URL = "productUrl";
  private String productUrl;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Long quantity;

  public static final String JSON_PROPERTY_RECEIVER_EMAIL = "receiverEmail";
  private String receiverEmail;

  public static final String JSON_PROPERTY_SIZE = "size";
  private String size;

  public static final String JSON_PROPERTY_SKU = "sku";
  private String sku;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "taxAmount";
  private Long taxAmount;

  public static final String JSON_PROPERTY_TAX_PERCENTAGE = "taxPercentage";
  private Long taxPercentage;

  public static final String JSON_PROPERTY_UPC = "upc";
  private String upc;

  public LineItem() { 
  }

  public LineItem amountExcludingTax(Long amountExcludingTax) {
    this.amountExcludingTax = amountExcludingTax;
    return this;
  }

   /**
   * Item amount excluding the tax, in minor units.
   * @return amountExcludingTax
  **/
  @ApiModelProperty(value = "Item amount excluding the tax, in minor units.")
  @JsonProperty(JSON_PROPERTY_AMOUNT_EXCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmountExcludingTax() {
    return amountExcludingTax;
  }


 /**
  * Item amount excluding the tax, in minor units.
  *
  * @param amountExcludingTax
  */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT_EXCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountExcludingTax(Long amountExcludingTax) {
    this.amountExcludingTax = amountExcludingTax;
  }


  public LineItem amountIncludingTax(Long amountIncludingTax) {
    this.amountIncludingTax = amountIncludingTax;
    return this;
  }

   /**
   * Item amount including the tax, in minor units.
   * @return amountIncludingTax
  **/
  @ApiModelProperty(value = "Item amount including the tax, in minor units.")
  @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmountIncludingTax() {
    return amountIncludingTax;
  }


 /**
  * Item amount including the tax, in minor units.
  *
  * @param amountIncludingTax
  */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountIncludingTax(Long amountIncludingTax) {
    this.amountIncludingTax = amountIncludingTax;
  }


  public LineItem brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Brand of the item.
   * @return brand
  **/
  @ApiModelProperty(value = "Brand of the item.")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


 /**
  * Brand of the item.
  *
  * @param brand
  */ 
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public LineItem color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Color of the item.
   * @return color
  **/
  @ApiModelProperty(value = "Color of the item.")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


 /**
  * Color of the item.
  *
  * @param color
  */ 
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


  public LineItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the line item.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the line item.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


 /**
  * Description of the line item.
  *
  * @param description
  */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public LineItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the line item.
   * @return id
  **/
  @ApiModelProperty(value = "ID of the line item.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * ID of the line item.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public LineItem imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Link to the picture of the purchased item.
   * @return imageUrl
  **/
  @ApiModelProperty(value = "Link to the picture of the purchased item.")
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageUrl() {
    return imageUrl;
  }


 /**
  * Link to the picture of the purchased item.
  *
  * @param imageUrl
  */ 
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public LineItem itemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
    return this;
  }

   /**
   * Item category, used by the payment methods PayPal and Ratepay.
   * @return itemCategory
  **/
  @ApiModelProperty(value = "Item category, used by the payment methods PayPal and Ratepay.")
  @JsonProperty(JSON_PROPERTY_ITEM_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getItemCategory() {
    return itemCategory;
  }


 /**
  * Item category, used by the payment methods PayPal and Ratepay.
  *
  * @param itemCategory
  */ 
  @JsonProperty(JSON_PROPERTY_ITEM_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }


  public LineItem manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Manufacturer of the item.
   * @return manufacturer
  **/
  @ApiModelProperty(value = "Manufacturer of the item.")
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManufacturer() {
    return manufacturer;
  }


 /**
  * Manufacturer of the item.
  *
  * @param manufacturer
  */ 
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public LineItem marketplaceSellerId(String marketplaceSellerId) {
    this.marketplaceSellerId = marketplaceSellerId;
    return this;
  }

   /**
   * Marketplace seller id.
   * @return marketplaceSellerId
  **/
  @ApiModelProperty(value = "Marketplace seller id.")
  @JsonProperty(JSON_PROPERTY_MARKETPLACE_SELLER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarketplaceSellerId() {
    return marketplaceSellerId;
  }


 /**
  * Marketplace seller id.
  *
  * @param marketplaceSellerId
  */ 
  @JsonProperty(JSON_PROPERTY_MARKETPLACE_SELLER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketplaceSellerId(String marketplaceSellerId) {
    this.marketplaceSellerId = marketplaceSellerId;
  }


  public LineItem productUrl(String productUrl) {
    this.productUrl = productUrl;
    return this;
  }

   /**
   * Link to the purchased item.
   * @return productUrl
  **/
  @ApiModelProperty(value = "Link to the purchased item.")
  @JsonProperty(JSON_PROPERTY_PRODUCT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductUrl() {
    return productUrl;
  }


 /**
  * Link to the purchased item.
  *
  * @param productUrl
  */ 
  @JsonProperty(JSON_PROPERTY_PRODUCT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }


  public LineItem quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of items.
   * @return quantity
  **/
  @ApiModelProperty(value = "Number of items.")
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuantity() {
    return quantity;
  }


 /**
  * Number of items.
  *
  * @param quantity
  */ 
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public LineItem receiverEmail(String receiverEmail) {
    this.receiverEmail = receiverEmail;
    return this;
  }

   /**
   * Email associated with the given product in the basket (usually in electronic gift cards).
   * @return receiverEmail
  **/
  @ApiModelProperty(value = "Email associated with the given product in the basket (usually in electronic gift cards).")
  @JsonProperty(JSON_PROPERTY_RECEIVER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceiverEmail() {
    return receiverEmail;
  }


 /**
  * Email associated with the given product in the basket (usually in electronic gift cards).
  *
  * @param receiverEmail
  */ 
  @JsonProperty(JSON_PROPERTY_RECEIVER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiverEmail(String receiverEmail) {
    this.receiverEmail = receiverEmail;
  }


  public LineItem size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Size of the item.
   * @return size
  **/
  @ApiModelProperty(value = "Size of the item.")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSize() {
    return size;
  }


 /**
  * Size of the item.
  *
  * @param size
  */ 
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(String size) {
    this.size = size;
  }


  public LineItem sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Stock keeping unit.
   * @return sku
  **/
  @ApiModelProperty(value = "Stock keeping unit.")
  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSku() {
    return sku;
  }


 /**
  * Stock keeping unit.
  *
  * @param sku
  */ 
  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSku(String sku) {
    this.sku = sku;
  }


  public LineItem taxAmount(Long taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Tax amount, in minor units.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Tax amount, in minor units.")
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTaxAmount() {
    return taxAmount;
  }


 /**
  * Tax amount, in minor units.
  *
  * @param taxAmount
  */ 
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxAmount(Long taxAmount) {
    this.taxAmount = taxAmount;
  }


  public LineItem taxPercentage(Long taxPercentage) {
    this.taxPercentage = taxPercentage;
    return this;
  }

   /**
   * Tax percentage, in minor units.
   * @return taxPercentage
  **/
  @ApiModelProperty(value = "Tax percentage, in minor units.")
  @JsonProperty(JSON_PROPERTY_TAX_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTaxPercentage() {
    return taxPercentage;
  }


 /**
  * Tax percentage, in minor units.
  *
  * @param taxPercentage
  */ 
  @JsonProperty(JSON_PROPERTY_TAX_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxPercentage(Long taxPercentage) {
    this.taxPercentage = taxPercentage;
  }


  public LineItem upc(String upc) {
    this.upc = upc;
    return this;
  }

   /**
   * Universal Product Code.
   * @return upc
  **/
  @ApiModelProperty(value = "Universal Product Code.")
  @JsonProperty(JSON_PROPERTY_UPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpc() {
    return upc;
  }


 /**
  * Universal Product Code.
  *
  * @param upc
  */ 
  @JsonProperty(JSON_PROPERTY_UPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpc(String upc) {
    this.upc = upc;
  }


  /**
   * Return true if this LineItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.amountExcludingTax, lineItem.amountExcludingTax) &&
        Objects.equals(this.amountIncludingTax, lineItem.amountIncludingTax) &&
        Objects.equals(this.brand, lineItem.brand) &&
        Objects.equals(this.color, lineItem.color) &&
        Objects.equals(this.description, lineItem.description) &&
        Objects.equals(this.id, lineItem.id) &&
        Objects.equals(this.imageUrl, lineItem.imageUrl) &&
        Objects.equals(this.itemCategory, lineItem.itemCategory) &&
        Objects.equals(this.manufacturer, lineItem.manufacturer) &&
        Objects.equals(this.marketplaceSellerId, lineItem.marketplaceSellerId) &&
        Objects.equals(this.productUrl, lineItem.productUrl) &&
        Objects.equals(this.quantity, lineItem.quantity) &&
        Objects.equals(this.receiverEmail, lineItem.receiverEmail) &&
        Objects.equals(this.size, lineItem.size) &&
        Objects.equals(this.sku, lineItem.sku) &&
        Objects.equals(this.taxAmount, lineItem.taxAmount) &&
        Objects.equals(this.taxPercentage, lineItem.taxPercentage) &&
        Objects.equals(this.upc, lineItem.upc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountExcludingTax, amountIncludingTax, brand, color, description, id, imageUrl, itemCategory, manufacturer, marketplaceSellerId, productUrl, quantity, receiverEmail, size, sku, taxAmount, taxPercentage, upc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    itemCategory: ").append(toIndentedString(itemCategory)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    marketplaceSellerId: ").append(toIndentedString(marketplaceSellerId)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    receiverEmail: ").append(toIndentedString(receiverEmail)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxPercentage: ").append(toIndentedString(taxPercentage)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
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
   * Create an instance of LineItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LineItem
   * @throws JsonProcessingException if the JSON string is invalid with respect to LineItem
   */
  public static LineItem fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, LineItem.class);
  }
/**
  * Convert an instance of LineItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

