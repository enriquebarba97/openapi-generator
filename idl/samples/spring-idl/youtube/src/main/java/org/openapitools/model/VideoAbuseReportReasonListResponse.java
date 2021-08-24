package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.VideoAbuseReportReason;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VideoAbuseReportReasonListResponse
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoAbuseReportReasonListResponse   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("items")
  @Valid
  private List<VideoAbuseReportReason> items = null;

  @JsonProperty("kind")
  private String kind = "youtube#videoAbuseReportReasonListResponse";

  @JsonProperty("visitorId")
  private String visitorId;

  public VideoAbuseReportReasonListResponse etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Etag of this resource.
   * @return etag
  */
  @ApiModelProperty(value = "Etag of this resource.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public VideoAbuseReportReasonListResponse eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Serialized EventId of the request which produced this response.
   * @return eventId
  */
  @ApiModelProperty(value = "Serialized EventId of the request which produced this response.")


  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public VideoAbuseReportReasonListResponse items(List<VideoAbuseReportReason> items) {
    this.items = items;
    return this;
  }

  public VideoAbuseReportReasonListResponse addItemsItem(VideoAbuseReportReason itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * A list of valid abuse reasons that are used with `video.ReportAbuse`.
   * @return items
  */
  @ApiModelProperty(value = "A list of valid abuse reasons that are used with `video.ReportAbuse`.")

  @Valid

  public List<VideoAbuseReportReason> getItems() {
    return items;
  }

  public void setItems(List<VideoAbuseReportReason> items) {
    this.items = items;
  }

  public VideoAbuseReportReasonListResponse kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string `\"youtube#videoAbuseReportReasonListResponse\"`.
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string `\"youtube#videoAbuseReportReasonListResponse\"`.")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public VideoAbuseReportReasonListResponse visitorId(String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

  /**
   * The `visitorId` identifies the visitor.
   * @return visitorId
  */
  @ApiModelProperty(value = "The `visitorId` identifies the visitor.")


  public String getVisitorId() {
    return visitorId;
  }

  public void setVisitorId(String visitorId) {
    this.visitorId = visitorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAbuseReportReasonListResponse videoAbuseReportReasonListResponse = (VideoAbuseReportReasonListResponse) o;
    return Objects.equals(this.etag, videoAbuseReportReasonListResponse.etag) &&
        Objects.equals(this.eventId, videoAbuseReportReasonListResponse.eventId) &&
        Objects.equals(this.items, videoAbuseReportReasonListResponse.items) &&
        Objects.equals(this.kind, videoAbuseReportReasonListResponse.kind) &&
        Objects.equals(this.visitorId, videoAbuseReportReasonListResponse.visitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, eventId, items, kind, visitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAbuseReportReasonListResponse {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    visitorId: ").append(toIndentedString(visitorId)).append("\n");
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

