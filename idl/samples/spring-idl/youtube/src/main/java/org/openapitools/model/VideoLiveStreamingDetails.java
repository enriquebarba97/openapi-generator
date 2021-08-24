package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about the live streaming metadata.
 */
@ApiModel(description = "Details about the live streaming metadata.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoLiveStreamingDetails   {
  @JsonProperty("activeLiveChatId")
  private String activeLiveChatId;

  @JsonProperty("actualEndTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime actualEndTime;

  @JsonProperty("actualStartTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime actualStartTime;

  @JsonProperty("concurrentViewers")
  private String concurrentViewers;

  @JsonProperty("scheduledEndTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduledEndTime;

  @JsonProperty("scheduledStartTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduledStartTime;

  public VideoLiveStreamingDetails activeLiveChatId(String activeLiveChatId) {
    this.activeLiveChatId = activeLiveChatId;
    return this;
  }

  /**
   * The ID of the currently active live chat attached to this video. This field is filled only if the video is a currently live broadcast that has live chat. Once the broadcast transitions to complete this field will be removed and the live chat closed down. For persistent broadcasts that live chat id will no longer be tied to this video but rather to the new video being displayed at the persistent page.
   * @return activeLiveChatId
  */
  @ApiModelProperty(value = "The ID of the currently active live chat attached to this video. This field is filled only if the video is a currently live broadcast that has live chat. Once the broadcast transitions to complete this field will be removed and the live chat closed down. For persistent broadcasts that live chat id will no longer be tied to this video but rather to the new video being displayed at the persistent page.")


  public String getActiveLiveChatId() {
    return activeLiveChatId;
  }

  public void setActiveLiveChatId(String activeLiveChatId) {
    this.activeLiveChatId = activeLiveChatId;
  }

  public VideoLiveStreamingDetails actualEndTime(OffsetDateTime actualEndTime) {
    this.actualEndTime = actualEndTime;
    return this;
  }

  /**
   * The time that the broadcast actually ended. This value will not be available until the broadcast is over.
   * @return actualEndTime
  */
  @ApiModelProperty(value = "The time that the broadcast actually ended. This value will not be available until the broadcast is over.")

  @Valid

  public OffsetDateTime getActualEndTime() {
    return actualEndTime;
  }

  public void setActualEndTime(OffsetDateTime actualEndTime) {
    this.actualEndTime = actualEndTime;
  }

  public VideoLiveStreamingDetails actualStartTime(OffsetDateTime actualStartTime) {
    this.actualStartTime = actualStartTime;
    return this;
  }

  /**
   * The time that the broadcast actually started. This value will not be available until the broadcast begins.
   * @return actualStartTime
  */
  @ApiModelProperty(value = "The time that the broadcast actually started. This value will not be available until the broadcast begins.")

  @Valid

  public OffsetDateTime getActualStartTime() {
    return actualStartTime;
  }

  public void setActualStartTime(OffsetDateTime actualStartTime) {
    this.actualStartTime = actualStartTime;
  }

  public VideoLiveStreamingDetails concurrentViewers(String concurrentViewers) {
    this.concurrentViewers = concurrentViewers;
    return this;
  }

  /**
   * The number of viewers currently watching the broadcast. The property and its value will be present if the broadcast has current viewers and the broadcast owner has not hidden the viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for a broadcast when the broadcast ends. So, this property would not identify the number of viewers watching an archived video of a live broadcast that already ended.
   * @return concurrentViewers
  */
  @ApiModelProperty(value = "The number of viewers currently watching the broadcast. The property and its value will be present if the broadcast has current viewers and the broadcast owner has not hidden the viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for a broadcast when the broadcast ends. So, this property would not identify the number of viewers watching an archived video of a live broadcast that already ended.")


  public String getConcurrentViewers() {
    return concurrentViewers;
  }

  public void setConcurrentViewers(String concurrentViewers) {
    this.concurrentViewers = concurrentViewers;
  }

  public VideoLiveStreamingDetails scheduledEndTime(OffsetDateTime scheduledEndTime) {
    this.scheduledEndTime = scheduledEndTime;
    return this;
  }

  /**
   * The time that the broadcast is scheduled to end. If the value is empty or the property is not present, then the broadcast is scheduled to contiue indefinitely.
   * @return scheduledEndTime
  */
  @ApiModelProperty(value = "The time that the broadcast is scheduled to end. If the value is empty or the property is not present, then the broadcast is scheduled to contiue indefinitely.")

  @Valid

  public OffsetDateTime getScheduledEndTime() {
    return scheduledEndTime;
  }

  public void setScheduledEndTime(OffsetDateTime scheduledEndTime) {
    this.scheduledEndTime = scheduledEndTime;
  }

  public VideoLiveStreamingDetails scheduledStartTime(OffsetDateTime scheduledStartTime) {
    this.scheduledStartTime = scheduledStartTime;
    return this;
  }

  /**
   * The time that the broadcast is scheduled to begin.
   * @return scheduledStartTime
  */
  @ApiModelProperty(value = "The time that the broadcast is scheduled to begin.")

  @Valid

  public OffsetDateTime getScheduledStartTime() {
    return scheduledStartTime;
  }

  public void setScheduledStartTime(OffsetDateTime scheduledStartTime) {
    this.scheduledStartTime = scheduledStartTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoLiveStreamingDetails videoLiveStreamingDetails = (VideoLiveStreamingDetails) o;
    return Objects.equals(this.activeLiveChatId, videoLiveStreamingDetails.activeLiveChatId) &&
        Objects.equals(this.actualEndTime, videoLiveStreamingDetails.actualEndTime) &&
        Objects.equals(this.actualStartTime, videoLiveStreamingDetails.actualStartTime) &&
        Objects.equals(this.concurrentViewers, videoLiveStreamingDetails.concurrentViewers) &&
        Objects.equals(this.scheduledEndTime, videoLiveStreamingDetails.scheduledEndTime) &&
        Objects.equals(this.scheduledStartTime, videoLiveStreamingDetails.scheduledStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeLiveChatId, actualEndTime, actualStartTime, concurrentViewers, scheduledEndTime, scheduledStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoLiveStreamingDetails {\n");
    
    sb.append("    activeLiveChatId: ").append(toIndentedString(activeLiveChatId)).append("\n");
    sb.append("    actualEndTime: ").append(toIndentedString(actualEndTime)).append("\n");
    sb.append("    actualStartTime: ").append(toIndentedString(actualStartTime)).append("\n");
    sb.append("    concurrentViewers: ").append(toIndentedString(concurrentViewers)).append("\n");
    sb.append("    scheduledEndTime: ").append(toIndentedString(scheduledEndTime)).append("\n");
    sb.append("    scheduledStartTime: ").append(toIndentedString(scheduledStartTime)).append("\n");
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

