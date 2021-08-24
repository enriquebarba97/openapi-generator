package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.ResourceId;
import org.openapitools.model.ThumbnailDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic details about a playlist, including title, description and thumbnails. Basic details of a YouTube Playlist item provided by the author. Next ID: 15
 */
@ApiModel(description = "Basic details about a playlist, including title, description and thumbnails. Basic details of a YouTube Playlist item provided by the author. Next ID: 15")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class PlaylistItemSnippet   {
  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("channelTitle")
  private String channelTitle;

  @JsonProperty("description")
  private String description;

  @JsonProperty("playlistId")
  private String playlistId;

  @JsonProperty("position")
  private Integer position;

  @JsonProperty("publishedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishedAt;

  @JsonProperty("resourceId")
  private ResourceId resourceId;

  @JsonProperty("thumbnails")
  private ThumbnailDetails thumbnails;

  @JsonProperty("title")
  private String title;

  @JsonProperty("videoOwnerChannelId")
  private String videoOwnerChannelId;

  @JsonProperty("videoOwnerChannelTitle")
  private String videoOwnerChannelTitle;

  public PlaylistItemSnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the user that added the item to the playlist.
   * @return channelId
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the user that added the item to the playlist.")


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public PlaylistItemSnippet channelTitle(String channelTitle) {
    this.channelTitle = channelTitle;
    return this;
  }

  /**
   * Channel title for the channel that the playlist item belongs to.
   * @return channelTitle
  */
  @ApiModelProperty(value = "Channel title for the channel that the playlist item belongs to.")


  public String getChannelTitle() {
    return channelTitle;
  }

  public void setChannelTitle(String channelTitle) {
    this.channelTitle = channelTitle;
  }

  public PlaylistItemSnippet description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The item's description.
   * @return description
  */
  @ApiModelProperty(value = "The item's description.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PlaylistItemSnippet playlistId(String playlistId) {
    this.playlistId = playlistId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify thGe playlist that the playlist item is in.
   * @return playlistId
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify thGe playlist that the playlist item is in.")


  public String getPlaylistId() {
    return playlistId;
  }

  public void setPlaylistId(String playlistId) {
    this.playlistId = playlistId;
  }

  public PlaylistItemSnippet position(Integer position) {
    this.position = position;
    return this;
  }

  /**
   * The order in which the item appears in the playlist. The value uses a zero-based index, so the first item has a position of 0, the second item has a position of 1, and so forth.
   * @return position
  */
  @ApiModelProperty(value = "The order in which the item appears in the playlist. The value uses a zero-based index, so the first item has a position of 0, the second item has a position of 1, and so forth.")


  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public PlaylistItemSnippet publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The date and time that the item was added to the playlist.
   * @return publishedAt
  */
  @ApiModelProperty(value = "The date and time that the item was added to the playlist.")

  @Valid

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public PlaylistItemSnippet resourceId(ResourceId resourceId) {
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

  public PlaylistItemSnippet thumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  /**
   * Get thumbnails
   * @return thumbnails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ThumbnailDetails getThumbnails() {
    return thumbnails;
  }

  public void setThumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
  }

  public PlaylistItemSnippet title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The item's title.
   * @return title
  */
  @ApiModelProperty(value = "The item's title.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PlaylistItemSnippet videoOwnerChannelId(String videoOwnerChannelId) {
    this.videoOwnerChannelId = videoOwnerChannelId;
    return this;
  }

  /**
   * Channel id for the channel this video belongs to.
   * @return videoOwnerChannelId
  */
  @ApiModelProperty(value = "Channel id for the channel this video belongs to.")


  public String getVideoOwnerChannelId() {
    return videoOwnerChannelId;
  }

  public void setVideoOwnerChannelId(String videoOwnerChannelId) {
    this.videoOwnerChannelId = videoOwnerChannelId;
  }

  public PlaylistItemSnippet videoOwnerChannelTitle(String videoOwnerChannelTitle) {
    this.videoOwnerChannelTitle = videoOwnerChannelTitle;
    return this;
  }

  /**
   * Channel title for the channel this video belongs to.
   * @return videoOwnerChannelTitle
  */
  @ApiModelProperty(value = "Channel title for the channel this video belongs to.")


  public String getVideoOwnerChannelTitle() {
    return videoOwnerChannelTitle;
  }

  public void setVideoOwnerChannelTitle(String videoOwnerChannelTitle) {
    this.videoOwnerChannelTitle = videoOwnerChannelTitle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistItemSnippet playlistItemSnippet = (PlaylistItemSnippet) o;
    return Objects.equals(this.channelId, playlistItemSnippet.channelId) &&
        Objects.equals(this.channelTitle, playlistItemSnippet.channelTitle) &&
        Objects.equals(this.description, playlistItemSnippet.description) &&
        Objects.equals(this.playlistId, playlistItemSnippet.playlistId) &&
        Objects.equals(this.position, playlistItemSnippet.position) &&
        Objects.equals(this.publishedAt, playlistItemSnippet.publishedAt) &&
        Objects.equals(this.resourceId, playlistItemSnippet.resourceId) &&
        Objects.equals(this.thumbnails, playlistItemSnippet.thumbnails) &&
        Objects.equals(this.title, playlistItemSnippet.title) &&
        Objects.equals(this.videoOwnerChannelId, playlistItemSnippet.videoOwnerChannelId) &&
        Objects.equals(this.videoOwnerChannelTitle, playlistItemSnippet.videoOwnerChannelTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelTitle, description, playlistId, position, publishedAt, resourceId, thumbnails, title, videoOwnerChannelId, videoOwnerChannelTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistItemSnippet {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelTitle: ").append(toIndentedString(channelTitle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    playlistId: ").append(toIndentedString(playlistId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoOwnerChannelId: ").append(toIndentedString(videoOwnerChannelId)).append("\n");
    sb.append("    videoOwnerChannelTitle: ").append(toIndentedString(videoOwnerChannelTitle)).append("\n");
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

