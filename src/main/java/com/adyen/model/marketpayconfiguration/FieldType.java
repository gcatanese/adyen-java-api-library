/*
 * Notification Configuration API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Notification Configuration API provides endpoints for setting up and testing notifications that inform you of events on your platform, for example when a verification check or a payout has been completed.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic/notifications). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Notification Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Notification/v6/createNotificationConfiguration ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayconfiguration;

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
 * FieldType
 */
@JsonPropertyOrder({
  FieldType.JSON_PROPERTY_FIELD,
  FieldType.JSON_PROPERTY_FIELD_NAME,
  FieldType.JSON_PROPERTY_SHAREHOLDER_CODE
})

public class FieldType {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  /**
   * The type of the field.
   */
  public enum FieldNameEnum {
    ACCOUNTCODE("accountCode"),
    
    ACCOUNTHOLDERCODE("accountHolderCode"),
    
    ACCOUNTHOLDERDETAILS("accountHolderDetails"),
    
    ACCOUNTNUMBER("accountNumber"),
    
    ACCOUNTSTATETYPE("accountStateType"),
    
    ACCOUNTSTATUS("accountStatus"),
    
    ACCOUNTTYPE("accountType"),
    
    ADDRESS("address"),
    
    BALANCEACCOUNT("balanceAccount"),
    
    BALANCEACCOUNTACTIVE("balanceAccountActive"),
    
    BALANCEACCOUNTCODE("balanceAccountCode"),
    
    BALANCEACCOUNTID("balanceAccountId"),
    
    BANKACCOUNT("bankAccount"),
    
    BANKACCOUNTCODE("bankAccountCode"),
    
    BANKACCOUNTNAME("bankAccountName"),
    
    BANKACCOUNTUUID("bankAccountUUID"),
    
    BANKBICSWIFT("bankBicSwift"),
    
    BANKCITY("bankCity"),
    
    BANKCODE("bankCode"),
    
    BANKNAME("bankName"),
    
    BANKSTATEMENT("bankStatement"),
    
    BRANCHCODE("branchCode"),
    
    BUSINESSCONTACT("businessContact"),
    
    CARDTOKEN("cardToken"),
    
    CHECKCODE("checkCode"),
    
    CITY("city"),
    
    COMPANYREGISTRATION("companyRegistration"),
    
    CONSTITUTIONALDOCUMENT("constitutionalDocument"),
    
    CONTROLLER("controller"),
    
    COUNTRY("country"),
    
    COUNTRYCODE("countryCode"),
    
    CURRENCY("currency"),
    
    CURRENCYCODE("currencyCode"),
    
    DATEOFBIRTH("dateOfBirth"),
    
    DESCRIPTION("description"),
    
    DESTINATIONACCOUNTCODE("destinationAccountCode"),
    
    DOCUMENT("document"),
    
    DOCUMENTCONTENT("documentContent"),
    
    DOCUMENTEXPIRATIONDATE("documentExpirationDate"),
    
    DOCUMENTISSUERCOUNTRY("documentIssuerCountry"),
    
    DOCUMENTISSUERSTATE("documentIssuerState"),
    
    DOCUMENTNAME("documentName"),
    
    DOCUMENTNUMBER("documentNumber"),
    
    DOCUMENTTYPE("documentType"),
    
    DOINGBUSINESSAS("doingBusinessAs"),
    
    DRIVINGLICENCE("drivingLicence"),
    
    DRIVINGLICENCEBACK("drivingLicenceBack"),
    
    DRIVINGLICENCEFRONT("drivingLicenceFront"),
    
    DRIVINGLICENSE("drivingLicense"),
    
    EMAIL("email"),
    
    FIRSTNAME("firstName"),
    
    FORMTYPE("formType"),
    
    FULLPHONENUMBER("fullPhoneNumber"),
    
    GENDER("gender"),
    
    HOPWEBSERVICEUSER("hopWebserviceUser"),
    
    HOUSENUMBERORNAME("houseNumberOrName"),
    
    IBAN("iban"),
    
    IDCARD("idCard"),
    
    IDCARDBACK("idCardBack"),
    
    IDCARDFRONT("idCardFront"),
    
    IDNUMBER("idNumber"),
    
    IDENTITYDOCUMENT("identityDocument"),
    
    INDIVIDUALDETAILS("individualDetails"),
    
    INFIX("infix"),
    
    JOBTITLE("jobTitle"),
    
