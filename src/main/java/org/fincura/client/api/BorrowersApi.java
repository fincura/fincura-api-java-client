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


import org.fincura.client.model.Borrower;
import org.fincura.client.model.InlineResponse2001;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BorrowersApi {
    private ApiClient localVarApiClient;

    public BorrowersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BorrowersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createBorrower
     * @param borrower  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBorrowerCall(Borrower borrower, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = borrower;

        // create path and map variables
        String localVarPath = "/v1/borrower";

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
    private okhttp3.Call createBorrowerValidateBeforeCall(Borrower borrower, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createBorrowerCall(borrower, _callback);
        return localVarCall;

    }

    /**
     * Create a new Borrower
     * Create a new Borrower record
     * @param borrower  (optional)
     * @return Borrower
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Borrower createBorrower(Borrower borrower) throws ApiException {
        ApiResponse<Borrower> localVarResp = createBorrowerWithHttpInfo(borrower);
        return localVarResp.getData();
    }

    /**
     * Create a new Borrower
     * Create a new Borrower record
     * @param borrower  (optional)
     * @return ApiResponse&lt;Borrower&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Borrower> createBorrowerWithHttpInfo(Borrower borrower) throws ApiException {
        okhttp3.Call localVarCall = createBorrowerValidateBeforeCall(borrower, null);
        Type localVarReturnType = new TypeToken<Borrower>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Borrower (asynchronously)
     * Create a new Borrower record
     * @param borrower  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBorrowerAsync(Borrower borrower, final ApiCallback<Borrower> _callback) throws ApiException {

        okhttp3.Call localVarCall = createBorrowerValidateBeforeCall(borrower, _callback);
        Type localVarReturnType = new TypeToken<Borrower>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listBorrowers
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
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
    public okhttp3.Call listBorrowersCall(Integer limit, Integer offset, String search, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/borrower";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
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
    private okhttp3.Call listBorrowersValidateBeforeCall(Integer limit, Integer offset, String search, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listBorrowersCall(limit, offset, search, _callback);
        return localVarCall;

    }

    /**
     * List Borrowers
     * List Borrower records
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param search A search term. (optional)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2001 listBorrowers(Integer limit, Integer offset, String search) throws ApiException {
        ApiResponse<InlineResponse2001> localVarResp = listBorrowersWithHttpInfo(limit, offset, search);
        return localVarResp.getData();
    }

    /**
     * List Borrowers
     * List Borrower records
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param search A search term. (optional)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2001> listBorrowersWithHttpInfo(Integer limit, Integer offset, String search) throws ApiException {
        okhttp3.Call localVarCall = listBorrowersValidateBeforeCall(limit, offset, search, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Borrowers (asynchronously)
     * List Borrower records
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
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
    public okhttp3.Call listBorrowersAsync(Integer limit, Integer offset, String search, final ApiCallback<InlineResponse2001> _callback) throws ApiException {

        okhttp3.Call localVarCall = listBorrowersValidateBeforeCall(limit, offset, search, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for partialUpdateBorrower
     * @param uuid  (required)
     * @param search A search term. (optional)
     * @param borrower  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call partialUpdateBorrowerCall(String uuid, String search, Borrower borrower, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = borrower;

        // create path and map variables
        String localVarPath = "/v1/borrower/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
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
            "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API_Key" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call partialUpdateBorrowerValidateBeforeCall(String uuid, String search, Borrower borrower, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling partialUpdateBorrower(Async)");
        }
        

        okhttp3.Call localVarCall = partialUpdateBorrowerCall(uuid, search, borrower, _callback);
        return localVarCall;

    }

    /**
     * Update a Borrower
     * 
     * @param uuid  (required)
     * @param search A search term. (optional)
     * @param borrower  (optional)
     * @return Borrower
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Borrower partialUpdateBorrower(String uuid, String search, Borrower borrower) throws ApiException {
        ApiResponse<Borrower> localVarResp = partialUpdateBorrowerWithHttpInfo(uuid, search, borrower);
        return localVarResp.getData();
    }

    /**
     * Update a Borrower
     * 
     * @param uuid  (required)
     * @param search A search term. (optional)
     * @param borrower  (optional)
     * @return ApiResponse&lt;Borrower&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Borrower> partialUpdateBorrowerWithHttpInfo(String uuid, String search, Borrower borrower) throws ApiException {
        okhttp3.Call localVarCall = partialUpdateBorrowerValidateBeforeCall(uuid, search, borrower, null);
        Type localVarReturnType = new TypeToken<Borrower>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a Borrower (asynchronously)
     * 
     * @param uuid  (required)
     * @param search A search term. (optional)
     * @param borrower  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call partialUpdateBorrowerAsync(String uuid, String search, Borrower borrower, final ApiCallback<Borrower> _callback) throws ApiException {

        okhttp3.Call localVarCall = partialUpdateBorrowerValidateBeforeCall(uuid, search, borrower, _callback);
        Type localVarReturnType = new TypeToken<Borrower>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveBorrower
     * @param uuid  (required)
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
    public okhttp3.Call retrieveBorrowerCall(String uuid, String search, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/borrower/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", localVarApiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
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
    private okhttp3.Call retrieveBorrowerValidateBeforeCall(String uuid, String search, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling retrieveBorrower(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveBorrowerCall(uuid, search, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a Borrower
     * Retrieve a Borrower
     * @param uuid  (required)
     * @param search A search term. (optional)
     * @return Borrower
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Borrower retrieveBorrower(String uuid, String search) throws ApiException {
        ApiResponse<Borrower> localVarResp = retrieveBorrowerWithHttpInfo(uuid, search);
        return localVarResp.getData();
    }

    /**
     * Retrieve a Borrower
     * Retrieve a Borrower
     * @param uuid  (required)
     * @param search A search term. (optional)
     * @return ApiResponse&lt;Borrower&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Borrower> retrieveBorrowerWithHttpInfo(String uuid, String search) throws ApiException {
        okhttp3.Call localVarCall = retrieveBorrowerValidateBeforeCall(uuid, search, null);
        Type localVarReturnType = new TypeToken<Borrower>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a Borrower (asynchronously)
     * Retrieve a Borrower
     * @param uuid  (required)
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
    public okhttp3.Call retrieveBorrowerAsync(String uuid, String search, final ApiCallback<Borrower> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveBorrowerValidateBeforeCall(uuid, search, _callback);
        Type localVarReturnType = new TypeToken<Borrower>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
