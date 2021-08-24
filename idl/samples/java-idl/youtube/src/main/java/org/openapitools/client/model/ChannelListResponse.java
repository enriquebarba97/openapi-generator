/*
 * YouTube Data API v3
 * The YouTube Data API v3 is an API that provides access to YouTube data, such as videos, playlists, and channels.
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Channel;
import org.openapitools.client.model.PageInfo;

/**
 * ChannelListResponse
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaIDLCodegen", date = "2021-08-24T20:55:04.712703200+02:00[Europe/Paris]")
public class ChannelListResponse {
  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Channel> items = null;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind = "youtube#channelListResponse";

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_PAGE_INFO = "pageInfo";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private PageInfo pageInfo;

  public static final String SERIALIZED_NAME_PREV_PAGE_TOKEN = "prevPageToken";
  @SerializedName(SERIALIZED_NAME_PREV_PAGE_TOKEN)
  private String prevPageToken;

  public static final String SERIALIZED_NAME_TOKEN_PAGINATION = "tokenPagination";
  @SerializedName(SERIALIZED_NAME_TOKEN_PAGINATION)
  private Object tokenPagination;

  public static final String SERIALIZED_NAME_VISITOR_ID = "visitorId";
  @SerializedName(SERIALIZED_NAME_VISITOR_ID)
  private String visitorId;


  public ChannelListResponse etag(String etag) {
    
    this.etag = etag;
    return this;
  }

   /**
   * Etag of this resource.
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Etag of this resource.")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    this.etag = etag;
  }


  public ChannelListResponse eventId(String eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * Serialized EventId of the request which produced this response.
   * @return eventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Serialized EventId of the request which produced this response.")

  public String getEventId() {
    return eventId;
  }


  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public ChannelListResponse items(List<Channel> items) {
    
    this.items = items;
    return this;
  }

  public ChannelListResponse addItemsItem(Channel itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Channel>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Channel> getItems() {
    return items;
  }


  public void setItems(List<Channel> items) {
    this.items = items;
  }


  public ChannelListResponse kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \&quot;youtube#channelListResponse\&quot;.
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#channelListResponse\".")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public ChannelListResponse nextPageToken(String nextPageToken) {
    
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.")

  public String getNextPageToken() {
    return nextPageToken;
  }


  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public ChannelListResponse pageInfo(PageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public ChannelListResponse prevPageToken(String prevPageToken) {
    
    this.prevPageToken = prevPageToken;
    return this;
  }

   /**
   * The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.
   * @return prevPageToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.")

  public String getPrevPageToken() {
    return prevPageToken;
  }


  public void setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
  }


  public ChannelListResponse tokenPagination(Object tokenPagination) {
    
    this.tokenPagination = tokenPagination;
    return this;
  }

   /**
   * Stub token pagination template to suppress results.
   * @return tokenPagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stub token pagination template to suppress results.")

  public Object getTokenPagination() {
    return tokenPagination;
  }


  public void setTokenPagination(Object tokenPagination) {
    this.tokenPagination = tokenPagination;
  }


  public ChannelListResponse visitorId(String visitorId) {
    
    this.visitorId = visitorId;
    return this;
  }

   /**
   * The visitorId identifies the visitor.
   * @return visitorId
  **/
  @javax.annotation.Nullable
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
    ChannelListResponse channelListResponse = (ChannelListResponse) o;
    return Objects.equals(this.etag, channelListResponse.etag) &&
        Objects.equals(this.eventId, channelListResponse.eventId) &&
        Objects.equals(this.items, channelListResponse.items) &&
        Objects.equals(this.kind, channelListResponse.kind) &&
        Objects.equals(this.nextPageToken, channelListResponse.nextPageToken) &&
        Objects.equals(this.pageInfo, channelListResponse.pageInfo) &&
        Objects.equals(this.prevPageToken, channelListResponse.prevPageToken) &&
        Objects.equals(this.tokenPagination, channelListResponse.tokenPagination) &&
        Objects.equals(this.visitorId, channelListResponse.visitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, eventId, items, kind, nextPageToken, pageInfo, prevPageToken, tokenPagination, visitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelListResponse {\n");
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

