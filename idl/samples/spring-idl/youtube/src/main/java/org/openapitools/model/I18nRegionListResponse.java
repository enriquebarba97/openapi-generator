package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.I18nRegion;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * I18nRegionListResponse
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class I18nRegionListResponse   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("items")
  @Valid
  private List<I18nRegion> items = null;

  @JsonProperty("kind")
  private String kind = "youtube#i18nRegionListResponse";

  @JsonProperty("visitorId")
  private String visitorId;

  public I18nRegionListResponse etag(String etag) {
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

  public I18nRegionListResponse eventId(String eventId) {
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

  public I18nRegionListResponse items(List<I18nRegion> items) {
    this.items = items;
    return this;
  }

  public I18nRegionListResponse addItemsItem(I18nRegion itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * A list of regions where YouTube is available. In this map, the i18n region ID is the map key, and its value is the corresponding i18nRegion resource.
   * @return items
  */
  @ApiModelProperty(value = "A list of regions where YouTube is available. In this map, the i18n region ID is the map key, and its value is the corresponding i18nRegion resource.")

  @Valid

  public List<I18nRegion> getItems() {
    return items;
  }

  public void setItems(List<I18nRegion> items) {
    this.items = items;
  }

  public I18nRegionListResponse kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#i18nRegionListResponse\".
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#i18nRegionListResponse\".")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public I18nRegionListResponse visitorId(String visitorId) {
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
    I18nRegionListResponse i18nRegionListResponse = (I18nRegionListResponse) o;
    return Objects.equals(this.etag, i18nRegionListResponse.etag) &&
        Objects.equals(this.eventId, i18nRegionListResponse.eventId) &&
        Objects.equals(this.items, i18nRegionListResponse.items) &&
        Objects.equals(this.kind, i18nRegionListResponse.kind) &&
        Objects.equals(this.visitorId, i18nRegionListResponse.visitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, eventId, items, kind, visitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class I18nRegionListResponse {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

