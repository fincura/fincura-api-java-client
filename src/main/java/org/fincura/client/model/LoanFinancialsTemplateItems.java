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
 * LoanFinancialsTemplateItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-16T22:01:35.618Z[GMT]")
public class LoanFinancialsTemplateItems {
  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item_type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private String itemType;

  /**
   * Gets or Sets textFormat
   */
  @JsonAdapter(TextFormatEnum.Adapter.class)
  public enum TextFormatEnum {
    NUMBER("NUMBER"),
    
    PERCENT("PERCENT"),
    
    DAYS("DAYS"),
    
    RATIO("RATIO");

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

  public static final String SERIALIZED_NAME_ORIGINAL_EQUATION = "original_equation";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_EQUATION)
  private String originalEquation;

  public static final String SERIALIZED_NAME_EQUATION_OVERRIDE = "equation_override";
  @SerializedName(SERIALIZED_NAME_EQUATION_OVERRIDE)
  private String equationOverride;

  public static final String SERIALIZED_NAME_LINE_ITEM_ID = "line_item_id";
  @SerializedName(SERIALIZED_NAME_LINE_ITEM_ID)
  private Integer lineItemId;

  public static final String SERIALIZED_NAME_DISPLAY_BOLD = "display_bold";
  @SerializedName(SERIALIZED_NAME_DISPLAY_BOLD)
  private Boolean displayBold;


   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRef() {
    return ref;
  }




   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }




   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemType() {
    return itemType;
  }




   /**
   * Get textFormat
   * @return textFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TextFormatEnum getTextFormat() {
    return textFormat;
  }




   /**
   * Get originalEquation
   * @return originalEquation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalEquation() {
    return originalEquation;
  }




   /**
   * Get equationOverride
   * @return equationOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEquationOverride() {
    return equationOverride;
  }




   /**
   * Get lineItemId
   * @return lineItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLineItemId() {
    return lineItemId;
  }




   /**
   * Get displayBold
   * @return displayBold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisplayBold() {
    return displayBold;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanFinancialsTemplateItems loanFinancialsTemplateItems = (LoanFinancialsTemplateItems) o;
    return Objects.equals(this.ref, loanFinancialsTemplateItems.ref) &&
        Objects.equals(this.label, loanFinancialsTemplateItems.label) &&
        Objects.equals(this.itemType, loanFinancialsTemplateItems.itemType) &&
        Objects.equals(this.textFormat, loanFinancialsTemplateItems.textFormat) &&
        Objects.equals(this.originalEquation, loanFinancialsTemplateItems.originalEquation) &&
        Objects.equals(this.equationOverride, loanFinancialsTemplateItems.equationOverride) &&
        Objects.equals(this.lineItemId, loanFinancialsTemplateItems.lineItemId) &&
        Objects.equals(this.displayBold, loanFinancialsTemplateItems.displayBold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, label, itemType, textFormat, originalEquation, equationOverride, lineItemId, displayBold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanFinancialsTemplateItems {\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    textFormat: ").append(toIndentedString(textFormat)).append("\n");
    sb.append("    originalEquation: ").append(toIndentedString(originalEquation)).append("\n");
    sb.append("    equationOverride: ").append(toIndentedString(equationOverride)).append("\n");
    sb.append("    lineItemId: ").append(toIndentedString(lineItemId)).append("\n");
    sb.append("    displayBold: ").append(toIndentedString(displayBold)).append("\n");
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

