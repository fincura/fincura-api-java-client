# DataViewsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveDataViewFromDocumentFile**](DataViewsApi.md#retrieveDataViewFromDocumentFile) | **GET** /v1/data-view/from_document_file/{document_file_uuid} | Get DataView from a DocumentFile
[**retrieveMostRecentDataView**](DataViewsApi.md#retrieveMostRecentDataView) | **GET** /v1/data-view/most_recent/{borrower_uuid} | Get the most recent period of data for a Borrower


<a name="retrieveDataViewFromDocumentFile"></a>
# **retrieveDataViewFromDocumentFile**
> DataView retrieveDataViewFromDocumentFile(documentFileUuid)

Get DataView from a DocumentFile

Retrieve a DataView from the standardized output of a DocumentFile submitted to Fincura

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.DataViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    DataViewsApi apiInstance = new DataViewsApi(defaultClient);
    String documentFileUuid = "documentFileUuid_example"; // String | 
    try {
      DataView result = apiInstance.retrieveDataViewFromDocumentFile(documentFileUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewsApi#retrieveDataViewFromDocumentFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentFileUuid** | **String**|  |

### Return type

[**DataView**](DataView.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="retrieveMostRecentDataView"></a>
# **retrieveMostRecentDataView**
> DataView retrieveMostRecentDataView(borrowerUuid, reportingInterval, preparationType)

Get the most recent period of data for a Borrower

Retrieve a DataView from the most recent standardized data for a borrower

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.DataViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    DataViewsApi apiInstance = new DataViewsApi(defaultClient);
    String borrowerUuid = "borrowerUuid_example"; // String | 
    String reportingInterval = "reportingInterval_example"; // String | Reporting Interval of the financial data
    String preparationType = "preparationType_example"; // String | Preparation Type of the finanical data
    try {
      DataView result = apiInstance.retrieveMostRecentDataView(borrowerUuid, reportingInterval, preparationType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataViewsApi#retrieveMostRecentDataView");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **borrowerUuid** | **String**|  |
 **reportingInterval** | **String**| Reporting Interval of the financial data | [optional] [enum: MONTHLY, QUARTERLY, SEMI_ANNUALLY, ANNUALLY, FISCAL_YTD]
 **preparationType** | **String**| Preparation Type of the finanical data | [optional] [enum: UNQUALIFIED, QUALIFIED, TAX_RETURN, REVIEWED, CPA_PREP, NTR, MANAGEMENT, UNKNOWN, CALCULATED]

### Return type

[**DataView**](DataView.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

