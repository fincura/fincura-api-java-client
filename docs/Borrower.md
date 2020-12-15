

# Borrower

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [optional] [readonly]
**name** | **String** | Name of the Borrower. Must be unique across Borrower records | 
**createdDate** | **OffsetDateTime** |  |  [optional] [readonly]
**portfolioUuid** | **UUID** | UUID of the Portfolio for this Borrower. (see [Portfolios](#tag/Portfolios)) |  [optional]
**externalId** | **String** | External ID is used to uniquely identify a record from your system in our system. Must be unique across records. |  [optional]
**contactEmail** | **String** | Borrower contact email |  [optional]
**contactPerson** | **String** | Borrower contact Full Name |  [optional]
**contactPhone** | **String** | Borrower contact Phone Number |  [optional]
**sicCode** | **String** |  |  [optional]
**naicsCode** | **String** |  |  [optional]
**sicIndustry** | [**SicIndustryEnum**](#SicIndustryEnum) |  |  [optional]
**customAttributes** | **Object** |  |  [optional]



## Enum: SicIndustryEnum

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



