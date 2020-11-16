# PortfoliosApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPortfolio**](PortfoliosApi.md#createPortfolio) | **POST** /v1/portfolio | Create a new Portfolio
[**listPortfolios**](PortfoliosApi.md#listPortfolios) | **GET** /v1/portfolio | List Portfolios
[**partialUpdatePortfolio**](PortfoliosApi.md#partialUpdatePortfolio) | **PATCH** /v1/portfolio/{uuid} | Update a Portfolio


<a name="createPortfolio"></a>
# **createPortfolio**
> Portfolio createPortfolio(portfolio)

Create a new Portfolio

Create a new Portfolio record

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    Portfolio portfolio = new Portfolio(); // Portfolio | 
    try {
      Portfolio result = apiInstance.createPortfolio(portfolio);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#createPortfolio");
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
 **portfolio** | [**Portfolio**](Portfolio.md)|  | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="listPortfolios"></a>
# **listPortfolios**
> InlineResponse2002 listPortfolios(limit, offset, search)

List Portfolios

List Portfolio records

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String search = "search_example"; // String | A search term.
    try {
      InlineResponse2002 result = apiInstance.listPortfolios(limit, offset, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#listPortfolios");
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
 **search** | **String**| A search term. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="partialUpdatePortfolio"></a>
# **partialUpdatePortfolio**
> Portfolio partialUpdatePortfolio(uuid, search, portfolio)

Update a Portfolio

Update a Portfolio

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String search = "search_example"; // String | A search term.
    Portfolio portfolio = new Portfolio(); // Portfolio | 
    try {
      Portfolio result = apiInstance.partialUpdatePortfolio(uuid, search, portfolio);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#partialUpdatePortfolio");
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
 **search** | **String**| A search term. | [optional]
 **portfolio** | [**Portfolio**](Portfolio.md)|  | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

