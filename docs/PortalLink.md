

# PortalLink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [optional] [readonly]
**reportingInterval** | [**ReportingIntervalEnum**](#ReportingIntervalEnum) |  |  [optional]
**fromDate** | **LocalDate** | Request statements from date |  [optional]
**toDate** | **LocalDate** | Request statements to date |  [optional]
**statementTypes** | [**List&lt;PortalLinkStatementTypes&gt;**](PortalLinkStatementTypes.md) |  |  [optional]
**portalUrl** | **URI** |  |  [optional] [readonly]



## Enum: ReportingIntervalEnum

Name | Value
---- | -----
MONTHLY | &quot;MONTHLY&quot;
QUARTERLY | &quot;QUARTERLY&quot;
SEMI_ANNUALLY | &quot;SEMI_ANNUALLY&quot;
ANNUALLY | &quot;ANNUALLY&quot;
FISCAL_YTD | &quot;FISCAL_YTD&quot;