    LASTNAME("lastName"),
    
    LASTREVIEWDATE("lastReviewDate"),
    
    LEGALARRANGEMENT("legalArrangement"),
    
    LEGALARRANGEMENTCODE("legalArrangementCode"),
    
    LEGALARRANGEMENTENTITY("legalArrangementEntity"),
    
    LEGALARRANGEMENTENTITYCODE("legalArrangementEntityCode"),
    
    LEGALARRANGEMENTLEGALFORM("legalArrangementLegalForm"),
    
    LEGALARRANGEMENTMEMBER("legalArrangementMember"),
    
    LEGALARRANGEMENTMEMBERS("legalArrangementMembers"),
    
    LEGALARRANGEMENTNAME("legalArrangementName"),
    
    LEGALARRANGEMENTREFERENCE("legalArrangementReference"),
    
    LEGALARRANGEMENTREGISTRATIONNUMBER("legalArrangementRegistrationNumber"),
    
    LEGALARRANGEMENTTAXNUMBER("legalArrangementTaxNumber"),
    
    LEGALARRANGEMENTTYPE("legalArrangementType"),
    
    LEGALBUSINESSNAME("legalBusinessName"),
    
    LEGALENTITY("legalEntity"),
    
    LEGALENTITYTYPE("legalEntityType"),
    
    LOGO("logo"),
    
    MERCHANTACCOUNT("merchantAccount"),
    
    MERCHANTCATEGORYCODE("merchantCategoryCode"),
    
    MERCHANTHOUSENUMBER("merchantHouseNumber"),
    
    MERCHANTREFERENCE("merchantReference"),
    
    MICRODEPOSIT("microDeposit"),
    
    NAME("name"),
    
    NATIONALITY("nationality"),
    
    ORIGINALREFERENCE("originalReference"),
    
    OWNERCITY("ownerCity"),
    
    OWNERCOUNTRYCODE("ownerCountryCode"),
    
    OWNERDATEOFBIRTH("ownerDateOfBirth"),
    
    OWNERHOUSENUMBERORNAME("ownerHouseNumberOrName"),
    
    OWNERNAME("ownerName"),
    
    OWNERPOSTALCODE("ownerPostalCode"),
    
    OWNERSTATE("ownerState"),
    
    OWNERSTREET("ownerStreet"),
    
    PASSPORT("passport"),
    
    PASSPORTNUMBER("passportNumber"),
    
    PAYOUTMETHOD("payoutMethod"),
    
    PAYOUTMETHODCODE("payoutMethodCode"),
    
    PAYOUTSCHEDULE("payoutSchedule"),
    
    PCISELFASSESSMENT("pciSelfAssessment"),
    
    PERSONALDATA("personalData"),
    
    PHONECOUNTRYCODE("phoneCountryCode"),
    
    PHONENUMBER("phoneNumber"),
    
    POSTALCODE("postalCode"),
    
    PRIMARYCURRENCY("primaryCurrency"),
    
    REASON("reason"),
    
    REGISTRATIONNUMBER("registrationNumber"),
    
    RETURNURL("returnUrl"),
    
    SCHEDULE("schedule"),
    
    SHAREHOLDER("shareholder"),
    
    SHAREHOLDERCODE("shareholderCode"),
    
    SHAREHOLDERCODEANDSIGNATORYCODE("shareholderCodeAndSignatoryCode"),
    
    SHAREHOLDERCODEORSIGNATORYCODE("shareholderCodeOrSignatoryCode"),
    
    SHAREHOLDERTYPE("shareholderType"),
    
    SHAREHOLDERTYPES("shareholderTypes"),
    
    SHOPPERINTERACTION("shopperInteraction"),
    
    SIGNATORY("signatory"),
    
    SIGNATORYCODE("signatoryCode"),
    
    SOCIALSECURITYNUMBER("socialSecurityNumber"),
    
    SOURCEACCOUNTCODE("sourceAccountCode"),
    
    SPLITACCOUNT("splitAccount"),
    
    SPLITCONFIGURATIONUUID("splitConfigurationUUID"),
    
    SPLITCURRENCY("splitCurrency"),
    
    SPLITVALUE("splitValue"),
    
    SPLITS("splits"),
    
    STATEORPROVINCE("stateOrProvince"),
    
    STATUS("status"),
    
    STOCKEXCHANGE("stockExchange"),
    
    STOCKNUMBER("stockNumber"),
    
