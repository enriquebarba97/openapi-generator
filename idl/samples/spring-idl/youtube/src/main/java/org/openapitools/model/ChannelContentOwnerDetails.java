package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The contentOwnerDetails object encapsulates channel data that is relevant for YouTube Partners linked with the channel.
 */
@ApiModel(description = "The contentOwnerDetails object encapsulates channel data that is relevant for YouTube Partners linked with the channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ChannelContentOwnerDetails   {
  @JsonProperty("contentOwner")
  private String contentOwner;

  @JsonProperty("timeLinked")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timeLinked;

  public ChannelContentOwnerDetails contentOwner(String contentOwner) {
    this.contentOwner = contentOwner;
    return this;
  }

  /**
   * The ID of the content owner linked to the channel.
   * @return contentOwner
  */
  @ApiModelProperty(value = "The ID of the content owner linked to the channel.")


  public String getContentOwner() {
    return contentOwner;
  }

  public void setContentOwner(String contentOwner) {
    this.contentOwner = contentOwner;
  }

  public ChannelContentOwnerDetails timeLinked(OffsetDateTime timeLinked) {
    this.timeLinked = timeLinked;
    return this;
  }

  /**
   * The date and time when the channel was linked to the content owner.
   * @return timeLinked
  */
  @ApiModelProperty(value = "The date and time when the channel was linked to the content owner.")

  @Valid

  public OffsetDateTime getTimeLinked() {
    return timeLinked;
  }

  public void setTimeLinked(OffsetDateTime timeLinked) {
    this.timeLinked = timeLinked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelContentOwnerDetails channelContentOwnerDetails = (ChannelContentOwnerDetails) o;
    return Objects.equals(this.contentOwner, channelContentOwnerDetails.contentOwner) &&
        Objects.equals(this.timeLinked, channelContentOwnerDetails.timeLinked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentOwner, timeLinked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelContentOwnerDetails {\n");
    
    sb.append("    contentOwner: ").append(toIndentedString(contentOwner)).append("\n");
    sb.append("    timeLinked: ").append(toIndentedString(timeLinked)).append("\n");
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

