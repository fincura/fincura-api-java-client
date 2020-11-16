

# Loan

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**title** | **String** | Title of the Loan. Must be unique for the Borrower | 
**description** | **String** |  |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**externalId** | **String** | External ID is used to uniquely identify a record from your system in our system. Must be unique across records. |  [optional]
**loanId** | **String** |  |  [optional]
**contractType** | [**ContractTypeEnum**](#ContractTypeEnum) |  |  [optional]
**borrowerUuid** | [**UUID**](UUID.md) | UUID of the borrower for this loan. (see [Borrowers](#tag/Borrowers)) | 
**borrowerInfo** | [**LoanBorrowerInfo**](LoanBorrowerInfo.md) |  | 
**principal** | [**BigDecimal**](BigDecimal.md) | Original principal value | 
**interestRate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**interestType** | [**InterestTypeEnum**](#InterestTypeEnum) |  |  [optional]
**termMonths** | **Integer** |  | 
**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | Loan end date. Calculated field |  [optional] [readonly]
**monthlyPayment** | [**BigDecimal**](BigDecimal.md) | calculated field |  [optional] [readonly]
**paymentsRemaining** | **Integer** | Calculated field |  [optional] [readonly]
**outstandingPrincipal** | [**BigDecimal**](BigDecimal.md) | calculated field |  [optional] [readonly]
**interestAccrued** | [**BigDecimal**](BigDecimal.md) | calculated field |  [optional] [readonly]
**loanToValue** | [**BigDecimal**](BigDecimal.md) | calculated field |  [optional] [readonly]
**scorecard** | [**ScorecardEnum**](#ScorecardEnum) |  |  [optional]
**collateralType** | [**CollateralTypeEnum**](#CollateralTypeEnum) |  |  [optional]
**collateralValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**collateralLifeMonths** | **Integer** | The life of the collateral in months |  [optional]
**residualValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**balloonPayment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**lastPaymentDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**complianceInfo** | [**LoanComplianceInfo**](LoanComplianceInfo.md) |  |  [optional]
**templateUuid** | [**UUID**](UUID.md) | DSRC template to use for finanical information |  [optional]
**periods** | [**List&lt;LoanPeriods&gt;**](LoanPeriods.md) | ReportingPeriod&#39;s to include in the loan financial information |  [optional]
**documents** | [**List&lt;LoanDocuments&gt;**](LoanDocuments.md) | Additional DocumentFile&#39;s to be included with loan information |  [optional]
**financials** | [**LoanFinancials**](LoanFinancials.md) |  |  [optional]
**analysisCommentary** | **String** |  |  [optional]
**guarantors** | [**List&lt;LoanGuarantors&gt;**](LoanGuarantors.md) |  |  [optional]
**priorYearFinancials** | [**LoanPriorYearFinancials**](LoanPriorYearFinancials.md) |  |  [optional]
**customAttributes** | **Object** |  |  [optional]



## Enum: ContractTypeEnum

Name | Value
---- | -----
LEASE | &quot;LEASE&quot;
LOAN | &quot;LOAN&quot;
NOT_APPLICABLE | &quot;NOT_APPLICABLE&quot;



## Enum: InterestTypeEnum

Name | Value
---- | -----
FIXED | &quot;FIXED&quot;
ADJUSTABLE | &quot;ADJUSTABLE&quot;



## Enum: PaymentTypeEnum

Name | Value
---- | -----
PRINCIPAL_AND_INTEREST | &quot;PRINCIPAL_AND_INTEREST&quot;
PRINCIPAL_PLUS_INTEREST | &quot;PRINCIPAL_PLUS_INTEREST&quot;
IO_PERIOD | &quot;IO_PERIOD&quot;
BALLON | &quot;BALLON&quot;



## Enum: StateEnum

Name | Value
---- | -----
PROPOSED | &quot;PROPOSED&quot;
APPROVED | &quot;APPROVED&quot;
DECLINED | &quot;DECLINED&quot;
ACTIVE | &quot;ACTIVE&quot;
PAID_OFF | &quot;PAID_OFF&quot;
DESISTED | &quot;DESISTED&quot;



## Enum: PaymentStatusEnum

Name | Value
---- | -----
CURRENT | &quot;CURRENT&quot;
GRACE_PERIOD | &quot;GRACE_PERIOD&quot;
DELINQUENT | &quot;DELINQUENT&quot;



## Enum: ScorecardEnum

Name | Value
---- | -----
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;
NOT_APPLICABLE | &quot;NOT_APPLICABLE&quot;



## Enum: CollateralTypeEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
CASH | &quot;CASH&quot;
AR | &quot;AR&quot;
IP | &quot;IP&quot;
REAL_ESTATE | &quot;REAL_ESTATE&quot;
EQUIPMENT | &quot;EQUIPMENT&quot;



