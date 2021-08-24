package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.ChannelSectionContentDetails;
import org.openapitools.model.ChannelSectionLocalization;
import org.openapitools.model.ChannelSectionSnippet;
import org.openapitools.model.ChannelSectionTargeting;

/**
 * ChannelSection
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ChannelSection   {
  @JsonProperty("contentDetails")
  private ChannelSectionContentDetails contentDetails;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#channelSection";

  @JsonProperty("localizations")
  private Map<String, ChannelSectionLocalization> localizations = null;

  @JsonProperty("snippet")
  private ChannelSectionSnippet snippet;

  @JsonProperty("targeting")
  private ChannelSectionTargeting targeting;

  public ChannelSection contentDetails(ChannelSectionContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

   /**
   * Get contentDetails
   * @return contentDetails
  **/
  @ApiModelProperty(value = "")
  public ChannelSectionContentDetails getContentDetails() {
    return contentDetails;
  }

  public void setContentDetails(ChannelSectionContentDetails contentDetails) {
    this.contentDetails = contentDetails;
  }

  public ChannelSection etag(String etag) {
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

  public ChannelSection id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the channel section.
   * @return id
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the channel section.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChannelSection kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#channelSection\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#channelSection\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ChannelSection localizations(Map<String, ChannelSectionLocalization> localizations) {
    this.localizations = localizations;
    return this;
  }

  public ChannelSection putLocalizationsItem(String key, ChannelSectionLocalization localizationsItem) {
    if (this.localizations == null) {
      this.localizations = new HashMap<String, ChannelSectionLocalization>();
    }
    this.localizations.put(key, localizationsItem);
    return this;
  }

   /**
   * Localizations for different languages
   * @return localizations
  **/
  @ApiModelProperty(value = "Localizations for different languages")
  public Map<String, ChannelSectionLocalization> getLocalizations() {
    return localizations;
  }

  public void setLocalizations(Map<String, ChannelSectionLocalization> localizations) {
    this.localizations = localizations;
  }

  public ChannelSection snippet(ChannelSectionSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public ChannelSectionSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(ChannelSectionSnippet snippet) {
    this.snippet = snippet;
  }

  public ChannelSection targeting(ChannelSectionTargeting targeting) {
    this.targeting = targeting;
    return this;
  }

   /**
   * Get targeting
   * @return targeting
  **/
  @ApiModelProperty(value = "")
  public ChannelSectionTargeting getTargeting() {
    return targeting;
  }

  public void setTargeting(ChannelSectionTargeting targeting) {
    this.targeting = targeting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelSection channelSection = (ChannelSection) o;
    return Objects.equals(this.contentDetails, channelSection.contentDetails) &&
        Objects.equals(this.etag, channelSection.etag) &&
        Objects.equals(this.id, channelSection.id) &&
        Objects.equals(this.kind, channelSection.kind) &&
        Objects.equals(this.localizations, channelSection.localizations) &&
        Objects.equals(this.snippet, channelSection.snippet) &&
        Objects.equals(this.targeting, channelSection.targeting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDetails, etag, id, kind, localizations, snippet, targeting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelSection {\n");
    
    sb.append("    contentDetails: ").append(toIndentedString(contentDetails)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    localizations: ").append(toIndentedString(localizations)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
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

