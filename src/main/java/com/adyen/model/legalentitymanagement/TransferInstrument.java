/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.BankAccountInfo;
import com.adyen.model.legalentitymanagement.CapabilityProblem;
import com.adyen.model.legalentitymanagement.DocumentReference;
import com.adyen.model.legalentitymanagement.SupportingEntityCapability;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TransferInstrument
 */
@JsonPropertyOrder({
  TransferInstrument.JSON_PROPERTY_BANK_ACCOUNT,
  TransferInstrument.JSON_PROPERTY_CAPABILITIES,
  TransferInstrument.JSON_PROPERTY_DOCUMENT_DETAILS,
  TransferInstrument.JSON_PROPERTY_ID,
  TransferInstrument.JSON_PROPERTY_LEGAL_ENTITY_ID,
  TransferInstrument.JSON_PROPERTY_PROBLEMS,
  TransferInstrument.JSON_PROPERTY_TYPE
})

public class TransferInstrument {
  public static final String JSON_PROPERTY_BANK_ACCOUNT = "bankAccount";
  private BankAccountInfo bankAccount;

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private Map<String, SupportingEntityCapability> capabilities = null;

  public static final String JSON_PROPERTY_DOCUMENT_DETAILS = "documentDetails";
  private List<DocumentReference> documentDetails = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_ID = "legalEntityId";
  private String legalEntityId;

  public static final String JSON_PROPERTY_PROBLEMS = "problems";
  private List<CapabilityProblem> problems = null;

  /**
   * The type of transfer instrument.  Possible value: **bankAccount**.
   */
  public enum TypeEnum {
    BANKACCOUNT("bankAccount"),
    
    RECURRINGDETAIL("recurringDetail");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public TransferInstrument() { 
  }

  public TransferInstrument bankAccount(BankAccountInfo bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankAccountInfo getBankAccount() {
    return bankAccount;
  }


 /**
  * bankAccount
  *
  * @param bankAccount
  */ 
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccount(BankAccountInfo bankAccount) {
    this.bankAccount = bankAccount;
  }


  public TransferInstrument capabilities(Map<String, SupportingEntityCapability> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public TransferInstrument putCapabilitiesItem(String key, SupportingEntityCapability capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new HashMap<>();
    }
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

   /**
   * List of capabilities for this transfer instrument.
   * @return capabilities
  **/
  @ApiModelProperty(value = "List of capabilities for this transfer instrument.")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, SupportingEntityCapability> getCapabilities() {
    return capabilities;
  }


 /**
  * List of capabilities for this transfer instrument.
  *
  * @param capabilities
  */ 
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(Map<String, SupportingEntityCapability> capabilities) {
    this.capabilities = capabilities;
  }


  public TransferInstrument documentDetails(List<DocumentReference> documentDetails) {
    this.documentDetails = documentDetails;
    return this;
  }

  public TransferInstrument addDocumentDetailsItem(DocumentReference documentDetailsItem) {
    if (this.documentDetails == null) {
      this.documentDetails = new ArrayList<>();
    }
    this.documentDetails.add(documentDetailsItem);
    return this;
  }

   /**
   * List of documents uploaded for the transfer instrument.
   * @return documentDetails
  **/
  @ApiModelProperty(value = "List of documents uploaded for the transfer instrument.")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocumentReference> getDocumentDetails() {
    return documentDetails;
  }


 /**
  * List of documents uploaded for the transfer instrument.
  *
  * @param documentDetails
  */ 
  @JsonProperty(JSON_PROPERTY_DOCUMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentDetails(List<DocumentReference> documentDetails) {
    this.documentDetails = documentDetails;
  }


  public TransferInstrument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the transfer instrument.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the transfer instrument.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * The unique identifier of the transfer instrument.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public TransferInstrument legalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument.
   * @return legalEntityId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument.")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegalEntityId() {
    return legalEntityId;
  }


 /**
  * The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) that owns the transfer instrument.
  *
  * @param legalEntityId
  */ 
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public TransferInstrument problems(List<CapabilityProblem> problems) {
    this.problems = problems;
    return this;
  }

  public TransferInstrument addProblemsItem(CapabilityProblem problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<>();
    }
    this.problems.add(problemsItem);
    return this;
  }

   /**
   * The verification errors related to capabilities for this transfer instrument.
   * @return problems
  **/
  @ApiModelProperty(value = "The verification errors related to capabilities for this transfer instrument.")
  @JsonProperty(JSON_PROPERTY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CapabilityProblem> getProblems() {
    return problems;
  }


 /**
  * The verification errors related to capabilities for this transfer instrument.
  *
  * @param problems
  */ 
  @JsonProperty(JSON_PROPERTY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProblems(List<CapabilityProblem> problems) {
    this.problems = problems;
  }


  public TransferInstrument type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of transfer instrument.  Possible value: **bankAccount**.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of transfer instrument.  Possible value: **bankAccount**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * The type of transfer instrument.  Possible value: **bankAccount**.
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this TransferInstrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferInstrument transferInstrument = (TransferInstrument) o;
    return Objects.equals(this.bankAccount, transferInstrument.bankAccount) &&
        Objects.equals(this.capabilities, transferInstrument.capabilities) &&
        Objects.equals(this.documentDetails, transferInstrument.documentDetails) &&
        Objects.equals(this.id, transferInstrument.id) &&
        Objects.equals(this.legalEntityId, transferInstrument.legalEntityId) &&
        Objects.equals(this.problems, transferInstrument.problems) &&
        Objects.equals(this.type, transferInstrument.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, capabilities, documentDetails, id, legalEntityId, problems, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferInstrument {\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    documentDetails: ").append(toIndentedString(documentDetails)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
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

/**
   * Create an instance of TransferInstrument given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferInstrument
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransferInstrument
   */
  public static TransferInstrument fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransferInstrument.class);
  }
/**
  * Convert an instance of TransferInstrument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

