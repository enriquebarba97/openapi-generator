package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * LiveStreamSnippet
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveStreamSnippet   {
  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("isDefaultStream")
  private Boolean isDefaultStream;

  @JsonProperty("publishedAt")
  private Date publishedAt;

  @JsonProperty("title")
  private String title;

  public LiveStreamSnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the channel that is transmitting the stream.
   * @return channelId
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the channel that is transmitting the stream.")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public LiveStreamSnippet description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The stream's description. The value cannot be longer than 10000 characters.
   * @return description
  **/
  @ApiModelProperty(value = "The stream's description. The value cannot be longer than 10000 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LiveStreamSnippet isDefaultStream(Boolean isDefaultStream) {
    this.isDefaultStream = isDefaultStream;
    return this;
  }

   /**
   * Get isDefaultStream
   * @return isDefaultStream
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsDefaultStream() {
    return isDefaultStream;
  }

  public void setIsDefaultStream(Boolean isDefaultStream) {
    this.isDefaultStream = isDefaultStream;
  }

  public LiveStreamSnippet publishedAt(Date publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * The date and time that the stream was created.
   * @return publishedAt
  **/
  @ApiModelProperty(value = "The date and time that the stream was created.")
  public Date getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(Date publishedAt) {
    this.publishedAt = publishedAt;
  }

  public LiveStreamSnippet title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The stream's title. The value must be between 1 and 128 characters long.
   * @return title
  **/
  @ApiModelProperty(value = "The stream's title. The value must be between 1 and 128 characters long.")
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
    LiveStreamSnippet liveStreamSnippet = (LiveStreamSnippet) o;
    return Objects.equals(this.channelId, liveStreamSnippet.channelId) &&
        Objects.equals(this.description, liveStreamSnippet.description) &&
        Objects.equals(this.isDefaultStream, liveStreamSnippet.isDefaultStream) &&
        Objects.equals(this.publishedAt, liveStreamSnippet.publishedAt) &&
        Objects.equals(this.title, liveStreamSnippet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, description, isDefaultStream, publishedAt, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamSnippet {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDefaultStream: ").append(toIndentedString(isDefaultStream)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
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

