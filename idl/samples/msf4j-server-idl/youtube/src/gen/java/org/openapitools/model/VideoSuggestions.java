package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.VideoSuggestionsTagSuggestion;

/**
 * Specifies suggestions on how to improve video content, including encoding hints, tag suggestions, and editor suggestions.
 */
@ApiModel(description = "Specifies suggestions on how to improve video content, including encoding hints, tag suggestions, and editor suggestions.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class VideoSuggestions   {
  /**
   * Gets or Sets editorSuggestions
   */
  public enum EditorSuggestionsEnum {
    VIDEOAUTOLEVELS("videoAutoLevels"),
    
    VIDEOSTABILIZE("videoStabilize"),
    
    VIDEOCROP("videoCrop"),
    
    AUDIOQUIETAUDIOSWAP("audioQuietAudioSwap");

    private String value;

    EditorSuggestionsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EditorSuggestionsEnum fromValue(String text) {
      for (EditorSuggestionsEnum b : EditorSuggestionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }
 
  @JsonProperty("editorSuggestions")
  private List<EditorSuggestionsEnum> editorSuggestions = null;

  /**
   * Gets or Sets processingErrors
   */
  public enum ProcessingErrorsEnum {
    AUDIOFILE("audioFile"),
    
    IMAGEFILE("imageFile"),
    
    PROJECTFILE("projectFile"),
    
    NOTAVIDEOFILE("notAVideoFile"),
    
    DOCFILE("docFile"),
    
    ARCHIVEFILE("archiveFile"),
    
    UNSUPPORTEDSPATIALAUDIOLAYOUT("unsupportedSpatialAudioLayout");

    private String value;

    ProcessingErrorsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProcessingErrorsEnum fromValue(String text) {
      for (ProcessingErrorsEnum b : ProcessingErrorsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }
 
  @JsonProperty("processingErrors")
  private List<ProcessingErrorsEnum> processingErrors = null;

  /**
   * Gets or Sets processingHints
   */
  public enum ProcessingHintsEnum {
    NONSTREAMABLEMOV("nonStreamableMov"),
    
    SENDBESTQUALITYVIDEO("sendBestQualityVideo"),
    
    SPHERICALVIDEO("sphericalVideo"),
    
    SPATIALAUDIO("spatialAudio"),
    
    VRVIDEO("vrVideo"),
    
    HDRVIDEO("hdrVideo");

    private String value;

    ProcessingHintsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProcessingHintsEnum fromValue(String text) {
      for (ProcessingHintsEnum b : ProcessingHintsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }
 
  @JsonProperty("processingHints")
  private List<ProcessingHintsEnum> processingHints = null;

  /**
   * Gets or Sets processingWarnings
   */
  public enum ProcessingWarningsEnum {
    UNKNOWNCONTAINER("unknownContainer"),
    
    UNKNOWNVIDEOCODEC("unknownVideoCodec"),
    
    UNKNOWNAUDIOCODEC("unknownAudioCodec"),
    
    INCONSISTENTRESOLUTION("inconsistentResolution"),
    
    HASEDITLIST("hasEditlist"),
    
    PROBLEMATICVIDEOCODEC("problematicVideoCodec"),
    
    PROBLEMATICAUDIOCODEC("problematicAudioCodec"),
    
    UNSUPPORTEDVRSTEREOMODE("unsupportedVrStereoMode"),
    
    UNSUPPORTEDSPHERICALPROJECTIONTYPE("unsupportedSphericalProjectionType"),
    
    UNSUPPORTEDHDRPIXELFORMAT("unsupportedHdrPixelFormat"),
    
    UNSUPPORTEDHDRCOLORMETADATA("unsupportedHdrColorMetadata"),
    
    PROBLEMATICHDRLOOKUPTABLE("problematicHdrLookupTable");

    private String value;

    ProcessingWarningsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProcessingWarningsEnum fromValue(String text) {
      for (ProcessingWarningsEnum b : ProcessingWarningsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }
 
  @JsonProperty("processingWarnings")
  private List<ProcessingWarningsEnum> processingWarnings = null;

  @JsonProperty("tagSuggestions")
  private List<VideoSuggestionsTagSuggestion> tagSuggestions = null;

  public VideoSuggestions editorSuggestions(List<EditorSuggestionsEnum> editorSuggestions) {
    this.editorSuggestions = editorSuggestions;
    return this;
  }

  public VideoSuggestions addEditorSuggestionsItem(EditorSuggestionsEnum editorSuggestionsItem) {
    if (this.editorSuggestions == null) {
      this.editorSuggestions = new ArrayList<EditorSuggestionsEnum>();
    }
    this.editorSuggestions.add(editorSuggestionsItem);
    return this;
  }

   /**
   * A list of video editing operations that might improve the video quality or playback experience of the uploaded video.
   * @return editorSuggestions
  **/
  @ApiModelProperty(value = "A list of video editing operations that might improve the video quality or playback experience of the uploaded video.")
  public List<EditorSuggestionsEnum> getEditorSuggestions() {
    return editorSuggestions;
  }

  public void setEditorSuggestions(List<EditorSuggestionsEnum> editorSuggestions) {
    this.editorSuggestions = editorSuggestions;
  }

  public VideoSuggestions processingErrors(List<ProcessingErrorsEnum> processingErrors) {
    this.processingErrors = processingErrors;
    return this;
  }

  public VideoSuggestions addProcessingErrorsItem(ProcessingErrorsEnum processingErrorsItem) {
    if (this.processingErrors == null) {
      this.processingErrors = new ArrayList<ProcessingErrorsEnum>();
    }
    this.processingErrors.add(processingErrorsItem);
    return this;
  }

   /**
   * A list of errors that will prevent YouTube from successfully processing the uploaded video video. These errors indicate that, regardless of the video's current processing status, eventually, that status will almost certainly be failed.
   * @return processingErrors
  **/
  @ApiModelProperty(value = "A list of errors that will prevent YouTube from successfully processing the uploaded video video. These errors indicate that, regardless of the video's current processing status, eventually, that status will almost certainly be failed.")
  public List<ProcessingErrorsEnum> getProcessingErrors() {
    return processingErrors;
  }

  public void setProcessingErrors(List<ProcessingErrorsEnum> processingErrors) {
    this.processingErrors = processingErrors;
  }

  public VideoSuggestions processingHints(List<ProcessingHintsEnum> processingHints) {
    this.processingHints = processingHints;
    return this;
  }

  public VideoSuggestions addProcessingHintsItem(ProcessingHintsEnum processingHintsItem) {
    if (this.processingHints == null) {
      this.processingHints = new ArrayList<ProcessingHintsEnum>();
    }
    this.processingHints.add(processingHintsItem);
    return this;
  }

   /**
   * A list of suggestions that may improve YouTube's ability to process the video.
   * @return processingHints
  **/
  @ApiModelProperty(value = "A list of suggestions that may improve YouTube's ability to process the video.")
  public List<ProcessingHintsEnum> getProcessingHints() {
    return processingHints;
  }

  public void setProcessingHints(List<ProcessingHintsEnum> processingHints) {
    this.processingHints = processingHints;
  }

  public VideoSuggestions processingWarnings(List<ProcessingWarningsEnum> processingWarnings) {
    this.processingWarnings = processingWarnings;
    return this;
  }

  public VideoSuggestions addProcessingWarningsItem(ProcessingWarningsEnum processingWarningsItem) {
    if (this.processingWarnings == null) {
      this.processingWarnings = new ArrayList<ProcessingWarningsEnum>();
    }
    this.processingWarnings.add(processingWarningsItem);
    return this;
  }

   /**
   * A list of reasons why YouTube may have difficulty transcoding the uploaded video or that might result in an erroneous transcoding. These warnings are generated before YouTube actually processes the uploaded video file. In addition, they identify issues that are unlikely to cause the video processing to fail but that might cause problems such as sync issues, video artifacts, or a missing audio track.
   * @return processingWarnings
  **/
  @ApiModelProperty(value = "A list of reasons why YouTube may have difficulty transcoding the uploaded video or that might result in an erroneous transcoding. These warnings are generated before YouTube actually processes the uploaded video file. In addition, they identify issues that are unlikely to cause the video processing to fail but that might cause problems such as sync issues, video artifacts, or a missing audio track.")
  public List<ProcessingWarningsEnum> getProcessingWarnings() {
    return processingWarnings;
  }

  public void setProcessingWarnings(List<ProcessingWarningsEnum> processingWarnings) {
    this.processingWarnings = processingWarnings;
  }

  public VideoSuggestions tagSuggestions(List<VideoSuggestionsTagSuggestion> tagSuggestions) {
    this.tagSuggestions = tagSuggestions;
    return this;
  }

  public VideoSuggestions addTagSuggestionsItem(VideoSuggestionsTagSuggestion tagSuggestionsItem) {
    if (this.tagSuggestions == null) {
      this.tagSuggestions = new ArrayList<VideoSuggestionsTagSuggestion>();
    }
    this.tagSuggestions.add(tagSuggestionsItem);
    return this;
  }

   /**
   * A list of keyword tags that could be added to the video's metadata to increase the likelihood that users will locate your video when searching or browsing on YouTube.
   * @return tagSuggestions
  **/
  @ApiModelProperty(value = "A list of keyword tags that could be added to the video's metadata to increase the likelihood that users will locate your video when searching or browsing on YouTube.")
  public List<VideoSuggestionsTagSuggestion> getTagSuggestions() {
    return tagSuggestions;
  }

  public void setTagSuggestions(List<VideoSuggestionsTagSuggestion> tagSuggestions) {
    this.tagSuggestions = tagSuggestions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoSuggestions videoSuggestions = (VideoSuggestions) o;
    return Objects.equals(this.editorSuggestions, videoSuggestions.editorSuggestions) &&
        Objects.equals(this.processingErrors, videoSuggestions.processingErrors) &&
        Objects.equals(this.processingHints, videoSuggestions.processingHints) &&
        Objects.equals(this.processingWarnings, videoSuggestions.processingWarnings) &&
        Objects.equals(this.tagSuggestions, videoSuggestions.tagSuggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editorSuggestions, processingErrors, processingHints, processingWarnings, tagSuggestions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoSuggestions {\n");
    
    sb.append("    editorSuggestions: ").append(toIndentedString(editorSuggestions)).append("\n");
    sb.append("    processingErrors: ").append(toIndentedString(processingErrors)).append("\n");
    sb.append("    processingHints: ").append(toIndentedString(processingHints)).append("\n");
    sb.append("    processingWarnings: ").append(toIndentedString(processingWarnings)).append("\n");
    sb.append("    tagSuggestions: ").append(toIndentedString(tagSuggestions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

