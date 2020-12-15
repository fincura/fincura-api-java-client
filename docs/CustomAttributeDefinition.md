

# CustomAttributeDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** |  |  [optional] [readonly]
**name** | **String** |  | 
**key** | **String** |  |  [optional] [readonly]
**description** | **String** |  |  [optional]
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  | 
**attributeType** | [**AttributeTypeEnum**](#AttributeTypeEnum) |  |  [optional]
**required** | **Boolean** |  |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
DOCUMENTFILE | &quot;DocumentFile&quot;
BORROWER | &quot;Borrower&quot;
LOAN | &quot;Loan&quot;



## Enum: AttributeTypeEnum

Name | Value
---- | -----
STRING | &quot;STRING&quot;
BOOLEAN | &quot;BOOLEAN&quot;
NUMBER | &quot;NUMBER&quot;



