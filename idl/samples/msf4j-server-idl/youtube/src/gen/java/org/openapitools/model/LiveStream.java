package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CdnSettings;
import org.openapitools.model.LiveStreamContentDetails;
import org.openapitools.model.LiveStreamSnippet;
import org.openapitools.model.LiveStreamStatus;

/**
 * A live stream describes a live ingestion point.
 */
@ApiModel(description = "A live stream describes a live ingestion point.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveStream   {
  @JsonProperty("cdn")
  private CdnSettings cdn;

  @JsonProperty("contentDetails")
  private LiveStreamContentDetails contentDetails;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#liveStream";

  @JsonProperty("snippet")
  private LiveStreamSnippet snippet;

  @JsonProperty("status")
  private LiveStreamStatus status;

  public LiveStream cdn(CdnSettings cdn) {
    this.cdn = cdn;
    return this;
  }

   /**
   * Get cdn
   * @return cdn
  **/
  @ApiModelProperty(value = "")
  public CdnSettings getCdn() {
    return cdn;
  }

  public void setCdn(CdnSettings cdn) {
    this.cdn = cdn;
  }

  public LiveStream contentDetails(LiveStreamContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

   /**
   * Get contentDetails
   * @return contentDetails
  **/
  @ApiModelProperty(value = "")
  public LiveStreamContentDetails getContentDetails() {
    return contentDetails;
  }

  public void setContentDetails(LiveStreamContentDetails contentDetails) {
    this.contentDetails = contentDetails;
  }

  public LiveStream etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * Etag of this resource.
   * @return etag
  **/
  @ApiModelProperty(value = "Etag of this resource.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public LiveStream id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID that YouTube assigns to uniquely identify the stream.
   * @return id
  **/
  @ApiModelProperty(value = "The ID that YouTube assigns to uniquely identify the stream.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LiveStream kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#liveStream\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#liveStream\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public LiveStream snippet(LiveStreamSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public LiveStreamSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(LiveStreamSnippet snippet) {
    this.snippet = snippet;
  }

  public LiveStream status(LiveStreamStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public LiveStreamStatus getStatus() {
    return status;
  }

  public void setStatus(LiveStreamStatus status) {
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
    LiveStream liveStream = (LiveStream) o;
    return Objects.equals(this.cdn, liveStream.cdn) &&
        Objects.equals(this.contentDetails, liveStream.contentDetails) &&
        Objects.equals(this.etag, liveStream.etag) &&
        Objects.equals(this.id, liveStream.id) &&
        Objects.equals(this.kind, liveStream.kind) &&
        Objects.equals(this.snippet, liveStream.snippet) &&
        Objects.equals(this.status, liveStream.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdn, contentDetails, etag, id, kind, snippet, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStream {\n");
    
    sb.append("    cdn: ").append(toIndentedString(cdn)).append("\n");
    sb.append("    contentDetails: ").append(toIndentedString(contentDetails)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
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

