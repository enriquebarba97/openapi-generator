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
 * Settings and Info of the monitor stream
 */
@ApiModel(description = "Settings and Info of the monitor stream")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class MonitorStreamInfo   {
  @JsonProperty("broadcastStreamDelayMs")
  private Integer broadcastStreamDelayMs;

  @JsonProperty("embedHtml")
  private String embedHtml;

  @JsonProperty("enableMonitorStream")
  private Boolean enableMonitorStream;

  public MonitorStreamInfo broadcastStreamDelayMs(Integer broadcastStreamDelayMs) {
    this.broadcastStreamDelayMs = broadcastStreamDelayMs;
    return this;
  }

  /**
   * If you have set the enableMonitorStream property to true, then this property determines the length of the live broadcast delay.
   * @return broadcastStreamDelayMs
  */
  @ApiModelProperty(value = "If you have set the enableMonitorStream property to true, then this property determines the length of the live broadcast delay.")


  public Integer getBroadcastStreamDelayMs() {
    return broadcastStreamDelayMs;
  }

  public void setBroadcastStreamDelayMs(Integer broadcastStreamDelayMs) {
    this.broadcastStreamDelayMs = broadcastStreamDelayMs;
  }

  public MonitorStreamInfo embedHtml(String embedHtml) {
    this.embedHtml = embedHtml;
    return this;
  }

  /**
   * HTML code that embeds a player that plays the monitor stream.
   * @return embedHtml
  */
  @ApiModelProperty(value = "HTML code that embeds a player that plays the monitor stream.")


  public String getEmbedHtml() {
    return embedHtml;
  }

  public void setEmbedHtml(String embedHtml) {
    this.embedHtml = embedHtml;
  }

  public MonitorStreamInfo enableMonitorStream(Boolean enableMonitorStream) {
    this.enableMonitorStream = enableMonitorStream;
    return this;
  }

  /**
   * This value determines whether the monitor stream is enabled for the broadcast. If the monitor stream is enabled, then YouTube will broadcast the event content on a special stream intended only for the broadcaster's consumption. The broadcaster can use the stream to review the event content and also to identify the optimal times to insert cuepoints. You need to set this value to true if you intend to have a broadcast delay for your event. *Note:* This property cannot be updated once the broadcast is in the testing or live state.
   * @return enableMonitorStream
  */
  @ApiModelProperty(value = "This value determines whether the monitor stream is enabled for the broadcast. If the monitor stream is enabled, then YouTube will broadcast the event content on a special stream intended only for the broadcaster's consumption. The broadcaster can use the stream to review the event content and also to identify the optimal times to insert cuepoints. You need to set this value to true if you intend to have a broadcast delay for your event. *Note:* This property cannot be updated once the broadcast is in the testing or live state.")


  public Boolean getEnableMonitorStream() {
    return enableMonitorStream;
  }

  public void setEnableMonitorStream(Boolean enableMonitorStream) {
    this.enableMonitorStream = enableMonitorStream;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorStreamInfo monitorStreamInfo = (MonitorStreamInfo) o;
    return Objects.equals(this.broadcastStreamDelayMs, monitorStreamInfo.broadcastStreamDelayMs) &&
        Objects.equals(this.embedHtml, monitorStreamInfo.embedHtml) &&
        Objects.equals(this.enableMonitorStream, monitorStreamInfo.enableMonitorStream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(broadcastStreamDelayMs, embedHtml, enableMonitorStream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorStreamInfo {\n");
    
    sb.append("    broadcastStreamDelayMs: ").append(toIndentedString(broadcastStreamDelayMs)).append("\n");
    sb.append("    embedHtml: ").append(toIndentedString(embedHtml)).append("\n");
    sb.append("    enableMonitorStream: ").append(toIndentedString(enableMonitorStream)).append("\n");
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

