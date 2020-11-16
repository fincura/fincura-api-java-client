

# EmbeddedWorkflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**documentFileUuid** | [**UUID**](UUID.md) | UUID of the DocumentFile for this workflow | 
**embedType** | [**EmbedTypeEnum**](#EmbedTypeEnum) |  |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**exitStep** | [**ExitStepEnum**](#ExitStepEnum) |  |  [optional]
**redirectUrl** | [**URI**](URI.md) |  |  [optional]
**uiControls** | [**EmbeddedWorkflowUiControls**](EmbeddedWorkflowUiControls.md) |  |  [optional]
**loaded** | **Boolean** |  |  [optional] [readonly]
**loadWorkflowUrl** | [**URI**](URI.md) |  |  [optional] [readonly]



## Enum: EmbedTypeEnum

Name | Value
---- | -----
IFRAME | &quot;IFRAME&quot;
NONE | &quot;NONE&quot;



## Enum: ExitStepEnum

Name | Value
---- | -----
TABLE_ID | &quot;TABLE_ID&quot;
COLUMN_ID | &quot;COLUMN_ID&quot;
REVIEW | &quot;REVIEW&quot;
SPREAD | &quot;SPREAD&quot;



