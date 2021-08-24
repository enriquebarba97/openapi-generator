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
 * Information about the uploaded video.
 */
@ApiModel(description = "Information about the uploaded video.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ActivityContentDetailsUpload   {
  @JsonProperty("videoId")
  private String videoId;

  public ActivityContentDetailsUpload videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the uploaded video.
   * @return videoId
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the uploaded video.")


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
    ActivityContentDetailsUpload activityContentDetailsUpload = (ActivityContentDetailsUpload) o;
    return Objects.equals(this.videoId, activityContentDetailsUpload.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityContentDetailsUpload {\n");
    
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

