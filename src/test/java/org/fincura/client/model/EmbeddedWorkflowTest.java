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
import java.net.URI;
import java.util.UUID;
import org.fincura.client.model.EmbeddedWorkflowUiControls;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for EmbeddedWorkflow
 */
public class EmbeddedWorkflowTest {
    private final EmbeddedWorkflow model = new EmbeddedWorkflow();

    /**
     * Model tests for EmbeddedWorkflow
     */
    @Test
    public void testEmbeddedWorkflow() {
        // TODO: test EmbeddedWorkflow
    }

    /**
     * Test the property 'uuid'
     */
    @Test
    public void uuidTest() {
        // TODO: test uuid
    }

    /**
     * Test the property 'documentFileUuid'
     */
    @Test
    public void documentFileUuidTest() {
        // TODO: test documentFileUuid
    }

    /**
     * Test the property 'embedType'
     */
    @Test
    public void embedTypeTest() {
        // TODO: test embedType
    }

    /**
     * Test the property 'createdDate'
     */
    @Test
    public void createdDateTest() {
        // TODO: test createdDate
    }

    /**
     * Test the property 'exitStep'
     */
    @Test
    public void exitStepTest() {
        // TODO: test exitStep
    }

    /**
     * Test the property 'redirectUrl'
     */
    @Test
    public void redirectUrlTest() {
        // TODO: test redirectUrl
    }

    /**
     * Test the property 'uiControls'
     */
    @Test
    public void uiControlsTest() {
        // TODO: test uiControls
    }

    /**
     * Test the property 'loaded'
     */
    @Test
    public void loadedTest() {
        // TODO: test loaded
    }

    /**
     * Test the property 'loadWorkflowUrl'
     */
    @Test
    public void loadWorkflowUrlTest() {
        // TODO: test loadWorkflowUrl
    }

}
