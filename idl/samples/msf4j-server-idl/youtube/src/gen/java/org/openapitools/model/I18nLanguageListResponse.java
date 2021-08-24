package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.I18nLanguage;

/**
 * I18nLanguageListResponse
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class I18nLanguageListResponse   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("items")
  private List<I18nLanguage> items = null;

  @JsonProperty("kind")
  private String kind = "youtube#i18nLanguageListResponse";

  @JsonProperty("visitorId")
  private String visitorId;

  public I18nLanguageListResponse etag(String etag) {
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

  public I18nLanguageListResponse eventId(String eventId) {
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

  public I18nLanguageListResponse items(List<I18nLanguage> items) {
    this.items = items;
    return this;
  }

  public I18nLanguageListResponse addItemsItem(I18nLanguage itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<I18nLanguage>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of supported i18n languages. In this map, the i18n language ID is the map key, and its value is the corresponding i18nLanguage resource.
   * @return items
  **/
  @ApiModelProperty(value = "A list of supported i18n languages. In this map, the i18n language ID is the map key, and its value is the corresponding i18nLanguage resource.")
  public List<I18nLanguage> getItems() {
    return items;
  }

  public void setItems(List<I18nLanguage> items) {
    this.items = items;
  }

  public I18nLanguageListResponse kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#i18nLanguageListResponse\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#i18nLanguageListResponse\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public I18nLanguageListResponse visitorId(String visitorId) {
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
    I18nLanguageListResponse i18nLanguageListResponse = (I18nLanguageListResponse) o;
    return Objects.equals(this.etag, i18nLanguageListResponse.etag) &&
        Objects.equals(this.eventId, i18nLanguageListResponse.eventId) &&
        Objects.equals(this.items, i18nLanguageListResponse.items) &&
        Objects.equals(this.kind, i18nLanguageListResponse.kind) &&
        Objects.equals(this.visitorId, i18nLanguageListResponse.visitorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, eventId, items, kind, visitorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class I18nLanguageListResponse {\n");
    
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

