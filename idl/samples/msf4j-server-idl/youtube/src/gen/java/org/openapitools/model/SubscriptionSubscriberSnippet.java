package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ThumbnailDetails;

/**
 * Basic details about a subscription&#39;s subscriber including title, description, channel ID and thumbnails.
 */
@ApiModel(description = "Basic details about a subscription's subscriber including title, description, channel ID and thumbnails.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class SubscriptionSubscriberSnippet   {
  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("thumbnails")
  private ThumbnailDetails thumbnails;

  @JsonProperty("title")
  private String title;

  public SubscriptionSubscriberSnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * The channel ID of the subscriber.
   * @return channelId
  **/
  @ApiModelProperty(value = "The channel ID of the subscriber.")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public SubscriptionSubscriberSnippet description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the subscriber.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the subscriber.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SubscriptionSubscriberSnippet thumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

   /**
   * Get thumbnails
   * @return thumbnails
  **/
  @ApiModelProperty(value = "")
  public ThumbnailDetails getThumbnails() {
    return thumbnails;
  }

  public void setThumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
  }

  public SubscriptionSubscriberSnippet title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the subscriber.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the subscriber.")
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
    SubscriptionSubscriberSnippet subscriptionSubscriberSnippet = (SubscriptionSubscriberSnippet) o;
    return Objects.equals(this.channelId, subscriptionSubscriberSnippet.channelId) &&
        Objects.equals(this.description, subscriptionSubscriberSnippet.description) &&
        Objects.equals(this.thumbnails, subscriptionSubscriberSnippet.thumbnails) &&
        Objects.equals(this.title, subscriptionSubscriberSnippet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, description, thumbnails, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSubscriberSnippet {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

