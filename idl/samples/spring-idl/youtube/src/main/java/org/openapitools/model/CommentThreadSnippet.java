package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Comment;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic details about a comment thread.
 */
@ApiModel(description = "Basic details about a comment thread.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class CommentThreadSnippet   {
  @JsonProperty("canReply")
  private Boolean canReply;

  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("isPublic")
  private Boolean isPublic;

  @JsonProperty("topLevelComment")
  private Comment topLevelComment;

  @JsonProperty("totalReplyCount")
  private Integer totalReplyCount;

  @JsonProperty("videoId")
  private String videoId;

  public CommentThreadSnippet canReply(Boolean canReply) {
    this.canReply = canReply;
    return this;
  }

  /**
   * Whether the current viewer of the thread can reply to it. This is viewer specific - other viewers may see a different value for this field.
   * @return canReply
  */
  @ApiModelProperty(value = "Whether the current viewer of the thread can reply to it. This is viewer specific - other viewers may see a different value for this field.")


  public Boolean getCanReply() {
    return canReply;
  }

  public void setCanReply(Boolean canReply) {
    this.canReply = canReply;
  }

  public CommentThreadSnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The YouTube channel the comments in the thread refer to or the channel with the video the comments refer to. If video_id isn't set the comments refer to the channel itself.
   * @return channelId
  */
  @ApiModelProperty(value = "The YouTube channel the comments in the thread refer to or the channel with the video the comments refer to. If video_id isn't set the comments refer to the channel itself.")


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public CommentThreadSnippet isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  /**
   * Whether the thread (and therefore all its comments) is visible to all YouTube users.
   * @return isPublic
  */
  @ApiModelProperty(value = "Whether the thread (and therefore all its comments) is visible to all YouTube users.")


  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public CommentThreadSnippet topLevelComment(Comment topLevelComment) {
    this.topLevelComment = topLevelComment;
    return this;
  }

  /**
   * Get topLevelComment
   * @return topLevelComment
  */
  @ApiModelProperty(value = "")

  @Valid

  public Comment getTopLevelComment() {
    return topLevelComment;
  }

  public void setTopLevelComment(Comment topLevelComment) {
    this.topLevelComment = topLevelComment;
  }

  public CommentThreadSnippet totalReplyCount(Integer totalReplyCount) {
    this.totalReplyCount = totalReplyCount;
    return this;
  }

  /**
   * The total number of replies (not including the top level comment).
   * @return totalReplyCount
  */
  @ApiModelProperty(value = "The total number of replies (not including the top level comment).")


  public Integer getTotalReplyCount() {
    return totalReplyCount;
  }

  public void setTotalReplyCount(Integer totalReplyCount) {
    this.totalReplyCount = totalReplyCount;
  }

  public CommentThreadSnippet videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * The ID of the video the comments refer to, if any. No video_id implies a channel discussion comment.
   * @return videoId
  */
  @ApiModelProperty(value = "The ID of the video the comments refer to, if any. No video_id implies a channel discussion comment.")


  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentThreadSnippet commentThreadSnippet = (CommentThreadSnippet) o;
    return Objects.equals(this.canReply, commentThreadSnippet.canReply) &&
        Objects.equals(this.channelId, commentThreadSnippet.channelId) &&
        Objects.equals(this.isPublic, commentThreadSnippet.isPublic) &&
        Objects.equals(this.topLevelComment, commentThreadSnippet.topLevelComment) &&
        Objects.equals(this.totalReplyCount, commentThreadSnippet.totalReplyCount) &&
        Objects.equals(this.videoId, commentThreadSnippet.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canReply, channelId, isPublic, topLevelComment, totalReplyCount, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentThreadSnippet {\n");
    
    sb.append("    canReply: ").append(toIndentedString(canReply)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    topLevelComment: ").append(toIndentedString(topLevelComment)).append("\n");
    sb.append("    totalReplyCount: ").append(toIndentedString(totalReplyCount)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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

