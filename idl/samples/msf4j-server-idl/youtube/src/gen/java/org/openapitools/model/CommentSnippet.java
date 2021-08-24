package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.CommentSnippetAuthorChannelId;

/**
 * Basic details about a comment, such as its author and text.
 */
@ApiModel(description = "Basic details about a comment, such as its author and text.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class CommentSnippet   {
  @JsonProperty("authorChannelId")
  private CommentSnippetAuthorChannelId authorChannelId;

  @JsonProperty("authorChannelUrl")
  private String authorChannelUrl;

  @JsonProperty("authorDisplayName")
  private String authorDisplayName;

  @JsonProperty("authorProfileImageUrl")
  private String authorProfileImageUrl;

  @JsonProperty("canRate")
  private Boolean canRate;

  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("likeCount")
  private Integer likeCount;

  /**
   * The comment's moderation status. Will not be set if the comments were requested through the id filter.
   */
  public enum ModerationStatusEnum {
    PUBLISHED("published"),
    
    HELDFORREVIEW("heldForReview"),
    
    LIKELYSPAM("likelySpam"),
    
    REJECTED("rejected");

    private String value;

    ModerationStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModerationStatusEnum fromValue(String text) {
      for (ModerationStatusEnum b : ModerationStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("moderationStatus")
  private ModerationStatusEnum moderationStatus;

  @JsonProperty("parentId")
  private String parentId;

  @JsonProperty("publishedAt")
  private Date publishedAt;

  @JsonProperty("textDisplay")
  private String textDisplay;

  @JsonProperty("textOriginal")
  private String textOriginal;

  @JsonProperty("updatedAt")
  private Date updatedAt;

  @JsonProperty("videoId")
  private String videoId;

  /**
   * The rating the viewer has given to this comment. For the time being this will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This may change in the future.
   */
  public enum ViewerRatingEnum {
    NONE("none"),
    
    LIKE("like"),
    
    DISLIKE("dislike");

    private String value;

    ViewerRatingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ViewerRatingEnum fromValue(String text) {
      for (ViewerRatingEnum b : ViewerRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("viewerRating")
  private ViewerRatingEnum viewerRating;

  public CommentSnippet authorChannelId(CommentSnippetAuthorChannelId authorChannelId) {
    this.authorChannelId = authorChannelId;
    return this;
  }

   /**
   * Get authorChannelId
   * @return authorChannelId
  **/
  @ApiModelProperty(value = "")
  public CommentSnippetAuthorChannelId getAuthorChannelId() {
    return authorChannelId;
  }

  public void setAuthorChannelId(CommentSnippetAuthorChannelId authorChannelId) {
    this.authorChannelId = authorChannelId;
  }

  public CommentSnippet authorChannelUrl(String authorChannelUrl) {
    this.authorChannelUrl = authorChannelUrl;
    return this;
  }

   /**
   * Link to the author's YouTube channel, if any.
   * @return authorChannelUrl
  **/
  @ApiModelProperty(value = "Link to the author's YouTube channel, if any.")
  public String getAuthorChannelUrl() {
    return authorChannelUrl;
  }

  public void setAuthorChannelUrl(String authorChannelUrl) {
    this.authorChannelUrl = authorChannelUrl;
  }

  public CommentSnippet authorDisplayName(String authorDisplayName) {
    this.authorDisplayName = authorDisplayName;
    return this;
  }

   /**
   * The name of the user who posted the comment.
   * @return authorDisplayName
  **/
  @ApiModelProperty(value = "The name of the user who posted the comment.")
  public String getAuthorDisplayName() {
    return authorDisplayName;
  }

  public void setAuthorDisplayName(String authorDisplayName) {
    this.authorDisplayName = authorDisplayName;
  }

  public CommentSnippet authorProfileImageUrl(String authorProfileImageUrl) {
    this.authorProfileImageUrl = authorProfileImageUrl;
    return this;
  }

   /**
   * The URL for the avatar of the user who posted the comment.
   * @return authorProfileImageUrl
  **/
  @ApiModelProperty(value = "The URL for the avatar of the user who posted the comment.")
  public String getAuthorProfileImageUrl() {
    return authorProfileImageUrl;
  }

  public void setAuthorProfileImageUrl(String authorProfileImageUrl) {
    this.authorProfileImageUrl = authorProfileImageUrl;
  }

  public CommentSnippet canRate(Boolean canRate) {
    this.canRate = canRate;
    return this;
  }

   /**
   * Whether the current viewer can rate this comment.
   * @return canRate
  **/
  @ApiModelProperty(value = "Whether the current viewer can rate this comment.")
  public Boolean getCanRate() {
    return canRate;
  }

  public void setCanRate(Boolean canRate) {
    this.canRate = canRate;
  }

  public CommentSnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * The id of the corresponding YouTube channel. In case of a channel comment this is the channel the comment refers to. In case of a video comment it's the video's channel.
   * @return channelId
  **/
  @ApiModelProperty(value = "The id of the corresponding YouTube channel. In case of a channel comment this is the channel the comment refers to. In case of a video comment it's the video's channel.")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public CommentSnippet likeCount(Integer likeCount) {
    this.likeCount = likeCount;
    return this;
  }

   /**
   * The total number of likes this comment has received.
   * @return likeCount
  **/
  @ApiModelProperty(value = "The total number of likes this comment has received.")
  public Integer getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Integer likeCount) {
    this.likeCount = likeCount;
  }

  public CommentSnippet moderationStatus(ModerationStatusEnum moderationStatus) {
    this.moderationStatus = moderationStatus;
    return this;
  }

   /**
   * The comment's moderation status. Will not be set if the comments were requested through the id filter.
   * @return moderationStatus
  **/
  @ApiModelProperty(value = "The comment's moderation status. Will not be set if the comments were requested through the id filter.")
  public ModerationStatusEnum getModerationStatus() {
    return moderationStatus;
  }

  public void setModerationStatus(ModerationStatusEnum moderationStatus) {
    this.moderationStatus = moderationStatus;
  }

  public CommentSnippet parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * The unique id of the parent comment, only set for replies.
   * @return parentId
  **/
  @ApiModelProperty(value = "The unique id of the parent comment, only set for replies.")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public CommentSnippet publishedAt(Date publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * The date and time when the comment was originally published.
   * @return publishedAt
  **/
  @ApiModelProperty(value = "The date and time when the comment was originally published.")
  public Date getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(Date publishedAt) {
    this.publishedAt = publishedAt;
  }

  public CommentSnippet textDisplay(String textDisplay) {
    this.textDisplay = textDisplay;
    return this;
  }

   /**
   * The comment's text. The format is either plain text or HTML dependent on what has been requested. Even the plain text representation may differ from the text originally posted in that it may replace video links with video titles etc.
   * @return textDisplay
  **/
  @ApiModelProperty(value = "The comment's text. The format is either plain text or HTML dependent on what has been requested. Even the plain text representation may differ from the text originally posted in that it may replace video links with video titles etc.")
  public String getTextDisplay() {
    return textDisplay;
  }

  public void setTextDisplay(String textDisplay) {
    this.textDisplay = textDisplay;
  }

  public CommentSnippet textOriginal(String textOriginal) {
    this.textOriginal = textOriginal;
    return this;
  }

   /**
   * The comment's original raw text as initially posted or last updated. The original text will only be returned if it is accessible to the viewer, which is only guaranteed if the viewer is the comment's author.
   * @return textOriginal
  **/
  @ApiModelProperty(value = "The comment's original raw text as initially posted or last updated. The original text will only be returned if it is accessible to the viewer, which is only guaranteed if the viewer is the comment's author.")
  public String getTextOriginal() {
    return textOriginal;
  }

  public void setTextOriginal(String textOriginal) {
    this.textOriginal = textOriginal;
  }

  public CommentSnippet updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when the comment was last updated.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The date and time when the comment was last updated.")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CommentSnippet videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * The ID of the video the comment refers to, if any.
   * @return videoId
  **/
  @ApiModelProperty(value = "The ID of the video the comment refers to, if any.")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public CommentSnippet viewerRating(ViewerRatingEnum viewerRating) {
    this.viewerRating = viewerRating;
    return this;
  }

   /**
   * The rating the viewer has given to this comment. For the time being this will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This may change in the future.
   * @return viewerRating
  **/
  @ApiModelProperty(value = "The rating the viewer has given to this comment. For the time being this will never return RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This may change in the future.")
  public ViewerRatingEnum getViewerRating() {
    return viewerRating;
  }

  public void setViewerRating(ViewerRatingEnum viewerRating) {
    this.viewerRating = viewerRating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentSnippet commentSnippet = (CommentSnippet) o;
    return Objects.equals(this.authorChannelId, commentSnippet.authorChannelId) &&
        Objects.equals(this.authorChannelUrl, commentSnippet.authorChannelUrl) &&
        Objects.equals(this.authorDisplayName, commentSnippet.authorDisplayName) &&
        Objects.equals(this.authorProfileImageUrl, commentSnippet.authorProfileImageUrl) &&
        Objects.equals(this.canRate, commentSnippet.canRate) &&
        Objects.equals(this.channelId, commentSnippet.channelId) &&
        Objects.equals(this.likeCount, commentSnippet.likeCount) &&
        Objects.equals(this.moderationStatus, commentSnippet.moderationStatus) &&
        Objects.equals(this.parentId, commentSnippet.parentId) &&
        Objects.equals(this.publishedAt, commentSnippet.publishedAt) &&
        Objects.equals(this.textDisplay, commentSnippet.textDisplay) &&
        Objects.equals(this.textOriginal, commentSnippet.textOriginal) &&
        Objects.equals(this.updatedAt, commentSnippet.updatedAt) &&
        Objects.equals(this.videoId, commentSnippet.videoId) &&
        Objects.equals(this.viewerRating, commentSnippet.viewerRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorChannelId, authorChannelUrl, authorDisplayName, authorProfileImageUrl, canRate, channelId, likeCount, moderationStatus, parentId, publishedAt, textDisplay, textOriginal, updatedAt, videoId, viewerRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentSnippet {\n");
    
    sb.append("    authorChannelId: ").append(toIndentedString(authorChannelId)).append("\n");
    sb.append("    authorChannelUrl: ").append(toIndentedString(authorChannelUrl)).append("\n");
    sb.append("    authorDisplayName: ").append(toIndentedString(authorDisplayName)).append("\n");
    sb.append("    authorProfileImageUrl: ").append(toIndentedString(authorProfileImageUrl)).append("\n");
    sb.append("    canRate: ").append(toIndentedString(canRate)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    moderationStatus: ").append(toIndentedString(moderationStatus)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    textDisplay: ").append(toIndentedString(textDisplay)).append("\n");
    sb.append("    textOriginal: ").append(toIndentedString(textOriginal)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    viewerRating: ").append(toIndentedString(viewerRating)).append("\n");
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

