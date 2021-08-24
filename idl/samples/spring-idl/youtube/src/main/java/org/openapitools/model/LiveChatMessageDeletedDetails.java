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
 * LiveChatMessageDeletedDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveChatMessageDeletedDetails   {
  @JsonProperty("deletedMessageId")
  private String deletedMessageId;

  public LiveChatMessageDeletedDetails deletedMessageId(String deletedMessageId) {
    this.deletedMessageId = deletedMessageId;
    return this;
  }

  /**
   * Get deletedMessageId
   * @return deletedMessageId
  */
  @ApiModelProperty(value = "")


  public String getDeletedMessageId() {
    return deletedMessageId;
  }

  public void setDeletedMessageId(String deletedMessageId) {
    this.deletedMessageId = deletedMessageId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveChatMessageDeletedDetails liveChatMessageDeletedDetails = (LiveChatMessageDeletedDetails) o;
    return Objects.equals(this.deletedMessageId, liveChatMessageDeletedDetails.deletedMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMessageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatMessageDeletedDetails {\n");
    
    sb.append("    deletedMessageId: ").append(toIndentedString(deletedMessageId)).append("\n");
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

