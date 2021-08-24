package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.ChannelLocalization;
import org.openapitools.model.ThumbnailDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic details about a channel, including title, description and thumbnails.
 */
@ApiModel(description = "Basic details about a channel, including title, description and thumbnails.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ChannelSnippet   {
  @JsonProperty("country")
  private String country;

  @JsonProperty("customUrl")
  private String customUrl;

  @JsonProperty("defaultLanguage")
  private String defaultLanguage;

  @JsonProperty("description")
  private String description;

  @JsonProperty("localized")
  private ChannelLocalization localized;

  @JsonProperty("publishedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishedAt;

  @JsonProperty("thumbnails")
  private ThumbnailDetails thumbnails;

  @JsonProperty("title")
  private String title;

  public ChannelSnippet country(String country) {
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

  public ChannelSnippet customUrl(String customUrl) {
    this.customUrl = customUrl;
    return this;
  }

  /**
   * The custom url of the channel.
   * @return customUrl
  */
  @ApiModelProperty(value = "The custom url of the channel.")


  public String getCustomUrl() {
    return customUrl;
  }

  public void setCustomUrl(String customUrl) {
    this.customUrl = customUrl;
  }

  public ChannelSnippet defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * The language of the channel's default title and description.
   * @return defaultLanguage
  */
  @ApiModelProperty(value = "The language of the channel's default title and description.")


  public String getDefaultLanguage() {
    return defaultLanguage;
  }

  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  public ChannelSnippet description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the channel.
   * @return description
  */
  @ApiModelProperty(value = "The description of the channel.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChannelSnippet localized(ChannelLocalization localized) {
    this.localized = localized;
    return this;
  }

  /**
   * Get localized
   * @return localized
  */
  @ApiModelProperty(value = "")

  @Valid

  public ChannelLocalization getLocalized() {
    return localized;
  }

  public void setLocalized(ChannelLocalization localized) {
    this.localized = localized;
  }

  public ChannelSnippet publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The date and time that the channel was created.
   * @return publishedAt
  */
  @ApiModelProperty(value = "The date and time that the channel was created.")

  @Valid

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public ChannelSnippet thumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  /**
   * Get thumbnails
   * @return thumbnails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ThumbnailDetails getThumbnails() {
    return thumbnails;
  }

  public void setThumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
  }

  public ChannelSnippet title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The channel's title.
   * @return title
  */
  @ApiModelProperty(value = "The channel's title.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelSnippet channelSnippet = (ChannelSnippet) o;
    return Objects.equals(this.country, channelSnippet.country) &&
        Objects.equals(this.customUrl, channelSnippet.customUrl) &&
        Objects.equals(this.defaultLanguage, channelSnippet.defaultLanguage) &&
        Objects.equals(this.description, channelSnippet.description) &&
        Objects.equals(this.localized, channelSnippet.localized) &&
        Objects.equals(this.publishedAt, channelSnippet.publishedAt) &&
        Objects.equals(this.thumbnails, channelSnippet.thumbnails) &&
        Objects.equals(this.title, channelSnippet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, customUrl, defaultLanguage, description, localized, publishedAt, thumbnails, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelSnippet {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    customUrl: ").append(toIndentedString(customUrl)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    localized: ").append(toIndentedString(localized)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

