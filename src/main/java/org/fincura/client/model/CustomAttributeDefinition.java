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
import java.util.UUID;

/**
 * CustomAttributeDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-27T00:03:41.356Z[GMT]")
public class CustomAttributeDefinition {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Gets or Sets recordType
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    DOCUMENTFILE("DocumentFile"),
    
    BORROWER("Borrower"),
    
    LOAN("Loan");

    private String value;

    RecordTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RecordTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecordTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecordTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RecordTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RECORD_TYPE = "record_type";
  @SerializedName(SERIALIZED_NAME_RECORD_TYPE)
  private RecordTypeEnum recordType;

  /**
   * Gets or Sets attributeType
   */
  @JsonAdapter(AttributeTypeEnum.Adapter.class)
  public enum AttributeTypeEnum {
    STRING("STRING"),
    
    BOOLEAN("BOOLEAN"),
    
    NUMBER("NUMBER");

    private String value;

    AttributeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttributeTypeEnum fromValue(String value) {
      for (AttributeTypeEnum b : AttributeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AttributeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttributeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttributeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AttributeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ATTRIBUTE_TYPE = "attribute_type";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_TYPE)
  private AttributeTypeEnum attributeType;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;


   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUuid() {
    return uuid;
  }




  public CustomAttributeDefinition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }




  public CustomAttributeDefinition description(String description) {
    
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


  public CustomAttributeDefinition recordType(RecordTypeEnum recordType) {
    
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @ApiModelProperty(required = true, value = "")

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public CustomAttributeDefinition attributeType(AttributeTypeEnum attributeType) {
    
    this.attributeType = attributeType;
    return this;
  }

   /**
   * Get attributeType
   * @return attributeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttributeTypeEnum getAttributeType() {
    return attributeType;
  }


  public void setAttributeType(AttributeTypeEnum attributeType) {
    this.attributeType = attributeType;
  }


  public CustomAttributeDefinition required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributeDefinition customAttributeDefinition = (CustomAttributeDefinition) o;
    return Objects.equals(this.uuid, customAttributeDefinition.uuid) &&
        Objects.equals(this.name, customAttributeDefinition.name) &&
        Objects.equals(this.key, customAttributeDefinition.key) &&
        Objects.equals(this.description, customAttributeDefinition.description) &&
        Objects.equals(this.recordType, customAttributeDefinition.recordType) &&
        Objects.equals(this.attributeType, customAttributeDefinition.attributeType) &&
        Objects.equals(this.required, customAttributeDefinition.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, key, description, recordType, attributeType, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributeDefinition {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

