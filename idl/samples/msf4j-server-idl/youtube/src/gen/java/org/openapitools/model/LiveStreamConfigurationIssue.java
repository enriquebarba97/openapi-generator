package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LiveStreamConfigurationIssue
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveStreamConfigurationIssue   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("reason")
  private String reason;

  /**
   * How severe this issue is to the stream.
   */
  public enum SeverityEnum {
    INFO("info"),
    
    WARNING("warning"),
    
    ERROR("error");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("severity")
  private SeverityEnum severity;

  /**
   * The kind of error happening.
   */
  public enum TypeEnum {
    GOPSIZEOVER("gopSizeOver"),
    
    GOPSIZELONG("gopSizeLong"),
    
    GOPSIZESHORT("gopSizeShort"),
    
    OPENGOP("openGop"),
    
    BADCONTAINER("badContainer"),
    
    AUDIOBITRATEHIGH("audioBitrateHigh"),
    
    AUDIOBITRATELOW("audioBitrateLow"),
    
    AUDIOSAMPLERATE("audioSampleRate"),
    
    BITRATEHIGH("bitrateHigh"),
    
    BITRATELOW("bitrateLow"),
    
    AUDIOCODEC("audioCodec"),
    
    VIDEOCODEC("videoCodec"),
    
    NOAUDIOSTREAM("noAudioStream"),
    
    NOVIDEOSTREAM("noVideoStream"),
    
    MULTIPLEVIDEOSTREAMS("multipleVideoStreams"),
    
    MULTIPLEAUDIOSTREAMS("multipleAudioStreams"),
    
    AUDIOTOOMANYCHANNELS("audioTooManyChannels"),
    
    INTERLACEDVIDEO("interlacedVideo"),
    
    FRAMERATEHIGH("frameRateHigh"),
    
    RESOLUTIONMISMATCH("resolutionMismatch"),
    
    VIDEOCODECMISMATCH("videoCodecMismatch"),
    
    VIDEOINTERLACEMISMATCH("videoInterlaceMismatch"),
    
    VIDEOPROFILEMISMATCH("videoProfileMismatch"),
    
    VIDEOBITRATEMISMATCH("videoBitrateMismatch"),
    
    FRAMERATEMISMATCH("framerateMismatch"),
    
    GOPMISMATCH("gopMismatch"),
    
    AUDIOSAMPLERATEMISMATCH("audioSampleRateMismatch"),
    
    AUDIOSTEREOMISMATCH("audioStereoMismatch"),
    
    AUDIOCODECMISMATCH("audioCodecMismatch"),
    
    AUDIOBITRATEMISMATCH("audioBitrateMismatch"),
    
    VIDEORESOLUTIONSUBOPTIMAL("videoResolutionSuboptimal"),
    
    VIDEORESOLUTIONUNSUPPORTED("videoResolutionUnsupported"),
    
    VIDEOINGESTIONSTARVED("videoIngestionStarved"),
    
    VIDEOINGESTIONFASTERTHANREALTIME("videoIngestionFasterThanRealtime");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  public LiveStreamConfigurationIssue description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The long-form description of the issue and how to resolve it.
   * @return description
  **/
  @ApiModelProperty(value = "The long-form description of the issue and how to resolve it.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LiveStreamConfigurationIssue reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The short-form reason for this issue.
   * @return reason
  **/
  @ApiModelProperty(value = "The short-form reason for this issue.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public LiveStreamConfigurationIssue severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * How severe this issue is to the stream.
   * @return severity
  **/
  @ApiModelProperty(value = "How severe this issue is to the stream.")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public LiveStreamConfigurationIssue type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The kind of error happening.
   * @return type
  **/
  @ApiModelProperty(value = "The kind of error happening.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStreamConfigurationIssue liveStreamConfigurationIssue = (LiveStreamConfigurationIssue) o;
    return Objects.equals(this.description, liveStreamConfigurationIssue.description) &&
        Objects.equals(this.reason, liveStreamConfigurationIssue.reason) &&
        Objects.equals(this.severity, liveStreamConfigurationIssue.severity) &&
        Objects.equals(this.type, liveStreamConfigurationIssue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, reason, severity, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamConfigurationIssue {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

