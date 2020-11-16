# CustomAttributesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomAttributeDefinition**](CustomAttributesApi.md#createCustomAttributeDefinition) | **POST** /v1/custom-attribute-definition | Create a CustomAttributeDefinition
[**destroyCustomAttributeDefinition**](CustomAttributesApi.md#destroyCustomAttributeDefinition) | **DELETE** /v1/custom-attribute-definition/{uuid} | Delete a CustomAttributeDefinition
[**listCustomAttributeDefinitions**](CustomAttributesApi.md#listCustomAttributeDefinitions) | **GET** /v1/custom-attribute-definition | List CustomAttributeDefinitions
[**retrieveCustomAttributeDefinition**](CustomAttributesApi.md#retrieveCustomAttributeDefinition) | **GET** /v1/custom-attribute-definition/{uuid} | Get CustomAttributeDefinition info


<a name="createCustomAttributeDefinition"></a>
# **createCustomAttributeDefinition**
> CustomAttributeDefinition createCustomAttributeDefinition(customAttributeDefinition)

Create a CustomAttributeDefinition

Create a CustomAttributeDefinition

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.CustomAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    CustomAttributesApi apiInstance = new CustomAttributesApi(defaultClient);
    CustomAttributeDefinition customAttributeDefinition = new CustomAttributeDefinition(); // CustomAttributeDefinition | 
    try {
      CustomAttributeDefinition result = apiInstance.createCustomAttributeDefinition(customAttributeDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributesApi#createCustomAttributeDefinition");
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
 **customAttributeDefinition** | [**CustomAttributeDefinition**](CustomAttributeDefinition.md)|  | [optional]

### Return type

[**CustomAttributeDefinition**](CustomAttributeDefinition.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="destroyCustomAttributeDefinition"></a>
# **destroyCustomAttributeDefinition**
> destroyCustomAttributeDefinition(uuid)

Delete a CustomAttributeDefinition

Delete a CustomAttributeDefinition.

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.CustomAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    CustomAttributesApi apiInstance = new CustomAttributesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    try {
      apiInstance.destroyCustomAttributeDefinition(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributesApi#destroyCustomAttributeDefinition");
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

<a name="listCustomAttributeDefinitions"></a>
# **listCustomAttributeDefinitions**
> InlineResponse2006 listCustomAttributeDefinitions(limit, offset)

List CustomAttributeDefinitions

List CustomAttributeDefinition

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.CustomAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    CustomAttributesApi apiInstance = new CustomAttributesApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    try {
      InlineResponse2006 result = apiInstance.listCustomAttributeDefinitions(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributesApi#listCustomAttributeDefinitions");
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

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="retrieveCustomAttributeDefinition"></a>
# **retrieveCustomAttributeDefinition**
> CustomAttributeDefinition retrieveCustomAttributeDefinition(uuid)

Get CustomAttributeDefinition info

Retrieve a CustomAttributeDefinition

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.CustomAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    CustomAttributesApi apiInstance = new CustomAttributesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    try {
      CustomAttributeDefinition result = apiInstance.retrieveCustomAttributeDefinition(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributesApi#retrieveCustomAttributeDefinition");
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

[**CustomAttributeDefinition**](CustomAttributeDefinition.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

