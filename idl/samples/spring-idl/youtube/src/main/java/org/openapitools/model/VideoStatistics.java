package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Statistics about the video, such as the number of times the video was viewed or liked.
 */
@ApiModel(description = "Statistics about the video, such as the number of times the video was viewed or liked.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoStatistics   {
  @JsonProperty("commentCount")
  private String commentCount;

  @JsonProperty("dislikeCount")
  private String dislikeCount;

  @JsonProperty("favoriteCount")
  private String favoriteCount;

  @JsonProperty("likeCount")
  private String likeCount;

  @JsonProperty("viewCount")
  private String viewCount;

  public VideoStatistics commentCount(String commentCount) {
    this.commentCount = commentCount;
    return this;
  }

  /**
   * The number of comments for the video.
   * @return commentCount
  */
  @ApiModelProperty(value = "The number of comments for the video.")


  public String getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(String commentCount) {
    this.commentCount = commentCount;
  }

  public VideoStatistics dislikeCount(String dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

  /**
   * The number of users who have indicated that they disliked the video by giving it a negative rating.
   * @return dislikeCount
  */
  @ApiModelProperty(value = "The number of users who have indicated that they disliked the video by giving it a negative rating.")


  public String getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(String dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public VideoStatistics favoriteCount(String favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

  /**
   * The number of users who currently have the video marked as a favorite video.
   * @return favoriteCount
  */
  @ApiModelProperty(value = "The number of users who currently have the video marked as a favorite video.")


  public String getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(String favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public VideoStatistics likeCount(String likeCount) {
    this.likeCount = likeCount;
    return this;
  }

  /**
   * The number of users who have indicated that they liked the video by giving it a positive rating.
   * @return likeCount
  */
  @ApiModelProperty(value = "The number of users who have indicated that they liked the video by giving it a positive rating.")


  public String getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(String likeCount) {
    this.likeCount = likeCount;
  }

  public VideoStatistics viewCount(String viewCount) {
    this.viewCount = viewCount;
    return this;
  }

  /**
   * The number of times the video has been viewed.
   * @return viewCount
  */
  @ApiModelProperty(value = "The number of times the video has been viewed.")


  public String getViewCount() {
    return viewCount;
  }

  public void setViewCount(String viewCount) {
    this.viewCount = viewCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoStatistics videoStatistics = (VideoStatistics) o;
    return Objects.equals(this.commentCount, videoStatistics.commentCount) &&
        Objects.equals(this.dislikeCount, videoStatistics.dislikeCount) &&
        Objects.equals(this.favoriteCount, videoStatistics.favoriteCount) &&
        Objects.equals(this.likeCount, videoStatistics.likeCount) &&
        Objects.equals(this.viewCount, videoStatistics.viewCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentCount, dislikeCount, favoriteCount, likeCount, viewCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoStatistics {\n");
    
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
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

