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
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for DataViewCalculatedValue
 */
public class DataViewCalculatedValueTest {
    private final DataViewCalculatedValue model = new DataViewCalculatedValue();

    /**
     * Model tests for DataViewCalculatedValue
     */
    @Test
    public void testDataViewCalculatedValue() {
        // TODO: test DataViewCalculatedValue
    }

    /**
     * Test the property 'value'
     */
    @Test
    public void valueTest() {
        // TODO: test value
    }

    /**
     * Test the property 'error'
     */
    @Test
    public void errorTest() {
        // TODO: test error
    }

    /**
     * Test the property 'errorMessage'
     */
    @Test
    public void errorMessageTest() {
        // TODO: test errorMessage
    }

    /**
     * Test the property 'footnotes'
     */
    @Test
    public void footnotesTest() {
        // TODO: test footnotes
    }

    /**
     * Test the property 'lineItem'
     */
    @Test
    public void lineItemTest() {
        // TODO: test lineItem
    }

}