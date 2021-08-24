package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PlaylistItemContentDetails;
import org.openapitools.model.PlaylistItemSnippet;
import org.openapitools.model.PlaylistItemStatus;

/**
 * A *playlistItem* resource identifies another resource, such as a video, that is included in a playlist. In addition, the playlistItem resource contains details about the included resource that pertain specifically to how that resource is used in that playlist. YouTube uses playlists to identify special collections of videos for a channel, such as: - uploaded videos - favorite videos - positively rated (liked) videos - watch history - watch later To be more specific, these lists are associated with a channel, which is a collection of a person, group, or company&#39;s videos, playlists, and other YouTube information. You can retrieve the playlist IDs for each of these lists from the channel resource for a given channel. You can then use the playlistItems.list method to retrieve any of those lists. You can also add or remove items from those lists by calling the playlistItems.insert and playlistItems.delete methods. For example, if a user gives a positive rating to a video, you would insert that video into the liked videos playlist for that user&#39;s channel.
 */
@ApiModel(description = "A *playlistItem* resource identifies another resource, such as a video, that is included in a playlist. In addition, the playlistItem resource contains details about the included resource that pertain specifically to how that resource is used in that playlist. YouTube uses playlists to identify special collections of videos for a channel, such as: - uploaded videos - favorite videos - positively rated (liked) videos - watch history - watch later To be more specific, these lists are associated with a channel, which is a collection of a person, group, or company's videos, playlists, and other YouTube information. You can retrieve the playlist IDs for each of these lists from the channel resource for a given channel. You can then use the playlistItems.list method to retrieve any of those lists. You can also add or remove items from those lists by calling the playlistItems.insert and playlistItems.delete methods. For example, if a user gives a positive rating to a video, you would insert that video into the liked videos playlist for that user's channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class PlaylistItem   {
  @JsonProperty("contentDetails")
  private PlaylistItemContentDetails contentDetails;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#playlistItem";

  @JsonProperty("snippet")
  private PlaylistItemSnippet snippet;

  @JsonProperty("status")
  private PlaylistItemStatus status;

  public PlaylistItem contentDetails(PlaylistItemContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

   /**
   * Get contentDetails
   * @return contentDetails
  **/
  @ApiModelProperty(value = "")
  public PlaylistItemContentDetails getContentDetails() {
    return contentDetails;
  }

  public void setContentDetails(PlaylistItemContentDetails contentDetails) {
    this.contentDetails = contentDetails;
  }

  public PlaylistItem etag(String etag) {
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

  public PlaylistItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the playlist item.
   * @return id
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the playlist item.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PlaylistItem kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#playlistItem\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#playlistItem\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public PlaylistItem snippet(PlaylistItemSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public PlaylistItemSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(PlaylistItemSnippet snippet) {
    this.snippet = snippet;
  }

  public PlaylistItem status(PlaylistItemStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public PlaylistItemStatus getStatus() {
    return status;
  }

  public void setStatus(PlaylistItemStatus status) {
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
    PlaylistItem playlistItem = (PlaylistItem) o;
    return Objects.equals(this.contentDetails, playlistItem.contentDetails) &&
        Objects.equals(this.etag, playlistItem.etag) &&
        Objects.equals(this.id, playlistItem.id) &&
        Objects.equals(this.kind, playlistItem.kind) &&
        Objects.equals(this.snippet, playlistItem.snippet) &&
        Objects.equals(this.status, playlistItem.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDetails, etag, id, kind, snippet, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistItem {\n");
    
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

