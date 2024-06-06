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
 * ExternalReason
 */
@JsonPropertyOrder({
  ExternalReason.JSON_PROPERTY_CODE,
  ExternalReason.JSON_PROPERTY_DESCRIPTION,
  ExternalReason.JSON_PROPERTY_NAMESPACE
})

public class ExternalReason {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private String namespace;

  public ExternalReason() { 
  }

  public ExternalReason code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The reason code.
   * @return code
  **/
  @ApiModelProperty(value = "The reason code.")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


 /**
  * The reason code.
  *
  * @param code
  */ 
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public ExternalReason description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the reason code.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the reason code.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


 /**
  * The description of the reason code.
  *
  * @param description
  */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ExternalReason namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * The namespace for the reason code.
   * @return namespace
  **/
  @ApiModelProperty(value = "The namespace for the reason code.")
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNamespace() {
    return namespace;
  }


 /**
  * The namespace for the reason code.
  *
  * @param namespace
  */ 
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  /**
   * Return true if this ExternalReason object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalReason externalReason = (ExternalReason) o;
    return Objects.equals(this.code, externalReason.code) &&
        Objects.equals(this.description, externalReason.description) &&
        Objects.equals(this.namespace, externalReason.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalReason {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
   * Create an instance of ExternalReason given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExternalReason
   * @throws JsonProcessingException if the JSON string is invalid with respect to ExternalReason
   */
  public static ExternalReason fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ExternalReason.class);
  }
/**
  * Convert an instance of ExternalReason to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

