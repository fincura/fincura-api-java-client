

# Webhook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  | 
**webhookUrl** | [**URI**](URI.md) |  | 
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
STAR | &quot;*&quot;



## Enum: WebhookMethodEnum

Name | Value
---- | -----
GET | &quot;GET&quot;
POST | &quot;POST&quot;



