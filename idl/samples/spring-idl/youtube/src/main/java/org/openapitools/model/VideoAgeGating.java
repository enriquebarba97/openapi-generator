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
 * VideoAgeGating
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoAgeGating   {
  @JsonProperty("alcoholContent")
  private Boolean alcoholContent;

  @JsonProperty("restricted")
  private Boolean restricted;

  /**
   * Video game rating, if any.
   */
  public enum VideoGameRatingEnum {
    ANYONE("anyone"),
    
    M15PLUS("m15Plus"),
    
    M16PLUS("m16Plus"),
    
    M17PLUS("m17Plus");

    private String value;

    VideoGameRatingEnum(String value) {
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
    public static VideoGameRatingEnum fromValue(String value) {
      for (VideoGameRatingEnum b : VideoGameRatingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("videoGameRating")
  private VideoGameRatingEnum videoGameRating;

  public VideoAgeGating alcoholContent(Boolean alcoholContent) {
    this.alcoholContent = alcoholContent;
    return this;
  }

  /**
   * Indicates whether or not the video has alcoholic beverage content. Only users of legal purchasing age in a particular country, as identified by ICAP, can view the content.
   * @return alcoholContent
  */
  @ApiModelProperty(value = "Indicates whether or not the video has alcoholic beverage content. Only users of legal purchasing age in a particular country, as identified by ICAP, can view the content.")


  public Boolean getAlcoholContent() {
    return alcoholContent;
  }

  public void setAlcoholContent(Boolean alcoholContent) {
    this.alcoholContent = alcoholContent;
  }

  public VideoAgeGating restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

  /**
   * Age-restricted trailers. For redband trailers and adult-rated video-games. Only users aged 18+ can view the content. The the field is true the content is restricted to viewers aged 18+. Otherwise The field won't be present.
   * @return restricted
  */
  @ApiModelProperty(value = "Age-restricted trailers. For redband trailers and adult-rated video-games. Only users aged 18+ can view the content. The the field is true the content is restricted to viewers aged 18+. Otherwise The field won't be present.")


  public Boolean getRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public VideoAgeGating videoGameRating(VideoGameRatingEnum videoGameRating) {
    this.videoGameRating = videoGameRating;
    return this;
  }

  /**
   * Video game rating, if any.
   * @return videoGameRating
  */
  @ApiModelProperty(value = "Video game rating, if any.")


  public VideoGameRatingEnum getVideoGameRating() {
    return videoGameRating;
  }

  public void setVideoGameRating(VideoGameRatingEnum videoGameRating) {
    this.videoGameRating = videoGameRating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAgeGating videoAgeGating = (VideoAgeGating) o;
    return Objects.equals(this.alcoholContent, videoAgeGating.alcoholContent) &&
        Objects.equals(this.restricted, videoAgeGating.restricted) &&
        Objects.equals(this.videoGameRating, videoAgeGating.videoGameRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alcoholContent, restricted, videoGameRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAgeGating {\n");
    
    sb.append("    alcoholContent: ").append(toIndentedString(alcoholContent)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    videoGameRating: ").append(toIndentedString(videoGameRating)).append("\n");
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

