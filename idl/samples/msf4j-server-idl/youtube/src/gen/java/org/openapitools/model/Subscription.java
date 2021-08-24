package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SubscriptionContentDetails;
import org.openapitools.model.SubscriptionSnippet;
import org.openapitools.model.SubscriptionSubscriberSnippet;

/**
 * A *subscription* resource contains information about a YouTube user subscription. A subscription notifies a user when new videos are added to a channel or when another user takes one of several actions on YouTube, such as uploading a video, rating a video, or commenting on a video.
 */
@ApiModel(description = "A *subscription* resource contains information about a YouTube user subscription. A subscription notifies a user when new videos are added to a channel or when another user takes one of several actions on YouTube, such as uploading a video, rating a video, or commenting on a video.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class Subscription   {
  @JsonProperty("contentDetails")
  private SubscriptionContentDetails contentDetails;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#subscription";

  @JsonProperty("snippet")
  private SubscriptionSnippet snippet;

  @JsonProperty("subscriberSnippet")
  private SubscriptionSubscriberSnippet subscriberSnippet;

  public Subscription contentDetails(SubscriptionContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

   /**
   * Get contentDetails
   * @return contentDetails
  **/
  @ApiModelProperty(value = "")
  public SubscriptionContentDetails getContentDetails() {
    return contentDetails;
  }

  public void setContentDetails(SubscriptionContentDetails contentDetails) {
    this.contentDetails = contentDetails;
  }

  public Subscription etag(String etag) {
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

  public Subscription id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the subscription.
   * @return id
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the subscription.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Subscription kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#subscription\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#subscription\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Subscription snippet(SubscriptionSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public SubscriptionSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(SubscriptionSnippet snippet) {
    this.snippet = snippet;
  }

  public Subscription subscriberSnippet(SubscriptionSubscriberSnippet subscriberSnippet) {
    this.subscriberSnippet = subscriberSnippet;
    return this;
  }

   /**
   * Get subscriberSnippet
   * @return subscriberSnippet
  **/
  @ApiModelProperty(value = "")
  public SubscriptionSubscriberSnippet getSubscriberSnippet() {
    return subscriberSnippet;
  }

  public void setSubscriberSnippet(SubscriptionSubscriberSnippet subscriberSnippet) {
    this.subscriberSnippet = subscriberSnippet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.contentDetails, subscription.contentDetails) &&
        Objects.equals(this.etag, subscription.etag) &&
        Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.kind, subscription.kind) &&
        Objects.equals(this.snippet, subscription.snippet) &&
        Objects.equals(this.subscriberSnippet, subscription.subscriberSnippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDetails, etag, id, kind, snippet, subscriberSnippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    contentDetails: ").append(toIndentedString(contentDetails)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    subscriberSnippet: ").append(toIndentedString(subscriberSnippet)).append("\n");
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

