

# EmbeddedWorkflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [optional] [readonly]
**documentFileUuid** | **UUID** | UUID of the DocumentFile for this workflow | 
**embedType** | [**EmbedTypeEnum**](#EmbedTypeEnum) |  |  [optional]
**createdDate** | **OffsetDateTime** |  |  [optional] [readonly]
**exitStep** | [**ExitStepEnum**](#ExitStepEnum) |  |  [optional]
**redirectUrl** | **URI** |  |  [optional]
**uiControls** | [**EmbeddedWorkflowUiControls**](EmbeddedWorkflowUiControls.md) |  |  [optional]
**loaded** | **Boolean** |  |  [optional] [readonly]
**loadWorkflowUrl** | **URI** |  |  [optional] [readonly]
**externalUserId** | **String** | Id to identify the user performing the work (e.g. email or username) |  [optional]
**externalUserLabel** | **String** | Human readable label to identify the user performing the work (e.g. name) |  [optional]



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



