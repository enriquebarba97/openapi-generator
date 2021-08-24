package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CommentThreadReplies;
import org.openapitools.model.CommentThreadSnippet;

/**
 * A *comment thread* represents information that applies to a top level comment and all its replies. It can also include the top level comment itself and some of the replies.
 */
@ApiModel(description = "A *comment thread* represents information that applies to a top level comment and all its replies. It can also include the top level comment itself and some of the replies.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class CommentThread   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#commentThread";

  @JsonProperty("replies")
  private CommentThreadReplies replies;

  @JsonProperty("snippet")
  private CommentThreadSnippet snippet;

  public CommentThread etag(String etag) {
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

  public CommentThread id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the comment thread.
   * @return id
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the comment thread.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CommentThread kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#commentThread\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#commentThread\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public CommentThread replies(CommentThreadReplies replies) {
    this.replies = replies;
    return this;
  }

   /**
   * Get replies
   * @return replies
  **/
  @ApiModelProperty(value = "")
  public CommentThreadReplies getReplies() {
    return replies;
  }

  public void setReplies(CommentThreadReplies replies) {
    this.replies = replies;
  }

  public CommentThread snippet(CommentThreadSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public CommentThreadSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(CommentThreadSnippet snippet) {
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
    CommentThread commentThread = (CommentThread) o;
    return Objects.equals(this.etag, commentThread.etag) &&
        Objects.equals(this.id, commentThread.id) &&
        Objects.equals(this.kind, commentThread.kind) &&
        Objects.equals(this.replies, commentThread.replies) &&
        Objects.equals(this.snippet, commentThread.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, id, kind, replies, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentThread {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    replies: ").append(toIndentedString(replies)).append("\n");
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

