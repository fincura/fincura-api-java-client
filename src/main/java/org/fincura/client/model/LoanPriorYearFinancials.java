/*
 * Fincura API
 * This [REST API](https://en.wikipedia.org/wiki/Representational_state_transfer) allows you to interact with the Fincura processing and insights engine.   # Authentication  This API uses API keys generated from a Fincura User account. To get access to your User account, speak with you Fincura account manager.  # Accepted Media Types  | File&nbsp;Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Extension(s)     | Content-Type(s) | | -------------------------------- |-------------- | ------------ | | PDF File | .pdf | `application/pdf` , `application/x-pdf` | | Excel File | .xls | `application/vnd.ms-excel`  | | Excel File | .xlsx | `application/vnd.openxmlformats-officedocument.spreadsheetml.sheet`  | | Excel File | .xlsm | `application/vnd.ms-excel.sheet.macroEnabled.12`  | | PNG Image | .png | `image/png`  | | GIF Image | .gif | `image/gif`  | | JPG Image | .jpg, .jpeg | `image/jpeg`  | | GIF Image | .gif | `image/gif`  |   # Getting Started  1. [Create a Borrower](#operation/createBorrower)  2. [Add a file](#operation/createDocumentFile) for that Borrower. 3. Analyze in the Fincura App  ****
 *
 * The version of the OpenAPI document: 1.2.6
 * Contact: support@fincura.com
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
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * LoanPriorYearFinancials
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-15T17:13:42.707Z[GMT]")
public class LoanPriorYearFinancials {
  public static final String SERIALIZED_NAME_STATEMENT_DATE = "statement_date";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DATE)
  private LocalDate statementDate;

  public static final String SERIALIZED_NAME_PREPARATION_TYPE = "preparation_type";
  @SerializedName(SERIALIZED_NAME_PREPARATION_TYPE)
  private String preparationType;

  public static final String SERIALIZED_NAME_NET_INCOME = "net_income";
  @SerializedName(SERIALIZED_NAME_NET_INCOME)
  private BigDecimal netIncome;


   /**
   * Get statementDate
   * @return statementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getStatementDate() {
    return statementDate;
  }




   /**
   * Get preparationType
   * @return preparationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreparationType() {
    return preparationType;
  }




   /**
   * Get netIncome
   * minimum: -1000000000000000000
   * maximum: 1000000000000000000
   * @return netIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNetIncome() {
    return netIncome;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanPriorYearFinancials loanPriorYearFinancials = (LoanPriorYearFinancials) o;
    return Objects.equals(this.statementDate, loanPriorYearFinancials.statementDate) &&
        Objects.equals(this.preparationType, loanPriorYearFinancials.preparationType) &&
        Objects.equals(this.netIncome, loanPriorYearFinancials.netIncome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementDate, preparationType, netIncome);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanPriorYearFinancials {\n");
    sb.append("    statementDate: ").append(toIndentedString(statementDate)).append("\n");
    sb.append("    preparationType: ").append(toIndentedString(preparationType)).append("\n");
    sb.append("    netIncome: ").append(toIndentedString(netIncome)).append("\n");
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

