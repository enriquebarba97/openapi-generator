package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about an audio stream.
 */
@ApiModel(description = "Information about an audio stream.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoFileDetailsAudioStream   {
  @JsonProperty("bitrateBps")
  private String bitrateBps;

  @JsonProperty("channelCount")
  private Integer channelCount;

  @JsonProperty("codec")
  private String codec;

  @JsonProperty("vendor")
  private String vendor;

  public VideoFileDetailsAudioStream bitrateBps(String bitrateBps) {
    this.bitrateBps = bitrateBps;
    return this;
  }

  /**
   * The audio stream's bitrate, in bits per second.
   * @return bitrateBps
  */
  @ApiModelProperty(value = "The audio stream's bitrate, in bits per second.")


  public String getBitrateBps() {
    return bitrateBps;
  }

  public void setBitrateBps(String bitrateBps) {
    this.bitrateBps = bitrateBps;
  }

  public VideoFileDetailsAudioStream channelCount(Integer channelCount) {
    this.channelCount = channelCount;
    return this;
  }

  /**
   * The number of audio channels that the stream contains.
   * @return channelCount
  */
  @ApiModelProperty(value = "The number of audio channels that the stream contains.")


  public Integer getChannelCount() {
    return channelCount;
  }

  public void setChannelCount(Integer channelCount) {
    this.channelCount = channelCount;
  }

  public VideoFileDetailsAudioStream codec(String codec) {
    this.codec = codec;
    return this;
  }

  /**
   * The audio codec that the stream uses.
   * @return codec
  */
  @ApiModelProperty(value = "The audio codec that the stream uses.")


  public String getCodec() {
    return codec;
  }

  public void setCodec(String codec) {
    this.codec = codec;
  }

  public VideoFileDetailsAudioStream vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
   * @return vendor
  */
  @ApiModelProperty(value = "A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.")


  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoFileDetailsAudioStream videoFileDetailsAudioStream = (VideoFileDetailsAudioStream) o;
    return Objects.equals(this.bitrateBps, videoFileDetailsAudioStream.bitrateBps) &&
        Objects.equals(this.channelCount, videoFileDetailsAudioStream.channelCount) &&
        Objects.equals(this.codec, videoFileDetailsAudioStream.codec) &&
        Objects.equals(this.vendor, videoFileDetailsAudioStream.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitrateBps, channelCount, codec, vendor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoFileDetailsAudioStream {\n");
    
    sb.append("    bitrateBps: ").append(toIndentedString(bitrateBps)).append("\n");
    sb.append("    channelCount: ").append(toIndentedString(channelCount)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

