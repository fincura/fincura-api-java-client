/*
 * Fincura API
 * This [REST API](https://en.wikipedia.org/wiki/Representational_state_transfer) allows you to interact with the Fincura processing and insights engine.   # Authentication  This API uses API keys generated from a Fincura User account. To get access to your User account, speak with you Fincura account manager.  # Accepted Media Types  | File&nbsp;Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Extension(s)     | Content-Type(s) | | -------------------------------- |-------------- | ------------ | | PDF File | .pdf | `application/pdf` , `application/x-pdf` | | Excel File | .xls | `application/vnd.ms-excel`  | | Excel File | .xlsx | `application/vnd.openxmlformats-officedocument.spreadsheetml.sheet`  | | Excel File | .xlsm | `application/vnd.ms-excel.sheet.macroEnabled.12`  | | PNG Image | .png | `image/png`  | | GIF Image | .gif | `image/gif`  | | JPG Image | .jpg, .jpeg | `image/jpeg`  | | GIF Image | .gif | `image/gif`  |   # Getting Started  1. [Create a Borrower](#operation/createBorrower)  2. [Add a file](#operation/createDocumentFile) for that Borrower. 3. Analyze in the Fincura App  ****
 *
 * The version of the OpenAPI document: 1.3.0
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


import org.fincura.client.model.FinancialRequirement;
import org.fincura.client.model.InlineResponse2004;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequirementsApi {
    private ApiClient localVarApiClient;

    public RequirementsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RequirementsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createFinancialRequirement
     * @param financialRequirement  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFinancialRequirementCall(FinancialRequirement financialRequirement, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = financialRequirement;

        // create path and map variables
        String localVarPath = "/v1/financial-requirement";

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
    private okhttp3.Call createFinancialRequirementValidateBeforeCall(FinancialRequirement financialRequirement, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createFinancialRequirementCall(financialRequirement, _callback);
        return localVarCall;

    }

    /**
     * Create a new FinancialRequirement
     * Create a new FinancialRequirement record
     * @param financialRequirement  (optional)
     * @return FinancialRequirement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public FinancialRequirement createFinancialRequirement(FinancialRequirement financialRequirement) throws ApiException {
        ApiResponse<FinancialRequirement> localVarResp = createFinancialRequirementWithHttpInfo(financialRequirement);
        return localVarResp.getData();
    }

    /**
     * Create a new FinancialRequirement
     * Create a new FinancialRequirement record
     * @param financialRequirement  (optional)
     * @return ApiResponse&lt;FinancialRequirement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FinancialRequirement> createFinancialRequirementWithHttpInfo(FinancialRequirement financialRequirement) throws ApiException {
        okhttp3.Call localVarCall = createFinancialRequirementValidateBeforeCall(financialRequirement, null);
        Type localVarReturnType = new TypeToken<FinancialRequirement>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new FinancialRequirement (asynchronously)
     * Create a new FinancialRequirement record
     * @param financialRequirement  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFinancialRequirementAsync(FinancialRequirement financialRequirement, final ApiCallback<FinancialRequirement> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFinancialRequirementValidateBeforeCall(financialRequirement, _callback);
        Type localVarReturnType = new TypeToken<FinancialRequirement>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listFinancialRequirements
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listFinancialRequirementsCall(Integer limit, Integer offset, String borrowerUuid, String search, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/financial-requirement";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (borrowerUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("borrower_uuid", borrowerUuid));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

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
    private okhttp3.Call listFinancialRequirementsValidateBeforeCall(Integer limit, Integer offset, String borrowerUuid, String search, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listFinancialRequirementsCall(limit, offset, borrowerUuid, search, _callback);
        return localVarCall;

    }

    /**
     * List FinancialRequirements
     * List FinancialRequirement records
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @return InlineResponse2004
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2004 listFinancialRequirements(Integer limit, Integer offset, String borrowerUuid, String search) throws ApiException {
        ApiResponse<InlineResponse2004> localVarResp = listFinancialRequirementsWithHttpInfo(limit, offset, borrowerUuid, search);
        return localVarResp.getData();
    }

    /**
     * List FinancialRequirements
     * List FinancialRequirement records
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @return ApiResponse&lt;InlineResponse2004&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2004> listFinancialRequirementsWithHttpInfo(Integer limit, Integer offset, String borrowerUuid, String search) throws ApiException {
        okhttp3.Call localVarCall = listFinancialRequirementsValidateBeforeCall(limit, offset, borrowerUuid, search, null);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List FinancialRequirements (asynchronously)
     * List FinancialRequirement records
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listFinancialRequirementsAsync(Integer limit, Integer offset, String borrowerUuid, String search, final ApiCallback<InlineResponse2004> _callback) throws ApiException {

        okhttp3.Call localVarCall = listFinancialRequirementsValidateBeforeCall(limit, offset, borrowerUuid, search, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for partialUpdateFinancialRequirement
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @param financialRequirement  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call partialUpdateFinancialRequirementCall(String uuid, String borrowerUuid, String search, FinancialRequirement financialRequirement, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = financialRequirement;

        // create path and map variables
        String localVarPath = "/v1/financial-requirement/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (borrowerUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("borrower_uuid", borrowerUuid));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

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
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call partialUpdateFinancialRequirementValidateBeforeCall(String uuid, String borrowerUuid, String search, FinancialRequirement financialRequirement, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling partialUpdateFinancialRequirement(Async)");
        }
        

        okhttp3.Call localVarCall = partialUpdateFinancialRequirementCall(uuid, borrowerUuid, search, financialRequirement, _callback);
        return localVarCall;

    }

    /**
     * Update a FinancialRequirement
     * 
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @param financialRequirement  (optional)
     * @return FinancialRequirement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public FinancialRequirement partialUpdateFinancialRequirement(String uuid, String borrowerUuid, String search, FinancialRequirement financialRequirement) throws ApiException {
        ApiResponse<FinancialRequirement> localVarResp = partialUpdateFinancialRequirementWithHttpInfo(uuid, borrowerUuid, search, financialRequirement);
        return localVarResp.getData();
    }

    /**
     * Update a FinancialRequirement
     * 
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @param financialRequirement  (optional)
     * @return ApiResponse&lt;FinancialRequirement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FinancialRequirement> partialUpdateFinancialRequirementWithHttpInfo(String uuid, String borrowerUuid, String search, FinancialRequirement financialRequirement) throws ApiException {
        okhttp3.Call localVarCall = partialUpdateFinancialRequirementValidateBeforeCall(uuid, borrowerUuid, search, financialRequirement, null);
        Type localVarReturnType = new TypeToken<FinancialRequirement>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a FinancialRequirement (asynchronously)
     * 
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @param financialRequirement  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call partialUpdateFinancialRequirementAsync(String uuid, String borrowerUuid, String search, FinancialRequirement financialRequirement, final ApiCallback<FinancialRequirement> _callback) throws ApiException {

        okhttp3.Call localVarCall = partialUpdateFinancialRequirementValidateBeforeCall(uuid, borrowerUuid, search, financialRequirement, _callback);
        Type localVarReturnType = new TypeToken<FinancialRequirement>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveFinancialRequirement
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveFinancialRequirementCall(String uuid, String borrowerUuid, String search, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/financial-requirement/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (borrowerUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("borrower_uuid", borrowerUuid));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

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
    private okhttp3.Call retrieveFinancialRequirementValidateBeforeCall(String uuid, String borrowerUuid, String search, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling retrieveFinancialRequirement(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveFinancialRequirementCall(uuid, borrowerUuid, search, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a FinancialRequirement
     * Retrieve a FinancialRequirement
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @return FinancialRequirement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public FinancialRequirement retrieveFinancialRequirement(String uuid, String borrowerUuid, String search) throws ApiException {
        ApiResponse<FinancialRequirement> localVarResp = retrieveFinancialRequirementWithHttpInfo(uuid, borrowerUuid, search);
        return localVarResp.getData();
    }

    /**
     * Retrieve a FinancialRequirement
     * Retrieve a FinancialRequirement
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @return ApiResponse&lt;FinancialRequirement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FinancialRequirement> retrieveFinancialRequirementWithHttpInfo(String uuid, String borrowerUuid, String search) throws ApiException {
        okhttp3.Call localVarCall = retrieveFinancialRequirementValidateBeforeCall(uuid, borrowerUuid, search, null);
        Type localVarReturnType = new TypeToken<FinancialRequirement>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a FinancialRequirement (asynchronously)
     * Retrieve a FinancialRequirement
     * @param uuid  (required)
     * @param borrowerUuid Borrower to filter results for (optional)
     * @param search A search term. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveFinancialRequirementAsync(String uuid, String borrowerUuid, String search, final ApiCallback<FinancialRequirement> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveFinancialRequirementValidateBeforeCall(uuid, borrowerUuid, search, _callback);
        Type localVarReturnType = new TypeToken<FinancialRequirement>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
