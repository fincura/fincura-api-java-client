# FilesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkFile**](FilesApi.md#createBulkFile) | **POST** /v1/bulk-file | Submit a new BulkFile
[**createDocumentFile**](FilesApi.md#createDocumentFile) | **POST** /v1/document-file | Submit a new DocumentFile
[**destroyDocumentFile**](FilesApi.md#destroyDocumentFile) | **DELETE** /v1/document-file/{uuid} | Delete a DocumentFile
[**listDocumentFiles**](FilesApi.md#listDocumentFiles) | **GET** /v1/document-file | List DocumentFile records
[**retrieveBulkFile**](FilesApi.md#retrieveBulkFile) | **GET** /v1/bulk-file/{uuid} | Retrieve a BulkFile
[**retrieveDocumentFile**](FilesApi.md#retrieveDocumentFile) | **GET** /v1/document-file/{uuid} | Get a DocumentFile


<a name="createBulkFile"></a>
# **createBulkFile**
> BulkFileCreate createBulkFile(bulkFileCreate)

Submit a new BulkFile

Add a new file to Fincura that maps to many borrowers. Requires use of a specific file processor per file format. Speak with you Fincura account manager about available options on your account.       POST /v1/bulk-file HTTP/1.1     Host: api.fincura.com     Accept: application/json     Authorization: Bearer eyJ0e...nFTRKTbcg     Content-Type: application/json      {         \&quot;processor_key\&quot;: \&quot;6e64724a-25fc-4e1a-8071-1ef29845ab1d\&quot;,         \&quot;media_type\&quot;: \&quot;application/pdf\&quot;\&quot;     }       The above request will create a new document record in Fincura and return a url to send the file to, as seen below.      {         \&quot;uuid\&quot;: \&quot;b901469b-8e9e-480c-bd03-186662dd5988\&quot;,         \&quot;upload_url\&quot;: \&quot;https://upload.fincura.com/b901469b-8e9e-480c-bd03-186662dd5988/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt\&quot;     }  In a subsequent request, the file can be sent to the &#x60;upload_url&#x60; via [HTTP PUT](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT). The &#x60;Content-Length&#x60; and &#x60;Content-Type&#x60; headers are required. The &#x60;Content-Type&#x60; should match the &#x60;media_type&#x60; from the previous request.      PUT /b901469b-8e9e-480c-bd03-186662dd5988/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt HTTP/1.1     Host: upload.fincura.com     Content-Length: 18828     Content-Type: application/pdf          {FILE  DATA}  Fincura will begin processing the file once it has been completely uploaded.

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    BulkFileCreate bulkFileCreate = new BulkFileCreate(); // BulkFileCreate | 
    try {
      BulkFileCreate result = apiInstance.createBulkFile(bulkFileCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#createBulkFile");
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
 **bulkFileCreate** | [**BulkFileCreate**](BulkFileCreate.md)|  | [optional]

### Return type

[**BulkFileCreate**](BulkFileCreate.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="createDocumentFile"></a>
# **createDocumentFile**
> DocumentFileCreate createDocumentFile(documentFileCreate)

Submit a new DocumentFile

Add a new file to Fincura for processing.  The minimal document creation request requires just a &#x60;borrower_uuid&#x60; and the &#x60;media_type&#x60; of the file to process.       POST /v1/document-file HTTP/1.1     Host: api.fincura.com     Accept: application/json     Authorization: Bearer eyJ0e...nFTRKTbcg     Content-Type: application/json      {         \&quot;borrower_uuid\&quot;: \&quot;6e64724a-25fc-4e1a-8071-1ef29845ab1d\&quot;,         \&quot;media_type\&quot;: \&quot;application/pdf\&quot;     }       The above request will create a new document record in Fincura and return a url to send the file to, as seen below.      {         \&quot;uuid\&quot;: \&quot;db74e98d-038e-4c8f-acf3-d06eb6f60fd3\&quot;,         \&quot;upload_url\&quot;: \&quot;https://upload.fincura.com/db74e98d-038e-4c8f-acf3-d06eb6f60fd3/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt\&quot;     }  In a subsequent request, the file can be sent to the &#x60;upload_url&#x60; via [HTTP PUT](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT). The &#x60;Content-Length&#x60; and &#x60;Content-Type&#x60; headers are required. The &#x60;Content-Type&#x60; should match the &#x60;media_type&#x60; from the previous request.      PUT /db74e98d-038e-4c8f-acf3-d06eb6f60fd3/document.pdf?signature&#x3D;mWFg4xsgm4EtFEt HTTP/1.1     Host: upload.fincura.com     Content-Length: 18828     Content-Type: application/pdf          {FILE  DATA}  Fincura will begin processing the file once it has been completely uploaded.  Additional fields described below:

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    DocumentFileCreate documentFileCreate = new DocumentFileCreate(); // DocumentFileCreate | 
    try {
      DocumentFileCreate result = apiInstance.createDocumentFile(documentFileCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#createDocumentFile");
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
 **documentFileCreate** | [**DocumentFileCreate**](DocumentFileCreate.md)|  | [optional]

### Return type

[**DocumentFileCreate**](DocumentFileCreate.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |
**429** | Rate Limit |  -  |

<a name="destroyDocumentFile"></a>
# **destroyDocumentFile**
> destroyDocumentFile(uuid, borrowerUuid)

Delete a DocumentFile

Delete a file from Fincura.

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String borrowerUuid = "borrowerUuid_example"; // String | Borrower to filter results for
    try {
      apiInstance.destroyDocumentFile(uuid, borrowerUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#destroyDocumentFile");
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
 **uuid** | **String**|  |
 **borrowerUuid** | **String**| Borrower to filter results for | [optional]

### Return type

null (empty response body)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** |  |  -  |

<a name="listDocumentFiles"></a>
# **listDocumentFiles**
> InlineResponse200 listDocumentFiles(limit, offset, borrowerUuid)

List DocumentFile records

List files submitted to Fincura

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String borrowerUuid = "borrowerUuid_example"; // String | Borrower to filter results for
    try {
      InlineResponse200 result = apiInstance.listDocumentFiles(limit, offset, borrowerUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#listDocumentFiles");
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
 **limit** | **Integer**| Number of results to return per page. | [optional]
 **offset** | **Integer**| The initial index from which to return the results. | [optional]
 **borrowerUuid** | **String**| Borrower to filter results for | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="retrieveBulkFile"></a>
# **retrieveBulkFile**
> BulkFileRead retrieveBulkFile(uuid)

Retrieve a BulkFile

Retrieve a bulk file submitted to Fincura

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    try {
      BulkFileRead result = apiInstance.retrieveBulkFile(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#retrieveBulkFile");
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
 **uuid** | **String**|  |

### Return type

[**BulkFileRead**](BulkFileRead.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="retrieveDocumentFile"></a>
# **retrieveDocumentFile**
> DocumentFileRead retrieveDocumentFile(uuid, borrowerUuid)

Get a DocumentFile

Retrieve a file submitted to Fincura

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String borrowerUuid = "borrowerUuid_example"; // String | Borrower to filter results for
    try {
      DocumentFileRead result = apiInstance.retrieveDocumentFile(uuid, borrowerUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#retrieveDocumentFile");
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
 **uuid** | **String**|  |
 **borrowerUuid** | **String**| Borrower to filter results for | [optional]

### Return type

[**DocumentFileRead**](DocumentFileRead.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

