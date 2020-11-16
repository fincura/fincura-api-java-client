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


package org.fincura.client.api;

import org.fincura.client.ApiException;
import org.fincura.client.model.EmbeddedWorkflow;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmbeddedWorkflowsApi
 */
@Ignore
public class EmbeddedWorkflowsApiTest {

    private final EmbeddedWorkflowsApi api = new EmbeddedWorkflowsApi();

    
    /**
     * 
     *
     * Returns a URL to an HTML webapp to complete document parsing pipeline flow
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEmbeddedWorkflowTest() throws ApiException {
        EmbeddedWorkflow embeddedWorkflow = null;
        EmbeddedWorkflow response = api.createEmbeddedWorkflow(embeddedWorkflow);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveEmbeddedWorkflowTest() throws ApiException {
        String uuid = null;
        EmbeddedWorkflow response = api.retrieveEmbeddedWorkflow(uuid);

        // TODO: test validations
    }
    
}
