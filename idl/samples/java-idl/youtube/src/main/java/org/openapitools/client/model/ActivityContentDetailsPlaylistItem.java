/*
 * YouTube Data API v3
 * The YouTube Data API v3 is an API that provides access to YouTube data, such as videos, playlists, and channels.
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.ResourceId;

/**
 * Information about a new playlist item.
 */
@ApiModel(description = "Information about a new playlist item.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaIDLCodegen", date = "2021-08-24T20:55:04.712703200+02:00[Europe/Paris]")
public class ActivityContentDetailsPlaylistItem {
  public static final String SERIALIZED_NAME_PLAYLIST_ID = "playlistId";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_ID)
  private String playlistId;

  public static final String SERIALIZED_NAME_PLAYLIST_ITEM_ID = "playlistItemId";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_ITEM_ID)
  private String playlistItemId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private ResourceId resourceId;


  public ActivityContentDetailsPlaylistItem playlistId(String playlistId) {
    
    this.playlistId = playlistId;
    return this;
  }

   /**
   * The value that YouTube uses to uniquely identify the playlist.
   * @return playlistId
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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

