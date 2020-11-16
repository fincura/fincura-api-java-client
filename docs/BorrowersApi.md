# BorrowersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBorrower**](BorrowersApi.md#createBorrower) | **POST** /v1/borrower | Create a new Borrower
[**listBorrowers**](BorrowersApi.md#listBorrowers) | **GET** /v1/borrower | List Borrowers
[**partialUpdateBorrower**](BorrowersApi.md#partialUpdateBorrower) | **PATCH** /v1/borrower/{uuid} | Update a Borrower
[**retrieveBorrower**](BorrowersApi.md#retrieveBorrower) | **GET** /v1/borrower/{uuid} | Retrieve a Borrower


<a name="createBorrower"></a>
# **createBorrower**
> Borrower createBorrower(borrower)

Create a new Borrower

Create a new Borrower record

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.BorrowersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    BorrowersApi apiInstance = new BorrowersApi(defaultClient);
    Borrower borrower = new Borrower(); // Borrower | 
    try {
      Borrower result = apiInstance.createBorrower(borrower);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BorrowersApi#createBorrower");
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
 **borrower** | [**Borrower**](Borrower.md)|  | [optional]

### Return type

[**Borrower**](Borrower.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="listBorrowers"></a>
# **listBorrowers**
> InlineResponse2001 listBorrowers(limit, offset, search)

List Borrowers

List Borrower records

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.BorrowersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    BorrowersApi apiInstance = new BorrowersApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String search = "search_example"; // String | A search term.
    try {
      InlineResponse2001 result = apiInstance.listBorrowers(limit, offset, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BorrowersApi#listBorrowers");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="partialUpdateBorrower"></a>
# **partialUpdateBorrower**
> Borrower partialUpdateBorrower(uuid, search, borrower)

Update a Borrower

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.BorrowersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    BorrowersApi apiInstance = new BorrowersApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String search = "search_example"; // String | A search term.
    Borrower borrower = new Borrower(); // Borrower | 
    try {
      Borrower result = apiInstance.partialUpdateBorrower(uuid, search, borrower);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BorrowersApi#partialUpdateBorrower");
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
 **borrower** | [**Borrower**](Borrower.md)|  | [optional]

### Return type

[**Borrower**](Borrower.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="retrieveBorrower"></a>
# **retrieveBorrower**
> Borrower retrieveBorrower(uuid, search)

Retrieve a Borrower

Retrieve a Borrower

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.BorrowersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    BorrowersApi apiInstance = new BorrowersApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String search = "search_example"; // String | A search term.
    try {
      Borrower result = apiInstance.retrieveBorrower(uuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BorrowersApi#retrieveBorrower");
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

### Return type

[**Borrower**](Borrower.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

