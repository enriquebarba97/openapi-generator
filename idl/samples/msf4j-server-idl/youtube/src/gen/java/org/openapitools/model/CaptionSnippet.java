package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Basic details about a caption track, such as its language and name.
 */
@ApiModel(description = "Basic details about a caption track, such as its language and name.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class CaptionSnippet   {
  /**
   * The type of audio track associated with the caption track.
   */
  public enum AudioTrackTypeEnum {
    UNKNOWN("unknown"),
    
    PRIMARY("primary"),
    
    COMMENTARY("commentary"),
    
    DESCRIPTIVE("descriptive");

    private String value;

    AudioTrackTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AudioTrackTypeEnum fromValue(String text) {
      for (AudioTrackTypeEnum b : AudioTrackTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("audioTrackType")
  private AudioTrackTypeEnum audioTrackType;

  /**
   * The reason that YouTube failed to process the caption track. This property is only present if the state property's value is failed.
   */
  public enum FailureReasonEnum {
    UNKNOWNFORMAT("unknownFormat"),
    
    UNSUPPORTEDFORMAT("unsupportedFormat"),
    
    PROCESSINGFAILED("processingFailed");

    private String value;

    FailureReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FailureReasonEnum fromValue(String text) {
      for (FailureReasonEnum b : FailureReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("failureReason")
  private FailureReasonEnum failureReason;

  @JsonProperty("isAutoSynced")
  private Boolean isAutoSynced;

  @JsonProperty("isCC")
  private Boolean isCC;

  @JsonProperty("isDraft")
  private Boolean isDraft;

  @JsonProperty("isEasyReader")
  private Boolean isEasyReader;

  @JsonProperty("isLarge")
  private Boolean isLarge;

  @JsonProperty("language")
  private String language;

  @JsonProperty("lastUpdated")
  private Date lastUpdated;

  @JsonProperty("name")
  private String name;

  /**
   * The caption track's status.
   */
  public enum StatusEnum {
    SERVING("serving"),
    
    SYNCING("syncing"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  /**
   * The caption track's type.
   */
  public enum TrackKindEnum {
    STANDARD("standard"),
    
    ASR("ASR"),
    
    FORCED("forced");

    private String value;

    TrackKindEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TrackKindEnum fromValue(String text) {
      for (TrackKindEnum b : TrackKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("trackKind")
  private TrackKindEnum trackKind;

  @JsonProperty("videoId")
  private String videoId;

  public CaptionSnippet audioTrackType(AudioTrackTypeEnum audioTrackType) {
    this.audioTrackType = audioTrackType;
    return this;
  }

   /**
   * The type of audio track associated with the caption track.
   * @return audioTrackType
  **/
  @ApiModelProperty(value = "The type of audio track associated with the caption track.")
  public AudioTrackTypeEnum getAudioTrackType() {
    return audioTrackType;
  }

  public void setAudioTrackType(AudioTrackTypeEnum audioTrackType) {
    this.audioTrackType = audioTrackType;
  }

  public CaptionSnippet failureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * The reason that YouTube failed to process the caption track. This property is only present if the state property's value is failed.
   * @return failureReason
  **/
  @ApiModelProperty(value = "The reason that YouTube failed to process the caption track. This property is only present if the state property's value is failed.")
  public FailureReasonEnum getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
  }

  public CaptionSnippet isAutoSynced(Boolean isAutoSynced) {
    this.isAutoSynced = isAutoSynced;
    return this;
  }

   /**
   * Indicates whether YouTube synchronized the caption track to the audio track in the video. The value will be true if a sync was explicitly requested when the caption track was uploaded. For example, when calling the captions.insert or captions.update methods, you can set the sync parameter to true to instruct YouTube to sync the uploaded track to the video. If the value is false, YouTube uses the time codes in the uploaded caption track to determine when to display captions.
   * @return isAutoSynced
  **/
  @ApiModelProperty(value = "Indicates whether YouTube synchronized the caption track to the audio track in the video. The value will be true if a sync was explicitly requested when the caption track was uploaded. For example, when calling the captions.insert or captions.update methods, you can set the sync parameter to true to instruct YouTube to sync the uploaded track to the video. If the value is false, YouTube uses the time codes in the uploaded caption track to determine when to display captions.")
  public Boolean getIsAutoSynced() {
    return isAutoSynced;
  }

  public void setIsAutoSynced(Boolean isAutoSynced) {
    this.isAutoSynced = isAutoSynced;
  }

  public CaptionSnippet isCC(Boolean isCC) {
    this.isCC = isCC;
    return this;
  }

   /**
   * Indicates whether the track contains closed captions for the deaf and hard of hearing. The default value is false.
   * @return isCC
  **/
  @ApiModelProperty(value = "Indicates whether the track contains closed captions for the deaf and hard of hearing. The default value is false.")
  public Boolean getIsCC() {
    return isCC;
  }

  public void setIsCC(Boolean isCC) {
    this.isCC = isCC;
  }

  public CaptionSnippet isDraft(Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

   /**
   * Indicates whether the caption track is a draft. If the value is true, then the track is not publicly visible. The default value is false. @mutable youtube.captions.insert youtube.captions.update
   * @return isDraft
  **/
  @ApiModelProperty(value = "Indicates whether the caption track is a draft. If the value is true, then the track is not publicly visible. The default value is false. @mutable youtube.captions.insert youtube.captions.update")
  public Boolean getIsDraft() {
    return isDraft;
  }

  public void setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
  }

  public CaptionSnippet isEasyReader(Boolean isEasyReader) {
    this.isEasyReader = isEasyReader;
    return this;
  }

   /**
   * Indicates whether caption track is formatted for \"easy reader,\" meaning it is at a third-grade level for language learners. The default value is false.
   * @return isEasyReader
  **/
  @ApiModelProperty(value = "Indicates whether caption track is formatted for \"easy reader,\" meaning it is at a third-grade level for language learners. The default value is false.")
  public Boolean getIsEasyReader() {
    return isEasyReader;
  }

  public void setIsEasyReader(Boolean isEasyReader) {
    this.isEasyReader = isEasyReader;
  }

  public CaptionSnippet isLarge(Boolean isLarge) {
    this.isLarge = isLarge;
    return this;
  }

   /**
   * Indicates whether the caption track uses large text for the vision-impaired. The default value is false.
   * @return isLarge
  **/
  @ApiModelProperty(value = "Indicates whether the caption track uses large text for the vision-impaired. The default value is false.")
  public Boolean getIsLarge() {
    return isLarge;
  }

  public void setIsLarge(Boolean isLarge) {
    this.isLarge = isLarge;
  }

  public CaptionSnippet language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language of the caption track. The property value is a BCP-47 language tag.
   * @return language
  **/
  @ApiModelProperty(value = "The language of the caption track. The property value is a BCP-47 language tag.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CaptionSnippet lastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The date and time when the caption track was last updated.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "The date and time when the caption track was last updated.")
  public Date getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public CaptionSnippet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the caption track. The name is intended to be visible to the user as an option during playback.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the caption track. The name is intended to be visible to the user as an option during playback.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CaptionSnippet status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The caption track's status.
   * @return status
  **/
  @ApiModelProperty(value = "The caption track's status.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CaptionSnippet trackKind(TrackKindEnum trackKind) {
    this.trackKind = trackKind;
    return this;
  }

   /**
   * The caption track's type.
   * @return trackKind
  **/
  @ApiModelProperty(value = "The caption track's type.")
  public TrackKindEnum getTrackKind() {
    return trackKind;
  }

  public void setTrackKind(TrackKindEnum trackKind) {
    this.trackKind = trackKind;
  }

  public CaptionSnippet videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the video associated with the caption track. @mutable youtube.captions.insert
   * @return videoId
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the video associated with the caption track. @mutable youtube.captions.insert")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptionSnippet captionSnippet = (CaptionSnippet) o;
    return Objects.equals(this.audioTrackType, captionSnippet.audioTrackType) &&
        Objects.equals(this.failureReason, captionSnippet.failureReason) &&
        Objects.equals(this.isAutoSynced, captionSnippet.isAutoSynced) &&
        Objects.equals(this.isCC, captionSnippet.isCC) &&
        Objects.equals(this.isDraft, captionSnippet.isDraft) &&
        Objects.equals(this.isEasyReader, captionSnippet.isEasyReader) &&
        Objects.equals(this.isLarge, captionSnippet.isLarge) &&
        Objects.equals(this.language, captionSnippet.language) &&
        Objects.equals(this.lastUpdated, captionSnippet.lastUpdated) &&
        Objects.equals(this.name, captionSnippet.name) &&
        Objects.equals(this.status, captionSnippet.status) &&
        Objects.equals(this.trackKind, captionSnippet.trackKind) &&
        Objects.equals(this.videoId, captionSnippet.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioTrackType, failureReason, isAutoSynced, isCC, isDraft, isEasyReader, isLarge, language, lastUpdated, name, status, trackKind, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptionSnippet {\n");
    
    sb.append("    audioTrackType: ").append(toIndentedString(audioTrackType)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    isAutoSynced: ").append(toIndentedString(isAutoSynced)).append("\n");
    sb.append("    isCC: ").append(toIndentedString(isCC)).append("\n");
    sb.append("    isDraft: ").append(toIndentedString(isDraft)).append("\n");
    sb.append("    isEasyReader: ").append(toIndentedString(isEasyReader)).append("\n");
    sb.append("    isLarge: ").append(toIndentedString(isLarge)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackKind: ").append(toIndentedString(trackKind)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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

