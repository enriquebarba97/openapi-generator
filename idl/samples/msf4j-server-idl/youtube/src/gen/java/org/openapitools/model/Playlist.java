package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.PlaylistContentDetails;
import org.openapitools.model.PlaylistLocalization;
import org.openapitools.model.PlaylistPlayer;
import org.openapitools.model.PlaylistSnippet;
import org.openapitools.model.PlaylistStatus;

/**
 * A *playlist* resource represents a YouTube playlist. A playlist is a collection of videos that can be viewed sequentially and shared with other users. A playlist can contain up to 200 videos, and YouTube does not limit the number of playlists that each user creates. By default, playlists are publicly visible to other users, but playlists can be public or private. YouTube also uses playlists to identify special collections of videos for a channel, such as: - uploaded videos - favorite videos - positively rated (liked) videos - watch history - watch later To be more specific, these lists are associated with a channel, which is a collection of a person, group, or company&#39;s videos, playlists, and other YouTube information. You can retrieve the playlist IDs for each of these lists from the channel resource for a given channel. You can then use the playlistItems.list method to retrieve any of those lists. You can also add or remove items from those lists by calling the playlistItems.insert and playlistItems.delete methods.
 */
@ApiModel(description = "A *playlist* resource represents a YouTube playlist. A playlist is a collection of videos that can be viewed sequentially and shared with other users. A playlist can contain up to 200 videos, and YouTube does not limit the number of playlists that each user creates. By default, playlists are publicly visible to other users, but playlists can be public or private. YouTube also uses playlists to identify special collections of videos for a channel, such as: - uploaded videos - favorite videos - positively rated (liked) videos - watch history - watch later To be more specific, these lists are associated with a channel, which is a collection of a person, group, or company's videos, playlists, and other YouTube information. You can retrieve the playlist IDs for each of these lists from the channel resource for a given channel. You can then use the playlistItems.list method to retrieve any of those lists. You can also add or remove items from those lists by calling the playlistItems.insert and playlistItems.delete methods.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class Playlist   {
  @JsonProperty("contentDetails")
  private PlaylistContentDetails contentDetails;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#playlist";

  @JsonProperty("localizations")
  private Map<String, PlaylistLocalization> localizations = null;

  @JsonProperty("player")
  private PlaylistPlayer player;

  @JsonProperty("snippet")
  private PlaylistSnippet snippet;

  @JsonProperty("status")
  private PlaylistStatus status;

  public Playlist contentDetails(PlaylistContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

   /**
   * Get contentDetails
   * @return contentDetails
  **/
  @ApiModelProperty(value = "")
  public PlaylistContentDetails getContentDetails() {
    return contentDetails;
  }

  public void setContentDetails(PlaylistContentDetails contentDetails) {
    this.contentDetails = contentDetails;
  }

  public Playlist etag(String etag) {
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

  public Playlist id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the playlist.
   * @return id
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the playlist.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Playlist kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#playlist\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#playlist\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Playlist localizations(Map<String, PlaylistLocalization> localizations) {
    this.localizations = localizations;
    return this;
  }

  public Playlist putLocalizationsItem(String key, PlaylistLocalization localizationsItem) {
    if (this.localizations == null) {
      this.localizations = new HashMap<String, PlaylistLocalization>();
    }
    this.localizations.put(key, localizationsItem);
    return this;
  }

   /**
   * Localizations for different languages
   * @return localizations
  **/
  @ApiModelProperty(value = "Localizations for different languages")
  public Map<String, PlaylistLocalization> getLocalizations() {
    return localizations;
  }

  public void setLocalizations(Map<String, PlaylistLocalization> localizations) {
    this.localizations = localizations;
  }

  public Playlist player(PlaylistPlayer player) {
    this.player = player;
    return this;
  }

   /**
   * Get player
   * @return player
  **/
  @ApiModelProperty(value = "")
  public PlaylistPlayer getPlayer() {
    return player;
  }

  public void setPlayer(PlaylistPlayer player) {
    this.player = player;
  }

  public Playlist snippet(PlaylistSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public PlaylistSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(PlaylistSnippet snippet) {
    this.snippet = snippet;
  }

  public Playlist status(PlaylistStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public PlaylistStatus getStatus() {
    return status;
  }

  public void setStatus(PlaylistStatus status) {
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
    Playlist playlist = (Playlist) o;
    return Objects.equals(this.contentDetails, playlist.contentDetails) &&
        Objects.equals(this.etag, playlist.etag) &&
        Objects.equals(this.id, playlist.id) &&
        Objects.equals(this.kind, playlist.kind) &&
        Objects.equals(this.localizations, playlist.localizations) &&
        Objects.equals(this.player, playlist.player) &&
        Objects.equals(this.snippet, playlist.snippet) &&
        Objects.equals(this.status, playlist.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDetails, etag, id, kind, localizations, player, snippet, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Playlist {\n");
    
    sb.append("    contentDetails: ").append(toIndentedString(contentDetails)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    localizations: ").append(toIndentedString(localizations)).append("\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
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

