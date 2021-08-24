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
 * Statistics about the live broadcast. These represent a snapshot of the values at the time of the request. Statistics are only returned for live broadcasts.
 */
@ApiModel(description = "Statistics about the live broadcast. These represent a snapshot of the values at the time of the request. Statistics are only returned for live broadcasts.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveBroadcastStatistics   {
  @JsonProperty("totalChatCount")
  private String totalChatCount;

  public LiveBroadcastStatistics totalChatCount(String totalChatCount) {
    this.totalChatCount = totalChatCount;
    return this;
  }

  /**
   * The total number of live chat messages currently on the broadcast. The property and its value will be present if the broadcast is public, has the live chat feature enabled, and has at least one message. Note that this field will not be filled after the broadcast ends. So this property would not identify the number of chat messages for an archived video of a completed live broadcast.
   * @return totalChatCount
  */
  @ApiModelProperty(value = "The total number of live chat messages currently on the broadcast. The property and its value will be present if the broadcast is public, has the live chat feature enabled, and has at least one message. Note that this field will not be filled after the broadcast ends. So this property would not identify the number of chat messages for an archived video of a completed live broadcast.")


  public String getTotalChatCount() {
    return totalChatCount;
  }

  public void setTotalChatCount(String totalChatCount) {
    this.totalChatCount = totalChatCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveBroadcastStatistics liveBroadcastStatistics = (LiveBroadcastStatistics) o;
    return Objects.equals(this.totalChatCount, liveBroadcastStatistics.totalChatCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalChatCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveBroadcastStatistics {\n");
    
    sb.append("    totalChatCount: ").append(toIndentedString(totalChatCount)).append("\n");
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

