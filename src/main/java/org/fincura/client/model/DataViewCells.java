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
import org.fincura.client.model.DataViewCalculatedValue;

/**
 * DataViewCells
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-27T00:03:41.356Z[GMT]")
public class DataViewCells {
  public static final String SERIALIZED_NAME_CALCULATED_VALUE = "calculated_value";
  @SerializedName(SERIALIZED_NAME_CALCULATED_VALUE)
  private DataViewCalculatedValue calculatedValue;


  public DataViewCells calculatedValue(DataViewCalculatedValue calculatedValue) {
    
    this.calculatedValue = calculatedValue;
    return this;
  }

   /**
   * Get calculatedValue
   * @return calculatedValue
  **/
  @ApiModelProperty(required = true, value = "")

  public DataViewCalculatedValue getCalculatedValue() {
    return calculatedValue;
  }


  public void setCalculatedValue(DataViewCalculatedValue calculatedValue) {
    this.calculatedValue = calculatedValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataViewCells dataViewCells = (DataViewCells) o;
    return Objects.equals(this.calculatedValue, dataViewCells.calculatedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataViewCells {\n");
    sb.append("    calculatedValue: ").append(toIndentedString(calculatedValue)).append("\n");
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

