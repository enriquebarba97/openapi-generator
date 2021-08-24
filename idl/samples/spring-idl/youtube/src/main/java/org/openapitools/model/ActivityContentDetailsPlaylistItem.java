package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResourceId;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about a new playlist item.
 */
@ApiModel(description = "Information about a new playlist item.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ActivityContentDetailsPlaylistItem   {
  @JsonProperty("playlistId")
  private String playlistId;

  @JsonProperty("playlistItemId")
  private String playlistItemId;

  @JsonProperty("resourceId")
  private ResourceId resourceId;

  public ActivityContentDetailsPlaylistItem playlistId(String playlistId) {
    this.playlistId = playlistId;
    return this;
  }

  /**
   * The value that YouTube uses to uniquely identify the playlist.
   * @return playlistId
  */
  @ApiModelProperty(value = "The value that YouTube uses to uniquely identify the playlist.")


  public String getPlaylistId() {
    return playlistId;
  }

  public void setPlaylistId(String playlistId) {
    this.playlistId = playlistId;
  }

  public ActivityContentDetailsPlaylistItem playlistItemId(String playlistItemId) {
    this.playlistItemId = playlistItemId;
    return this;
  }

  /**
   * ID of the item within the playlist.
   * @return playlistItemId
  */
  @ApiModelProperty(value = "ID of the item within the playlist.")


  public String getPlaylistItemId() {
    return playlistItemId;
  }

  public void setPlaylistItemId(String playlistItemId) {
    this.playlistItemId = playlistItemId;
  }

  public ActivityContentDetailsPlaylistItem resourceId(ResourceId resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResourceId getResourceId() {
    return resourceId;
  }

  public void setResourceId(ResourceId resourceId) {
    this.resourceId = resourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityContentDetailsPlaylistItem activityContentDetailsPlaylistItem = (ActivityContentDetailsPlaylistItem) o;
    return Objects.equals(this.playlistId, activityContentDetailsPlaylistItem.playlistId) &&
        Objects.equals(this.playlistItemId, activityContentDetailsPlaylistItem.playlistItemId) &&
        Objects.equals(this.resourceId, activityContentDetailsPlaylistItem.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playlistId, playlistItemId, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityContentDetailsPlaylistItem {\n");
    
    sb.append("    playlistId: ").append(toIndentedString(playlistId)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

