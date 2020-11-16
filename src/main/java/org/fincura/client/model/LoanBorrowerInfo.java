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
 * Borrower information specific to this loan (does not update the underlying Borrower)
 */
@ApiModel(description = "Borrower information specific to this loan (does not update the underlying Borrower)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-16T22:01:35.618Z[GMT]")
public class LoanBorrowerInfo {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets industry
   */
  @JsonAdapter(IndustryEnum.Adapter.class)
  public enum IndustryEnum {
    UNKNOWN("UNKNOWN"),
    
    AGRICULTURE_FORESTRY_FISHING("AGRICULTURE_FORESTRY_FISHING"),
    
    CONSTRUCTION("CONSTRUCTION"),
    
    MINING("MINING"),
    
    TRANSPORTATION_AND_PUBLIC_UTILITIES("TRANSPORTATION_AND_PUBLIC_UTILITIES"),
    
    WHOLESALE_TRADE("WHOLESALE_TRADE"),
    
    RETAIL_TRADE("RETAIL_TRADE"),
    
    MANUFACTURING("MANUFACTURING"),
    
    FINANCE_INSURANCE_REAL_ESTATE("FINANCE_INSURANCE_REAL_ESTATE"),
    
    SERVICES("SERVICES"),
    
    PUBLIC_ADMINISTRATION("PUBLIC_ADMINISTRATION");

    private String value;

    IndustryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IndustryEnum fromValue(String value) {
      for (IndustryEnum b : IndustryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IndustryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IndustryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndustryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IndustryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private IndustryEnum industry;

  public static final String SERIALIZED_NAME_NAICS_CODE = "naics_code";
  @SerializedName(SERIALIZED_NAME_NAICS_CODE)
  private Integer naicsCode;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIPCODE = "zipcode";
  @SerializedName(SERIALIZED_NAME_ZIPCODE)
  private String zipcode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_COMPANY_NOTES = "company_notes";
  @SerializedName(SERIALIZED_NAME_COMPANY_NOTES)
  private String companyNotes;

  public static final String SERIALIZED_NAME_DUN_BRADSTREET_SCORE = "dun_bradstreet_score";
  @SerializedName(SERIALIZED_NAME_DUN_BRADSTREET_SCORE)
  private Integer dunBradstreetScore;

  public static final String SERIALIZED_NAME_PAYNET_SCORE = "paynet_score";
  @SerializedName(SERIALIZED_NAME_PAYNET_SCORE)
  private String paynetScore;


  public LoanBorrowerInfo name(String name) {
    
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


  public LoanBorrowerInfo industry(IndustryEnum industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndustryEnum getIndustry() {
    return industry;
  }


  public void setIndustry(IndustryEnum industry) {
    this.industry = industry;
  }


  public LoanBorrowerInfo naicsCode(Integer naicsCode) {
    
    this.naicsCode = naicsCode;
    return this;
  }

   /**
   * Get naicsCode
   * minimum: 0
   * maximum: 999999
   * @return naicsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNaicsCode() {
    return naicsCode;
  }


  public void setNaicsCode(Integer naicsCode) {
    this.naicsCode = naicsCode;
  }


  public LoanBorrowerInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public LoanBorrowerInfo city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public LoanBorrowerInfo state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public LoanBorrowerInfo zipcode(String zipcode) {
    
    this.zipcode = zipcode;
    return this;
  }

   /**
   * Get zipcode
   * @return zipcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZipcode() {
    return zipcode;
  }


  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }


  public LoanBorrowerInfo country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public LoanBorrowerInfo email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public LoanBorrowerInfo companyNotes(String companyNotes) {
    
    this.companyNotes = companyNotes;
    return this;
  }

   /**
   * Get companyNotes
   * @return companyNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyNotes() {
    return companyNotes;
  }


  public void setCompanyNotes(String companyNotes) {
    this.companyNotes = companyNotes;
  }


  public LoanBorrowerInfo dunBradstreetScore(Integer dunBradstreetScore) {
    
    this.dunBradstreetScore = dunBradstreetScore;
    return this;
  }

   /**
   * Get dunBradstreetScore
   * minimum: 0
   * maximum: 100
   * @return dunBradstreetScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDunBradstreetScore() {
    return dunBradstreetScore;
  }


  public void setDunBradstreetScore(Integer dunBradstreetScore) {
    this.dunBradstreetScore = dunBradstreetScore;
  }


  public LoanBorrowerInfo paynetScore(String paynetScore) {
    
    this.paynetScore = paynetScore;
    return this;
  }

   /**
   * Get paynetScore
   * @return paynetScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaynetScore() {
    return paynetScore;
  }


  public void setPaynetScore(String paynetScore) {
    this.paynetScore = paynetScore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanBorrowerInfo loanBorrowerInfo = (LoanBorrowerInfo) o;
    return Objects.equals(this.name, loanBorrowerInfo.name) &&
        Objects.equals(this.industry, loanBorrowerInfo.industry) &&
        Objects.equals(this.naicsCode, loanBorrowerInfo.naicsCode) &&
        Objects.equals(this.address, loanBorrowerInfo.address) &&
        Objects.equals(this.city, loanBorrowerInfo.city) &&
        Objects.equals(this.state, loanBorrowerInfo.state) &&
        Objects.equals(this.zipcode, loanBorrowerInfo.zipcode) &&
        Objects.equals(this.country, loanBorrowerInfo.country) &&
        Objects.equals(this.email, loanBorrowerInfo.email) &&
        Objects.equals(this.companyNotes, loanBorrowerInfo.companyNotes) &&
        Objects.equals(this.dunBradstreetScore, loanBorrowerInfo.dunBradstreetScore) &&
        Objects.equals(this.paynetScore, loanBorrowerInfo.paynetScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, industry, naicsCode, address, city, state, zipcode, country, email, companyNotes, dunBradstreetScore, paynetScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanBorrowerInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    naicsCode: ").append(toIndentedString(naicsCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    companyNotes: ").append(toIndentedString(companyNotes)).append("\n");
    sb.append("    dunBradstreetScore: ").append(toIndentedString(dunBradstreetScore)).append("\n");
    sb.append("    paynetScore: ").append(toIndentedString(paynetScore)).append("\n");
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

