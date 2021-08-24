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
 * LiveChatTextMessageDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaIDLCodegen", date = "2021-08-24T20:55:04.712703200+02:00[Europe/Paris]")
public class LiveChatTextMessageDetails {
  public static final String SERIALIZED_NAME_MESSAGE_TEXT = "messageText";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXT)
  private String messageText;


  public LiveChatTextMessageDetails messageText(String messageText) {
    
    this.messageText = messageText;
    return this;
  }

   /**
   * The user&#39;s message.
   * @return messageText
  **/
  @javax.annotation.Nullable
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

