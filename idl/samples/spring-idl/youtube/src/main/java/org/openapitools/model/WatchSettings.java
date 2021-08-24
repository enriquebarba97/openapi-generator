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
 * Branding properties for the watch. All deprecated.
 */
@ApiModel(description = "Branding properties for the watch. All deprecated.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class WatchSettings   {
  @JsonProperty("backgroundColor")
  private String backgroundColor;

  @JsonProperty("featuredPlaylistId")
  private String featuredPlaylistId;

  @JsonProperty("textColor")
  private String textColor;

  public WatchSettings backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * The text color for the video watch page's branded area.
   * @return backgroundColor
  */
  @ApiModelProperty(value = "The text color for the video watch page's branded area.")


  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public WatchSettings featuredPlaylistId(String featuredPlaylistId) {
    this.featuredPlaylistId = featuredPlaylistId;
    return this;
  }

  /**
   * An ID that uniquely identifies a playlist that displays next to the video player.
   * @return featuredPlaylistId
  */
  @ApiModelProperty(value = "An ID that uniquely identifies a playlist that displays next to the video player.")


  public String getFeaturedPlaylistId() {
    return featuredPlaylistId;
  }

  public void setFeaturedPlaylistId(String featuredPlaylistId) {
    this.featuredPlaylistId = featuredPlaylistId;
  }

  public WatchSettings textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }

  /**
   * The background color for the video watch page's branded area.
   * @return textColor
  */
  @ApiModelProperty(value = "The background color for the video watch page's branded area.")


  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchSettings watchSettings = (WatchSettings) o;
    return Objects.equals(this.backgroundColor, watchSettings.backgroundColor) &&
        Objects.equals(this.featuredPlaylistId, watchSettings.featuredPlaylistId) &&
        Objects.equals(this.textColor, watchSettings.textColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, featuredPlaylistId, textColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchSettings {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    featuredPlaylistId: ").append(toIndentedString(featuredPlaylistId)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
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