    STOCKTICKER("stockTicker"),
    
    STORE("store"),
    
    STOREDETAIL("storeDetail"),
    
    STORENAME("storeName"),
    
    STOREREFERENCE("storeReference"),
    
    STREET("street"),
    
    TAXID("taxId"),
    
    TIER("tier"),
    
    TIERNUMBER("tierNumber"),
    
    TRANSFERCODE("transferCode"),
    
    ULTIMATEPARENTCOMPANY("ultimateParentCompany"),
    
    ULTIMATEPARENTCOMPANYADDRESSDETAILS("ultimateParentCompanyAddressDetails"),
    
    ULTIMATEPARENTCOMPANYADDRESSDETAILSCOUNTRY("ultimateParentCompanyAddressDetailsCountry"),
    
    ULTIMATEPARENTCOMPANYBUSINESSDETAILS("ultimateParentCompanyBusinessDetails"),
    
    ULTIMATEPARENTCOMPANYBUSINESSDETAILSLEGALBUSINESSNAME("ultimateParentCompanyBusinessDetailsLegalBusinessName"),
    
    ULTIMATEPARENTCOMPANYBUSINESSDETAILSREGISTRATIONNUMBER("ultimateParentCompanyBusinessDetailsRegistrationNumber"),
    
    ULTIMATEPARENTCOMPANYCODE("ultimateParentCompanyCode"),
    
    ULTIMATEPARENTCOMPANYSTOCKEXCHANGE("ultimateParentCompanyStockExchange"),
    
    ULTIMATEPARENTCOMPANYSTOCKNUMBER("ultimateParentCompanyStockNumber"),
    
    ULTIMATEPARENTCOMPANYSTOCKNUMBERORSTOCKTICKER("ultimateParentCompanyStockNumberOrStockTicker"),
    
    ULTIMATEPARENTCOMPANYSTOCKTICKER("ultimateParentCompanyStockTicker"),
    
    UNKNOWN("unknown"),
    
    VALUE("value"),
    
    VERIFICATIONTYPE("verificationType"),
    
    VIRTUALACCOUNT("virtualAccount"),
    
    VISANUMBER("visaNumber"),
    
    WEBADDRESS("webAddress"),
    
    YEAR("year");

    private String value;

    FieldNameEnum(String value) {
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
    public static FieldNameEnum fromValue(String value) {
      for (FieldNameEnum b : FieldNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FIELD_NAME = "fieldName";
  private FieldNameEnum fieldName;

  public static final String JSON_PROPERTY_SHAREHOLDER_CODE = "shareholderCode";
  private String shareholderCode;

  public FieldType() { 
  }

  public FieldType field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The full name of the property.
   * @return field
  **/
  @ApiModelProperty(value = "The full name of the property.")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(String field) {
    this.field = field;
  }


  public FieldType fieldName(FieldNameEnum fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * The type of the field.
   * @return fieldName
  **/
  @ApiModelProperty(value = "The type of the field.")
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FieldNameEnum getFieldName() {
    return fieldName;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldName(FieldNameEnum fieldName) {
    this.fieldName = fieldName;
  }


  public FieldType shareholderCode(String shareholderCode) {
    this.shareholderCode = shareholderCode;
    return this;
  }

   /**
   * The code of the shareholder that the field belongs to. If empty, the field belongs to an account holder.
   * @return shareholderCode
  **/
  @ApiModelProperty(value = "The code of the shareholder that the field belongs to. If empty, the field belongs to an account holder.")
  @JsonProperty(JSON_PROPERTY_SHAREHOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShareholderCode() {
    return shareholderCode;
  }


  @JsonProperty(JSON_PROPERTY_SHAREHOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareholderCode(String shareholderCode) {
    this.shareholderCode = shareholderCode;
  }


  /**
   * Return true if this FieldType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldType fieldType = (FieldType) o;
    return Objects.equals(this.field, fieldType.field) &&
        Objects.equals(this.fieldName, fieldType.fieldName) &&
        Objects.equals(this.shareholderCode, fieldType.shareholderCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, fieldName, shareholderCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldType {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    shareholderCode: ").append(toIndentedString(shareholderCode)).append("\n");
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
   * Create an instance of FieldType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FieldType
   * @throws JsonProcessingException if the JSON string is invalid with respect to FieldType
   */
  public static FieldType fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, FieldType.class);
  }
/**
  * Convert an instance of FieldType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

