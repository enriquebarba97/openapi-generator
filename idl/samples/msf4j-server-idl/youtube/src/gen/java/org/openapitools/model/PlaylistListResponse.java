package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PageInfo;
import org.openapitools.model.Playlist;

/**
 * PlaylistListResponse
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class PlaylistListResponse   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("items")
  private List<Playlist> items = null;

  @JsonProperty("kind")
  private String kind = "youtube#playlistListResponse";

  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("pageInfo")
  private PageInfo pageInfo;

  @JsonProperty("prevPageToken")
  private String prevPageToken;

  @JsonProperty("tokenPagination")
  private Object tokenPagination;

  @JsonProperty("visitorId")
  private String visitorId;

  public PlaylistListResponse etag(String etag) {
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

  public PlaylistListResponse eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Serialized EventId of the request which produced this response.
   * @return eventId
  **/
  @ApiModelProperty(value = "Serialized EventId of the request which produced this response.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public PlaylistListResponse items(List<Playlist> items) {
    this.items = items;
    return this;
  }

  public PlaylistListResponse addItemsItem(Playlist itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Playlist>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of playlists that match the request criteria
   * @return items
  **/
  @ApiModelProperty(value = "A list of playlists that match the request criteria")
  public List<Playlist> getItems() {
    return items;
  }

  public void setItems(List<Playlist> items) {
    this.items = items;
  }

  public PlaylistListResponse kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#playlistListResponse\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#playlistListResponse\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public PlaylistListResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
   * @return nextPageToken
  **/
  @ApiModelProperty(value = "The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public PlaylistListResponse pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @ApiModelProperty(value = "")
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  public PlaylistListResponse prevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

   /**
   * The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.
   * @return prevPageToken
  **/
  @ApiModelProperty(value = "The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.")
  public String getPrevPageToken() {
    return prevPageToken;
  }

  public void setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
  }

  public PlaylistListResponse tokenPagination(Object tokenPagination) {
    this.tokenPagination = tokenPagination;
    return this;
  }

   /**
   * Stub token pagination template to suppress results.
   * @return tokenPagination
  **/
  @ApiModelProperty(value = "Stub token pagination template to suppress results.")
  public Object getTokenPagination() {
    return tokenPagination;
  }

  public void setTokenPagination(Object tokenPagination) {
    this.tokenPagination = tokenPagination;
  }

  public PlaylistListResponse visitorId(String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

   /**
   * The visitorId identifies the visitor.
   * @return visitorId
  **/
  @ApiModelProperty(value = "The visitorId identifies the visitor.")
  public String getVisitorId() {
    return visitorId;
  }

  public void setVisitorId(String visitorId) {
    this.visitorId = visitorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistListResponse playlistListResponse = (PlaylistListResponse) o;
    return Objects.equals(this.etag, playlistListResponse.etag) &&
        Objects.equals(this.eventId, playlistListResponse.eventId) &&
        Objects.equals(this.items, playlistListResponse.items) &&
        Objects.equals(this.kind, playlistListResponse.kind) &&
        Objects.equals(this.nextPageToken, playlistListResponse.nextPageToken) &&
        Objects.equals(this.pageInfo, playlistListResponse.pageInfo) &&
        Objects.equals(this.prevPageToken, playlistListResponse.prevPageToken) &&
        Objects.equals(this.tokenPagination, playlistListResponse.tokenPagination) &&
        Objects.equals(this.visitorId, playlistListResponse.visitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, eventId, items, kind, nextPageToken, pageInfo, prevPageToken, tokenPagination, visitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistListResponse {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    prevPageToken: ").append(toIndentedString(prevPageToken)).append("\n");
    sb.append("    tokenPagination: ").append(toIndentedString(tokenPagination)).append("\n");
    sb.append("    visitorId: ").append(toIndentedString(visitorId)).append("\n");
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

