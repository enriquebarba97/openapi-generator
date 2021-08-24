

# InvideoPosition

Describes the spatial position of a visual widget inside a video. It is a union of various position types, out of which only will be set one.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cornerPosition** | [**CornerPositionEnum**](#CornerPositionEnum) | Describes in which corner of the video the visual widget will appear. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Defines the position type. |  [optional]



## Enum: CornerPositionEnum

Name | Value
---- | -----
TOPLEFT | &quot;topLeft&quot;
TOPRIGHT | &quot;topRight&quot;
BOTTOMLEFT | &quot;bottomLeft&quot;
BOTTOMRIGHT | &quot;bottomRight&quot;



## Enum: TypeEnum

Name | Value
---- | -----
CORNER | &quot;corner&quot;



