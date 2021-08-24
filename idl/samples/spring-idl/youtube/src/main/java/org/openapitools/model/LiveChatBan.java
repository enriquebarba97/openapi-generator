package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LiveChatBanSnippet;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A &#x60;__liveChatBan__&#x60; resource represents a ban for a YouTube live chat.
 */
@ApiModel(description = "A `__liveChatBan__` resource represents a ban for a YouTube live chat.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveChatBan   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#liveChatBan";

  @JsonProperty("snippet")
  private LiveChatBanSnippet snippet;

  public LiveChatBan etag(String etag) {
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

  public LiveChatBan id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID that YouTube assigns to uniquely identify the ban.
   * @return id
  */
  @ApiModelProperty(value = "The ID that YouTube assigns to uniquely identify the ban.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LiveChatBan kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string `\"youtube#liveChatBan\"`.
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string `\"youtube#liveChatBan\"`.")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public LiveChatBan snippet(LiveChatBanSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @ApiModelProperty(value = "")

  @Valid

  public LiveChatBanSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(LiveChatBanSnippet snippet) {
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
    LiveChatBan liveChatBan = (LiveChatBan) o;
    return Objects.equals(this.etag, liveChatBan.etag) &&
        Objects.equals(this.id, liveChatBan.id) &&
        Objects.equals(this.kind, liveChatBan.kind) &&
        Objects.equals(this.snippet, liveChatBan.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, id, kind, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatBan {\n");
    
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

