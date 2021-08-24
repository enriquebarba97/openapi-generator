package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.ChannelAuditDetails;
import org.openapitools.model.ChannelBrandingSettings;
import org.openapitools.model.ChannelContentDetails;
import org.openapitools.model.ChannelContentOwnerDetails;
import org.openapitools.model.ChannelConversionPings;
import org.openapitools.model.ChannelLocalization;
import org.openapitools.model.ChannelSnippet;
import org.openapitools.model.ChannelStatistics;
import org.openapitools.model.ChannelStatus;
import org.openapitools.model.ChannelTopicDetails;

/**
 * A *channel* resource contains information about a YouTube channel.
 */
@ApiModel(description = "A *channel* resource contains information about a YouTube channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class Channel   {
  @JsonProperty("auditDetails")
  private ChannelAuditDetails auditDetails;

  @JsonProperty("brandingSettings")
  private ChannelBrandingSettings brandingSettings;

  @JsonProperty("contentDetails")
  private ChannelContentDetails contentDetails;

  @JsonProperty("contentOwnerDetails")
  private ChannelContentOwnerDetails contentOwnerDetails;

  @JsonProperty("conversionPings")
  private ChannelConversionPings conversionPings;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#channel";

  @JsonProperty("localizations")
  private Map<String, ChannelLocalization> localizations = null;

  @JsonProperty("snippet")
  private ChannelSnippet snippet;

  @JsonProperty("statistics")
  private ChannelStatistics statistics;

  @JsonProperty("status")
  private ChannelStatus status;

  @JsonProperty("topicDetails")
  private ChannelTopicDetails topicDetails;

  public Channel auditDetails(ChannelAuditDetails auditDetails) {
    this.auditDetails = auditDetails;
    return this;
  }

   /**
   * Get auditDetails
   * @return auditDetails
  **/
  @ApiModelProperty(value = "")
  public ChannelAuditDetails getAuditDetails() {
    return auditDetails;
  }

  public void setAuditDetails(ChannelAuditDetails auditDetails) {
    this.auditDetails = auditDetails;
  }

  public Channel brandingSettings(ChannelBrandingSettings brandingSettings) {
    this.brandingSettings = brandingSettings;
    return this;
  }

   /**
   * Get brandingSettings
   * @return brandingSettings
  **/
  @ApiModelProperty(value = "")
  public ChannelBrandingSettings getBrandingSettings() {
    return brandingSettings;
  }

  public void setBrandingSettings(ChannelBrandingSettings brandingSettings) {
    this.brandingSettings = brandingSettings;
  }

  public Channel contentDetails(ChannelContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

   /**
   * Get contentDetails
   * @return contentDetails
  **/
  @ApiModelProperty(value = "")
  public ChannelContentDetails getContentDetails() {
    return contentDetails;
  }

  public void setContentDetails(ChannelContentDetails contentDetails) {
    this.contentDetails = contentDetails;
  }

  public Channel contentOwnerDetails(ChannelContentOwnerDetails contentOwnerDetails) {
    this.contentOwnerDetails = contentOwnerDetails;
    return this;
  }

   /**
   * Get contentOwnerDetails
   * @return contentOwnerDetails
  **/
  @ApiModelProperty(value = "")
  public ChannelContentOwnerDetails getContentOwnerDetails() {
    return contentOwnerDetails;
  }

  public void setContentOwnerDetails(ChannelContentOwnerDetails contentOwnerDetails) {
    this.contentOwnerDetails = contentOwnerDetails;
  }

  public Channel conversionPings(ChannelConversionPings conversionPings) {
    this.conversionPings = conversionPings;
    return this;
  }

   /**
   * Get conversionPings
   * @return conversionPings
  **/
  @ApiModelProperty(value = "")
  public ChannelConversionPings getConversionPings() {
    return conversionPings;
  }

  public void setConversionPings(ChannelConversionPings conversionPings) {
    this.conversionPings = conversionPings;
  }

  public Channel etag(String etag) {
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

  public Channel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the channel.
   * @return id
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the channel.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Channel kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#channel\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#channel\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Channel localizations(Map<String, ChannelLocalization> localizations) {
    this.localizations = localizations;
    return this;
  }

  public Channel putLocalizationsItem(String key, ChannelLocalization localizationsItem) {
    if (this.localizations == null) {
      this.localizations = new HashMap<String, ChannelLocalization>();
    }
    this.localizations.put(key, localizationsItem);
    return this;
  }

   /**
   * Localizations for different languages
   * @return localizations
  **/
  @ApiModelProperty(value = "Localizations for different languages")
  public Map<String, ChannelLocalization> getLocalizations() {
    return localizations;
  }

  public void setLocalizations(Map<String, ChannelLocalization> localizations) {
    this.localizations = localizations;
  }

  public Channel snippet(ChannelSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public ChannelSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(ChannelSnippet snippet) {
    this.snippet = snippet;
  }

  public Channel statistics(ChannelStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(value = "")
  public ChannelStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(ChannelStatistics statistics) {
    this.statistics = statistics;
  }

  public Channel status(ChannelStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public ChannelStatus getStatus() {
    return status;
  }

  public void setStatus(ChannelStatus status) {
    this.status = status;
  }

  public Channel topicDetails(ChannelTopicDetails topicDetails) {
    this.topicDetails = topicDetails;
    return this;
  }

   /**
   * Get topicDetails
   * @return topicDetails
  **/
  @ApiModelProperty(value = "")
  public ChannelTopicDetails getTopicDetails() {
    return topicDetails;
  }

  public void setTopicDetails(ChannelTopicDetails topicDetails) {
    this.topicDetails = topicDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Channel channel = (Channel) o;
    return Objects.equals(this.auditDetails, channel.auditDetails) &&
        Objects.equals(this.brandingSettings, channel.brandingSettings) &&
        Objects.equals(this.contentDetails, channel.contentDetails) &&
        Objects.equals(this.contentOwnerDetails, channel.contentOwnerDetails) &&
        Objects.equals(this.conversionPings, channel.conversionPings) &&
        Objects.equals(this.etag, channel.etag) &&
        Objects.equals(this.id, channel.id) &&
        Objects.equals(this.kind, channel.kind) &&
        Objects.equals(this.localizations, channel.localizations) &&
        Objects.equals(this.snippet, channel.snippet) &&
        Objects.equals(this.statistics, channel.statistics) &&
        Objects.equals(this.status, channel.status) &&
        Objects.equals(this.topicDetails, channel.topicDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditDetails, brandingSettings, contentDetails, contentOwnerDetails, conversionPings, etag, id, kind, localizations, snippet, statistics, status, topicDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Channel {\n");
    
    sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
    sb.append("    brandingSettings: ").append(toIndentedString(brandingSettings)).append("\n");
    sb.append("    contentDetails: ").append(toIndentedString(contentDetails)).append("\n");
    sb.append("    contentOwnerDetails: ").append(toIndentedString(contentOwnerDetails)).append("\n");
    sb.append("    conversionPings: ").append(toIndentedString(conversionPings)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    localizations: ").append(toIndentedString(localizations)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    topicDetails: ").append(toIndentedString(topicDetails)).append("\n");
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

