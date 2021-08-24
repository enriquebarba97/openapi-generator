

# LiveStreamConfigurationIssue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The long-form description of the issue and how to resolve it. |  [optional]
**reason** | **String** | The short-form reason for this issue. |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | How severe this issue is to the stream. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The kind of error happening. |  [optional]



## Enum: SeverityEnum

Name | Value
---- | -----
INFO | &quot;info&quot;
WARNING | &quot;warning&quot;
ERROR | &quot;error&quot;



## Enum: TypeEnum

Name | Value
---- | -----
GOPSIZEOVER | &quot;gopSizeOver&quot;
GOPSIZELONG | &quot;gopSizeLong&quot;
GOPSIZESHORT | &quot;gopSizeShort&quot;
OPENGOP | &quot;openGop&quot;
BADCONTAINER | &quot;badContainer&quot;
AUDIOBITRATEHIGH | &quot;audioBitrateHigh&quot;
AUDIOBITRATELOW | &quot;audioBitrateLow&quot;
AUDIOSAMPLERATE | &quot;audioSampleRate&quot;
BITRATEHIGH | &quot;bitrateHigh&quot;
BITRATELOW | &quot;bitrateLow&quot;
AUDIOCODEC | &quot;audioCodec&quot;
VIDEOCODEC | &quot;videoCodec&quot;
NOAUDIOSTREAM | &quot;noAudioStream&quot;
NOVIDEOSTREAM | &quot;noVideoStream&quot;
MULTIPLEVIDEOSTREAMS | &quot;multipleVideoStreams&quot;
MULTIPLEAUDIOSTREAMS | &quot;multipleAudioStreams&quot;
AUDIOTOOMANYCHANNELS | &quot;audioTooManyChannels&quot;
INTERLACEDVIDEO | &quot;interlacedVideo&quot;
FRAMERATEHIGH | &quot;frameRateHigh&quot;
RESOLUTIONMISMATCH | &quot;resolutionMismatch&quot;
VIDEOCODECMISMATCH | &quot;videoCodecMismatch&quot;
VIDEOINTERLACEMISMATCH | &quot;videoInterlaceMismatch&quot;
VIDEOPROFILEMISMATCH | &quot;videoProfileMismatch&quot;
VIDEOBITRATEMISMATCH | &quot;videoBitrateMismatch&quot;
FRAMERATEMISMATCH | &quot;framerateMismatch&quot;
GOPMISMATCH | &quot;gopMismatch&quot;
AUDIOSAMPLERATEMISMATCH | &quot;audioSampleRateMismatch&quot;
AUDIOSTEREOMISMATCH | &quot;audioStereoMismatch&quot;
AUDIOCODECMISMATCH | &quot;audioCodecMismatch&quot;
AUDIOBITRATEMISMATCH | &quot;audioBitrateMismatch&quot;
VIDEORESOLUTIONSUBOPTIMAL | &quot;videoResolutionSuboptimal&quot;
VIDEORESOLUTIONUNSUPPORTED | &quot;videoResolutionUnsupported&quot;
VIDEOINGESTIONSTARVED | &quot;videoIngestionStarved&quot;
VIDEOINGESTIONFASTERTHANREALTIME | &quot;videoIngestionFasterThanRealtime&quot;



