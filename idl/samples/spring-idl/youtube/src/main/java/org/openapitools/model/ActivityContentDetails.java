package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ActivityContentDetailsBulletin;
import org.openapitools.model.ActivityContentDetailsChannelItem;
import org.openapitools.model.ActivityContentDetailsComment;
import org.openapitools.model.ActivityContentDetailsFavorite;
import org.openapitools.model.ActivityContentDetailsLike;
import org.openapitools.model.ActivityContentDetailsPlaylistItem;
import org.openapitools.model.ActivityContentDetailsPromotedItem;
import org.openapitools.model.ActivityContentDetailsRecommendation;
import org.openapitools.model.ActivityContentDetailsSocial;
import org.openapitools.model.ActivityContentDetailsSubscription;
import org.openapitools.model.ActivityContentDetailsUpload;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about the content of an activity: the video that was shared, the channel that was subscribed to, etc.
 */
@ApiModel(description = "Details about the content of an activity: the video that was shared, the channel that was subscribed to, etc.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ActivityContentDetails   {
  @JsonProperty("bulletin")
  private ActivityContentDetailsBulletin bulletin;

  @JsonProperty("channelItem")
  private ActivityContentDetailsChannelItem channelItem;

  @JsonProperty("comment")
  private ActivityContentDetailsComment comment;

  @JsonProperty("favorite")
  private ActivityContentDetailsFavorite favorite;

  @JsonProperty("like")
  private ActivityContentDetailsLike like;

  @JsonProperty("playlistItem")
  private ActivityContentDetailsPlaylistItem playlistItem;

  @JsonProperty("promotedItem")
  private ActivityContentDetailsPromotedItem promotedItem;

  @JsonProperty("recommendation")
  private ActivityContentDetailsRecommendation recommendation;

  @JsonProperty("social")
  private ActivityContentDetailsSocial social;

  @JsonProperty("subscription")
  private ActivityContentDetailsSubscription subscription;

  @JsonProperty("upload")
  private ActivityContentDetailsUpload upload;

  public ActivityContentDetails bulletin(ActivityContentDetailsBulletin bulletin) {
    this.bulletin = bulletin;
    return this;
  }

  /**
   * Get bulletin
   * @return bulletin
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsBulletin getBulletin() {
    return bulletin;
  }

  public void setBulletin(ActivityContentDetailsBulletin bulletin) {
    this.bulletin = bulletin;
  }

  public ActivityContentDetails channelItem(ActivityContentDetailsChannelItem channelItem) {
    this.channelItem = channelItem;
    return this;
  }

  /**
   * Get channelItem
   * @return channelItem
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsChannelItem getChannelItem() {
    return channelItem;
  }

  public void setChannelItem(ActivityContentDetailsChannelItem channelItem) {
    this.channelItem = channelItem;
  }

  public ActivityContentDetails comment(ActivityContentDetailsComment comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsComment getComment() {
    return comment;
  }

  public void setComment(ActivityContentDetailsComment comment) {
    this.comment = comment;
  }

  public ActivityContentDetails favorite(ActivityContentDetailsFavorite favorite) {
    this.favorite = favorite;
    return this;
  }

  /**
   * Get favorite
   * @return favorite
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsFavorite getFavorite() {
    return favorite;
  }

  public void setFavorite(ActivityContentDetailsFavorite favorite) {
    this.favorite = favorite;
  }

  public ActivityContentDetails like(ActivityContentDetailsLike like) {
    this.like = like;
    return this;
  }

  /**
   * Get like
   * @return like
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsLike getLike() {
    return like;
  }

  public void setLike(ActivityContentDetailsLike like) {
    this.like = like;
  }

  public ActivityContentDetails playlistItem(ActivityContentDetailsPlaylistItem playlistItem) {
    this.playlistItem = playlistItem;
    return this;
  }

  /**
   * Get playlistItem
   * @return playlistItem
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsPlaylistItem getPlaylistItem() {
    return playlistItem;
  }

  public void setPlaylistItem(ActivityContentDetailsPlaylistItem playlistItem) {
    this.playlistItem = playlistItem;
  }

  public ActivityContentDetails promotedItem(ActivityContentDetailsPromotedItem promotedItem) {
    this.promotedItem = promotedItem;
    return this;
  }

  /**
   * Get promotedItem
   * @return promotedItem
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsPromotedItem getPromotedItem() {
    return promotedItem;
  }

  public void setPromotedItem(ActivityContentDetailsPromotedItem promotedItem) {
    this.promotedItem = promotedItem;
  }

  public ActivityContentDetails recommendation(ActivityContentDetailsRecommendation recommendation) {
    this.recommendation = recommendation;
    return this;
  }

  /**
   * Get recommendation
   * @return recommendation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsRecommendation getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(ActivityContentDetailsRecommendation recommendation) {
    this.recommendation = recommendation;
  }

  public ActivityContentDetails social(ActivityContentDetailsSocial social) {
    this.social = social;
    return this;
  }

  /**
   * Get social
   * @return social
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsSocial getSocial() {
    return social;
  }

  public void setSocial(ActivityContentDetailsSocial social) {
    this.social = social;
  }

  public ActivityContentDetails subscription(ActivityContentDetailsSubscription subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * Get subscription
   * @return subscription
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsSubscription getSubscription() {
    return subscription;
  }

  public void setSubscription(ActivityContentDetailsSubscription subscription) {
    this.subscription = subscription;
  }

  public ActivityContentDetails upload(ActivityContentDetailsUpload upload) {
    this.upload = upload;
    return this;
  }

  /**
   * Get upload
   * @return upload
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityContentDetailsUpload getUpload() {
    return upload;
  }

  public void setUpload(ActivityContentDetailsUpload upload) {
    this.upload = upload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityContentDetails activityContentDetails = (ActivityContentDetails) o;
    return Objects.equals(this.bulletin, activityContentDetails.bulletin) &&
        Objects.equals(this.channelItem, activityContentDetails.channelItem) &&
        Objects.equals(this.comment, activityContentDetails.comment) &&
        Objects.equals(this.favorite, activityContentDetails.favorite) &&
        Objects.equals(this.like, activityContentDetails.like) &&
        Objects.equals(this.playlistItem, activityContentDetails.playlistItem) &&
        Objects.equals(this.promotedItem, activityContentDetails.promotedItem) &&
        Objects.equals(this.recommendation, activityContentDetails.recommendation) &&
        Objects.equals(this.social, activityContentDetails.social) &&
        Objects.equals(this.subscription, activityContentDetails.subscription) &&
        Objects.equals(this.upload, activityContentDetails.upload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulletin, channelItem, comment, favorite, like, playlistItem, promotedItem, recommendation, social, subscription, upload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityContentDetails {\n");
    
    sb.append("    bulletin: ").append(toIndentedString(bulletin)).append("\n");
    sb.append("    channelItem: ").append(toIndentedString(channelItem)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    like: ").append(toIndentedString(like)).append("\n");
    sb.append("    playlistItem: ").append(toIndentedString(playlistItem)).append("\n");
    sb.append("    promotedItem: ").append(toIndentedString(promotedItem)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    social: ").append(toIndentedString(social)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    upload: ").append(toIndentedString(upload)).append("\n");
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

