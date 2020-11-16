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
import org.fincura.client.model.CustomAttributeDefinition;
import org.fincura.client.model.InlineResponse2006;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomAttributesApi
 */
@Ignore
public class CustomAttributesApiTest {

    private final CustomAttributesApi api = new CustomAttributesApi();

    
    /**
     * Create a CustomAttributeDefinition
     *
     * Create a CustomAttributeDefinition
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomAttributeDefinitionTest() throws ApiException {
        CustomAttributeDefinition customAttributeDefinition = null;
        CustomAttributeDefinition response = api.createCustomAttributeDefinition(customAttributeDefinition);

        // TODO: test validations
    }
    
    /**
     * Delete a CustomAttributeDefinition
     *
     * Delete a CustomAttributeDefinition.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroyCustomAttributeDefinitionTest() throws ApiException {
        String uuid = null;
        api.destroyCustomAttributeDefinition(uuid);

        // TODO: test validations
    }
    
    /**
     * List CustomAttributeDefinitions
     *
     * List CustomAttributeDefinition
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCustomAttributeDefinitionsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        InlineResponse2006 response = api.listCustomAttributeDefinitions(limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get CustomAttributeDefinition info
     *
     * Retrieve a CustomAttributeDefinition
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveCustomAttributeDefinitionTest() throws ApiException {
        String uuid = null;
        CustomAttributeDefinition response = api.retrieveCustomAttributeDefinition(uuid);

        // TODO: test validations
    }
    
}