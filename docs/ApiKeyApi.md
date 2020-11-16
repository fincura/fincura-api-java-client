# ApiKeyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**refreshApiKey**](ApiKeyApi.md#refreshApiKey) | **POST** /v1/api-key/refresh | Refresh Api Key


<a name="refreshApiKey"></a>
# **refreshApiKey**
> ApiKey refreshApiKey(apiKey)

Refresh Api Key

Extend the life of the current authorized token by exchanging it for a new one

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.ApiKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    ApiKeyApi apiInstance = new ApiKeyApi(defaultClient);
    ApiKey apiKey = new ApiKey(); // ApiKey | 
    try {
      ApiKey result = apiInstance.refreshApiKey(apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeyApi#refreshApiKey");
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
 **apiKey** | [**ApiKey**](ApiKey.md)|  | [optional]

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

