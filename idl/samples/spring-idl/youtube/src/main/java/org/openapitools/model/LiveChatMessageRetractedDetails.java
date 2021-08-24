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
 * LiveChatMessageRetractedDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveChatMessageRetractedDetails   {
  @JsonProperty("retractedMessageId")
  private String retractedMessageId;

  public LiveChatMessageRetractedDetails retractedMessageId(String retractedMessageId) {
    this.retractedMessageId = retractedMessageId;
    return this;
  }

  /**
   * Get retractedMessageId
   * @return retractedMessageId
  */
  @ApiModelProperty(value = "")


  public String getRetractedMessageId() {
    return retractedMessageId;
  }

  public void setRetractedMessageId(String retractedMessageId) {
    this.retractedMessageId = retractedMessageId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveChatMessageRetractedDetails liveChatMessageRetractedDetails = (LiveChatMessageRetractedDetails) o;
    return Objects.equals(this.retractedMessageId, liveChatMessageRetractedDetails.retractedMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retractedMessageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatMessageRetractedDetails {\n");
    
    sb.append("    retractedMessageId: ").append(toIndentedString(retractedMessageId)).append("\n");
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

