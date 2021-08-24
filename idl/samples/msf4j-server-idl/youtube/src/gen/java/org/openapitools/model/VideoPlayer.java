package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Player to be used for a video playback.
 */
@ApiModel(description = "Player to be used for a video playback.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class VideoPlayer   {
  @JsonProperty("embedHeight")
  private String embedHeight;

  @JsonProperty("embedHtml")
  private String embedHtml;

  @JsonProperty("embedWidth")
  private String embedWidth;

  public VideoPlayer embedHeight(String embedHeight) {
    this.embedHeight = embedHeight;
    return this;
  }

   /**
   * Get embedHeight
   * @return embedHeight
  **/
  @ApiModelProperty(value = "")
  public String getEmbedHeight() {
    return embedHeight;
  }

  public void setEmbedHeight(String embedHeight) {
    this.embedHeight = embedHeight;
  }

  public VideoPlayer embedHtml(String embedHtml) {
    this.embedHtml = embedHtml;
    return this;
  }

   /**
   * An <iframe> tag that embeds a player that will play the video.
   * @return embedHtml
  **/
  @ApiModelProperty(value = "An <iframe> tag that embeds a player that will play the video.")
  public String getEmbedHtml() {
    return embedHtml;
  }

  public void setEmbedHtml(String embedHtml) {
    this.embedHtml = embedHtml;
  }

  public VideoPlayer embedWidth(String embedWidth) {
    this.embedWidth = embedWidth;
    return this;
  }

   /**
   * The embed width
   * @return embedWidth
  **/
  @ApiModelProperty(value = "The embed width")
  public String getEmbedWidth() {
    return embedWidth;
  }

  public void setEmbedWidth(String embedWidth) {
    this.embedWidth = embedWidth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoPlayer videoPlayer = (VideoPlayer) o;
    return Objects.equals(this.embedHeight, videoPlayer.embedHeight) &&
        Objects.equals(this.embedHtml, videoPlayer.embedHtml) &&
        Objects.equals(this.embedWidth, videoPlayer.embedWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedHeight, embedHtml, embedWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoPlayer {\n");
    
    sb.append("    embedHeight: ").append(toIndentedString(embedHeight)).append("\n");
    sb.append("    embedHtml: ").append(toIndentedString(embedHtml)).append("\n");
    sb.append("    embedWidth: ").append(toIndentedString(embedWidth)).append("\n");
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

