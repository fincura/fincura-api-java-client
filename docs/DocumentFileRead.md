

# DocumentFileRead

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**status** | **String** |  |  [optional] [readonly]
**pipelineStep** | **String** |  |  [optional] [readonly]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**borrowerUuid** | [**UUID**](UUID.md) | UUID of the borrower for this file. | 
**borrowerName** | **String** |  |  [optional] [readonly]
**filename** | **String** | Used to reference the original filename. Defaults to &#x60;document.{MEDIA TYPE FILE EXTENSION}&#x60; e.g. fye_2020.pdf |  [optional]
**statementTypes** | **List&lt;Object&gt;** |  |  [optional] [readonly]
**customAttributes** | **Object** |  |  [optional]



