package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SuperChatEventSnippet;

/**
 * A &#x60;__superChatEvent__&#x60; resource represents a Super Chat purchase on a YouTube channel.
 */
@ApiModel(description = "A `__superChatEvent__` resource represents a Super Chat purchase on a YouTube channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class SuperChatEvent   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#superChatEvent";

  @JsonProperty("snippet")
  private SuperChatEventSnippet snippet;

  public SuperChatEvent etag(String etag) {
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

  public SuperChatEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID that YouTube assigns to uniquely identify the Super Chat event.
   * @return id
  **/
  @ApiModelProperty(value = "The ID that YouTube assigns to uniquely identify the Super Chat event.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SuperChatEvent kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string `\"youtube#superChatEvent\"`.
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string `\"youtube#superChatEvent\"`.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public SuperChatEvent snippet(SuperChatEventSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public SuperChatEventSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(SuperChatEventSnippet snippet) {
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
    SuperChatEvent superChatEvent = (SuperChatEvent) o;
    return Objects.equals(this.etag, superChatEvent.etag) &&
        Objects.equals(this.id, superChatEvent.id) &&
        Objects.equals(this.kind, superChatEvent.kind) &&
        Objects.equals(this.snippet, superChatEvent.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, id, kind, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperChatEvent {\n");
    
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

