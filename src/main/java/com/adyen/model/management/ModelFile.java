/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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
 * ModelFile
 */
@JsonPropertyOrder({
  ModelFile.JSON_PROPERTY_DATA,
  ModelFile.JSON_PROPERTY_NAME
})
@JsonTypeName("File")

public class ModelFile {
  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ModelFile() { 
  }

  public ModelFile data(String data) {
    this.data = data;
    return this;
  }

   /**
   * The certificate content converted to a Base64-encoded string.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "The certificate content converted to a Base64-encoded string.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getData() {
    return data;
  }


 /**
  * The certificate content converted to a Base64-encoded string.
  *
  * @param data
  */ 
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(String data) {
    this.data = data;
  }


  public ModelFile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the certificate. Must be unique across Wi-Fi profiles.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the certificate. Must be unique across Wi-Fi profiles.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


 /**
  * The name of the certificate. Must be unique across Wi-Fi profiles.
  *
  * @param name
  */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this File object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelFile _file = (ModelFile) o;
    return Objects.equals(this.data, _file.data) &&
        Objects.equals(this.name, _file.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFile {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
   * Create an instance of ModelFile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModelFile
   * @throws JsonProcessingException if the JSON string is invalid with respect to ModelFile
   */
  public static ModelFile fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ModelFile.class);
  }
/**
  * Convert an instance of ModelFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

