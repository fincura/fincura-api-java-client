# EmbeddedWorkflowsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbeddedWorkflow**](EmbeddedWorkflowsApi.md#createEmbeddedWorkflow) | **POST** /v1/embedded-workflow | 
[**retrieveEmbeddedWorkflow**](EmbeddedWorkflowsApi.md#retrieveEmbeddedWorkflow) | **GET** /v1/embedded-workflow/{uuid} | 


<a name="createEmbeddedWorkflow"></a>
# **createEmbeddedWorkflow**
> EmbeddedWorkflow createEmbeddedWorkflow(embeddedWorkflow)



Returns a URL to an HTML webapp to complete document parsing pipeline flow

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.EmbeddedWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    EmbeddedWorkflowsApi apiInstance = new EmbeddedWorkflowsApi(defaultClient);
    EmbeddedWorkflow embeddedWorkflow = new EmbeddedWorkflow(); // EmbeddedWorkflow | 
    try {
      EmbeddedWorkflow result = apiInstance.createEmbeddedWorkflow(embeddedWorkflow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbeddedWorkflowsApi#createEmbeddedWorkflow");
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
 **embeddedWorkflow** | [**EmbeddedWorkflow**](EmbeddedWorkflow.md)|  | [optional]

### Return type

[**EmbeddedWorkflow**](EmbeddedWorkflow.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="retrieveEmbeddedWorkflow"></a>
# **retrieveEmbeddedWorkflow**
> EmbeddedWorkflow retrieveEmbeddedWorkflow(uuid)



### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.EmbeddedWorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    EmbeddedWorkflowsApi apiInstance = new EmbeddedWorkflowsApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    try {
      EmbeddedWorkflow result = apiInstance.retrieveEmbeddedWorkflow(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbeddedWorkflowsApi#retrieveEmbeddedWorkflow");
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

[**EmbeddedWorkflow**](EmbeddedWorkflow.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

