package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic details about rating of a video.
 */
@ApiModel(description = "Basic details about rating of a video.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoRating   {
  /**
   * Rating of a video.
   */
  public enum RatingEnum {
    NONE("none"),
    
    LIKE("like"),
    
    DISLIKE("dislike");

    private String value;

    RatingEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RatingEnum fromValue(String value) {
      for (RatingEnum b : RatingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("rating")
  private RatingEnum rating;

  @JsonProperty("videoId")
  private String videoId;

  public VideoRating rating(RatingEnum rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Rating of a video.
   * @return rating
  */
  @ApiModelProperty(value = "Rating of a video.")


  public RatingEnum getRating() {
    return rating;
  }

  public void setRating(RatingEnum rating) {
    this.rating = rating;
  }

  public VideoRating videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the video.
   * @return videoId
  */
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
    VideoRating videoRating = (VideoRating) o;
    return Objects.equals(this.rating, videoRating.rating) &&
        Objects.equals(this.videoId, videoRating.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoRating {\n");
    
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

