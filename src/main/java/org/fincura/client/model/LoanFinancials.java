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
import org.fincura.client.model.LoanFinancialsDataColumns;
import org.fincura.client.model.LoanFinancialsTemplateItems;

/**
 * LoanFinancials
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-17T21:24:18.400Z[GMT]")
public class LoanFinancials {
  public static final String SERIALIZED_NAME_DATA_OVERRIDES = "data_overrides";
  @SerializedName(SERIALIZED_NAME_DATA_OVERRIDES)
  private List<List<String>> dataOverrides = new ArrayList<List<String>>();

  public static final String SERIALIZED_NAME_TEMPLATE_ITEMS = "template_items";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ITEMS)
  private List<LoanFinancialsTemplateItems> templateItems = null;

  public static final String SERIALIZED_NAME_DATA_COLUMNS = "data_columns";
  @SerializedName(SERIALIZED_NAME_DATA_COLUMNS)
  private List<LoanFinancialsDataColumns> dataColumns = null;


  public LoanFinancials dataOverrides(List<List<String>> dataOverrides) {
    
    this.dataOverrides = dataOverrides;
    return this;
  }

  public LoanFinancials addDataOverridesItem(List<String> dataOverridesItem) {
    this.dataOverrides.add(dataOverridesItem);
    return this;
  }

   /**
   * Get dataOverrides
   * @return dataOverrides
  **/
  @ApiModelProperty(required = true, value = "")

  public List<List<String>> getDataOverrides() {
    return dataOverrides;
  }


  public void setDataOverrides(List<List<String>> dataOverrides) {
    this.dataOverrides = dataOverrides;
  }


   /**
   * Get templateItems
   * @return templateItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LoanFinancialsTemplateItems> getTemplateItems() {
    return templateItems;
  }




   /**
   * Get dataColumns
   * @return dataColumns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LoanFinancialsDataColumns> getDataColumns() {
    return dataColumns;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanFinancials loanFinancials = (LoanFinancials) o;
    return Objects.equals(this.dataOverrides, loanFinancials.dataOverrides) &&
        Objects.equals(this.templateItems, loanFinancials.templateItems) &&
        Objects.equals(this.dataColumns, loanFinancials.dataColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataOverrides, templateItems, dataColumns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanFinancials {\n");
    sb.append("    dataOverrides: ").append(toIndentedString(dataOverrides)).append("\n");
    sb.append("    templateItems: ").append(toIndentedString(templateItems)).append("\n");
    sb.append("    dataColumns: ").append(toIndentedString(dataColumns)).append("\n");
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

