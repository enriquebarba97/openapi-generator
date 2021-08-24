package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Information about a video stream.
 */
@ApiModel(description = "Information about a video stream.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class VideoFileDetailsVideoStream   {
  @JsonProperty("aspectRatio")
  private Double aspectRatio;

  @JsonProperty("bitrateBps")
  private String bitrateBps;

  @JsonProperty("codec")
  private String codec;

  @JsonProperty("frameRateFps")
  private Double frameRateFps;

  @JsonProperty("heightPixels")
  private Integer heightPixels;

  /**
   * The amount that YouTube needs to rotate the original source content to properly display the video.
   */
  public enum RotationEnum {
    NONE("none"),
    
    CLOCKWISE("clockwise"),
    
    UPSIDEDOWN("upsideDown"),
    
    COUNTERCLOCKWISE("counterClockwise"),
    
    OTHER("other");

    private String value;

    RotationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RotationEnum fromValue(String text) {
      for (RotationEnum b : RotationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("rotation")
  private RotationEnum rotation;

  @JsonProperty("vendor")
  private String vendor;

  @JsonProperty("widthPixels")
  private Integer widthPixels;

  public VideoFileDetailsVideoStream aspectRatio(Double aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * The video content's display aspect ratio, which specifies the aspect ratio in which the video should be displayed.
   * @return aspectRatio
  **/
  @ApiModelProperty(value = "The video content's display aspect ratio, which specifies the aspect ratio in which the video should be displayed.")
  public Double getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(Double aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public VideoFileDetailsVideoStream bitrateBps(String bitrateBps) {
    this.bitrateBps = bitrateBps;
    return this;
  }

   /**
   * The video stream's bitrate, in bits per second.
   * @return bitrateBps
  **/
  @ApiModelProperty(value = "The video stream's bitrate, in bits per second.")
  public String getBitrateBps() {
    return bitrateBps;
  }

  public void setBitrateBps(String bitrateBps) {
    this.bitrateBps = bitrateBps;
  }

  public VideoFileDetailsVideoStream codec(String codec) {
    this.codec = codec;
    return this;
  }

   /**
   * The video codec that the stream uses.
   * @return codec
  **/
  @ApiModelProperty(value = "The video codec that the stream uses.")
  public String getCodec() {
    return codec;
  }

  public void setCodec(String codec) {
    this.codec = codec;
  }

  public VideoFileDetailsVideoStream frameRateFps(Double frameRateFps) {
    this.frameRateFps = frameRateFps;
    return this;
  }

   /**
   * The video stream's frame rate, in frames per second.
   * @return frameRateFps
  **/
  @ApiModelProperty(value = "The video stream's frame rate, in frames per second.")
  public Double getFrameRateFps() {
    return frameRateFps;
  }

  public void setFrameRateFps(Double frameRateFps) {
    this.frameRateFps = frameRateFps;
  }

  public VideoFileDetailsVideoStream heightPixels(Integer heightPixels) {
    this.heightPixels = heightPixels;
    return this;
  }

   /**
   * The encoded video content's height in pixels.
   * @return heightPixels
  **/
  @ApiModelProperty(value = "The encoded video content's height in pixels.")
  public Integer getHeightPixels() {
    return heightPixels;
  }

  public void setHeightPixels(Integer heightPixels) {
    this.heightPixels = heightPixels;
  }

  public VideoFileDetailsVideoStream rotation(RotationEnum rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * The amount that YouTube needs to rotate the original source content to properly display the video.
   * @return rotation
  **/
  @ApiModelProperty(value = "The amount that YouTube needs to rotate the original source content to properly display the video.")
  public RotationEnum getRotation() {
    return rotation;
  }

  public void setRotation(RotationEnum rotation) {
    this.rotation = rotation;
  }

  public VideoFileDetailsVideoStream vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
   * @return vendor
  **/
  @ApiModelProperty(value = "A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public VideoFileDetailsVideoStream widthPixels(Integer widthPixels) {
    this.widthPixels = widthPixels;
    return this;
  }

   /**
   * The encoded video content's width in pixels. You can calculate the video's encoding aspect ratio as width_pixels / height_pixels.
   * @return widthPixels
  **/
  @ApiModelProperty(value = "The encoded video content's width in pixels. You can calculate the video's encoding aspect ratio as width_pixels / height_pixels.")
  public Integer getWidthPixels() {
    return widthPixels;
  }

  public void setWidthPixels(Integer widthPixels) {
    this.widthPixels = widthPixels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoFileDetailsVideoStream videoFileDetailsVideoStream = (VideoFileDetailsVideoStream) o;
    return Objects.equals(this.aspectRatio, videoFileDetailsVideoStream.aspectRatio) &&
        Objects.equals(this.bitrateBps, videoFileDetailsVideoStream.bitrateBps) &&
        Objects.equals(this.codec, videoFileDetailsVideoStream.codec) &&
        Objects.equals(this.frameRateFps, videoFileDetailsVideoStream.frameRateFps) &&
        Objects.equals(this.heightPixels, videoFileDetailsVideoStream.heightPixels) &&
        Objects.equals(this.rotation, videoFileDetailsVideoStream.rotation) &&
        Objects.equals(this.vendor, videoFileDetailsVideoStream.vendor) &&
        Objects.equals(this.widthPixels, videoFileDetailsVideoStream.widthPixels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspectRatio, bitrateBps, codec, frameRateFps, heightPixels, rotation, vendor, widthPixels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoFileDetailsVideoStream {\n");
    
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    bitrateBps: ").append(toIndentedString(bitrateBps)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    frameRateFps: ").append(toIndentedString(frameRateFps)).append("\n");
    sb.append("    heightPixels: ").append(toIndentedString(heightPixels)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    widthPixels: ").append(toIndentedString(widthPixels)).append("\n");
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

