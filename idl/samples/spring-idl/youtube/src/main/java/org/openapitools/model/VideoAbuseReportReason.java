package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VideoAbuseReportReasonSnippet;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A &#x60;__videoAbuseReportReason__&#x60; resource identifies a reason that a video could be reported as abusive. Video abuse report reasons are used with &#x60;video.ReportAbuse&#x60;.
 */
@ApiModel(description = "A `__videoAbuseReportReason__` resource identifies a reason that a video could be reported as abusive. Video abuse report reasons are used with `video.ReportAbuse`.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoAbuseReportReason   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#videoAbuseReportReason";

  @JsonProperty("snippet")
  private VideoAbuseReportReasonSnippet snippet;

  public VideoAbuseReportReason etag(String etag) {
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

  public VideoAbuseReportReason id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this abuse report reason.
   * @return id
  */
  @ApiModelProperty(value = "The ID of this abuse report reason.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VideoAbuseReportReason kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string `\"youtube#videoAbuseReportReason\"`.
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string `\"youtube#videoAbuseReportReason\"`.")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public VideoAbuseReportReason snippet(VideoAbuseReportReasonSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @ApiModelProperty(value = "")

  @Valid

  public VideoAbuseReportReasonSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(VideoAbuseReportReasonSnippet snippet) {
    this.snippet = snippet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAbuseReportReason videoAbuseReportReason = (VideoAbuseReportReason) o;
    return Objects.equals(this.etag, videoAbuseReportReason.etag) &&
        Objects.equals(this.id, videoAbuseReportReason.id) &&
        Objects.equals(this.kind, videoAbuseReportReason.kind) &&
        Objects.equals(this.snippet, videoAbuseReportReason.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, id, kind, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAbuseReportReason {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
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

