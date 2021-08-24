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
 * LiveChatMessageRetractedDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaIDLCodegen", date = "2021-08-24T20:55:04.712703200+02:00[Europe/Paris]")
public class LiveChatMessageRetractedDetails {
  public static final String SERIALIZED_NAME_RETRACTED_MESSAGE_ID = "retractedMessageId";
  @SerializedName(SERIALIZED_NAME_RETRACTED_MESSAGE_ID)
  private String retractedMessageId;


  public LiveChatMessageRetractedDetails retractedMessageId(String retractedMessageId) {
    
    this.retractedMessageId = retractedMessageId;
    return this;
  }

   /**
   * Get retractedMessageId
   * @return retractedMessageId
  **/
  @javax.annotation.Nullable
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

