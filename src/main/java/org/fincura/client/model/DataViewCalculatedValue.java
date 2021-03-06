/*
 * Fincura API
 * This [REST API](https://en.wikipedia.org/wiki/Representational_state_transfer) allows you to interact with the Fincura processing and insights engine.   # Authentication  This API uses API keys generated from a Fincura User account. To get access to your User account, speak with you Fincura account manager.  # Accepted Media Types  | File&nbsp;Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Extension(s)     | Content-Type(s) | | -------------------------------- |-------------- | ------------ | | PDF File | .pdf | `application/pdf` , `application/x-pdf` | | Excel File | .xls | `application/vnd.ms-excel`  | | Excel File | .xlsx | `application/vnd.openxmlformats-officedocument.spreadsheetml.sheet`  | | Excel File | .xlsm | `application/vnd.ms-excel.sheet.macroEnabled.12`  | | PNG Image | .png | `image/png`  | | GIF Image | .gif | `image/gif`  | | JPG Image | .jpg, .jpeg | `image/jpeg`  | | GIF Image | .gif | `image/gif`  |   # Getting Started  1. [Create a Borrower](#operation/createBorrower)  2. [Add a file](#operation/createDocumentFile) for that Borrower. 3. Analyze in the Fincura App  ****
 *
 * The version of the OpenAPI document: 1.3.0
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
import org.fincura.client.model.DataViewCalculatedValueLineItem;

/**
 * DataViewCalculatedValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-27T00:03:41.356Z[GMT]")
public class DataViewCalculatedValue {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_FOOTNOTES = "footnotes";
  @SerializedName(SERIALIZED_NAME_FOOTNOTES)
  private String footnotes;

  public static final String SERIALIZED_NAME_LINE_ITEM = "line_item";
  @SerializedName(SERIALIZED_NAME_LINE_ITEM)
  private DataViewCalculatedValueLineItem lineItem;


  public DataViewCalculatedValue value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public DataViewCalculatedValue error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(required = true, value = "")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public DataViewCalculatedValue errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(required = true, value = "")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public DataViewCalculatedValue footnotes(String footnotes) {
    
    this.footnotes = footnotes;
    return this;
  }

   /**
   * Get footnotes
   * @return footnotes
  **/
  @ApiModelProperty(required = true, value = "")

  public String getFootnotes() {
    return footnotes;
  }


  public void setFootnotes(String footnotes) {
    this.footnotes = footnotes;
  }


  public DataViewCalculatedValue lineItem(DataViewCalculatedValueLineItem lineItem) {
    
    this.lineItem = lineItem;
    return this;
  }

   /**
   * Get lineItem
   * @return lineItem
  **/
  @ApiModelProperty(required = true, value = "")

  public DataViewCalculatedValueLineItem getLineItem() {
    return lineItem;
  }


  public void setLineItem(DataViewCalculatedValueLineItem lineItem) {
    this.lineItem = lineItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataViewCalculatedValue dataViewCalculatedValue = (DataViewCalculatedValue) o;
    return Objects.equals(this.value, dataViewCalculatedValue.value) &&
        Objects.equals(this.error, dataViewCalculatedValue.error) &&
        Objects.equals(this.errorMessage, dataViewCalculatedValue.errorMessage) &&
        Objects.equals(this.footnotes, dataViewCalculatedValue.footnotes) &&
        Objects.equals(this.lineItem, dataViewCalculatedValue.lineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, error, errorMessage, footnotes, lineItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataViewCalculatedValue {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    footnotes: ").append(toIndentedString(footnotes)).append("\n");
    sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
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

