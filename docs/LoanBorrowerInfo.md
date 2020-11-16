

# LoanBorrowerInfo

Borrower information specific to this loan (does not update the underlying Borrower)
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**industry** | [**IndustryEnum**](#IndustryEnum) |  |  [optional]
**naicsCode** | **Integer** |  |  [optional]
**address** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**state** | **String** |  |  [optional]
**zipcode** | **String** |  |  [optional]
**country** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**companyNotes** | **String** |  |  [optional]
**dunBradstreetScore** | **Integer** |  |  [optional]
**paynetScore** | **String** |  |  [optional]



## Enum: IndustryEnum

Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
AGRICULTURE_FORESTRY_FISHING | &quot;AGRICULTURE_FORESTRY_FISHING&quot;
CONSTRUCTION | &quot;CONSTRUCTION&quot;
MINING | &quot;MINING&quot;
TRANSPORTATION_AND_PUBLIC_UTILITIES | &quot;TRANSPORTATION_AND_PUBLIC_UTILITIES&quot;
WHOLESALE_TRADE | &quot;WHOLESALE_TRADE&quot;
RETAIL_TRADE | &quot;RETAIL_TRADE&quot;
MANUFACTURING | &quot;MANUFACTURING&quot;
FINANCE_INSURANCE_REAL_ESTATE | &quot;FINANCE_INSURANCE_REAL_ESTATE&quot;
SERVICES | &quot;SERVICES&quot;
PUBLIC_ADMINISTRATION | &quot;PUBLIC_ADMINISTRATION&quot;



