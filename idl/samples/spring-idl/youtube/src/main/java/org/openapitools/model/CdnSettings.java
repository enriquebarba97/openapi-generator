package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.IngestionInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Brief description of the live stream cdn settings.
 */
@ApiModel(description = "Brief description of the live stream cdn settings.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class CdnSettings   {
  @JsonProperty("format")
  private String format;

  /**
   * The frame rate of the inbound video data.
   */
  public enum FrameRateEnum {
    _30FPS("30fps"),
    
    _60FPS("60fps"),
    
    VARIABLE("variable");

    private String value;

    FrameRateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FrameRateEnum fromValue(String value) {
      for (FrameRateEnum b : FrameRateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("frameRate")
  private FrameRateEnum frameRate;

  @JsonProperty("ingestionInfo")
  private IngestionInfo ingestionInfo;

  /**
   *  The method or protocol used to transmit the video stream.
   */
  public enum IngestionTypeEnum {
    RTMP("rtmp"),
    
    DASH("dash"),
    
    WEBRTC("webrtc"),
    
    HLS("hls");

    private String value;

    IngestionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IngestionTypeEnum fromValue(String value) {
      for (IngestionTypeEnum b : IngestionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ingestionType")
  private IngestionTypeEnum ingestionType;

  /**
   * The resolution of the inbound video data.
   */
  public enum ResolutionEnum {
    _240P("240p"),
    
    _360P("360p"),
    
    _480P("480p"),
    
    _720P("720p"),
    
    _1080P("1080p"),
    
    _1440P("1440p"),
    
    _2160P("2160p"),
    
    VARIABLE("variable");

    private String value;

    ResolutionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResolutionEnum fromValue(String value) {
      for (ResolutionEnum b : ResolutionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("resolution")
  private ResolutionEnum resolution;

  public CdnSettings format(String format) {
    this.format = format;
    return this;
  }

  /**
   * The format of the video stream that you are sending to Youtube. 
   * @return format
  */
  @ApiModelProperty(value = "The format of the video stream that you are sending to Youtube. ")


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public CdnSettings frameRate(FrameRateEnum frameRate) {
    this.frameRate = frameRate;
    return this;
  }

  /**
   * The frame rate of the inbound video data.
   * @return frameRate
  */
  @ApiModelProperty(value = "The frame rate of the inbound video data.")


  public FrameRateEnum getFrameRate() {
    return frameRate;
  }

  public void setFrameRate(FrameRateEnum frameRate) {
    this.frameRate = frameRate;
  }

  public CdnSettings ingestionInfo(IngestionInfo ingestionInfo) {
    this.ingestionInfo = ingestionInfo;
    return this;
  }

  /**
   * Get ingestionInfo
   * @return ingestionInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public IngestionInfo getIngestionInfo() {
    return ingestionInfo;
  }

  public void setIngestionInfo(IngestionInfo ingestionInfo) {
    this.ingestionInfo = ingestionInfo;
  }

  public CdnSettings ingestionType(IngestionTypeEnum ingestionType) {
    this.ingestionType = ingestionType;
    return this;
  }

  /**
   *  The method or protocol used to transmit the video stream.
   * @return ingestionType
  */
  @ApiModelProperty(value = " The method or protocol used to transmit the video stream.")


  public IngestionTypeEnum getIngestionType() {
    return ingestionType;
  }

  public void setIngestionType(IngestionTypeEnum ingestionType) {
    this.ingestionType = ingestionType;
  }

  public CdnSettings resolution(ResolutionEnum resolution) {
    this.resolution = resolution;
    return this;
  }

  /**
   * The resolution of the inbound video data.
   * @return resolution
  */
  @ApiModelProperty(value = "The resolution of the inbound video data.")


  public ResolutionEnum getResolution() {
    return resolution;
  }

  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdnSettings cdnSettings = (CdnSettings) o;
    return Objects.equals(this.format, cdnSettings.format) &&
        Objects.equals(this.frameRate, cdnSettings.frameRate) &&
        Objects.equals(this.ingestionInfo, cdnSettings.ingestionInfo) &&
        Objects.equals(this.ingestionType, cdnSettings.ingestionType) &&
        Objects.equals(this.resolution, cdnSettings.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, frameRate, ingestionInfo, ingestionType, resolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdnSettings {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
    sb.append("    ingestionInfo: ").append(toIndentedString(ingestionInfo)).append("\n");
    sb.append("    ingestionType: ").append(toIndentedString(ingestionType)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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

