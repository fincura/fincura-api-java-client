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
 * EmbeddedWorkflowUiControls
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-17T21:24:18.400Z[GMT]")
public class EmbeddedWorkflowUiControls {
  public static final String SERIALIZED_NAME_PRIMARY_BUTTON_COLOR = "primary_button_color";
  @SerializedName(SERIALIZED_NAME_PRIMARY_BUTTON_COLOR)
  private String primaryButtonColor;

  public static final String SERIALIZED_NAME_COMPLETE_BUTTON_LABEL = "complete_button_label";
  @SerializedName(SERIALIZED_NAME_COMPLETE_BUTTON_LABEL)
  private String completeButtonLabel;

  public static final String SERIALIZED_NAME_SHOW_EXIT_BUTTON = "show_exit_button";
  @SerializedName(SERIALIZED_NAME_SHOW_EXIT_BUTTON)
  private Boolean showExitButton;


  public EmbeddedWorkflowUiControls primaryButtonColor(String primaryButtonColor) {
    
    this.primaryButtonColor = primaryButtonColor;
    return this;
  }

   /**
   * Get primaryButtonColor
   * @return primaryButtonColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryButtonColor() {
    return primaryButtonColor;
  }


  public void setPrimaryButtonColor(String primaryButtonColor) {
    this.primaryButtonColor = primaryButtonColor;
  }


  public EmbeddedWorkflowUiControls completeButtonLabel(String completeButtonLabel) {
    
    this.completeButtonLabel = completeButtonLabel;
    return this;
  }

   /**
   * Get completeButtonLabel
   * @return completeButtonLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompleteButtonLabel() {
    return completeButtonLabel;
  }


  public void setCompleteButtonLabel(String completeButtonLabel) {
    this.completeButtonLabel = completeButtonLabel;
  }


  public EmbeddedWorkflowUiControls showExitButton(Boolean showExitButton) {
    
    this.showExitButton = showExitButton;
    return this;
  }

   /**
   * Get showExitButton
   * @return showExitButton
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShowExitButton() {
    return showExitButton;
  }


  public void setShowExitButton(Boolean showExitButton) {
    this.showExitButton = showExitButton;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedWorkflowUiControls embeddedWorkflowUiControls = (EmbeddedWorkflowUiControls) o;
    return Objects.equals(this.primaryButtonColor, embeddedWorkflowUiControls.primaryButtonColor) &&
        Objects.equals(this.completeButtonLabel, embeddedWorkflowUiControls.completeButtonLabel) &&
        Objects.equals(this.showExitButton, embeddedWorkflowUiControls.showExitButton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryButtonColor, completeButtonLabel, showExitButton);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedWorkflowUiControls {\n");
    sb.append("    primaryButtonColor: ").append(toIndentedString(primaryButtonColor)).append("\n");
    sb.append("    completeButtonLabel: ").append(toIndentedString(completeButtonLabel)).append("\n");
    sb.append("    showExitButton: ").append(toIndentedString(showExitButton)).append("\n");
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

