package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LiveChatMessageAuthorDetails;
import org.openapitools.model.LiveChatMessageSnippet;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A *liveChatMessage* resource represents a chat message in a YouTube Live Chat.
 */
@ApiModel(description = "A *liveChatMessage* resource represents a chat message in a YouTube Live Chat.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveChatMessage   {
  @JsonProperty("authorDetails")
  private LiveChatMessageAuthorDetails authorDetails;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#liveChatMessage";

  @JsonProperty("snippet")
  private LiveChatMessageSnippet snippet;

  public LiveChatMessage authorDetails(LiveChatMessageAuthorDetails authorDetails) {
    this.authorDetails = authorDetails;
    return this;
  }

  /**
   * Get authorDetails
   * @return authorDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public LiveChatMessageAuthorDetails getAuthorDetails() {
    return authorDetails;
  }

  public void setAuthorDetails(LiveChatMessageAuthorDetails authorDetails) {
    this.authorDetails = authorDetails;
  }

  public LiveChatMessage etag(String etag) {
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

  public LiveChatMessage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID that YouTube assigns to uniquely identify the message.
   * @return id
  */
  @ApiModelProperty(value = "The ID that YouTube assigns to uniquely identify the message.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LiveChatMessage kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#liveChatMessage\".
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#liveChatMessage\".")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public LiveChatMessage snippet(LiveChatMessageSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @ApiModelProperty(value = "")

  @Valid

  public LiveChatMessageSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(LiveChatMessageSnippet snippet) {
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
    LiveChatMessage liveChatMessage = (LiveChatMessage) o;
    return Objects.equals(this.authorDetails, liveChatMessage.authorDetails) &&
        Objects.equals(this.etag, liveChatMessage.etag) &&
        Objects.equals(this.id, liveChatMessage.id) &&
        Objects.equals(this.kind, liveChatMessage.kind) &&
        Objects.equals(this.snippet, liveChatMessage.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorDetails, etag, id, kind, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatMessage {\n");
    
    sb.append("    authorDetails: ").append(toIndentedString(authorDetails)).append("\n");
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

