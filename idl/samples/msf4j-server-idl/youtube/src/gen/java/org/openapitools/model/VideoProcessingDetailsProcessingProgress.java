package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Video processing progress and completion time estimate.
 */
@ApiModel(description = "Video processing progress and completion time estimate.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class VideoProcessingDetailsProcessingProgress   {
  @JsonProperty("partsProcessed")
  private String partsProcessed;

  @JsonProperty("partsTotal")
  private String partsTotal;

  @JsonProperty("timeLeftMs")
  private String timeLeftMs;

  public VideoProcessingDetailsProcessingProgress partsProcessed(String partsProcessed) {
    this.partsProcessed = partsProcessed;
    return this;
  }

   /**
   * The number of parts of the video that YouTube has already processed. You can estimate the percentage of the video that YouTube has already processed by calculating: 100 * parts_processed / parts_total Note that since the estimated number of parts could increase without a corresponding increase in the number of parts that have already been processed, it is possible that the calculated progress could periodically decrease while YouTube processes a video.
   * @return partsProcessed
  **/
  @ApiModelProperty(value = "The number of parts of the video that YouTube has already processed. You can estimate the percentage of the video that YouTube has already processed by calculating: 100 * parts_processed / parts_total Note that since the estimated number of parts could increase without a corresponding increase in the number of parts that have already been processed, it is possible that the calculated progress could periodically decrease while YouTube processes a video.")
  public String getPartsProcessed() {
    return partsProcessed;
  }

  public void setPartsProcessed(String partsProcessed) {
    this.partsProcessed = partsProcessed;
  }

  public VideoProcessingDetailsProcessingProgress partsTotal(String partsTotal) {
    this.partsTotal = partsTotal;
    return this;
  }

   /**
   * An estimate of the total number of parts that need to be processed for the video. The number may be updated with more precise estimates while YouTube processes the video.
   * @return partsTotal
  **/
  @ApiModelProperty(value = "An estimate of the total number of parts that need to be processed for the video. The number may be updated with more precise estimates while YouTube processes the video.")
  public String getPartsTotal() {
    return partsTotal;
  }

  public void setPartsTotal(String partsTotal) {
    this.partsTotal = partsTotal;
  }

  public VideoProcessingDetailsProcessingProgress timeLeftMs(String timeLeftMs) {
    this.timeLeftMs = timeLeftMs;
    return this;
  }

   /**
   * An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the video.
   * @return timeLeftMs
  **/
  @ApiModelProperty(value = "An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the video.")
  public String getTimeLeftMs() {
    return timeLeftMs;
  }

  public void setTimeLeftMs(String timeLeftMs) {
    this.timeLeftMs = timeLeftMs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoProcessingDetailsProcessingProgress videoProcessingDetailsProcessingProgress = (VideoProcessingDetailsProcessingProgress) o;
    return Objects.equals(this.partsProcessed, videoProcessingDetailsProcessingProgress.partsProcessed) &&
        Objects.equals(this.partsTotal, videoProcessingDetailsProcessingProgress.partsTotal) &&
        Objects.equals(this.timeLeftMs, videoProcessingDetailsProcessingProgress.timeLeftMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partsProcessed, partsTotal, timeLeftMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoProcessingDetailsProcessingProgress {\n");
    
    sb.append("    partsProcessed: ").append(toIndentedString(partsProcessed)).append("\n");
    sb.append("    partsTotal: ").append(toIndentedString(partsTotal)).append("\n");
    sb.append("    timeLeftMs: ").append(toIndentedString(timeLeftMs)).append("\n");
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

