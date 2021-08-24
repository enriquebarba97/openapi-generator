package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Statistics about a channel: number of subscribers, number of videos in the channel, etc.
 */
@ApiModel(description = "Statistics about a channel: number of subscribers, number of videos in the channel, etc.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ChannelStatistics   {
  @JsonProperty("commentCount")
  private String commentCount;

  @JsonProperty("hiddenSubscriberCount")
  private Boolean hiddenSubscriberCount;

  @JsonProperty("subscriberCount")
  private String subscriberCount;

  @JsonProperty("videoCount")
  private String videoCount;

  @JsonProperty("viewCount")
  private String viewCount;

  public ChannelStatistics commentCount(String commentCount) {
    this.commentCount = commentCount;
    return this;
  }

   /**
   * The number of comments for the channel.
   * @return commentCount
  **/
  @ApiModelProperty(value = "The number of comments for the channel.")
  public String getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(String commentCount) {
    this.commentCount = commentCount;
  }

  public ChannelStatistics hiddenSubscriberCount(Boolean hiddenSubscriberCount) {
    this.hiddenSubscriberCount = hiddenSubscriberCount;
    return this;
  }

   /**
   * Whether or not the number of subscribers is shown for this user.
   * @return hiddenSubscriberCount
  **/
  @ApiModelProperty(value = "Whether or not the number of subscribers is shown for this user.")
  public Boolean getHiddenSubscriberCount() {
    return hiddenSubscriberCount;
  }

  public void setHiddenSubscriberCount(Boolean hiddenSubscriberCount) {
    this.hiddenSubscriberCount = hiddenSubscriberCount;
  }

  public ChannelStatistics subscriberCount(String subscriberCount) {
    this.subscriberCount = subscriberCount;
    return this;
  }

   /**
   * The number of subscribers that the channel has.
   * @return subscriberCount
  **/
  @ApiModelProperty(value = "The number of subscribers that the channel has.")
  public String getSubscriberCount() {
    return subscriberCount;
  }

  public void setSubscriberCount(String subscriberCount) {
    this.subscriberCount = subscriberCount;
  }

  public ChannelStatistics videoCount(String videoCount) {
    this.videoCount = videoCount;
    return this;
  }

   /**
   * The number of videos uploaded to the channel.
   * @return videoCount
  **/
  @ApiModelProperty(value = "The number of videos uploaded to the channel.")
  public String getVideoCount() {
    return videoCount;
  }

  public void setVideoCount(String videoCount) {
    this.videoCount = videoCount;
  }

  public ChannelStatistics viewCount(String viewCount) {
    this.viewCount = viewCount;
    return this;
  }

   /**
   * The number of times the channel has been viewed.
   * @return viewCount
  **/
  @ApiModelProperty(value = "The number of times the channel has been viewed.")
  public String getViewCount() {
    return viewCount;
  }

  public void setViewCount(String viewCount) {
    this.viewCount = viewCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelStatistics channelStatistics = (ChannelStatistics) o;
    return Objects.equals(this.commentCount, channelStatistics.commentCount) &&
        Objects.equals(this.hiddenSubscriberCount, channelStatistics.hiddenSubscriberCount) &&
        Objects.equals(this.subscriberCount, channelStatistics.subscriberCount) &&
        Objects.equals(this.videoCount, channelStatistics.videoCount) &&
        Objects.equals(this.viewCount, channelStatistics.viewCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentCount, hiddenSubscriberCount, subscriberCount, videoCount, viewCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelStatistics {\n");
    
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    hiddenSubscriberCount: ").append(toIndentedString(hiddenSubscriberCount)).append("\n");
    sb.append("    subscriberCount: ").append(toIndentedString(subscriberCount)).append("\n");
    sb.append("    videoCount: ").append(toIndentedString(videoCount)).append("\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
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

