package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LiveStreamHealthStatus;

/**
 * Brief description of the live stream status.
 */
@ApiModel(description = "Brief description of the live stream status.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveStreamStatus   {
  @JsonProperty("healthStatus")
  private LiveStreamHealthStatus healthStatus;

  /**
   * Gets or Sets streamStatus
   */
  public enum StreamStatusEnum {
    CREATED("created"),
    
    READY("ready"),
    
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    ERROR("error");

    private String value;

    StreamStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StreamStatusEnum fromValue(String text) {
      for (StreamStatusEnum b : StreamStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("streamStatus")
  private StreamStatusEnum streamStatus;

  public LiveStreamStatus healthStatus(LiveStreamHealthStatus healthStatus) {
    this.healthStatus = healthStatus;
    return this;
  }

   /**
   * Get healthStatus
   * @return healthStatus
  **/
  @ApiModelProperty(value = "")
  public LiveStreamHealthStatus getHealthStatus() {
    return healthStatus;
  }

  public void setHealthStatus(LiveStreamHealthStatus healthStatus) {
    this.healthStatus = healthStatus;
  }

  public LiveStreamStatus streamStatus(StreamStatusEnum streamStatus) {
    this.streamStatus = streamStatus;
    return this;
  }

   /**
   * Get streamStatus
   * @return streamStatus
  **/
  @ApiModelProperty(value = "")
  public StreamStatusEnum getStreamStatus() {
    return streamStatus;
  }

  public void setStreamStatus(StreamStatusEnum streamStatus) {
    this.streamStatus = streamStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStreamStatus liveStreamStatus = (LiveStreamStatus) o;
    return Objects.equals(this.healthStatus, liveStreamStatus.healthStatus) &&
        Objects.equals(this.streamStatus, liveStreamStatus.streamStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthStatus, streamStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamStatus {\n");
    
    sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
    sb.append("    streamStatus: ").append(toIndentedString(streamStatus)).append("\n");
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

