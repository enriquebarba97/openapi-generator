package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ChannelContentDetailsRelatedPlaylists
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ChannelContentDetailsRelatedPlaylists   {
  @JsonProperty("favorites")
  private String favorites;

  @JsonProperty("likes")
  private String likes;

  @JsonProperty("uploads")
  private String uploads;

  @JsonProperty("watchHistory")
  private String watchHistory;

  @JsonProperty("watchLater")
  private String watchLater;

  public ChannelContentDetailsRelatedPlaylists favorites(String favorites) {
    this.favorites = favorites;
    return this;
  }

   /**
   * The ID of the playlist that contains the channel\"s favorite videos. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list.
   * @return favorites
  **/
  @ApiModelProperty(value = "The ID of the playlist that contains the channel\"s favorite videos. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list.")
  public String getFavorites() {
    return favorites;
  }

  public void setFavorites(String favorites) {
    this.favorites = favorites;
  }

  public ChannelContentDetailsRelatedPlaylists likes(String likes) {
    this.likes = likes;
    return this;
  }

   /**
   * The ID of the playlist that contains the channel\"s liked videos. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list.
   * @return likes
  **/
  @ApiModelProperty(value = "The ID of the playlist that contains the channel\"s liked videos. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list.")
  public String getLikes() {
    return likes;
  }

  public void setLikes(String likes) {
    this.likes = likes;
  }

  public ChannelContentDetailsRelatedPlaylists uploads(String uploads) {
    this.uploads = uploads;
    return this;
  }

   /**
   * The ID of the playlist that contains the channel\"s uploaded videos. Use the videos.insert method to upload new videos and the videos.delete method to delete previously uploaded videos.
   * @return uploads
  **/
  @ApiModelProperty(value = "The ID of the playlist that contains the channel\"s uploaded videos. Use the videos.insert method to upload new videos and the videos.delete method to delete previously uploaded videos.")
  public String getUploads() {
    return uploads;
  }

  public void setUploads(String uploads) {
    this.uploads = uploads;
  }

  public ChannelContentDetailsRelatedPlaylists watchHistory(String watchHistory) {
    this.watchHistory = watchHistory;
    return this;
  }

   /**
   * The ID of the playlist that contains the channel\"s watch history. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list.
   * @return watchHistory
  **/
  @ApiModelProperty(value = "The ID of the playlist that contains the channel\"s watch history. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list.")
  public String getWatchHistory() {
    return watchHistory;
  }

  public void setWatchHistory(String watchHistory) {
    this.watchHistory = watchHistory;
  }

  public ChannelContentDetailsRelatedPlaylists watchLater(String watchLater) {
    this.watchLater = watchLater;
    return this;
  }

   /**
   * The ID of the playlist that contains the channel\"s watch later playlist. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list.
   * @return watchLater
  **/
  @ApiModelProperty(value = "The ID of the playlist that contains the channel\"s watch later playlist. Use the playlistItems.insert and playlistItems.delete to add or remove items from that list.")
  public String getWatchLater() {
    return watchLater;
  }

  public void setWatchLater(String watchLater) {
    this.watchLater = watchLater;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelContentDetailsRelatedPlaylists channelContentDetailsRelatedPlaylists = (ChannelContentDetailsRelatedPlaylists) o;
    return Objects.equals(this.favorites, channelContentDetailsRelatedPlaylists.favorites) &&
        Objects.equals(this.likes, channelContentDetailsRelatedPlaylists.likes) &&
        Objects.equals(this.uploads, channelContentDetailsRelatedPlaylists.uploads) &&
        Objects.equals(this.watchHistory, channelContentDetailsRelatedPlaylists.watchHistory) &&
        Objects.equals(this.watchLater, channelContentDetailsRelatedPlaylists.watchLater);
  }

  @Override
  public int hashCode() {
    return Objects.hash(favorites, likes, uploads, watchHistory, watchLater);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelContentDetailsRelatedPlaylists {\n");
    
    sb.append("    favorites: ").append(toIndentedString(favorites)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    uploads: ").append(toIndentedString(uploads)).append("\n");
    sb.append("    watchHistory: ").append(toIndentedString(watchHistory)).append("\n");
    sb.append("    watchLater: ").append(toIndentedString(watchLater)).append("\n");
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

