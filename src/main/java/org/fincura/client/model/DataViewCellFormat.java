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

/**
 * DataViewCellFormat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-17T21:24:18.400Z[GMT]")
public class DataViewCellFormat {
  /**
   * Gets or Sets textFormat
   */
  @JsonAdapter(TextFormatEnum.Adapter.class)
  public enum TextFormatEnum {
    PERCENT("PERCENT"),
    
    CURRENCY("CURRENCY"),
    
    RATIO("RATIO"),
    
    DAYS("DAYS");

    private String value;

    TextFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextFormatEnum fromValue(String value) {
      for (TextFormatEnum b : TextFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TextFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TextFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TEXT_FORMAT = "text_format";
  @SerializedName(SERIALIZED_NAME_TEXT_FORMAT)
  private TextFormatEnum textFormat;


  public DataViewCellFormat textFormat(TextFormatEnum textFormat) {
    
    this.textFormat = textFormat;
    return this;
  }

   /**
   * Get textFormat
   * @return textFormat
  **/
  @ApiModelProperty(required = true, value = "")

  public TextFormatEnum getTextFormat() {
    return textFormat;
  }


  public void setTextFormat(TextFormatEnum textFormat) {
    this.textFormat = textFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataViewCellFormat dataViewCellFormat = (DataViewCellFormat) o;
    return Objects.equals(this.textFormat, dataViewCellFormat.textFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataViewCellFormat {\n");
    sb.append("    textFormat: ").append(toIndentedString(textFormat)).append("\n");
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

