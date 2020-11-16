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

import org.fincura.client.ApiCallback;
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.ApiResponse;
import org.fincura.client.Configuration;
import org.fincura.client.Pair;
import org.fincura.client.ProgressRequestBody;
import org.fincura.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.fincura.client.model.DocumentFileCreate;
import org.fincura.client.model.DocumentFileRead;
import org.fincura.client.model.InlineResponse200;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilesApi {
    private ApiClient localVarApiClient;

    public FilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createDocumentFile
     * @param documentFileCreate  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limit </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createDocumentFileCall(DocumentFileCreate documentFileCreate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = documentFileCreate;

        // create path and map variables
        String localVarPath = "/v1/document-file";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_Key" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createDocumentFileValidateBeforeCall(DocumentFileCreate documentFileCreate, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createDocumentFileCall(documentFileCreate, _callback);
        return localVarCall;

    }

    /**
     * Submit a new DocumentFile
     * Add a new file to Fincura for processing.  The minimal document creation request requires just a borrower_uuid and the media_type of the file to process.       POST /v1/document-file HTTP/1.1     Host: api.fincura.com     Accept: application/json     Authorization: Bearer eyJ0e...nFTRKTbcg     Content-Type: application/json      {         \&quot;borrower_uuid\&quot;: \&quot;6e64724a-25fc-4e1a-8071-1ef29845ab1d\&quot;,         \&quot;media_type\&quot;: \&quot;application/pdf\&quot;\&quot;     }       The above request will create a new document record in Fincura and return a url to send the file to, as seen below.      {         \&quot;uuid\&quot;: \&quot;b1dc3e36-f332-4653-bfab-0b923fc2548f\&quot;,         \&quot;upload_url\&quot;: \&quot;https://upload.fincura.com/b1dc3e36-f332-4653-bfab-0b923fc2548f/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt\&quot;     }  In a subsequent request, the file can be sent to the &#x60;upload_url&#x60; via [HTTP PUT](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT). The &#x60;Content-Length&#x60; and &#x60;Content-Type&#x60; headers are required. The &#x60;Content-Type&#x60; should match the &#x60;media_type&#x60; from the previous request.      PUT /b1dc3e36-f332-4653-bfab-0b923fc2548f/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt HTTP/1.1     Host: upload.fincura.com     Content-Length: 18828     Content-Type: application/pdf          {FILE  DATA}  Fincura will begin processing the file once it has been completely uploaded.  Additional fields described below:
     * @param documentFileCreate  (optional)
     * @return DocumentFileCreate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limit </td><td>  -  </td></tr>
     </table>
     */
    public DocumentFileCreate createDocumentFile(DocumentFileCreate documentFileCreate) throws ApiException {
        ApiResponse<DocumentFileCreate> localVarResp = createDocumentFileWithHttpInfo(documentFileCreate);
        return localVarResp.getData();
    }

    /**
     * Submit a new DocumentFile
     * Add a new file to Fincura for processing.  The minimal document creation request requires just a borrower_uuid and the media_type of the file to process.       POST /v1/document-file HTTP/1.1     Host: api.fincura.com     Accept: application/json     Authorization: Bearer eyJ0e...nFTRKTbcg     Content-Type: application/json      {         \&quot;borrower_uuid\&quot;: \&quot;6e64724a-25fc-4e1a-8071-1ef29845ab1d\&quot;,         \&quot;media_type\&quot;: \&quot;application/pdf\&quot;\&quot;     }       The above request will create a new document record in Fincura and return a url to send the file to, as seen below.      {         \&quot;uuid\&quot;: \&quot;b1dc3e36-f332-4653-bfab-0b923fc2548f\&quot;,         \&quot;upload_url\&quot;: \&quot;https://upload.fincura.com/b1dc3e36-f332-4653-bfab-0b923fc2548f/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt\&quot;     }  In a subsequent request, the file can be sent to the &#x60;upload_url&#x60; via [HTTP PUT](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT). The &#x60;Content-Length&#x60; and &#x60;Content-Type&#x60; headers are required. The &#x60;Content-Type&#x60; should match the &#x60;media_type&#x60; from the previous request.      PUT /b1dc3e36-f332-4653-bfab-0b923fc2548f/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt HTTP/1.1     Host: upload.fincura.com     Content-Length: 18828     Content-Type: application/pdf          {FILE  DATA}  Fincura will begin processing the file once it has been completely uploaded.  Additional fields described below:
     * @param documentFileCreate  (optional)
     * @return ApiResponse&lt;DocumentFileCreate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limit </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentFileCreate> createDocumentFileWithHttpInfo(DocumentFileCreate documentFileCreate) throws ApiException {
        okhttp3.Call localVarCall = createDocumentFileValidateBeforeCall(documentFileCreate, null);
        Type localVarReturnType = new TypeToken<DocumentFileCreate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Submit a new DocumentFile (asynchronously)
     * Add a new file to Fincura for processing.  The minimal document creation request requires just a borrower_uuid and the media_type of the file to process.       POST /v1/document-file HTTP/1.1     Host: api.fincura.com     Accept: application/json     Authorization: Bearer eyJ0e...nFTRKTbcg     Content-Type: application/json      {         \&quot;borrower_uuid\&quot;: \&quot;6e64724a-25fc-4e1a-8071-1ef29845ab1d\&quot;,         \&quot;media_type\&quot;: \&quot;application/pdf\&quot;\&quot;     }       The above request will create a new document record in Fincura and return a url to send the file to, as seen below.      {         \&quot;uuid\&quot;: \&quot;b1dc3e36-f332-4653-bfab-0b923fc2548f\&quot;,         \&quot;upload_url\&quot;: \&quot;https://upload.fincura.com/b1dc3e36-f332-4653-bfab-0b923fc2548f/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt\&quot;     }  In a subsequent request, the file can be sent to the &#x60;upload_url&#x60; via [HTTP PUT](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT). The &#x60;Content-Length&#x60; and &#x60;Content-Type&#x60; headers are required. The &#x60;Content-Type&#x60; should match the &#x60;media_type&#x60; from the previous request.      PUT /b1dc3e36-f332-4653-bfab-0b923fc2548f/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt HTTP/1.1     Host: upload.fincura.com     Content-Length: 18828     Content-Type: application/pdf          {FILE  DATA}  Fincura will begin processing the file once it has been completely uploaded.  Additional fields described below:
     * @param documentFileCreate  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limit </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createDocumentFileAsync(DocumentFileCreate documentFileCreate, final ApiCallback<DocumentFileCreate> _callback) throws ApiException {

        okhttp3.Call localVarCall = createDocumentFileValidateBeforeCall(documentFileCreate, _callback);
        Type localVarReturnType = new TypeToken<DocumentFileCreate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for destroyDocumentFile
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call destroyDocumentFileCall(String uuid, String borrowerUuid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/document-file/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (borrowerUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("borrower_uuid", borrowerUuid));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_Key" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call destroyDocumentFileValidateBeforeCall(String uuid, String borrowerUuid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling destroyDocumentFile(Async)");
        }
        

        okhttp3.Call localVarCall = destroyDocumentFileCall(uuid, borrowerUuid, _callback);
        return localVarCall;

    }

    /**
     * Delete a DocumentFile
     * Delete a file from Fincura.
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public void destroyDocumentFile(String uuid, String borrowerUuid) throws ApiException {
        destroyDocumentFileWithHttpInfo(uuid, borrowerUuid);
    }

    /**
     * Delete a DocumentFile
     * Delete a file from Fincura.
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> destroyDocumentFileWithHttpInfo(String uuid, String borrowerUuid) throws ApiException {
        okhttp3.Call localVarCall = destroyDocumentFileValidateBeforeCall(uuid, borrowerUuid, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a DocumentFile (asynchronously)
     * Delete a file from Fincura.
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call destroyDocumentFileAsync(String uuid, String borrowerUuid, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = destroyDocumentFileValidateBeforeCall(uuid, borrowerUuid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for listDocumentFiles
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listDocumentFilesCall(Integer limit, Integer offset, String borrowerUuid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/document-file";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (borrowerUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("borrower_uuid", borrowerUuid));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_Key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listDocumentFilesValidateBeforeCall(Integer limit, Integer offset, String borrowerUuid, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listDocumentFilesCall(limit, offset, borrowerUuid, _callback);
        return localVarCall;

    }

    /**
     * List DocumentFile records
     * List files submitted to Fincura
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse200 listDocumentFiles(Integer limit, Integer offset, String borrowerUuid) throws ApiException {
        ApiResponse<InlineResponse200> localVarResp = listDocumentFilesWithHttpInfo(limit, offset, borrowerUuid);
        return localVarResp.getData();
    }

    /**
     * List DocumentFile records
     * List files submitted to Fincura
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse200> listDocumentFilesWithHttpInfo(Integer limit, Integer offset, String borrowerUuid) throws ApiException {
        okhttp3.Call localVarCall = listDocumentFilesValidateBeforeCall(limit, offset, borrowerUuid, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List DocumentFile records (asynchronously)
     * List files submitted to Fincura
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listDocumentFilesAsync(Integer limit, Integer offset, String borrowerUuid, final ApiCallback<InlineResponse200> _callback) throws ApiException {

        okhttp3.Call localVarCall = listDocumentFilesValidateBeforeCall(limit, offset, borrowerUuid, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveDocumentFile
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveDocumentFileCall(String uuid, String borrowerUuid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/document-file/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (borrowerUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("borrower_uuid", borrowerUuid));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_Key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveDocumentFileValidateBeforeCall(String uuid, String borrowerUuid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling retrieveDocumentFile(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveDocumentFileCall(uuid, borrowerUuid, _callback);
        return localVarCall;

    }

    /**
     * Get the status of a submitted DocumentFile
     * Retrieve a file submitted to Fincura
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @return DocumentFileRead
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public DocumentFileRead retrieveDocumentFile(String uuid, String borrowerUuid) throws ApiException {
        ApiResponse<DocumentFileRead> localVarResp = retrieveDocumentFileWithHttpInfo(uuid, borrowerUuid);
        return localVarResp.getData();
    }

    /**
     * Get the status of a submitted DocumentFile
     * Retrieve a file submitted to Fincura
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @return ApiResponse&lt;DocumentFileRead&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentFileRead> retrieveDocumentFileWithHttpInfo(String uuid, String borrowerUuid) throws ApiException {
        okhttp3.Call localVarCall = retrieveDocumentFileValidateBeforeCall(uuid, borrowerUuid, null);
        Type localVarReturnType = new TypeToken<DocumentFileRead>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the status of a submitted DocumentFile (asynchronously)
     * Retrieve a file submitted to Fincura
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveDocumentFileAsync(String uuid, String borrowerUuid, final ApiCallback<DocumentFileRead> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveDocumentFileValidateBeforeCall(uuid, borrowerUuid, _callback);
        Type localVarReturnType = new TypeToken<DocumentFileRead>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
