package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InvideoPosition;
import org.openapitools.model.InvideoTiming;

/**
 * LINT.IfChange Describes an invideo branding.
 */
@ApiModel(description = "LINT.IfChange Describes an invideo branding.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class InvideoBranding   {
  @JsonProperty("imageBytes")
  private byte[] imageBytes;

  @JsonProperty("imageUrl")
  private String imageUrl;

  @JsonProperty("position")
  private InvideoPosition position;

  @JsonProperty("targetChannelId")
  private String targetChannelId;

  @JsonProperty("timing")
  private InvideoTiming timing;

  public InvideoBranding imageBytes(byte[] imageBytes) {
    this.imageBytes = imageBytes;
    return this;
  }

   /**
   * The bytes the uploaded image. Only used in api to youtube communication.
   * @return imageBytes
  **/
  @ApiModelProperty(value = "The bytes the uploaded image. Only used in api to youtube communication.")
  public byte[] getImageBytes() {
    return imageBytes;
  }

  public void setImageBytes(byte[] imageBytes) {
    this.imageBytes = imageBytes;
  }

  public InvideoBranding imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The url of the uploaded image. Only used in apiary to api communication.
   * @return imageUrl
  **/
  @ApiModelProperty(value = "The url of the uploaded image. Only used in apiary to api communication.")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public InvideoBranding position(InvideoPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public InvideoPosition getPosition() {
    return position;
  }

  public void setPosition(InvideoPosition position) {
    this.position = position;
  }

  public InvideoBranding targetChannelId(String targetChannelId) {
    this.targetChannelId = targetChannelId;
    return this;
  }

   /**
   * The channel to which this branding links. If not present it defaults to the current channel.
   * @return targetChannelId
  **/
  @ApiModelProperty(value = "The channel to which this branding links. If not present it defaults to the current channel.")
  public String getTargetChannelId() {
    return targetChannelId;
  }

  public void setTargetChannelId(String targetChannelId) {
    this.targetChannelId = targetChannelId;
  }

  public InvideoBranding timing(InvideoTiming timing) {
    this.timing = timing;
    return this;
  }

   /**
   * Get timing
   * @return timing
  **/
  @ApiModelProperty(value = "")
  public InvideoTiming getTiming() {
    return timing;
  }

  public void setTiming(InvideoTiming timing) {
    this.timing = timing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvideoBranding invideoBranding = (InvideoBranding) o;
    return Objects.equals(this.imageBytes, invideoBranding.imageBytes) &&
        Objects.equals(this.imageUrl, invideoBranding.imageUrl) &&
        Objects.equals(this.position, invideoBranding.position) &&
        Objects.equals(this.targetChannelId, invideoBranding.targetChannelId) &&
        Objects.equals(this.timing, invideoBranding.timing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageBytes, imageUrl, position, targetChannelId, timing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvideoBranding {\n");
    
    sb.append("    imageBytes: ").append(toIndentedString(imageBytes)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    targetChannelId: ").append(toIndentedString(targetChannelId)).append("\n");
    sb.append("    timing: ").append(toIndentedString(timing)).append("\n");
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

