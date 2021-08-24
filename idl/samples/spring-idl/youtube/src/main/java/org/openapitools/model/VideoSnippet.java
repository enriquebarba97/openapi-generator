package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ThumbnailDetails;
import org.openapitools.model.VideoLocalization;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic details about a video, including title, description, uploader, thumbnails and category.
 */
@ApiModel(description = "Basic details about a video, including title, description, uploader, thumbnails and category.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoSnippet   {
  @JsonProperty("categoryId")
  private String categoryId;

  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("channelTitle")
  private String channelTitle;

  @JsonProperty("defaultAudioLanguage")
  private String defaultAudioLanguage;

  @JsonProperty("defaultLanguage")
  private String defaultLanguage;

  @JsonProperty("description")
  private String description;

  /**
   * Indicates if the video is an upcoming/active live broadcast. Or it's \"none\" if the video is not an upcoming/active live broadcast.
   */
  public enum LiveBroadcastContentEnum {
    NONE("none"),
    
    UPCOMING("upcoming"),
    
    LIVE("live"),
    
    COMPLETED("completed");

    private String value;

    LiveBroadcastContentEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LiveBroadcastContentEnum fromValue(String value) {
      for (LiveBroadcastContentEnum b : LiveBroadcastContentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("liveBroadcastContent")
  private LiveBroadcastContentEnum liveBroadcastContent;

  @JsonProperty("localized")
  private VideoLocalization localized;

  @JsonProperty("publishedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishedAt;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("thumbnails")
  private ThumbnailDetails thumbnails;

  @JsonProperty("title")
  private String title;

  public VideoSnippet categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * The YouTube video category associated with the video.
   * @return categoryId
  */
  @ApiModelProperty(value = "The YouTube video category associated with the video.")


  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public VideoSnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the channel that the video was uploaded to.
   * @return channelId
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the channel that the video was uploaded to.")


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public VideoSnippet channelTitle(String channelTitle) {
    this.channelTitle = channelTitle;
    return this;
  }

  /**
   * Channel title for the channel that the video belongs to.
   * @return channelTitle
  */
  @ApiModelProperty(value = "Channel title for the channel that the video belongs to.")


  public String getChannelTitle() {
    return channelTitle;
  }

  public void setChannelTitle(String channelTitle) {
    this.channelTitle = channelTitle;
  }

  public VideoSnippet defaultAudioLanguage(String defaultAudioLanguage) {
    this.defaultAudioLanguage = defaultAudioLanguage;
    return this;
  }

  /**
   * The default_audio_language property specifies the language spoken in the video's default audio track.
   * @return defaultAudioLanguage
  */
  @ApiModelProperty(value = "The default_audio_language property specifies the language spoken in the video's default audio track.")


  public String getDefaultAudioLanguage() {
    return defaultAudioLanguage;
  }

  public void setDefaultAudioLanguage(String defaultAudioLanguage) {
    this.defaultAudioLanguage = defaultAudioLanguage;
  }

  public VideoSnippet defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * The language of the videos's default snippet.
   * @return defaultLanguage
  */
  @ApiModelProperty(value = "The language of the videos's default snippet.")


  public String getDefaultLanguage() {
    return defaultLanguage;
  }

  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  public VideoSnippet description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The video's description. @mutable youtube.videos.insert youtube.videos.update
   * @return description
  */
  @ApiModelProperty(value = "The video's description. @mutable youtube.videos.insert youtube.videos.update")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VideoSnippet liveBroadcastContent(LiveBroadcastContentEnum liveBroadcastContent) {
    this.liveBroadcastContent = liveBroadcastContent;
    return this;
  }

  /**
   * Indicates if the video is an upcoming/active live broadcast. Or it's \"none\" if the video is not an upcoming/active live broadcast.
   * @return liveBroadcastContent
  */
  @ApiModelProperty(value = "Indicates if the video is an upcoming/active live broadcast. Or it's \"none\" if the video is not an upcoming/active live broadcast.")


  public LiveBroadcastContentEnum getLiveBroadcastContent() {
    return liveBroadcastContent;
  }

  public void setLiveBroadcastContent(LiveBroadcastContentEnum liveBroadcastContent) {
    this.liveBroadcastContent = liveBroadcastContent;
  }

  public VideoSnippet localized(VideoLocalization localized) {
    this.localized = localized;
    return this;
  }

  /**
   * Get localized
   * @return localized
  */
  @ApiModelProperty(value = "")

  @Valid

  public VideoLocalization getLocalized() {
    return localized;
  }

  public void setLocalized(VideoLocalization localized) {
    this.localized = localized;
  }

  public VideoSnippet publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The date and time when the video was uploaded.
   * @return publishedAt
  */
  @ApiModelProperty(value = "The date and time when the video was uploaded.")

  @Valid

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public VideoSnippet tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public VideoSnippet addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of keyword tags associated with the video. Tags may contain spaces.
   * @return tags
  */
  @ApiModelProperty(value = "A list of keyword tags associated with the video. Tags may contain spaces.")


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public VideoSnippet thumbnails(ThumbnailDetails thumbnails) {
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

  public VideoSnippet title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The video's title. @mutable youtube.videos.insert youtube.videos.update
   * @return title
  */
  @ApiModelProperty(value = "The video's title. @mutable youtube.videos.insert youtube.videos.update")


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
    VideoSnippet videoSnippet = (VideoSnippet) o;
    return Objects.equals(this.categoryId, videoSnippet.categoryId) &&
        Objects.equals(this.channelId, videoSnippet.channelId) &&
        Objects.equals(this.channelTitle, videoSnippet.channelTitle) &&
        Objects.equals(this.defaultAudioLanguage, videoSnippet.defaultAudioLanguage) &&
        Objects.equals(this.defaultLanguage, videoSnippet.defaultLanguage) &&
        Objects.equals(this.description, videoSnippet.description) &&
        Objects.equals(this.liveBroadcastContent, videoSnippet.liveBroadcastContent) &&
        Objects.equals(this.localized, videoSnippet.localized) &&
        Objects.equals(this.publishedAt, videoSnippet.publishedAt) &&
        Objects.equals(this.tags, videoSnippet.tags) &&
        Objects.equals(this.thumbnails, videoSnippet.thumbnails) &&
        Objects.equals(this.title, videoSnippet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, channelId, channelTitle, defaultAudioLanguage, defaultLanguage, description, liveBroadcastContent, localized, publishedAt, tags, thumbnails, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoSnippet {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelTitle: ").append(toIndentedString(channelTitle)).append("\n");
    sb.append("    defaultAudioLanguage: ").append(toIndentedString(defaultAudioLanguage)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveBroadcastContent: ").append(toIndentedString(liveBroadcastContent)).append("\n");
    sb.append("    localized: ").append(toIndentedString(localized)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

