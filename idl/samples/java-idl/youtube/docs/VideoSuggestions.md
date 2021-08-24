

# VideoSuggestions

Specifies suggestions on how to improve video content, including encoding hints, tag suggestions, and editor suggestions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**editorSuggestions** | [**List&lt;EditorSuggestionsEnum&gt;**](#List&lt;EditorSuggestionsEnum&gt;) | A list of video editing operations that might improve the video quality or playback experience of the uploaded video. |  [optional]
**processingErrors** | [**List&lt;ProcessingErrorsEnum&gt;**](#List&lt;ProcessingErrorsEnum&gt;) | A list of errors that will prevent YouTube from successfully processing the uploaded video video. These errors indicate that, regardless of the video&#39;s current processing status, eventually, that status will almost certainly be failed. |  [optional]
**processingHints** | [**List&lt;ProcessingHintsEnum&gt;**](#List&lt;ProcessingHintsEnum&gt;) | A list of suggestions that may improve YouTube&#39;s ability to process the video. |  [optional]
**processingWarnings** | [**List&lt;ProcessingWarningsEnum&gt;**](#List&lt;ProcessingWarningsEnum&gt;) | A list of reasons why YouTube may have difficulty transcoding the uploaded video or that might result in an erroneous transcoding. These warnings are generated before YouTube actually processes the uploaded video file. In addition, they identify issues that are unlikely to cause the video processing to fail but that might cause problems such as sync issues, video artifacts, or a missing audio track. |  [optional]
**tagSuggestions** | [**List&lt;VideoSuggestionsTagSuggestion&gt;**](VideoSuggestionsTagSuggestion.md) | A list of keyword tags that could be added to the video&#39;s metadata to increase the likelihood that users will locate your video when searching or browsing on YouTube. |  [optional]



## Enum: List&lt;EditorSuggestionsEnum&gt;

Name | Value
---- | -----
VIDEOAUTOLEVELS | &quot;videoAutoLevels&quot;
VIDEOSTABILIZE | &quot;videoStabilize&quot;
VIDEOCROP | &quot;videoCrop&quot;
AUDIOQUIETAUDIOSWAP | &quot;audioQuietAudioSwap&quot;



## Enum: List&lt;ProcessingErrorsEnum&gt;

Name | Value
---- | -----
AUDIOFILE | &quot;audioFile&quot;
IMAGEFILE | &quot;imageFile&quot;
PROJECTFILE | &quot;projectFile&quot;
NOTAVIDEOFILE | &quot;notAVideoFile&quot;
DOCFILE | &quot;docFile&quot;
ARCHIVEFILE | &quot;archiveFile&quot;
UNSUPPORTEDSPATIALAUDIOLAYOUT | &quot;unsupportedSpatialAudioLayout&quot;



## Enum: List&lt;ProcessingHintsEnum&gt;

Name | Value
---- | -----
NONSTREAMABLEMOV | &quot;nonStreamableMov&quot;
SENDBESTQUALITYVIDEO | &quot;sendBestQualityVideo&quot;
SPHERICALVIDEO | &quot;sphericalVideo&quot;
SPATIALAUDIO | &quot;spatialAudio&quot;
VRVIDEO | &quot;vrVideo&quot;
HDRVIDEO | &quot;hdrVideo&quot;



## Enum: List&lt;ProcessingWarningsEnum&gt;

Name | Value
---- | -----
UNKNOWNCONTAINER | &quot;unknownContainer&quot;
UNKNOWNVIDEOCODEC | &quot;unknownVideoCodec&quot;
UNKNOWNAUDIOCODEC | &quot;unknownAudioCodec&quot;
INCONSISTENTRESOLUTION | &quot;inconsistentResolution&quot;
HASEDITLIST | &quot;hasEditlist&quot;
PROBLEMATICVIDEOCODEC | &quot;problematicVideoCodec&quot;
PROBLEMATICAUDIOCODEC | &quot;problematicAudioCodec&quot;
UNSUPPORTEDVRSTEREOMODE | &quot;unsupportedVrStereoMode&quot;
UNSUPPORTEDSPHERICALPROJECTIONTYPE | &quot;unsupportedSphericalProjectionType&quot;
UNSUPPORTEDHDRPIXELFORMAT | &quot;unsupportedHdrPixelFormat&quot;
UNSUPPORTEDHDRCOLORMETADATA | &quot;unsupportedHdrColorMetadata&quot;
PROBLEMATICHDRLOOKUPTABLE | &quot;problematicHdrLookupTable&quot;



