# TenantSettingsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**readTenantSettings**](TenantSettingsApi.md#readTenantSettings) | **GET** /v1/tenant-settings/read | Get Tenant Settings


<a name="readTenantSettings"></a>
# **readTenantSettings**
> TenantSettings readTenantSettings()

Get Tenant Settings

Read Tenant Settings

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.TenantSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    TenantSettingsApi apiInstance = new TenantSettingsApi(defaultClient);
    try {
      TenantSettings result = apiInstance.readTenantSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantSettingsApi#readTenantSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantSettings**](TenantSettings.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

