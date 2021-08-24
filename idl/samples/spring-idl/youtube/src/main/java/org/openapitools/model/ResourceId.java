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
 * A resource id is a generic reference that points to another YouTube resource.
 */
@ApiModel(description = "A resource id is a generic reference that points to another YouTube resource.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ResourceId   {
  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("playlistId")
  private String playlistId;

  @JsonProperty("videoId")
  private String videoId;

  public ResourceId channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a channel. This property is only present if the resourceId.kind value is youtube#channel.
   * @return channelId
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the referred resource, if that resource is a channel. This property is only present if the resourceId.kind value is youtube#channel.")


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public ResourceId kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The type of the API resource.
   * @return kind
  */
  @ApiModelProperty(value = "The type of the API resource.")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ResourceId playlistId(String playlistId) {
    this.playlistId = playlistId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a playlist. This property is only present if the resourceId.kind value is youtube#playlist.
   * @return playlistId
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the referred resource, if that resource is a playlist. This property is only present if the resourceId.kind value is youtube#playlist.")


  public String getPlaylistId() {
    return playlistId;
  }

  public void setPlaylistId(String playlistId) {
    this.playlistId = playlistId;
  }

  public ResourceId videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a video. This property is only present if the resourceId.kind value is youtube#video.
   * @return videoId
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the referred resource, if that resource is a video. This property is only present if the resourceId.kind value is youtube#video.")


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
    ResourceId resourceId = (ResourceId) o;
    return Objects.equals(this.channelId, resourceId.channelId) &&
        Objects.equals(this.kind, resourceId.kind) &&
        Objects.equals(this.playlistId, resourceId.playlistId) &&
        Objects.equals(this.videoId, resourceId.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, kind, playlistId, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceId {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    playlistId: ").append(toIndentedString(playlistId)).append("\n");
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

