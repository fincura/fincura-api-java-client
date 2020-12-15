

# Webhook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [optional] [readonly]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  | 
**webhookUrl** | **URI** |  | 
**webhookMethod** | [**WebhookMethodEnum**](#WebhookMethodEnum) |  |  [optional]
**externalId** | **String** | External ID is used to uniquely identify a record from your system in our system. Must be unique across records. |  [optional]
**signingKey** | **String** |  |  [optional] [readonly]



## Enum: EventTypeEnum

Name | Value
---- | -----
DOCUMENTFILE_RECEIVED | &quot;DocumentFile.Received&quot;
DOCUMENTFILE_PROCESSING | &quot;DocumentFile.Processing&quot;
DOCUMENTFILE_HUMANREQUIRED | &quot;DocumentFile.HumanRequired&quot;
DOCUMENTFILE_SPREADCOMPLETE | &quot;DocumentFile.SpreadComplete&quot;
DOCUMENTFILE_ERROR | &quot;DocumentFile.Error&quot;
BULKFILE_RECEIVED | &quot;BulkFile.Received&quot;
BULKFILE_PROCESSING | &quot;BulkFile.Processing&quot;
BULKFILE_PROCESSED | &quot;BulkFile.Processed&quot;
BULKFILE_ERROR | &quot;BulkFile.Error&quot;
STAR | &quot;*&quot;



## Enum: WebhookMethodEnum

Name | Value
---- | -----
GET | &quot;GET&quot;
POST | &quot;POST&quot;



