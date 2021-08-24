package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openapitools.model.LiveChatMessage;
import org.openapitools.model.PageInfo;

/**
 * LiveChatMessageListResponse
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveChatMessageListResponse   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("items")
  private List<LiveChatMessage> items = null;

  @JsonProperty("kind")
  private String kind = "youtube#liveChatMessageListResponse";

  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("offlineAt")
  private Date offlineAt;

  @JsonProperty("pageInfo")
  private PageInfo pageInfo;

  @JsonProperty("pollingIntervalMillis")
  private Integer pollingIntervalMillis;

  @JsonProperty("tokenPagination")
  private Object tokenPagination;

  @JsonProperty("visitorId")
  private String visitorId;

  public LiveChatMessageListResponse etag(String etag) {
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

  public LiveChatMessageListResponse eventId(String eventId) {
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

  public LiveChatMessageListResponse items(List<LiveChatMessage> items) {
    this.items = items;
    return this;
  }

  public LiveChatMessageListResponse addItemsItem(LiveChatMessage itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<LiveChatMessage>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<LiveChatMessage> getItems() {
    return items;
  }

  public void setItems(List<LiveChatMessage> items) {
    this.items = items;
  }

  public LiveChatMessageListResponse kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#liveChatMessageListResponse\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#liveChatMessageListResponse\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public LiveChatMessageListResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Get nextPageToken
   * @return nextPageToken
  **/
  @ApiModelProperty(value = "")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public LiveChatMessageListResponse offlineAt(Date offlineAt) {
    this.offlineAt = offlineAt;
    return this;
  }

   /**
   * The date and time when the underlying stream went offline.
   * @return offlineAt
  **/
  @ApiModelProperty(value = "The date and time when the underlying stream went offline.")
  public Date getOfflineAt() {
    return offlineAt;
  }

  public void setOfflineAt(Date offlineAt) {
    this.offlineAt = offlineAt;
  }

  public LiveChatMessageListResponse pageInfo(PageInfo pageInfo) {
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

  public LiveChatMessageListResponse pollingIntervalMillis(Integer pollingIntervalMillis) {
    this.pollingIntervalMillis = pollingIntervalMillis;
    return this;
  }

   /**
   * The amount of time the client should wait before polling again.
   * @return pollingIntervalMillis
  **/
  @ApiModelProperty(value = "The amount of time the client should wait before polling again.")
  public Integer getPollingIntervalMillis() {
    return pollingIntervalMillis;
  }

  public void setPollingIntervalMillis(Integer pollingIntervalMillis) {
    this.pollingIntervalMillis = pollingIntervalMillis;
  }

  public LiveChatMessageListResponse tokenPagination(Object tokenPagination) {
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

  public LiveChatMessageListResponse visitorId(String visitorId) {
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
    LiveChatMessageListResponse liveChatMessageListResponse = (LiveChatMessageListResponse) o;
    return Objects.equals(this.etag, liveChatMessageListResponse.etag) &&
        Objects.equals(this.eventId, liveChatMessageListResponse.eventId) &&
        Objects.equals(this.items, liveChatMessageListResponse.items) &&
        Objects.equals(this.kind, liveChatMessageListResponse.kind) &&
        Objects.equals(this.nextPageToken, liveChatMessageListResponse.nextPageToken) &&
        Objects.equals(this.offlineAt, liveChatMessageListResponse.offlineAt) &&
        Objects.equals(this.pageInfo, liveChatMessageListResponse.pageInfo) &&
        Objects.equals(this.pollingIntervalMillis, liveChatMessageListResponse.pollingIntervalMillis) &&
        Objects.equals(this.tokenPagination, liveChatMessageListResponse.tokenPagination) &&
        Objects.equals(this.visitorId, liveChatMessageListResponse.visitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, eventId, items, kind, nextPageToken, offlineAt, pageInfo, pollingIntervalMillis, tokenPagination, visitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatMessageListResponse {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    offlineAt: ").append(toIndentedString(offlineAt)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    pollingIntervalMillis: ").append(toIndentedString(pollingIntervalMillis)).append("\n");
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

