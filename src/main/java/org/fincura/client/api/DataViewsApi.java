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


import org.fincura.client.model.DataView;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataViewsApi {
    private ApiClient localVarApiClient;

    public DataViewsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataViewsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for retrieveDataViewFromDocumentFile
     * @param documentFileUuid  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveDataViewFromDocumentFileCall(String documentFileUuid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/data-view/from_document_file/{document_file_uuid}"
            .replaceAll("\\{" + "document_file_uuid" + "\\}", localVarApiClient.escapeString(documentFileUuid.toString()));

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
    private okhttp3.Call retrieveDataViewFromDocumentFileValidateBeforeCall(String documentFileUuid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'documentFileUuid' is set
        if (documentFileUuid == null) {
            throw new ApiException("Missing the required parameter 'documentFileUuid' when calling retrieveDataViewFromDocumentFile(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveDataViewFromDocumentFileCall(documentFileUuid, _callback);
        return localVarCall;

    }

    /**
     * Get DataView from a DocumentFile
     * Retrieve a DataView from the standardized output of a DocumentFile submitted to Fincura
     * @param documentFileUuid  (required)
     * @return DataView
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public DataView retrieveDataViewFromDocumentFile(String documentFileUuid) throws ApiException {
        ApiResponse<DataView> localVarResp = retrieveDataViewFromDocumentFileWithHttpInfo(documentFileUuid);
        return localVarResp.getData();
    }

    /**
     * Get DataView from a DocumentFile
     * Retrieve a DataView from the standardized output of a DocumentFile submitted to Fincura
     * @param documentFileUuid  (required)
     * @return ApiResponse&lt;DataView&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DataView> retrieveDataViewFromDocumentFileWithHttpInfo(String documentFileUuid) throws ApiException {
        okhttp3.Call localVarCall = retrieveDataViewFromDocumentFileValidateBeforeCall(documentFileUuid, null);
        Type localVarReturnType = new TypeToken<DataView>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get DataView from a DocumentFile (asynchronously)
     * Retrieve a DataView from the standardized output of a DocumentFile submitted to Fincura
     * @param documentFileUuid  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveDataViewFromDocumentFileAsync(String documentFileUuid, final ApiCallback<DataView> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveDataViewFromDocumentFileValidateBeforeCall(documentFileUuid, _callback);
        Type localVarReturnType = new TypeToken<DataView>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveMostRecentDataView
     * @param borrowerUuid  (required)
     * @param reportingInterval Reporting Interval of the financial data (optional)
     * @param preparationType Preparation Type of the finanical data (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveMostRecentDataViewCall(String borrowerUuid, String reportingInterval, String preparationType, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/data-view/most_recent/{borrower_uuid}"
            .replaceAll("\\{" + "borrower_uuid" + "\\}", localVarApiClient.escapeString(borrowerUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (reportingInterval != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reporting_interval", reportingInterval));
        }

        if (preparationType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("preparation_type", preparationType));
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
    private okhttp3.Call retrieveMostRecentDataViewValidateBeforeCall(String borrowerUuid, String reportingInterval, String preparationType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'borrowerUuid' is set
        if (borrowerUuid == null) {
            throw new ApiException("Missing the required parameter 'borrowerUuid' when calling retrieveMostRecentDataView(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveMostRecentDataViewCall(borrowerUuid, reportingInterval, preparationType, _callback);
        return localVarCall;

    }

    /**
     * Get the most recent period of data for a Borrower
     * Retrieve a DataView from the most recent standardized data for a borrower
     * @param borrowerUuid  (required)
     * @param reportingInterval Reporting Interval of the financial data (optional)
     * @param preparationType Preparation Type of the finanical data (optional)
     * @return DataView
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public DataView retrieveMostRecentDataView(String borrowerUuid, String reportingInterval, String preparationType) throws ApiException {
        ApiResponse<DataView> localVarResp = retrieveMostRecentDataViewWithHttpInfo(borrowerUuid, reportingInterval, preparationType);
        return localVarResp.getData();
    }

    /**
     * Get the most recent period of data for a Borrower
     * Retrieve a DataView from the most recent standardized data for a borrower
     * @param borrowerUuid  (required)
     * @param reportingInterval Reporting Interval of the financial data (optional)
     * @param preparationType Preparation Type of the finanical data (optional)
     * @return ApiResponse&lt;DataView&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DataView> retrieveMostRecentDataViewWithHttpInfo(String borrowerUuid, String reportingInterval, String preparationType) throws ApiException {
        okhttp3.Call localVarCall = retrieveMostRecentDataViewValidateBeforeCall(borrowerUuid, reportingInterval, preparationType, null);
        Type localVarReturnType = new TypeToken<DataView>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the most recent period of data for a Borrower (asynchronously)
     * Retrieve a DataView from the most recent standardized data for a borrower
     * @param borrowerUuid  (required)
     * @param reportingInterval Reporting Interval of the financial data (optional)
     * @param preparationType Preparation Type of the finanical data (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveMostRecentDataViewAsync(String borrowerUuid, String reportingInterval, String preparationType, final ApiCallback<DataView> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveMostRecentDataViewValidateBeforeCall(borrowerUuid, reportingInterval, preparationType, _callback);
        Type localVarReturnType = new TypeToken<DataView>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
