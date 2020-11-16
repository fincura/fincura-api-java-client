# LoansApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLoan**](LoansApi.md#createLoan) | **POST** /v1/loan | Create a new Loan
[**destroyLoan**](LoansApi.md#destroyLoan) | **DELETE** /v1/loan/{uuid} | Delete a Loan
[**listLoans**](LoansApi.md#listLoans) | **GET** /v1/loan | List Loans
[**partialUpdateLoan**](LoansApi.md#partialUpdateLoan) | **PATCH** /v1/loan/{uuid} | Update a Loan
[**retrieveLoan**](LoansApi.md#retrieveLoan) | **GET** /v1/loan/{uuid} | Retrieve a Loan


<a name="createLoan"></a>
# **createLoan**
> Loan createLoan(loan)

Create a new Loan

Create a new Loan record

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.LoansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    LoansApi apiInstance = new LoansApi(defaultClient);
    Loan loan = new Loan(); // Loan | 
    try {
      Loan result = apiInstance.createLoan(loan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoansApi#createLoan");
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
 **loan** | [**Loan**](Loan.md)|  | [optional]

### Return type

[**Loan**](Loan.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="destroyLoan"></a>
# **destroyLoan**
> destroyLoan(uuid, borrowerUuid, search)

Delete a Loan

Delete a loan from Fincura.

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.LoansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    LoansApi apiInstance = new LoansApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String borrowerUuid = "borrowerUuid_example"; // String | Borrower to filter results for
    String search = "search_example"; // String | A search term.
    try {
      apiInstance.destroyLoan(uuid, borrowerUuid, search);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoansApi#destroyLoan");
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

<a name="listLoans"></a>
# **listLoans**
> InlineResponse2003 listLoans(limit, offset, borrowerUuid, search)

List Loans

List Loan records

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.LoansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    LoansApi apiInstance = new LoansApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String borrowerUuid = "borrowerUuid_example"; // String | Borrower to filter results for
    String search = "search_example"; // String | A search term.
    try {
      InlineResponse2003 result = apiInstance.listLoans(limit, offset, borrowerUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoansApi#listLoans");
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

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="partialUpdateLoan"></a>
# **partialUpdateLoan**
> Loan partialUpdateLoan(uuid, borrowerUuid, search, loan)

Update a Loan

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.LoansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    LoansApi apiInstance = new LoansApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String borrowerUuid = "borrowerUuid_example"; // String | Borrower to filter results for
    String search = "search_example"; // String | A search term.
    Loan loan = new Loan(); // Loan | 
    try {
      Loan result = apiInstance.partialUpdateLoan(uuid, borrowerUuid, search, loan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoansApi#partialUpdateLoan");
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
 **loan** | [**Loan**](Loan.md)|  | [optional]

### Return type

[**Loan**](Loan.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="retrieveLoan"></a>
# **retrieveLoan**
> Loan retrieveLoan(uuid, borrowerUuid, search)

Retrieve a Loan

Retrieve a Loan

### Example
```java
// Import classes:
import org.fincura.client.ApiClient;
import org.fincura.client.ApiException;
import org.fincura.client.Configuration;
import org.fincura.client.auth.*;
import org.fincura.client.models.*;
import org.fincura.client.api.LoansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: API_Key
    HttpBearerAuth API_Key = (HttpBearerAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setBearerToken("BEARER TOKEN");

    LoansApi apiInstance = new LoansApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String borrowerUuid = "borrowerUuid_example"; // String | Borrower to filter results for
    String search = "search_example"; // String | A search term.
    try {
      Loan result = apiInstance.retrieveLoan(uuid, borrowerUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoansApi#retrieveLoan");
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

[**Loan**](Loan.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

