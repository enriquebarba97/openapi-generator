/*
 * YouTube Data API v3
 * The YouTube Data API v3 is an API that provides access to YouTube data, such as videos, playlists, and channels.
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Geographical coordinates of a point, in WGS84.
 */
@ApiModel(description = "Geographical coordinates of a point, in WGS84.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaIDLCodegen", date = "2021-08-24T20:55:04.712703200+02:00[Europe/Paris]")
public class GeoPoint {
  public static final String SERIALIZED_NAME_ALTITUDE = "altitude";
  @SerializedName(SERIALIZED_NAME_ALTITUDE)
  private Double altitude;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;


  public GeoPoint altitude(Double altitude) {
    
    this.altitude = altitude;
    return this;
  }

   /**
   * Altitude above the reference ellipsoid, in meters.
   * @return altitude
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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

