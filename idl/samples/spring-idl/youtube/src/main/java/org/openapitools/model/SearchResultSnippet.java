package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.ThumbnailDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic details about a search result, including title, description and thumbnails of the item referenced by the search result.
 */
@ApiModel(description = "Basic details about a search result, including title, description and thumbnails of the item referenced by the search result.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class SearchResultSnippet   {
  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("channelTitle")
  private String channelTitle;

  @JsonProperty("description")
  private String description;

  /**
   * It indicates if the resource (video or channel) has upcoming/active live broadcast content. Or it's \"none\" if there is not any upcoming/active live broadcasts.
   */
  public enum LiveBroadcastContentEnum {
    NONE("none"),
    
    UPCOMING("upcoming"),
    
    LIVE("live"),
    
    COMPLETED("completed");

    private String value;

    LiveBroadcastContentEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LiveBroadcastContentEnum fromValue(String value) {
      for (LiveBroadcastContentEnum b : LiveBroadcastContentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("liveBroadcastContent")
  private LiveBroadcastContentEnum liveBroadcastContent;

  @JsonProperty("publishedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishedAt;

  @JsonProperty("thumbnails")
  private ThumbnailDetails thumbnails;

  @JsonProperty("title")
  private String title;

  public SearchResultSnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The value that YouTube uses to uniquely identify the channel that published the resource that the search result identifies.
   * @return channelId
  */
  @ApiModelProperty(value = "The value that YouTube uses to uniquely identify the channel that published the resource that the search result identifies.")


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public SearchResultSnippet channelTitle(String channelTitle) {
    this.channelTitle = channelTitle;
    return this;
  }

  /**
   * The title of the channel that published the resource that the search result identifies.
   * @return channelTitle
  */
  @ApiModelProperty(value = "The title of the channel that published the resource that the search result identifies.")


  public String getChannelTitle() {
    return channelTitle;
  }

  public void setChannelTitle(String channelTitle) {
    this.channelTitle = channelTitle;
  }

  public SearchResultSnippet description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the search result.
   * @return description
  */
  @ApiModelProperty(value = "A description of the search result.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SearchResultSnippet liveBroadcastContent(LiveBroadcastContentEnum liveBroadcastContent) {
    this.liveBroadcastContent = liveBroadcastContent;
    return this;
  }

  /**
   * It indicates if the resource (video or channel) has upcoming/active live broadcast content. Or it's \"none\" if there is not any upcoming/active live broadcasts.
   * @return liveBroadcastContent
  */
  @ApiModelProperty(value = "It indicates if the resource (video or channel) has upcoming/active live broadcast content. Or it's \"none\" if there is not any upcoming/active live broadcasts.")


  public LiveBroadcastContentEnum getLiveBroadcastContent() {
    return liveBroadcastContent;
  }

  public void setLiveBroadcastContent(LiveBroadcastContentEnum liveBroadcastContent) {
    this.liveBroadcastContent = liveBroadcastContent;
  }

  public SearchResultSnippet publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The creation date and time of the resource that the search result identifies.
   * @return publishedAt
  */
  @ApiModelProperty(value = "The creation date and time of the resource that the search result identifies.")

  @Valid

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public SearchResultSnippet thumbnails(ThumbnailDetails thumbnails) {
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

  public SearchResultSnippet title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the search result.
   * @return title
  */
  @ApiModelProperty(value = "The title of the search result.")


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
    SearchResultSnippet searchResultSnippet = (SearchResultSnippet) o;
    return Objects.equals(this.channelId, searchResultSnippet.channelId) &&
        Objects.equals(this.channelTitle, searchResultSnippet.channelTitle) &&
        Objects.equals(this.description, searchResultSnippet.description) &&
        Objects.equals(this.liveBroadcastContent, searchResultSnippet.liveBroadcastContent) &&
        Objects.equals(this.publishedAt, searchResultSnippet.publishedAt) &&
        Objects.equals(this.thumbnails, searchResultSnippet.thumbnails) &&
        Objects.equals(this.title, searchResultSnippet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelTitle, description, liveBroadcastContent, publishedAt, thumbnails, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultSnippet {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelTitle: ").append(toIndentedString(channelTitle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveBroadcastContent: ").append(toIndentedString(liveBroadcastContent)).append("\n");
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

