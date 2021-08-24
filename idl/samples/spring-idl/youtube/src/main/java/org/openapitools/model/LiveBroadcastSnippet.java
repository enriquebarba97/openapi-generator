package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.ThumbnailDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic broadcast information.
 */
@ApiModel(description = "Basic broadcast information.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveBroadcastSnippet   {
  @JsonProperty("actualEndTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime actualEndTime;

  @JsonProperty("actualStartTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime actualStartTime;

  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("isDefaultBroadcast")
  private Boolean isDefaultBroadcast;

  @JsonProperty("liveChatId")
  private String liveChatId;

  @JsonProperty("publishedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishedAt;

  @JsonProperty("scheduledEndTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduledEndTime;

  @JsonProperty("scheduledStartTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduledStartTime;

  @JsonProperty("thumbnails")
  private ThumbnailDetails thumbnails;

  @JsonProperty("title")
  private String title;

  public LiveBroadcastSnippet actualEndTime(OffsetDateTime actualEndTime) {
    this.actualEndTime = actualEndTime;
    return this;
  }

  /**
   * The date and time that the broadcast actually ended. This information is only available once the broadcast's state is complete.
   * @return actualEndTime
  */
  @ApiModelProperty(value = "The date and time that the broadcast actually ended. This information is only available once the broadcast's state is complete.")

  @Valid

  public OffsetDateTime getActualEndTime() {
    return actualEndTime;
  }

  public void setActualEndTime(OffsetDateTime actualEndTime) {
    this.actualEndTime = actualEndTime;
  }

  public LiveBroadcastSnippet actualStartTime(OffsetDateTime actualStartTime) {
    this.actualStartTime = actualStartTime;
    return this;
  }

  /**
   * The date and time that the broadcast actually started. This information is only available once the broadcast's state is live.
   * @return actualStartTime
  */
  @ApiModelProperty(value = "The date and time that the broadcast actually started. This information is only available once the broadcast's state is live.")

  @Valid

  public OffsetDateTime getActualStartTime() {
    return actualStartTime;
  }

  public void setActualStartTime(OffsetDateTime actualStartTime) {
    this.actualStartTime = actualStartTime;
  }

  public LiveBroadcastSnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the channel that is publishing the broadcast.
   * @return channelId
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the channel that is publishing the broadcast.")


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public LiveBroadcastSnippet description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The broadcast's description. As with the title, you can set this field by modifying the broadcast resource or by setting the description field of the corresponding video resource.
   * @return description
  */
  @ApiModelProperty(value = "The broadcast's description. As with the title, you can set this field by modifying the broadcast resource or by setting the description field of the corresponding video resource.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LiveBroadcastSnippet isDefaultBroadcast(Boolean isDefaultBroadcast) {
    this.isDefaultBroadcast = isDefaultBroadcast;
    return this;
  }

  /**
   * Indicates whether this broadcast is the default broadcast. Internal only.
   * @return isDefaultBroadcast
  */
  @ApiModelProperty(value = "Indicates whether this broadcast is the default broadcast. Internal only.")


  public Boolean getIsDefaultBroadcast() {
    return isDefaultBroadcast;
  }

  public void setIsDefaultBroadcast(Boolean isDefaultBroadcast) {
    this.isDefaultBroadcast = isDefaultBroadcast;
  }

  public LiveBroadcastSnippet liveChatId(String liveChatId) {
    this.liveChatId = liveChatId;
    return this;
  }

  /**
   * The id of the live chat for this broadcast.
   * @return liveChatId
  */
  @ApiModelProperty(value = "The id of the live chat for this broadcast.")


  public String getLiveChatId() {
    return liveChatId;
  }

  public void setLiveChatId(String liveChatId) {
    this.liveChatId = liveChatId;
  }

  public LiveBroadcastSnippet publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The date and time that the broadcast was added to YouTube's live broadcast schedule.
   * @return publishedAt
  */
  @ApiModelProperty(value = "The date and time that the broadcast was added to YouTube's live broadcast schedule.")

  @Valid

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public LiveBroadcastSnippet scheduledEndTime(OffsetDateTime scheduledEndTime) {
    this.scheduledEndTime = scheduledEndTime;
    return this;
  }

  /**
   * The date and time that the broadcast is scheduled to start.
   * @return scheduledEndTime
  */
  @ApiModelProperty(value = "The date and time that the broadcast is scheduled to start.")

  @Valid

  public OffsetDateTime getScheduledEndTime() {
    return scheduledEndTime;
  }

  public void setScheduledEndTime(OffsetDateTime scheduledEndTime) {
    this.scheduledEndTime = scheduledEndTime;
  }

  public LiveBroadcastSnippet scheduledStartTime(OffsetDateTime scheduledStartTime) {
    this.scheduledStartTime = scheduledStartTime;
    return this;
  }

  /**
   * The date and time that the broadcast is scheduled to end.
   * @return scheduledStartTime
  */
  @ApiModelProperty(value = "The date and time that the broadcast is scheduled to end.")

  @Valid

  public OffsetDateTime getScheduledStartTime() {
    return scheduledStartTime;
  }

  public void setScheduledStartTime(OffsetDateTime scheduledStartTime) {
    this.scheduledStartTime = scheduledStartTime;
  }

  public LiveBroadcastSnippet thumbnails(ThumbnailDetails thumbnails) {
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

  public LiveBroadcastSnippet title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The broadcast's title. Note that the broadcast represents exactly one YouTube video. You can set this field by modifying the broadcast resource or by setting the title field of the corresponding video resource.
   * @return title
  */
  @ApiModelProperty(value = "The broadcast's title. Note that the broadcast represents exactly one YouTube video. You can set this field by modifying the broadcast resource or by setting the title field of the corresponding video resource.")


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
    LiveBroadcastSnippet liveBroadcastSnippet = (LiveBroadcastSnippet) o;
    return Objects.equals(this.actualEndTime, liveBroadcastSnippet.actualEndTime) &&
        Objects.equals(this.actualStartTime, liveBroadcastSnippet.actualStartTime) &&
        Objects.equals(this.channelId, liveBroadcastSnippet.channelId) &&
        Objects.equals(this.description, liveBroadcastSnippet.description) &&
        Objects.equals(this.isDefaultBroadcast, liveBroadcastSnippet.isDefaultBroadcast) &&
        Objects.equals(this.liveChatId, liveBroadcastSnippet.liveChatId) &&
        Objects.equals(this.publishedAt, liveBroadcastSnippet.publishedAt) &&
        Objects.equals(this.scheduledEndTime, liveBroadcastSnippet.scheduledEndTime) &&
        Objects.equals(this.scheduledStartTime, liveBroadcastSnippet.scheduledStartTime) &&
        Objects.equals(this.thumbnails, liveBroadcastSnippet.thumbnails) &&
        Objects.equals(this.title, liveBroadcastSnippet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualEndTime, actualStartTime, channelId, description, isDefaultBroadcast, liveChatId, publishedAt, scheduledEndTime, scheduledStartTime, thumbnails, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveBroadcastSnippet {\n");
    
    sb.append("    actualEndTime: ").append(toIndentedString(actualEndTime)).append("\n");
    sb.append("    actualStartTime: ").append(toIndentedString(actualStartTime)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDefaultBroadcast: ").append(toIndentedString(isDefaultBroadcast)).append("\n");
    sb.append("    liveChatId: ").append(toIndentedString(liveChatId)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    scheduledEndTime: ").append(toIndentedString(scheduledEndTime)).append("\n");
    sb.append("    scheduledStartTime: ").append(toIndentedString(scheduledStartTime)).append("\n");
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

