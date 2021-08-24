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
 * Describes information necessary for ingesting an RTMP or an HTTP stream.
 */
@ApiModel(description = "Describes information necessary for ingesting an RTMP or an HTTP stream.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class IngestionInfo   {
  @JsonProperty("backupIngestionAddress")
  private String backupIngestionAddress;

  @JsonProperty("ingestionAddress")
  private String ingestionAddress;

  @JsonProperty("rtmpsBackupIngestionAddress")
  private String rtmpsBackupIngestionAddress;

  @JsonProperty("rtmpsIngestionAddress")
  private String rtmpsIngestionAddress;

  @JsonProperty("streamName")
  private String streamName;

  public IngestionInfo backupIngestionAddress(String backupIngestionAddress) {
    this.backupIngestionAddress = backupIngestionAddress;
    return this;
  }

  /**
   * The backup ingestion URL that you should use to stream video to YouTube. You have the option of simultaneously streaming the content that you are sending to the ingestionAddress to this URL.
   * @return backupIngestionAddress
  */
  @ApiModelProperty(value = "The backup ingestion URL that you should use to stream video to YouTube. You have the option of simultaneously streaming the content that you are sending to the ingestionAddress to this URL.")


  public String getBackupIngestionAddress() {
    return backupIngestionAddress;
  }

  public void setBackupIngestionAddress(String backupIngestionAddress) {
    this.backupIngestionAddress = backupIngestionAddress;
  }

  public IngestionInfo ingestionAddress(String ingestionAddress) {
    this.ingestionAddress = ingestionAddress;
    return this;
  }

  /**
   * The primary ingestion URL that you should use to stream video to YouTube. You must stream video to this URL. Depending on which application or tool you use to encode your video stream, you may need to enter the stream URL and stream name separately or you may need to concatenate them in the following format: *STREAM_URL/STREAM_NAME* 
   * @return ingestionAddress
  */
  @ApiModelProperty(value = "The primary ingestion URL that you should use to stream video to YouTube. You must stream video to this URL. Depending on which application or tool you use to encode your video stream, you may need to enter the stream URL and stream name separately or you may need to concatenate them in the following format: *STREAM_URL/STREAM_NAME* ")


  public String getIngestionAddress() {
    return ingestionAddress;
  }

  public void setIngestionAddress(String ingestionAddress) {
    this.ingestionAddress = ingestionAddress;
  }

  public IngestionInfo rtmpsBackupIngestionAddress(String rtmpsBackupIngestionAddress) {
    this.rtmpsBackupIngestionAddress = rtmpsBackupIngestionAddress;
    return this;
  }

  /**
   * This ingestion url may be used instead of backupIngestionAddress in order to stream via RTMPS. Not applicable to non-RTMP streams.
   * @return rtmpsBackupIngestionAddress
  */
  @ApiModelProperty(value = "This ingestion url may be used instead of backupIngestionAddress in order to stream via RTMPS. Not applicable to non-RTMP streams.")


  public String getRtmpsBackupIngestionAddress() {
    return rtmpsBackupIngestionAddress;
  }

  public void setRtmpsBackupIngestionAddress(String rtmpsBackupIngestionAddress) {
    this.rtmpsBackupIngestionAddress = rtmpsBackupIngestionAddress;
  }

  public IngestionInfo rtmpsIngestionAddress(String rtmpsIngestionAddress) {
    this.rtmpsIngestionAddress = rtmpsIngestionAddress;
    return this;
  }

  /**
   * This ingestion url may be used instead of ingestionAddress in order to stream via RTMPS. Not applicable to non-RTMP streams.
   * @return rtmpsIngestionAddress
  */
  @ApiModelProperty(value = "This ingestion url may be used instead of ingestionAddress in order to stream via RTMPS. Not applicable to non-RTMP streams.")


  public String getRtmpsIngestionAddress() {
    return rtmpsIngestionAddress;
  }

  public void setRtmpsIngestionAddress(String rtmpsIngestionAddress) {
    this.rtmpsIngestionAddress = rtmpsIngestionAddress;
  }

  public IngestionInfo streamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

  /**
   * The HTTP or RTMP stream name that YouTube assigns to the video stream.
   * @return streamName
  */
  @ApiModelProperty(value = "The HTTP or RTMP stream name that YouTube assigns to the video stream.")


  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngestionInfo ingestionInfo = (IngestionInfo) o;
    return Objects.equals(this.backupIngestionAddress, ingestionInfo.backupIngestionAddress) &&
        Objects.equals(this.ingestionAddress, ingestionInfo.ingestionAddress) &&
        Objects.equals(this.rtmpsBackupIngestionAddress, ingestionInfo.rtmpsBackupIngestionAddress) &&
        Objects.equals(this.rtmpsIngestionAddress, ingestionInfo.rtmpsIngestionAddress) &&
        Objects.equals(this.streamName, ingestionInfo.streamName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupIngestionAddress, ingestionAddress, rtmpsBackupIngestionAddress, rtmpsIngestionAddress, streamName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngestionInfo {\n");
    
    sb.append("    backupIngestionAddress: ").append(toIndentedString(backupIngestionAddress)).append("\n");
    sb.append("    ingestionAddress: ").append(toIndentedString(ingestionAddress)).append("\n");
    sb.append("    rtmpsBackupIngestionAddress: ").append(toIndentedString(rtmpsBackupIngestionAddress)).append("\n");
    sb.append("    rtmpsIngestionAddress: ").append(toIndentedString(rtmpsIngestionAddress)).append("\n");
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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

