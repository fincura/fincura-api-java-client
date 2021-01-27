

# DocumentFileCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [optional] [readonly]
**status** | **String** |  |  [optional] [readonly]
**createdDate** | **OffsetDateTime** |  |  [optional] [readonly]
**borrowerUuid** | **UUID** | UUID of the borrower for this file. (see [Borrowers](#tag/Borrowers)) | 
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | [MIME type](https://developer.mozilla.org/en-US/docs/Glossary/MIME_type) of the file | 
**filename** | **String** | Used to reference the original filename. Defaults to &#x60;document.{MEDIA TYPE FILE EXTENSION}&#x60; e.g. fye_2021.pdf |  [optional]
**statements** | [**List&lt;DocumentFileCreateStatements&gt;**](DocumentFileCreateStatements.md) |  By default, any document submitted to Fincura will be scanned for Income Statement and Balance Sheet information.  The engine can also be pointed at Tax Returns by setting a statement object with a &#x60;form_type&#x60; and &#x60;tax_year&#x60;. Supported tax form types: &#x60;1065&#x60;, &#x60;1040&#x60;, &#x60;1120&#x60;, &#x60;1120S&#x60;  &#x60;&#x60;&#x60; {     \&quot;borrower_uuid\&quot;: \&quot;6e...845ab1d\&quot;,     \&quot;media_type\&quot;: \&quot;application/pdf\&quot;,     \&quot;statements\&quot;: [         {           \&quot;form_type\&quot;: \&quot;1065\&quot;           \&quot;tax_year\&quot;: 2019         }       ] } &#x60;&#x60;&#x60;        |  [optional]
**uploadUrl** | **URI** |  |  [optional] [readonly]
**externalId** | **String** | External ID is used to uniquely identify a record from your system in our system. Must be unique across records. |  [optional]
**customAttributes** | **Object** |  |  [optional]



## Enum: MediaTypeEnum

Name | Value
---- | -----
APPLICATION_PDF | &quot;application/pdf&quot;
APPLICATION_X_PDF | &quot;application/x-pdf&quot;
APPLICATION_VND_MS_EXCEL | &quot;application/vnd.ms-excel&quot;
APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET | &quot;application/vnd.openxmlformats-officedocument.spreadsheetml.sheet&quot;
APPLICATION_VND_MS_EXCEL_SHEET_MACROENABLED_12 | &quot;application/vnd.ms-excel.sheet.macroEnabled.12&quot;
IMAGE_PNG | &quot;image/png&quot;
IMAGE_GIF | &quot;image/gif&quot;
IMAGE_JPEG | &quot;image/jpeg&quot;



