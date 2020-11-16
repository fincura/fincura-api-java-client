/*
 * Fincura Integration API
 * This [REST API](https://en.wikipedia.org/wiki/Representational_state_transfer) allows you to interact with the Fincura processing and insights engine.   # Authentication  This API uses API keys generated from a Fincura User account. To get access to your User account, speak with you Fincura account manager.  # Accepted Media Types  | File&nbsp;Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Extension(s)     | Content-Type(s) | | -------------------------------- |-------------- | ------------ | | PDF File | .pdf | `application/pdf` , `application/x-pdf` | | Excel File | .xls | `application/vnd.ms-excel`  | | Excel File | .xlsx | `application/vnd.openxmlformats-officedocument.spreadsheetml.sheet`  | | PNG Image | .png | `image/png`  | | GIF Image | .gif | `image/gif`  | | JPG Image | .jpg, .jpeg | `image/jpeg`  | | GIF Image | .gif | `image/gif`  |   # Getting Started  1. [Create a Borrower](#operation/createBorrower)  2. [Add a file](#operation/createDocumentFile) for that Borrower. 3. Analyze in the Fincura App  ****
 *
 * The version of the OpenAPI document: 1.2.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.fincura.client.model;

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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.fincura.client.model.FinancialRequirementRules;
import org.threeten.bp.OffsetDateTime;

/**
 * FinancialRequirement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-16T22:01:35.618Z[GMT]")
public class FinancialRequirement {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED_DATE = "created_date";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_BORROWER_UUID = "borrower_uuid";
  @SerializedName(SERIALIZED_NAME_BORROWER_UUID)
  private UUID borrowerUuid;

  public static final String SERIALIZED_NAME_LOAN_UUID = "loan_uuid";
  @SerializedName(SERIALIZED_NAME_LOAN_UUID)
  private UUID loanUuid;

  public static final String SERIALIZED_NAME_INPUT_EQUATION = "input_equation";
  @SerializedName(SERIALIZED_NAME_INPUT_EQUATION)
  private String inputEquation;

  /**
   * Gets or Sets frequency
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    MONTHLY("MONTHLY"),
    
    QUARTERLY("QUARTERLY"),
    
    SEMI_ANNUALLY("SEMI_ANNUALLY"),
    
    ANNUALLY("ANNUALLY"),
    
    TTM("TTM"),
    
    FISCAL_YTD("FISCAL_YTD");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<FinancialRequirementRules> rules = null;


   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUuid() {
    return uuid;
  }




  public FinancialRequirement name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Title of the FinancialRequirement. Must be unique for the Borrower
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Title of the FinancialRequirement. Must be unique for the Borrower")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FinancialRequirement description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public FinancialRequirement externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External ID is used to uniquely identify a record from your system in our system. Must be unique across records.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External ID is used to uniquely identify a record from your system in our system. Must be unique across records.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public FinancialRequirement borrowerUuid(UUID borrowerUuid) {
    
    this.borrowerUuid = borrowerUuid;
    return this;
  }

   /**
   * UUID of the borrower for this loan. (see [Borrowers](#tag/Borrowers))
   * @return borrowerUuid
  **/
  @ApiModelProperty(required = true, value = "UUID of the borrower for this loan. (see [Borrowers](#tag/Borrowers))")

  public UUID getBorrowerUuid() {
    return borrowerUuid;
  }


  public void setBorrowerUuid(UUID borrowerUuid) {
    this.borrowerUuid = borrowerUuid;
  }


  public FinancialRequirement loanUuid(UUID loanUuid) {
    
    this.loanUuid = loanUuid;
    return this;
  }

   /**
   * UUID of the loan for this requirement. (see [Loans](#tag/Loans))
   * @return loanUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID of the loan for this requirement. (see [Loans](#tag/Loans))")

  public UUID getLoanUuid() {
    return loanUuid;
  }


  public void setLoanUuid(UUID loanUuid) {
    this.loanUuid = loanUuid;
  }


  public FinancialRequirement inputEquation(String inputEquation) {
    
    this.inputEquation = inputEquation;
    return this;
  }

   /**
   * Get inputEquation
   * @return inputEquation
  **/
  @ApiModelProperty(required = true, value = "")

  public String getInputEquation() {
    return inputEquation;
  }


  public void setInputEquation(String inputEquation) {
    this.inputEquation = inputEquation;
  }


  public FinancialRequirement frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public FinancialRequirement rules(List<FinancialRequirementRules> rules) {
    
    this.rules = rules;
    return this;
  }

  public FinancialRequirement addRulesItem(FinancialRequirementRules rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<FinancialRequirementRules>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FinancialRequirementRules> getRules() {
    return rules;
  }


  public void setRules(List<FinancialRequirementRules> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialRequirement financialRequirement = (FinancialRequirement) o;
    return Objects.equals(this.uuid, financialRequirement.uuid) &&
        Objects.equals(this.name, financialRequirement.name) &&
        Objects.equals(this.description, financialRequirement.description) &&
        Objects.equals(this.createdDate, financialRequirement.createdDate) &&
        Objects.equals(this.externalId, financialRequirement.externalId) &&
        Objects.equals(this.borrowerUuid, financialRequirement.borrowerUuid) &&
        Objects.equals(this.loanUuid, financialRequirement.loanUuid) &&
        Objects.equals(this.inputEquation, financialRequirement.inputEquation) &&
        Objects.equals(this.frequency, financialRequirement.frequency) &&
        Objects.equals(this.rules, financialRequirement.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, description, createdDate, externalId, borrowerUuid, loanUuid, inputEquation, frequency, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialRequirement {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    borrowerUuid: ").append(toIndentedString(borrowerUuid)).append("\n");
    sb.append("    loanUuid: ").append(toIndentedString(loanUuid)).append("\n");
    sb.append("    inputEquation: ").append(toIndentedString(inputEquation)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

}

