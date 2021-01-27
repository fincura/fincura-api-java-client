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
import java.net.URI;
import java.util.UUID;

/**
 * Webhook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-27T00:03:41.356Z[GMT]")
public class Webhook {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  /**
   * Gets or Sets eventType
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
  public enum EventTypeEnum {
    DOCUMENTFILE_RECEIVED("DocumentFile.Received"),
    
    DOCUMENTFILE_PROCESSING("DocumentFile.Processing"),
    
    DOCUMENTFILE_HUMANREQUIRED("DocumentFile.HumanRequired"),
    
    DOCUMENTFILE_SPREADCOMPLETE("DocumentFile.SpreadComplete"),
    
    DOCUMENTFILE_ERROR("DocumentFile.Error"),
    
    BULKFILE_RECEIVED("BulkFile.Received"),
    
    BULKFILE_PROCESSING("BulkFile.Processing"),
    
    BULKFILE_PROCESSED("BulkFile.Processed"),
    
    BULKFILE_ERROR("BulkFile.Error"),
    
    STAR("*");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private EventTypeEnum eventType;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhook_url";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private URI webhookUrl;

  /**
   * Gets or Sets webhookMethod
   */
  @JsonAdapter(WebhookMethodEnum.Adapter.class)
  public enum WebhookMethodEnum {
    GET("GET"),
    
    POST("POST");

    private String value;

    WebhookMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WebhookMethodEnum fromValue(String value) {
      for (WebhookMethodEnum b : WebhookMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WebhookMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WebhookMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WebhookMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WebhookMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WEBHOOK_METHOD = "webhook_method";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_METHOD)
  private WebhookMethodEnum webhookMethod = WebhookMethodEnum.POST;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_SIGNING_KEY = "signing_key";
  @SerializedName(SERIALIZED_NAME_SIGNING_KEY)
  private String signingKey;


   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUuid() {
    return uuid;
  }




  public Webhook eventType(EventTypeEnum eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "")

  public EventTypeEnum getEventType() {
    return eventType;
  }


  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public Webhook webhookUrl(URI webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @ApiModelProperty(required = true, value = "")

  public URI getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(URI webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public Webhook webhookMethod(WebhookMethodEnum webhookMethod) {
    
    this.webhookMethod = webhookMethod;
    return this;
  }

   /**
   * Get webhookMethod
   * @return webhookMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookMethodEnum getWebhookMethod() {
    return webhookMethod;
  }


  public void setWebhookMethod(WebhookMethodEnum webhookMethod) {
    this.webhookMethod = webhookMethod;
  }


  public Webhook externalId(String externalId) {
    
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


   /**
   * Get signingKey
   * @return signingKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSigningKey() {
    return signingKey;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.uuid, webhook.uuid) &&
        Objects.equals(this.eventType, webhook.eventType) &&
        Objects.equals(this.webhookUrl, webhook.webhookUrl) &&
        Objects.equals(this.webhookMethod, webhook.webhookMethod) &&
        Objects.equals(this.externalId, webhook.externalId) &&
        Objects.equals(this.signingKey, webhook.signingKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, eventType, webhookUrl, webhookMethod, externalId, signingKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookMethod: ").append(toIndentedString(webhookMethod)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
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

