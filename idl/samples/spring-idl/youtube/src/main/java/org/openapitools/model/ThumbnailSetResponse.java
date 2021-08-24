package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ThumbnailDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ThumbnailSetResponse
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ThumbnailSetResponse   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("items")
  @Valid
  private List<ThumbnailDetails> items = null;

  @JsonProperty("kind")
  private String kind = "youtube#thumbnailSetResponse";

  @JsonProperty("visitorId")
  private String visitorId;

  public ThumbnailSetResponse etag(String etag) {
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

  public ThumbnailSetResponse eventId(String eventId) {
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

  public ThumbnailSetResponse items(List<ThumbnailDetails> items) {
    this.items = items;
    return this;
  }

  public ThumbnailSetResponse addItemsItem(ThumbnailDetails itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * A list of thumbnails.
   * @return items
  */
  @ApiModelProperty(value = "A list of thumbnails.")

  @Valid

  public List<ThumbnailDetails> getItems() {
    return items;
  }

  public void setItems(List<ThumbnailDetails> items) {
    this.items = items;
  }

  public ThumbnailSetResponse kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#thumbnailSetResponse\".
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#thumbnailSetResponse\".")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ThumbnailSetResponse visitorId(String visitorId) {
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
    ThumbnailSetResponse thumbnailSetResponse = (ThumbnailSetResponse) o;
    return Objects.equals(this.etag, thumbnailSetResponse.etag) &&
        Objects.equals(this.eventId, thumbnailSetResponse.eventId) &&
        Objects.equals(this.items, thumbnailSetResponse.items) &&
        Objects.equals(this.kind, thumbnailSetResponse.kind) &&
        Objects.equals(this.visitorId, thumbnailSetResponse.visitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, eventId, items, kind, visitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThumbnailSetResponse {\n");
    
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

