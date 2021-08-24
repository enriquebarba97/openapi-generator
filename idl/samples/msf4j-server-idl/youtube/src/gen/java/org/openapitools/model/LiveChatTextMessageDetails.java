package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LiveChatTextMessageDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveChatTextMessageDetails   {
  @JsonProperty("messageText")
  private String messageText;

  public LiveChatTextMessageDetails messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

   /**
   * The user's message.
   * @return messageText
  **/
  @ApiModelProperty(value = "The user's message.")
  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveChatTextMessageDetails liveChatTextMessageDetails = (LiveChatTextMessageDetails) o;
    return Objects.equals(this.messageText, liveChatTextMessageDetails.messageText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatTextMessageDetails {\n");
    
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
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

