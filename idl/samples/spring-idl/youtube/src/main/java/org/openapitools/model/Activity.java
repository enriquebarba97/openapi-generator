package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ActivityContentDetails;
import org.openapitools.model.ActivitySnippet;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An *activity* resource contains information about an action that a particular channel, or user, has taken on YouTube.The actions reported in activity feeds include rating a video, sharing a video, marking a video as a favorite, commenting on a video, uploading a video, and so forth. Each activity resource identifies the type of action, the channel associated with the action, and the resource(s) associated with the action, such as the video that was rated or uploaded.
 */
@ApiModel(description = "An *activity* resource contains information about an action that a particular channel, or user, has taken on YouTube.The actions reported in activity feeds include rating a video, sharing a video, marking a video as a favorite, commenting on a video, uploading a video, and so forth. Each activity resource identifies the type of action, the channel associated with the action, and the resource(s) associated with the action, such as the video that was rated or uploaded.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class Activity   {
  @JsonProperty("contentDetails")
  private ActivityContentDetails contentDetails;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#activity";

  @JsonProperty("snippet")
  private ActivitySnippet snippet;

  public Activity contentDetails(ActivityContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

  /**
   * Get contentDetails
   * @return contentDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetails getContentDetails() {
    return contentDetails;
  }

  public void setContentDetails(ActivityContentDetails contentDetails) {
    this.contentDetails = contentDetails;
  }

  public Activity etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Etag of this resource
   * @return etag
  */
  @ApiModelProperty(value = "Etag of this resource")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Activity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the activity.
   * @return id
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the activity.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Activity kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#activity\".
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#activity\".")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Activity snippet(ActivitySnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivitySnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(ActivitySnippet snippet) {
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
    Activity activity = (Activity) o;
    return Objects.equals(this.contentDetails, activity.contentDetails) &&
        Objects.equals(this.etag, activity.etag) &&
        Objects.equals(this.id, activity.id) &&
        Objects.equals(this.kind, activity.kind) &&
        Objects.equals(this.snippet, activity.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDetails, etag, id, kind, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    contentDetails: ").append(toIndentedString(contentDetails)).append("\n");
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

