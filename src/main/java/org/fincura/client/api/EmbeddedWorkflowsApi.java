/*
 * Fincura API
 * This [REST API](https://en.wikipedia.org/wiki/Representational_state_transfer) allows you to interact with the Fincura processing and insights engine.   # Authentication  This API uses API keys generated from a Fincura User account. To get access to your User account, speak with you Fincura account manager.  # Accepted Media Types  | File&nbsp;Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Extension(s)     | Content-Type(s) | | -------------------------------- |-------------- | ------------ | | PDF File | .pdf | `application/pdf` , `application/x-pdf` | | Excel File | .xls | `application/vnd.ms-excel`  | | Excel File | .xlsx | `application/vnd.openxmlformats-officedocument.spreadsheetml.sheet`  | | Excel File | .xlsm | `application/vnd.ms-excel.sheet.macroEnabled.12`  | | PNG Image | .png | `image/png`  | | GIF Image | .gif | `image/gif`  | | JPG Image | .jpg, .jpeg | `image/jpeg`  | | GIF Image | .gif | `image/gif`  |   # Getting Started  1. [Create a Borrower](#operation/createBorrower)  2. [Add a file](#operation/createDocumentFile) for that Borrower. 3. Analyze in the Fincura App  ****
 *
 * The version of the OpenAPI document: 1.2.6
 * Contact: support@fincura.com
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


import org.fincura.client.model.EmbeddedWorkflow;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmbeddedWorkflowsApi {
    private ApiClient localVarApiClient;

    public EmbeddedWorkflowsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmbeddedWorkflowsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createEmbeddedWorkflow
     * @param embeddedWorkflow  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEmbeddedWorkflowCall(EmbeddedWorkflow embeddedWorkflow, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = embeddedWorkflow;

        // create path and map variables
        String localVarPath = "/v1/embedded-workflow";

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
    private okhttp3.Call createEmbeddedWorkflowValidateBeforeCall(EmbeddedWorkflow embeddedWorkflow, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createEmbeddedWorkflowCall(embeddedWorkflow, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a URL to an HTML webapp to complete document parsing pipeline flow
     * @param embeddedWorkflow  (optional)
     * @return EmbeddedWorkflow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public EmbeddedWorkflow createEmbeddedWorkflow(EmbeddedWorkflow embeddedWorkflow) throws ApiException {
        ApiResponse<EmbeddedWorkflow> localVarResp = createEmbeddedWorkflowWithHttpInfo(embeddedWorkflow);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a URL to an HTML webapp to complete document parsing pipeline flow
     * @param embeddedWorkflow  (optional)
     * @return ApiResponse&lt;EmbeddedWorkflow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmbeddedWorkflow> createEmbeddedWorkflowWithHttpInfo(EmbeddedWorkflow embeddedWorkflow) throws ApiException {
        okhttp3.Call localVarCall = createEmbeddedWorkflowValidateBeforeCall(embeddedWorkflow, null);
        Type localVarReturnType = new TypeToken<EmbeddedWorkflow>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a URL to an HTML webapp to complete document parsing pipeline flow
     * @param embeddedWorkflow  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEmbeddedWorkflowAsync(EmbeddedWorkflow embeddedWorkflow, final ApiCallback<EmbeddedWorkflow> _callback) throws ApiException {

        okhttp3.Call localVarCall = createEmbeddedWorkflowValidateBeforeCall(embeddedWorkflow, _callback);
        Type localVarReturnType = new TypeToken<EmbeddedWorkflow>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveEmbeddedWorkflow
     * @param uuid  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveEmbeddedWorkflowCall(String uuid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/embedded-workflow/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_Key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveEmbeddedWorkflowValidateBeforeCall(String uuid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling retrieveEmbeddedWorkflow(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveEmbeddedWorkflowCall(uuid, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param uuid  (required)
     * @return EmbeddedWorkflow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public EmbeddedWorkflow retrieveEmbeddedWorkflow(String uuid) throws ApiException {
        ApiResponse<EmbeddedWorkflow> localVarResp = retrieveEmbeddedWorkflowWithHttpInfo(uuid);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param uuid  (required)
     * @return ApiResponse&lt;EmbeddedWorkflow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmbeddedWorkflow> retrieveEmbeddedWorkflowWithHttpInfo(String uuid) throws ApiException {
        okhttp3.Call localVarCall = retrieveEmbeddedWorkflowValidateBeforeCall(uuid, null);
        Type localVarReturnType = new TypeToken<EmbeddedWorkflow>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param uuid  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveEmbeddedWorkflowAsync(String uuid, final ApiCallback<EmbeddedWorkflow> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveEmbeddedWorkflowValidateBeforeCall(uuid, _callback);
        Type localVarReturnType = new TypeToken<EmbeddedWorkflow>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
