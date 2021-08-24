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
 * Basic details about a video category, such as its localized title.
 */
@ApiModel(description = "Basic details about a video category, such as its localized title.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoCategorySnippet   {
  @JsonProperty("assignable")
  private Boolean assignable;

  @JsonProperty("channelId")
  private String channelId = "UCBR8-60-B28hp2BmDPdntcQ";

  @JsonProperty("title")
  private String title;

  public VideoCategorySnippet assignable(Boolean assignable) {
    this.assignable = assignable;
    return this;
  }

  /**
   * Get assignable
   * @return assignable
  */
  @ApiModelProperty(value = "")


  public Boolean getAssignable() {
    return assignable;
  }

  public void setAssignable(Boolean assignable) {
    this.assignable = assignable;
  }

  public VideoCategorySnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The YouTube channel that created the video category.
   * @return channelId
  */
  @ApiModelProperty(value = "The YouTube channel that created the video category.")


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public VideoCategorySnippet title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The video category's title.
   * @return title
  */
  @ApiModelProperty(value = "The video category's title.")


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
    VideoCategorySnippet videoCategorySnippet = (VideoCategorySnippet) o;
    return Objects.equals(this.assignable, videoCategorySnippet.assignable) &&
        Objects.equals(this.channelId, videoCategorySnippet.channelId) &&
        Objects.equals(this.title, videoCategorySnippet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignable, channelId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCategorySnippet {\n");
    
    sb.append("    assignable: ").append(toIndentedString(assignable)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
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

