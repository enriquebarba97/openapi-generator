package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LiveBroadcastContentDetails;
import org.openapitools.model.LiveBroadcastSnippet;
import org.openapitools.model.LiveBroadcastStatistics;
import org.openapitools.model.LiveBroadcastStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A *liveBroadcast* resource represents an event that will be streamed, via live video, on YouTube.
 */
@ApiModel(description = "A *liveBroadcast* resource represents an event that will be streamed, via live video, on YouTube.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveBroadcast   {
  @JsonProperty("contentDetails")
  private LiveBroadcastContentDetails contentDetails;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#liveBroadcast";

  @JsonProperty("snippet")
  private LiveBroadcastSnippet snippet;

  @JsonProperty("statistics")
  private LiveBroadcastStatistics statistics;

  @JsonProperty("status")
  private LiveBroadcastStatus status;

  public LiveBroadcast contentDetails(LiveBroadcastContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

  /**
   * Get contentDetails
   * @return contentDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public LiveBroadcastContentDetails getContentDetails() {
    return contentDetails;
  }

  public void setContentDetails(LiveBroadcastContentDetails contentDetails) {
    this.contentDetails = contentDetails;
  }

  public LiveBroadcast etag(String etag) {
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

  public LiveBroadcast id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID that YouTube assigns to uniquely identify the broadcast.
   * @return id
  */
  @ApiModelProperty(value = "The ID that YouTube assigns to uniquely identify the broadcast.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LiveBroadcast kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#liveBroadcast\".
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#liveBroadcast\".")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public LiveBroadcast snippet(LiveBroadcastSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @ApiModelProperty(value = "")

  @Valid

  public LiveBroadcastSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(LiveBroadcastSnippet snippet) {
    this.snippet = snippet;
  }

  public LiveBroadcast statistics(LiveBroadcastStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * @return statistics
  */
  @ApiModelProperty(value = "")

  @Valid

  public LiveBroadcastStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(LiveBroadcastStatistics statistics) {
    this.statistics = statistics;
  }

  public LiveBroadcast status(LiveBroadcastStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public LiveBroadcastStatus getStatus() {
    return status;
  }

  public void setStatus(LiveBroadcastStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveBroadcast liveBroadcast = (LiveBroadcast) o;
    return Objects.equals(this.contentDetails, liveBroadcast.contentDetails) &&
        Objects.equals(this.etag, liveBroadcast.etag) &&
        Objects.equals(this.id, liveBroadcast.id) &&
        Objects.equals(this.kind, liveBroadcast.kind) &&
        Objects.equals(this.snippet, liveBroadcast.snippet) &&
        Objects.equals(this.statistics, liveBroadcast.statistics) &&
        Objects.equals(this.status, liveBroadcast.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDetails, etag, id, kind, snippet, statistics, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveBroadcast {\n");
    
    sb.append("    contentDetails: ").append(toIndentedString(contentDetails)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

