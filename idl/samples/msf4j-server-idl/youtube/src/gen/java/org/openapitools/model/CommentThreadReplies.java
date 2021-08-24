package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Comment;

/**
 * Comments written in (direct or indirect) reply to the top level comment.
 */
@ApiModel(description = "Comments written in (direct or indirect) reply to the top level comment.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class CommentThreadReplies   {
  @JsonProperty("comments")
  private List<Comment> comments = null;

  public CommentThreadReplies comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public CommentThreadReplies addCommentsItem(Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<Comment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * A limited number of replies. Unless the number of replies returned equals total_reply_count in the snippet the returned replies are only a subset of the total number of replies.
   * @return comments
  **/
  @ApiModelProperty(value = "A limited number of replies. Unless the number of replies returned equals total_reply_count in the snippet the returned replies are only a subset of the total number of replies.")
  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentThreadReplies commentThreadReplies = (CommentThreadReplies) o;
    return Objects.equals(this.comments, commentThreadReplies.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentThreadReplies {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

