package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.GeoPoint;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Recording information associated with the video.
 */
@ApiModel(description = "Recording information associated with the video.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoRecordingDetails   {
  @JsonProperty("location")
  private GeoPoint location;

  @JsonProperty("locationDescription")
  private String locationDescription;

  @JsonProperty("recordingDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime recordingDate;

  public VideoRecordingDetails location(GeoPoint location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public GeoPoint getLocation() {
    return location;
  }

  public void setLocation(GeoPoint location) {
    this.location = location;
  }

  public VideoRecordingDetails locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * The text description of the location where the video was recorded.
   * @return locationDescription
  */
  @ApiModelProperty(value = "The text description of the location where the video was recorded.")


  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public VideoRecordingDetails recordingDate(OffsetDateTime recordingDate) {
    this.recordingDate = recordingDate;
    return this;
  }

  /**
   * The date and time when the video was recorded.
   * @return recordingDate
  */
  @ApiModelProperty(value = "The date and time when the video was recorded.")

  @Valid

  public OffsetDateTime getRecordingDate() {
    return recordingDate;
  }

  public void setRecordingDate(OffsetDateTime recordingDate) {
    this.recordingDate = recordingDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoRecordingDetails videoRecordingDetails = (VideoRecordingDetails) o;
    return Objects.equals(this.location, videoRecordingDetails.location) &&
        Objects.equals(this.locationDescription, videoRecordingDetails.locationDescription) &&
        Objects.equals(this.recordingDate, videoRecordingDetails.recordingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, locationDescription, recordingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoRecordingDetails {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    recordingDate: ").append(toIndentedString(recordingDate)).append("\n");
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

