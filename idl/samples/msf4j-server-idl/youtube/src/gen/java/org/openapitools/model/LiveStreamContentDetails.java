package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Detailed settings of a stream.
 */
@ApiModel(description = "Detailed settings of a stream.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveStreamContentDetails   {
  @JsonProperty("closedCaptionsIngestionUrl")
  private String closedCaptionsIngestionUrl;

  @JsonProperty("isReusable")
  private Boolean isReusable;

  public LiveStreamContentDetails closedCaptionsIngestionUrl(String closedCaptionsIngestionUrl) {
    this.closedCaptionsIngestionUrl = closedCaptionsIngestionUrl;
    return this;
  }

   /**
   * The ingestion URL where the closed captions of this stream are sent.
   * @return closedCaptionsIngestionUrl
  **/
  @ApiModelProperty(value = "The ingestion URL where the closed captions of this stream are sent.")
  public String getClosedCaptionsIngestionUrl() {
    return closedCaptionsIngestionUrl;
  }

  public void setClosedCaptionsIngestionUrl(String closedCaptionsIngestionUrl) {
    this.closedCaptionsIngestionUrl = closedCaptionsIngestionUrl;
  }

  public LiveStreamContentDetails isReusable(Boolean isReusable) {
    this.isReusable = isReusable;
    return this;
  }

   /**
   * Indicates whether the stream is reusable, which means that it can be bound to multiple broadcasts. It is common for broadcasters to reuse the same stream for many different broadcasts if those broadcasts occur at different times. If you set this value to false, then the stream will not be reusable, which means that it can only be bound to one broadcast. Non-reusable streams differ from reusable streams in the following ways: - A non-reusable stream can only be bound to one broadcast. - A non-reusable stream might be deleted by an automated process after the broadcast ends. - The liveStreams.list method does not list non-reusable streams if you call the method and set the mine parameter to true. The only way to use that method to retrieve the resource for a non-reusable stream is to use the id parameter to identify the stream. 
   * @return isReusable
  **/
  @ApiModelProperty(value = "Indicates whether the stream is reusable, which means that it can be bound to multiple broadcasts. It is common for broadcasters to reuse the same stream for many different broadcasts if those broadcasts occur at different times. If you set this value to false, then the stream will not be reusable, which means that it can only be bound to one broadcast. Non-reusable streams differ from reusable streams in the following ways: - A non-reusable stream can only be bound to one broadcast. - A non-reusable stream might be deleted by an automated process after the broadcast ends. - The liveStreams.list method does not list non-reusable streams if you call the method and set the mine parameter to true. The only way to use that method to retrieve the resource for a non-reusable stream is to use the id parameter to identify the stream. ")
  public Boolean getIsReusable() {
    return isReusable;
  }

  public void setIsReusable(Boolean isReusable) {
    this.isReusable = isReusable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStreamContentDetails liveStreamContentDetails = (LiveStreamContentDetails) o;
    return Objects.equals(this.closedCaptionsIngestionUrl, liveStreamContentDetails.closedCaptionsIngestionUrl) &&
        Objects.equals(this.isReusable, liveStreamContentDetails.isReusable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closedCaptionsIngestionUrl, isReusable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamContentDetails {\n");
    
    sb.append("    closedCaptionsIngestionUrl: ").append(toIndentedString(closedCaptionsIngestionUrl)).append("\n");
    sb.append("    isReusable: ").append(toIndentedString(isReusable)).append("\n");
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

