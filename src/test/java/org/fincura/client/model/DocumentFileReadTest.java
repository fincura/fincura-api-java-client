/*
 * Fincura API
 * This [REST API](https://en.wikipedia.org/wiki/Representational_state_transfer) allows you to interact with the Fincura processing and insights engine.   # Authentication  This API uses API keys generated from a Fincura User account. To get access to your User account, speak with you Fincura account manager.  # Accepted Media Types  | File&nbsp;Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Extension(s)     | Content-Type(s) | | -------------------------------- |-------------- | ------------ | | PDF File | .pdf | `application/pdf` , `application/x-pdf` | | Excel File | .xls | `application/vnd.ms-excel`  | | Excel File | .xlsx | `application/vnd.openxmlformats-officedocument.spreadsheetml.sheet`  | | Excel File | .xlsm | `application/vnd.ms-excel.sheet.macroEnabled.12`  | | PNG Image | .png | `image/png`  | | GIF Image | .gif | `image/gif`  | | JPG Image | .jpg, .jpeg | `image/jpeg`  | | GIF Image | .gif | `image/gif`  |   # Getting Started  1. [Create a Borrower](#operation/createBorrower)  2. [Add a file](#operation/createDocumentFile) for that Borrower. 3. Analyze in the Fincura App  ****
 *
 * The version of the OpenAPI document: 1.2.6
 * Contact: support@example.com
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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for DocumentFileRead
 */
public class DocumentFileReadTest {
    private final DocumentFileRead model = new DocumentFileRead();

    /**
     * Model tests for DocumentFileRead
     */
    @Test
    public void testDocumentFileRead() {
        // TODO: test DocumentFileRead
    }

    /**
     * Test the property 'uuid'
     */
    @Test
    public void uuidTest() {
        // TODO: test uuid
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'pipelineStep'
     */
    @Test
    public void pipelineStepTest() {
        // TODO: test pipelineStep
    }

    /**
     * Test the property 'createdDate'
     */
    @Test
    public void createdDateTest() {
        // TODO: test createdDate
    }

    /**
     * Test the property 'borrowerUuid'
     */
    @Test
    public void borrowerUuidTest() {
        // TODO: test borrowerUuid
    }

    /**
     * Test the property 'borrowerName'
     */
    @Test
    public void borrowerNameTest() {
        // TODO: test borrowerName
    }

    /**
     * Test the property 'filename'
     */
    @Test
    public void filenameTest() {
        // TODO: test filename
    }

    /**
     * Test the property 'statementTypes'
     */
    @Test
    public void statementTypesTest() {
        // TODO: test statementTypes
    }

    /**
     * Test the property 'customAttributes'
     */
    @Test
    public void customAttributesTest() {
        // TODO: test customAttributes
    }

}
