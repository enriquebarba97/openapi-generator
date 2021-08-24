package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * PlaylistItemContentDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class PlaylistItemContentDetails   {
  @JsonProperty("endAt")
  private String endAt;

  @JsonProperty("note")
  private String note;

  @JsonProperty("startAt")
  private String startAt;

  @JsonProperty("videoId")
  private String videoId;

  @JsonProperty("videoPublishedAt")
  private Date videoPublishedAt;

  public PlaylistItemContentDetails endAt(String endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * The time, measured in seconds from the start of the video, when the video should stop playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) By default, assume that the video.endTime is the end of the video.
   * @return endAt
  **/
  @ApiModelProperty(value = "The time, measured in seconds from the start of the video, when the video should stop playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) By default, assume that the video.endTime is the end of the video.")
  public String getEndAt() {
    return endAt;
  }

  public void setEndAt(String endAt) {
    this.endAt = endAt;
  }

  public PlaylistItemContentDetails note(String note) {
    this.note = note;
    return this;
  }

   /**
   * A user-generated note for this item.
   * @return note
  **/
  @ApiModelProperty(value = "A user-generated note for this item.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public PlaylistItemContentDetails startAt(String startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * The time, measured in seconds from the start of the video, when the video should start playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) The default value is 0.
   * @return startAt
  **/
  @ApiModelProperty(value = "The time, measured in seconds from the start of the video, when the video should start playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) The default value is 0.")
  public String getStartAt() {
    return startAt;
  }

  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }

  public PlaylistItemContentDetails videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the id query parameter to this value in your API request.
   * @return videoId
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the id query parameter to this value in your API request.")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public PlaylistItemContentDetails videoPublishedAt(Date videoPublishedAt) {
    this.videoPublishedAt = videoPublishedAt;
    return this;
  }

   /**
   * The date and time that the video was published to YouTube.
   * @return videoPublishedAt
  **/
  @ApiModelProperty(value = "The date and time that the video was published to YouTube.")
  public Date getVideoPublishedAt() {
    return videoPublishedAt;
  }

  public void setVideoPublishedAt(Date videoPublishedAt) {
    this.videoPublishedAt = videoPublishedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistItemContentDetails playlistItemContentDetails = (PlaylistItemContentDetails) o;
    return Objects.equals(this.endAt, playlistItemContentDetails.endAt) &&
        Objects.equals(this.note, playlistItemContentDetails.note) &&
        Objects.equals(this.startAt, playlistItemContentDetails.startAt) &&
        Objects.equals(this.videoId, playlistItemContentDetails.videoId) &&
        Objects.equals(this.videoPublishedAt, playlistItemContentDetails.videoPublishedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endAt, note, startAt, videoId, videoPublishedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistItemContentDetails {\n");
    
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoPublishedAt: ").append(toIndentedString(videoPublishedAt)).append("\n");
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

