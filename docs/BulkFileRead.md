

# BulkFileRead

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [optional] [readonly]
**status** | **String** |  |  [optional] [readonly]
**createdDate** | **OffsetDateTime** |  |  [optional] [readonly]
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | [MIME type](https://developer.mozilla.org/en-US/docs/Glossary/MIME_type) of the file | 
**filename** | **String** | Used to reference the original filename. Defaults to &#x60;document.{MEDIA TYPE FILE EXTENSION}&#x60; e.g. fye_2021.pdf |  [optional]
**documentFiles** | **List&lt;String&gt;** |  |  [optional] [readonly]
**processorKey** | **String** | Key of custom processor |  [optional]
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



