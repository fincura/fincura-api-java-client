

# FinancialRequirementRules

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [optional] [readonly]
**thresholdValue** | **BigDecimal** |  | 
**comparer** | [**ComparerEnum**](#ComparerEnum) |  |  [optional]
**startDate** | **LocalDate** |  | 
**endDate** | **LocalDate** |  |  [optional]



## Enum: ComparerEnum

Name | Value
---- | -----
_ | &quot;&#x3D;&#x3D;&quot;
NOT_EQUAL | &quot;!&#x3D;&quot;
GREATER_THAN | &quot;&gt;&quot;
LESS_THAN | &quot;&lt;&quot;
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;



