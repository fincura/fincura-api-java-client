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
import org.fincura.client.model.DataViewCells;
import org.threeten.bp.OffsetDateTime;

/**
 * DataViewColumns
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-16T22:01:35.618Z[GMT]")
public class DataViewColumns {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_STATEMENT_DATE = "statement_date";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DATE)
  private OffsetDateTime statementDate;

  public static final String SERIALIZED_NAME_REPORTING_INTERVAL = "reporting_interval";
  @SerializedName(SERIALIZED_NAME_REPORTING_INTERVAL)
  private String reportingInterval;

  public static final String SERIALIZED_NAME_PREPARATION_TYPE = "preparation_type";
  @SerializedName(SERIALIZED_NAME_PREPARATION_TYPE)
  private String preparationType;

  public static final String SERIALIZED_NAME_PREPARED_BY = "prepared_by";
  @SerializedName(SERIALIZED_NAME_PREPARED_BY)
  private String preparedBy;

  public static final String SERIALIZED_NAME_MONTHS_IN_INTERVAL = "months_in_interval";
  @SerializedName(SERIALIZED_NAME_MONTHS_IN_INTERVAL)
  private Integer monthsInInterval;

  public static final String SERIALIZED_NAME_CELLS = "cells";
  @SerializedName(SERIALIZED_NAME_CELLS)
  private List<DataViewCells> cells = new ArrayList<DataViewCells>();


  public DataViewColumns label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public DataViewColumns statementDate(OffsetDateTime statementDate) {
    
    this.statementDate = statementDate;
    return this;
  }

   /**
   * Get statementDate
   * @return statementDate
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getStatementDate() {
    return statementDate;
  }


  public void setStatementDate(OffsetDateTime statementDate) {
    this.statementDate = statementDate;
  }


  public DataViewColumns reportingInterval(String reportingInterval) {
    
    this.reportingInterval = reportingInterval;
    return this;
  }

   /**
   * Get reportingInterval
   * @return reportingInterval
  **/
  @ApiModelProperty(required = true, value = "")

  public String getReportingInterval() {
    return reportingInterval;
  }


  public void setReportingInterval(String reportingInterval) {
    this.reportingInterval = reportingInterval;
  }


  public DataViewColumns preparationType(String preparationType) {
    
    this.preparationType = preparationType;
    return this;
  }

   /**
   * Get preparationType
   * @return preparationType
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPreparationType() {
    return preparationType;
  }


  public void setPreparationType(String preparationType) {
    this.preparationType = preparationType;
  }


  public DataViewColumns preparedBy(String preparedBy) {
    
    this.preparedBy = preparedBy;
    return this;
  }

   /**
   * Get preparedBy
   * @return preparedBy
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPreparedBy() {
    return preparedBy;
  }


  public void setPreparedBy(String preparedBy) {
    this.preparedBy = preparedBy;
  }


  public DataViewColumns monthsInInterval(Integer monthsInInterval) {
    
    this.monthsInInterval = monthsInInterval;
    return this;
  }

   /**
   * Get monthsInInterval
   * @return monthsInInterval
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getMonthsInInterval() {
    return monthsInInterval;
  }


  public void setMonthsInInterval(Integer monthsInInterval) {
    this.monthsInInterval = monthsInInterval;
  }


  public DataViewColumns cells(List<DataViewCells> cells) {
    
    this.cells = cells;
    return this;
  }

  public DataViewColumns addCellsItem(DataViewCells cellsItem) {
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Get cells
   * @return cells
  **/
  @ApiModelProperty(required = true, value = "")

  public List<DataViewCells> getCells() {
    return cells;
  }


  public void setCells(List<DataViewCells> cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataViewColumns dataViewColumns = (DataViewColumns) o;
    return Objects.equals(this.label, dataViewColumns.label) &&
        Objects.equals(this.statementDate, dataViewColumns.statementDate) &&
        Objects.equals(this.reportingInterval, dataViewColumns.reportingInterval) &&
        Objects.equals(this.preparationType, dataViewColumns.preparationType) &&
        Objects.equals(this.preparedBy, dataViewColumns.preparedBy) &&
        Objects.equals(this.monthsInInterval, dataViewColumns.monthsInInterval) &&
        Objects.equals(this.cells, dataViewColumns.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, statementDate, reportingInterval, preparationType, preparedBy, monthsInInterval, cells);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataViewColumns {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    statementDate: ").append(toIndentedString(statementDate)).append("\n");
    sb.append("    reportingInterval: ").append(toIndentedString(reportingInterval)).append("\n");
    sb.append("    preparationType: ").append(toIndentedString(preparationType)).append("\n");
    sb.append("    preparedBy: ").append(toIndentedString(preparedBy)).append("\n");
    sb.append("    monthsInInterval: ").append(toIndentedString(monthsInInterval)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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

