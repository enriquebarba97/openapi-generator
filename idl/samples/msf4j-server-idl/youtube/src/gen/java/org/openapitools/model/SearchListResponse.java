package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PageInfo;
import org.openapitools.model.SearchResult;

/**
 * SearchListResponse
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class SearchListResponse   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("items")
  private List<SearchResult> items = null;

  @JsonProperty("kind")
  private String kind = "youtube#searchListResponse";

  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("pageInfo")
  private PageInfo pageInfo;

  @JsonProperty("prevPageToken")
  private String prevPageToken;

  @JsonProperty("regionCode")
  private String regionCode;

  @JsonProperty("tokenPagination")
  private Object tokenPagination;

  @JsonProperty("visitorId")
  private String visitorId;

  public SearchListResponse etag(String etag) {
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

  public SearchListResponse eventId(String eventId) {
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

  public SearchListResponse items(List<SearchResult> items) {
    this.items = items;
    return this;
  }

  public SearchListResponse addItemsItem(SearchResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<SearchResult>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Pagination information for token pagination.
   * @return items
  **/
  @ApiModelProperty(value = "Pagination information for token pagination.")
  public List<SearchResult> getItems() {
    return items;
  }

  public void setItems(List<SearchResult> items) {
    this.items = items;
  }

  public SearchListResponse kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#searchListResponse\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#searchListResponse\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public SearchListResponse nextPageToken(String nextPageToken) {
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

  public SearchListResponse pageInfo(PageInfo pageInfo) {
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

  public SearchListResponse prevPageToken(String prevPageToken) {
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

  public SearchListResponse regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * Get regionCode
   * @return regionCode
  **/
  @ApiModelProperty(value = "")
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public SearchListResponse tokenPagination(Object tokenPagination) {
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

  public SearchListResponse visitorId(String visitorId) {
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
    SearchListResponse searchListResponse = (SearchListResponse) o;
    return Objects.equals(this.etag, searchListResponse.etag) &&
        Objects.equals(this.eventId, searchListResponse.eventId) &&
        Objects.equals(this.items, searchListResponse.items) &&
        Objects.equals(this.kind, searchListResponse.kind) &&
        Objects.equals(this.nextPageToken, searchListResponse.nextPageToken) &&
        Objects.equals(this.pageInfo, searchListResponse.pageInfo) &&
        Objects.equals(this.prevPageToken, searchListResponse.prevPageToken) &&
        Objects.equals(this.regionCode, searchListResponse.regionCode) &&
        Objects.equals(this.tokenPagination, searchListResponse.tokenPagination) &&
        Objects.equals(this.visitorId, searchListResponse.visitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, eventId, items, kind, nextPageToken, pageInfo, prevPageToken, regionCode, tokenPagination, visitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchListResponse {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    prevPageToken: ").append(toIndentedString(prevPageToken)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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

