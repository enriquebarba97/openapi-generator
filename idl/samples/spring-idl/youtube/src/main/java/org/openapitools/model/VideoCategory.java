package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VideoCategorySnippet;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A *videoCategory* resource identifies a category that has been or could be associated with uploaded videos.
 */
@ApiModel(description = "A *videoCategory* resource identifies a category that has been or could be associated with uploaded videos.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoCategory   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#videoCategory";

  @JsonProperty("snippet")
  private VideoCategorySnippet snippet;

  public VideoCategory etag(String etag) {
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

  public VideoCategory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the video category.
   * @return id
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the video category.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VideoCategory kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#videoCategory\".
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#videoCategory\".")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public VideoCategory snippet(VideoCategorySnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @ApiModelProperty(value = "")

  @Valid

  public VideoCategorySnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(VideoCategorySnippet snippet) {
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
    VideoCategory videoCategory = (VideoCategory) o;
    return Objects.equals(this.etag, videoCategory.etag) &&
        Objects.equals(this.id, videoCategory.id) &&
        Objects.equals(this.kind, videoCategory.kind) &&
        Objects.equals(this.snippet, videoCategory.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, id, kind, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCategory {\n");
    
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

