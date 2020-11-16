

# DocumentFileCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**status** | **String** |  |  [optional] [readonly]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**borrowerUuid** | [**UUID**](UUID.md) | UUID of the borrower for this file. (see [Borrowers](#tag/Borrowers)) | 
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | [MIME type](https://developer.mozilla.org/en-US/docs/Glossary/MIME_type) of the file | 
**filename** | **String** | Used to reference the original filename. Defaults to &#x60;document.{MEDIA TYPE FILE EXTENSION}&#x60; e.g. fye_2020.pdf |  [optional]
**statements** | [**List&lt;DocumentFileCreateStatements&gt;**](DocumentFileCreateStatements.md) |  |  [optional]
**uploadUrl** | [**URI**](URI.md) |  |  [optional] [readonly]
**externalId** | **String** | External ID is used to uniquely identify a record from your system in our system. Must be unique across records. |  [optional]
**customAttributes** | **Object** |  |  [optional]



## Enum: MediaTypeEnum

Name | Value
---- | -----
APPLICATION_PDF | &quot;application/pdf&quot;
APPLICATION_X_PDF | &quot;application/x-pdf&quot;
APPLICATION_VND_MS_EXCEL | &quot;application/vnd.ms-excel&quot;
APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET | &quot;application/vnd.openxmlformats-officedocument.spreadsheetml.sheet&quot;
IMAGE_PNG | &quot;image/png&quot;
IMAGE_GIF | &quot;image/gif&quot;
IMAGE_JPEG | &quot;image/jpeg&quot;



