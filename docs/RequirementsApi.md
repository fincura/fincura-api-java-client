# RequirementsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFinancialRequirement**](RequirementsApi.md#createFinancialRequirement) | **POST** /v1/financial-requirement | Create a new FinancialRequirement
[**listFinancialRequirements**](RequirementsApi.md#listFinancialRequirements) | **GET** /v1/financial-requirement | List FinancialRequirements
[**partialUpdateFinancialRequirement**](RequirementsApi.md#partialUpdateFinancialRequirement) | **PATCH** /v1/financial-requirement/{uuid} | Update a FinancialRequirement
[**retrieveFinancialRequirement**](RequirementsApi.md#retrieveFinancialRequirement) | **GET** /v1/financial-requirement/{uuid} | Retrieve a FinancialRequirement


<a name="createFinancialRequirement"></a>
# **createFinancialRequirement**
> FinancialRequirement createFinancialRequirement(financialRequirement)

Create a new FinancialRequirement

Create a new FinancialRequirement record

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.RequirementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    RequirementsApi apiInstance = new RequirementsApi(defaultClient);
    FinancialRequirement financialRequirement = new FinancialRequirement(); // FinancialRequirement | 
    try {
      FinancialRequirement result = apiInstance.createFinancialRequirement(financialRequirement);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequirementsApi#createFinancialRequirement");
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
 **financialRequirement** | [**FinancialRequirement**](FinancialRequirement.md)|  | [optional]

### Return type

[**FinancialRequirement**](FinancialRequirement.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="listFinancialRequirements"></a>
# **listFinancialRequirements**
> InlineResponse2004 listFinancialRequirements(limit, offset, borrowerUuid, search)

List FinancialRequirements

List FinancialRequirement records

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.RequirementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    RequirementsApi apiInstance = new RequirementsApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String borrowerUuid = "borrowerUuid_example"; // String | Borrower to filter results for
    String search = "search_example"; // String | A search term.
    try {
      InlineResponse2004 result = apiInstance.listFinancialRequirements(limit, offset, borrowerUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequirementsApi#listFinancialRequirements");
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
 **search** | **String**| A search term. | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="partialUpdateFinancialRequirement"></a>
# **partialUpdateFinancialRequirement**
> FinancialRequirement partialUpdateFinancialRequirement(uuid, borrowerUuid, search, financialRequirement)

Update a FinancialRequirement

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.RequirementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    RequirementsApi apiInstance = new RequirementsApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String borrowerUuid = "borrowerUuid_example"; // String | Borrower to filter results for
    String search = "search_example"; // String | A search term.
    FinancialRequirement financialRequirement = new FinancialRequirement(); // FinancialRequirement | 
    try {
      FinancialRequirement result = apiInstance.partialUpdateFinancialRequirement(uuid, borrowerUuid, search, financialRequirement);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequirementsApi#partialUpdateFinancialRequirement");
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
 **search** | **String**| A search term. | [optional]
 **financialRequirement** | [**FinancialRequirement**](FinancialRequirement.md)|  | [optional]

### Return type

[**FinancialRequirement**](FinancialRequirement.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="retrieveFinancialRequirement"></a>
# **retrieveFinancialRequirement**
> FinancialRequirement retrieveFinancialRequirement(uuid, borrowerUuid, search)

Retrieve a FinancialRequirement

Retrieve a FinancialRequirement

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.RequirementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    RequirementsApi apiInstance = new RequirementsApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String borrowerUuid = "borrowerUuid_example"; // String | Borrower to filter results for
    String search = "search_example"; // String | A search term.
    try {
      FinancialRequirement result = apiInstance.retrieveFinancialRequirement(uuid, borrowerUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequirementsApi#retrieveFinancialRequirement");
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
 **search** | **String**| A search term. | [optional]

### Return type

[**FinancialRequirement**](FinancialRequirement.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

