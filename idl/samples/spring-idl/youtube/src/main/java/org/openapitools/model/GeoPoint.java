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
 * Geographical coordinates of a point, in WGS84.
 */
@ApiModel(description = "Geographical coordinates of a point, in WGS84.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class GeoPoint   {
  @JsonProperty("altitude")
  private Double altitude;

  @JsonProperty("latitude")
  private Double latitude;

  @JsonProperty("longitude")
  private Double longitude;

  public GeoPoint altitude(Double altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Altitude above the reference ellipsoid, in meters.
   * @return altitude
  */
  @ApiModelProperty(value = "Altitude above the reference ellipsoid, in meters.")


  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public GeoPoint latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude in degrees.
   * @return latitude
  */
  @ApiModelProperty(value = "Latitude in degrees.")


  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public GeoPoint longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Longitude in degrees.
   * @return longitude
  */
  @ApiModelProperty(value = "Longitude in degrees.")


  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoPoint geoPoint = (GeoPoint) o;
    return Objects.equals(this.altitude, geoPoint.altitude) &&
        Objects.equals(this.latitude, geoPoint.latitude) &&
        Objects.equals(this.longitude, geoPoint.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altitude, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoPoint {\n");
    
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

