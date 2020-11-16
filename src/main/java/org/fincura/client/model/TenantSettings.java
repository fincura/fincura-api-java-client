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
 * TenantSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-16T22:01:35.618Z[GMT]")
public class TenantSettings {
  public static final String SERIALIZED_NAME_PORTAL_DOMAIN = "portal_domain";
  @SerializedName(SERIALIZED_NAME_PORTAL_DOMAIN)
  private String portalDomain;

  public static final String SERIALIZED_NAME_WEBHOOK_SIGNING_KEY = "webhook_signing_key";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_SIGNING_KEY)
  private String webhookSigningKey;


   /**
   * Whitelabled domain for borrower portal
   * @return portalDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whitelabled domain for borrower portal")

  public String getPortalDomain() {
    return portalDomain;
  }




   /**
   * 36 character hexadecimal string
   * @return webhookSigningKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "36 character hexadecimal string")

  public String getWebhookSigningKey() {
    return webhookSigningKey;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantSettings tenantSettings = (TenantSettings) o;
    return Objects.equals(this.portalDomain, tenantSettings.portalDomain) &&
        Objects.equals(this.webhookSigningKey, tenantSettings.webhookSigningKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portalDomain, webhookSigningKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantSettings {\n");
    sb.append("    portalDomain: ").append(toIndentedString(portalDomain)).append("\n");
    sb.append("    webhookSigningKey: ").append(toIndentedString(webhookSigningKey)).append("\n");
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
