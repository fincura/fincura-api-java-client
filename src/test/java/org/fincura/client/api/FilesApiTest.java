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
import org.fincura.client.model.DocumentFileCreate;
import org.fincura.client.model.DocumentFileRead;
import org.fincura.client.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
@Ignore
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    
    /**
     * Submit a new DocumentFile
     *
     * Add a new file to Fincura for processing.  The minimal document creation request requires just a borrower_uuid and the media_type of the file to process.       POST /v1/document-file HTTP/1.1     Host: api.fincura.com     Accept: application/json     Authorization: Bearer eyJ0e...nFTRKTbcg     Content-Type: application/json      {         \&quot;borrower_uuid\&quot;: \&quot;6e64724a-25fc-4e1a-8071-1ef29845ab1d\&quot;,         \&quot;media_type\&quot;: \&quot;application/pdf\&quot;\&quot;     }       The above request will create a new document record in Fincura and return a url to send the file to, as seen below.      {         \&quot;uuid\&quot;: \&quot;b1dc3e36-f332-4653-bfab-0b923fc2548f\&quot;,         \&quot;upload_url\&quot;: \&quot;https://upload.fincura.com/b1dc3e36-f332-4653-bfab-0b923fc2548f/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt\&quot;     }  In a subsequent request, the file can be sent to the &#x60;upload_url&#x60; via [HTTP PUT](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT). The &#x60;Content-Length&#x60; and &#x60;Content-Type&#x60; headers are required. The &#x60;Content-Type&#x60; should match the &#x60;media_type&#x60; from the previous request.      PUT /b1dc3e36-f332-4653-bfab-0b923fc2548f/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt HTTP/1.1     Host: upload.fincura.com     Content-Length: 18828     Content-Type: application/pdf          {FILE  DATA}  Fincura will begin processing the file once it has been completely uploaded.  Additional fields described below:
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDocumentFileTest() throws ApiException {
        DocumentFileCreate documentFileCreate = null;
        DocumentFileCreate response = api.createDocumentFile(documentFileCreate);

        // TODO: test validations
    }
    
    /**
     * Delete a DocumentFile
     *
     * Delete a file from Fincura.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroyDocumentFileTest() throws ApiException {
        String uuid = null;
        String borrowerUuid = null;
        api.destroyDocumentFile(uuid, borrowerUuid);

        // TODO: test validations
    }
    
    /**
     * List DocumentFile records
     *
     * List files submitted to Fincura
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDocumentFilesTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String borrowerUuid = null;
        InlineResponse200 response = api.listDocumentFiles(limit, offset, borrowerUuid);

        // TODO: test validations
    }
    
    /**
     * Get the status of a submitted DocumentFile
     *
     * Retrieve a file submitted to Fincura
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveDocumentFileTest() throws ApiException {
        String uuid = null;
        String borrowerUuid = null;
        DocumentFileRead response = api.retrieveDocumentFile(uuid, borrowerUuid);

        // TODO: test validations
    }
    
}
