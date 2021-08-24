package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Branding properties for the channel view.
 */
@ApiModel(description = "Branding properties for the channel view.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ChannelSettings   {
  @JsonProperty("country")
  private String country;

  @JsonProperty("defaultLanguage")
  private String defaultLanguage;

  @JsonProperty("defaultTab")
  private String defaultTab;

  @JsonProperty("description")
  private String description;

  @JsonProperty("featuredChannelsTitle")
  private String featuredChannelsTitle;

  @JsonProperty("featuredChannelsUrls")
  @Valid
  private List<String> featuredChannelsUrls = null;

  @JsonProperty("keywords")
  private String keywords;

  @JsonProperty("moderateComments")
  private Boolean moderateComments;

  @JsonProperty("profileColor")
  private String profileColor;

  @JsonProperty("showBrowseView")
  private Boolean showBrowseView;

  @JsonProperty("showRelatedChannels")
  private Boolean showRelatedChannels;

  @JsonProperty("title")
  private String title;

  @JsonProperty("trackingAnalyticsAccountId")
  private String trackingAnalyticsAccountId;

  @JsonProperty("unsubscribedTrailer")
  private String unsubscribedTrailer;

  public ChannelSettings country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The country of the channel.
   * @return country
  */
  @ApiModelProperty(value = "The country of the channel.")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ChannelSettings defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * Get defaultLanguage
   * @return defaultLanguage
  */
  @ApiModelProperty(value = "")


  public String getDefaultLanguage() {
    return defaultLanguage;
  }

  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  public ChannelSettings defaultTab(String defaultTab) {
    this.defaultTab = defaultTab;
    return this;
  }

  /**
   * Which content tab users should see when viewing the channel.
   * @return defaultTab
  */
  @ApiModelProperty(value = "Which content tab users should see when viewing the channel.")


  public String getDefaultTab() {
    return defaultTab;
  }

  public void setDefaultTab(String defaultTab) {
    this.defaultTab = defaultTab;
  }

  public ChannelSettings description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Specifies the channel description.
   * @return description
  */
  @ApiModelProperty(value = "Specifies the channel description.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChannelSettings featuredChannelsTitle(String featuredChannelsTitle) {
    this.featuredChannelsTitle = featuredChannelsTitle;
    return this;
  }

  /**
   * Title for the featured channels tab.
   * @return featuredChannelsTitle
  */
  @ApiModelProperty(value = "Title for the featured channels tab.")


  public String getFeaturedChannelsTitle() {
    return featuredChannelsTitle;
  }

  public void setFeaturedChannelsTitle(String featuredChannelsTitle) {
    this.featuredChannelsTitle = featuredChannelsTitle;
  }

  public ChannelSettings featuredChannelsUrls(List<String> featuredChannelsUrls) {
    this.featuredChannelsUrls = featuredChannelsUrls;
    return this;
  }

  public ChannelSettings addFeaturedChannelsUrlsItem(String featuredChannelsUrlsItem) {
    if (this.featuredChannelsUrls == null) {
      this.featuredChannelsUrls = new ArrayList<>();
    }
    this.featuredChannelsUrls.add(featuredChannelsUrlsItem);
    return this;
  }

  /**
   * The list of featured channels.
   * @return featuredChannelsUrls
  */
  @ApiModelProperty(value = "The list of featured channels.")


  public List<String> getFeaturedChannelsUrls() {
    return featuredChannelsUrls;
  }

  public void setFeaturedChannelsUrls(List<String> featuredChannelsUrls) {
    this.featuredChannelsUrls = featuredChannelsUrls;
  }

  public ChannelSettings keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Lists keywords associated with the channel, comma-separated.
   * @return keywords
  */
  @ApiModelProperty(value = "Lists keywords associated with the channel, comma-separated.")


  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public ChannelSettings moderateComments(Boolean moderateComments) {
    this.moderateComments = moderateComments;
    return this;
  }

  /**
   * Whether user-submitted comments left on the channel page need to be approved by the channel owner to be publicly visible.
   * @return moderateComments
  */
  @ApiModelProperty(value = "Whether user-submitted comments left on the channel page need to be approved by the channel owner to be publicly visible.")


  public Boolean getModerateComments() {
    return moderateComments;
  }

  public void setModerateComments(Boolean moderateComments) {
    this.moderateComments = moderateComments;
  }

  public ChannelSettings profileColor(String profileColor) {
    this.profileColor = profileColor;
    return this;
  }

  /**
   * A prominent color that can be rendered on this channel page.
   * @return profileColor
  */
  @ApiModelProperty(value = "A prominent color that can be rendered on this channel page.")


  public String getProfileColor() {
    return profileColor;
  }

  public void setProfileColor(String profileColor) {
    this.profileColor = profileColor;
  }

  public ChannelSettings showBrowseView(Boolean showBrowseView) {
    this.showBrowseView = showBrowseView;
    return this;
  }

  /**
   * Whether the tab to browse the videos should be displayed.
   * @return showBrowseView
  */
  @ApiModelProperty(value = "Whether the tab to browse the videos should be displayed.")


  public Boolean getShowBrowseView() {
    return showBrowseView;
  }

  public void setShowBrowseView(Boolean showBrowseView) {
    this.showBrowseView = showBrowseView;
  }

  public ChannelSettings showRelatedChannels(Boolean showRelatedChannels) {
    this.showRelatedChannels = showRelatedChannels;
    return this;
  }

  /**
   * Whether related channels should be proposed.
   * @return showRelatedChannels
  */
  @ApiModelProperty(value = "Whether related channels should be proposed.")


  public Boolean getShowRelatedChannels() {
    return showRelatedChannels;
  }

  public void setShowRelatedChannels(Boolean showRelatedChannels) {
    this.showRelatedChannels = showRelatedChannels;
  }

  public ChannelSettings title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Specifies the channel title.
   * @return title
  */
  @ApiModelProperty(value = "Specifies the channel title.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ChannelSettings trackingAnalyticsAccountId(String trackingAnalyticsAccountId) {
    this.trackingAnalyticsAccountId = trackingAnalyticsAccountId;
    return this;
  }

  /**
   * The ID for a Google Analytics account to track and measure traffic to the channels.
   * @return trackingAnalyticsAccountId
  */
  @ApiModelProperty(value = "The ID for a Google Analytics account to track and measure traffic to the channels.")


  public String getTrackingAnalyticsAccountId() {
    return trackingAnalyticsAccountId;
  }

  public void setTrackingAnalyticsAccountId(String trackingAnalyticsAccountId) {
    this.trackingAnalyticsAccountId = trackingAnalyticsAccountId;
  }

  public ChannelSettings unsubscribedTrailer(String unsubscribedTrailer) {
    this.unsubscribedTrailer = unsubscribedTrailer;
    return this;
  }

  /**
   * The trailer of the channel, for users that are not subscribers.
   * @return unsubscribedTrailer
  */
  @ApiModelProperty(value = "The trailer of the channel, for users that are not subscribers.")


  public String getUnsubscribedTrailer() {
    return unsubscribedTrailer;
  }

  public void setUnsubscribedTrailer(String unsubscribedTrailer) {
    this.unsubscribedTrailer = unsubscribedTrailer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelSettings channelSettings = (ChannelSettings) o;
    return Objects.equals(this.country, channelSettings.country) &&
        Objects.equals(this.defaultLanguage, channelSettings.defaultLanguage) &&
        Objects.equals(this.defaultTab, channelSettings.defaultTab) &&
        Objects.equals(this.description, channelSettings.description) &&
        Objects.equals(this.featuredChannelsTitle, channelSettings.featuredChannelsTitle) &&
        Objects.equals(this.featuredChannelsUrls, channelSettings.featuredChannelsUrls) &&
        Objects.equals(this.keywords, channelSettings.keywords) &&
        Objects.equals(this.moderateComments, channelSettings.moderateComments) &&
        Objects.equals(this.profileColor, channelSettings.profileColor) &&
        Objects.equals(this.showBrowseView, channelSettings.showBrowseView) &&
        Objects.equals(this.showRelatedChannels, channelSettings.showRelatedChannels) &&
        Objects.equals(this.title, channelSettings.title) &&
        Objects.equals(this.trackingAnalyticsAccountId, channelSettings.trackingAnalyticsAccountId) &&
        Objects.equals(this.unsubscribedTrailer, channelSettings.unsubscribedTrailer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, defaultLanguage, defaultTab, description, featuredChannelsTitle, featuredChannelsUrls, keywords, moderateComments, profileColor, showBrowseView, showRelatedChannels, title, trackingAnalyticsAccountId, unsubscribedTrailer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelSettings {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    defaultTab: ").append(toIndentedString(defaultTab)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    featuredChannelsTitle: ").append(toIndentedString(featuredChannelsTitle)).append("\n");
    sb.append("    featuredChannelsUrls: ").append(toIndentedString(featuredChannelsUrls)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    moderateComments: ").append(toIndentedString(moderateComments)).append("\n");
    sb.append("    profileColor: ").append(toIndentedString(profileColor)).append("\n");
    sb.append("    showBrowseView: ").append(toIndentedString(showBrowseView)).append("\n");
    sb.append("    showRelatedChannels: ").append(toIndentedString(showRelatedChannels)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    trackingAnalyticsAccountId: ").append(toIndentedString(trackingAnalyticsAccountId)).append("\n");
    sb.append("    unsubscribedTrailer: ").append(toIndentedString(unsubscribedTrailer)).append("\n");
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

