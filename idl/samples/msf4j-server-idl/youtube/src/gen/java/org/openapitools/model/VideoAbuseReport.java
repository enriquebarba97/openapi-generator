package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VideoAbuseReport
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class VideoAbuseReport   {
  @JsonProperty("comments")
  private String comments;

  @JsonProperty("language")
  private String language;

  @JsonProperty("reasonId")
  private String reasonId;

  @JsonProperty("secondaryReasonId")
  private String secondaryReasonId;

  @JsonProperty("videoId")
  private String videoId;

  public VideoAbuseReport comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Additional comments regarding the abuse report.
   * @return comments
  **/
  @ApiModelProperty(value = "Additional comments regarding the abuse report.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public VideoAbuseReport language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language that the content was viewed in.
   * @return language
  **/
  @ApiModelProperty(value = "The language that the content was viewed in.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public VideoAbuseReport reasonId(String reasonId) {
    this.reasonId = reasonId;
    return this;
  }

   /**
   * The high-level, or primary, reason that the content is abusive. The value is an abuse report reason ID.
   * @return reasonId
  **/
  @ApiModelProperty(value = "The high-level, or primary, reason that the content is abusive. The value is an abuse report reason ID.")
  public String getReasonId() {
    return reasonId;
  }

  public void setReasonId(String reasonId) {
    this.reasonId = reasonId;
  }

  public VideoAbuseReport secondaryReasonId(String secondaryReasonId) {
    this.secondaryReasonId = secondaryReasonId;
    return this;
  }

   /**
   * The specific, or secondary, reason that this content is abusive (if available). The value is an abuse report reason ID that is a valid secondary reason for the primary reason.
   * @return secondaryReasonId
  **/
  @ApiModelProperty(value = "The specific, or secondary, reason that this content is abusive (if available). The value is an abuse report reason ID that is a valid secondary reason for the primary reason.")
  public String getSecondaryReasonId() {
    return secondaryReasonId;
  }

  public void setSecondaryReasonId(String secondaryReasonId) {
    this.secondaryReasonId = secondaryReasonId;
  }

  public VideoAbuseReport videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the video.
   * @return videoId
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the video.")
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
    VideoAbuseReport videoAbuseReport = (VideoAbuseReport) o;
    return Objects.equals(this.comments, videoAbuseReport.comments) &&
        Objects.equals(this.language, videoAbuseReport.language) &&
        Objects.equals(this.reasonId, videoAbuseReport.reasonId) &&
        Objects.equals(this.secondaryReasonId, videoAbuseReport.secondaryReasonId) &&
        Objects.equals(this.videoId, videoAbuseReport.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, language, reasonId, secondaryReasonId, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAbuseReport {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    reasonId: ").append(toIndentedString(reasonId)).append("\n");
    sb.append("    secondaryReasonId: ").append(toIndentedString(secondaryReasonId)).append("\n");
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

