package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PlaylistLocalization;
import org.openapitools.model.ThumbnailDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic details about a playlist, including title, description and thumbnails.
 */
@ApiModel(description = "Basic details about a playlist, including title, description and thumbnails.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class PlaylistSnippet   {
  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("channelTitle")
  private String channelTitle;

  @JsonProperty("defaultLanguage")
  private String defaultLanguage;

  @JsonProperty("description")
  private String description;

  @JsonProperty("localized")
  private PlaylistLocalization localized;

  @JsonProperty("publishedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishedAt;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("thumbnailVideoId")
  private String thumbnailVideoId;

  @JsonProperty("thumbnails")
  private ThumbnailDetails thumbnails;

  @JsonProperty("title")
  private String title;

  public PlaylistSnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the channel that published the playlist.
   * @return channelId
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the channel that published the playlist.")


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public PlaylistSnippet channelTitle(String channelTitle) {
    this.channelTitle = channelTitle;
    return this;
  }

  /**
   * The channel title of the channel that the video belongs to.
   * @return channelTitle
  */
  @ApiModelProperty(value = "The channel title of the channel that the video belongs to.")


  public String getChannelTitle() {
    return channelTitle;
  }

  public void setChannelTitle(String channelTitle) {
    this.channelTitle = channelTitle;
  }

  public PlaylistSnippet defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * The language of the playlist's default title and description.
   * @return defaultLanguage
  */
  @ApiModelProperty(value = "The language of the playlist's default title and description.")


  public String getDefaultLanguage() {
    return defaultLanguage;
  }

  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  public PlaylistSnippet description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The playlist's description.
   * @return description
  */
  @ApiModelProperty(value = "The playlist's description.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PlaylistSnippet localized(PlaylistLocalization localized) {
    this.localized = localized;
    return this;
  }

  /**
   * Get localized
   * @return localized
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaylistLocalization getLocalized() {
    return localized;
  }

  public void setLocalized(PlaylistLocalization localized) {
    this.localized = localized;
  }

  public PlaylistSnippet publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The date and time that the playlist was created.
   * @return publishedAt
  */
  @ApiModelProperty(value = "The date and time that the playlist was created.")

  @Valid

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public PlaylistSnippet tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PlaylistSnippet addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Keyword tags associated with the playlist.
   * @return tags
  */
  @ApiModelProperty(value = "Keyword tags associated with the playlist.")


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public PlaylistSnippet thumbnailVideoId(String thumbnailVideoId) {
    this.thumbnailVideoId = thumbnailVideoId;
    return this;
  }

  /**
   * Note: if the playlist has a custom thumbnail, this field will not be populated. The video id selected by the user that will be used as the thumbnail of this playlist. This field defaults to the first publicly viewable video in the playlist, if: 1. The user has never selected a video to be the thumbnail of the playlist. 2. The user selects a video to be the thumbnail, and then removes that video from the playlist. 3. The user selects a non-owned video to be the thumbnail, but that video becomes private, or gets deleted.
   * @return thumbnailVideoId
  */
  @ApiModelProperty(value = "Note: if the playlist has a custom thumbnail, this field will not be populated. The video id selected by the user that will be used as the thumbnail of this playlist. This field defaults to the first publicly viewable video in the playlist, if: 1. The user has never selected a video to be the thumbnail of the playlist. 2. The user selects a video to be the thumbnail, and then removes that video from the playlist. 3. The user selects a non-owned video to be the thumbnail, but that video becomes private, or gets deleted.")


  public String getThumbnailVideoId() {
    return thumbnailVideoId;
  }

  public void setThumbnailVideoId(String thumbnailVideoId) {
    this.thumbnailVideoId = thumbnailVideoId;
  }

  public PlaylistSnippet thumbnails(ThumbnailDetails thumbnails) {
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

  public PlaylistSnippet title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The playlist's title.
   * @return title
  */
  @ApiModelProperty(value = "The playlist's title.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistSnippet playlistSnippet = (PlaylistSnippet) o;
    return Objects.equals(this.channelId, playlistSnippet.channelId) &&
        Objects.equals(this.channelTitle, playlistSnippet.channelTitle) &&
        Objects.equals(this.defaultLanguage, playlistSnippet.defaultLanguage) &&
        Objects.equals(this.description, playlistSnippet.description) &&
        Objects.equals(this.localized, playlistSnippet.localized) &&
        Objects.equals(this.publishedAt, playlistSnippet.publishedAt) &&
        Objects.equals(this.tags, playlistSnippet.tags) &&
        Objects.equals(this.thumbnailVideoId, playlistSnippet.thumbnailVideoId) &&
        Objects.equals(this.thumbnails, playlistSnippet.thumbnails) &&
        Objects.equals(this.title, playlistSnippet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelTitle, defaultLanguage, description, localized, publishedAt, tags, thumbnailVideoId, thumbnails, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistSnippet {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelTitle: ").append(toIndentedString(channelTitle)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    localized: ").append(toIndentedString(localized)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thumbnailVideoId: ").append(toIndentedString(thumbnailVideoId)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

