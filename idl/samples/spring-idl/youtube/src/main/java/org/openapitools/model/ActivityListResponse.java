package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Activity;
import org.openapitools.model.PageInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActivityListResponse
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ActivityListResponse   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("items")
  @Valid
  private List<Activity> items = null;

  @JsonProperty("kind")
  private String kind = "youtube#activityListResponse";

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

  public ActivityListResponse etag(String etag) {
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

  public ActivityListResponse eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Serialized EventId of the request which produced this response.
   * @return eventId
  */
  @ApiModelProperty(value = "Serialized EventId of the request which produced this response.")


  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ActivityListResponse items(List<Activity> items) {
    this.items = items;
    return this;
  }

  public ActivityListResponse addItemsItem(Activity itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Activity> getItems() {
    return items;
  }

  public void setItems(List<Activity> items) {
    this.items = items;
  }

  public ActivityListResponse kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#activityListResponse\".
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#activityListResponse\".")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ActivityListResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
   * @return nextPageToken
  */
  @ApiModelProperty(value = "The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public ActivityListResponse pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   * @return pageInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  public ActivityListResponse prevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  /**
   * The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.
   * @return prevPageToken
  */
  @ApiModelProperty(value = "The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.")


  public String getPrevPageToken() {
    return prevPageToken;
  }

  public void setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
  }

  public ActivityListResponse tokenPagination(Object tokenPagination) {
    this.tokenPagination = tokenPagination;
    return this;
  }

  /**
   * Stub token pagination template to suppress results.
   * @return tokenPagination
  */
  @ApiModelProperty(value = "Stub token pagination template to suppress results.")


  public Object getTokenPagination() {
    return tokenPagination;
  }

  public void setTokenPagination(Object tokenPagination) {
    this.tokenPagination = tokenPagination;
  }

  public ActivityListResponse visitorId(String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

  /**
   * The visitorId identifies the visitor.
   * @return visitorId
  */
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
    ActivityListResponse activityListResponse = (ActivityListResponse) o;
    return Objects.equals(this.etag, activityListResponse.etag) &&
        Objects.equals(this.eventId, activityListResponse.eventId) &&
        Objects.equals(this.items, activityListResponse.items) &&
        Objects.equals(this.kind, activityListResponse.kind) &&
        Objects.equals(this.nextPageToken, activityListResponse.nextPageToken) &&
        Objects.equals(this.pageInfo, activityListResponse.pageInfo) &&
        Objects.equals(this.prevPageToken, activityListResponse.prevPageToken) &&
        Objects.equals(this.tokenPagination, activityListResponse.tokenPagination) &&
        Objects.equals(this.visitorId, activityListResponse.visitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, eventId, items, kind, nextPageToken, pageInfo, prevPageToken, tokenPagination, visitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityListResponse {\n");
    
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

