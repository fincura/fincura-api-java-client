

# FinancialRequirement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [optional] [readonly]
**name** | **String** | Title of the FinancialRequirement. Must be unique for the Borrower | 
**description** | **String** |  |  [optional]
**createdDate** | **OffsetDateTime** |  |  [optional] [readonly]
**externalId** | **String** | External ID is used to uniquely identify a record from your system in our system. Must be unique across records. |  [optional]
**borrowerUuid** | **UUID** | UUID of the borrower for this loan. (see [Borrowers](#tag/Borrowers)) | 
**loanUuid** | **UUID** | UUID of the loan for this requirement. (see [Loans](#tag/Loans)) |  [optional]
**inputEquation** | **String** |  | 
**frequency** | [**FrequencyEnum**](#FrequencyEnum) |  |  [optional]
**rules** | [**List&lt;FinancialRequirementRules&gt;**](FinancialRequirementRules.md) |  |  [optional]



## Enum: FrequencyEnum

Name | Value
---- | -----
MONTHLY | &quot;MONTHLY&quot;
QUARTERLY | &quot;QUARTERLY&quot;
SEMI_ANNUALLY | &quot;SEMI_ANNUALLY&quot;
ANNUALLY | &quot;ANNUALLY&quot;
TTM | &quot;TTM&quot;
FISCAL_YTD | &quot;FISCAL_YTD&quot;



