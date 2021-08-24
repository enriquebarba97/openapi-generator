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
import org.openapitools.client.model.ChannelProfileDetails;

/**
 * LiveChatModeratorSnippet
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaIDLCodegen", date = "2021-08-24T20:55:04.712703200+02:00[Europe/Paris]")
public class LiveChatModeratorSnippet {
  public static final String SERIALIZED_NAME_LIVE_CHAT_ID = "liveChatId";
  @SerializedName(SERIALIZED_NAME_LIVE_CHAT_ID)
  private String liveChatId;

  public static final String SERIALIZED_NAME_MODERATOR_DETAILS = "moderatorDetails";
  @SerializedName(SERIALIZED_NAME_MODERATOR_DETAILS)
  private ChannelProfileDetails moderatorDetails;


  public LiveChatModeratorSnippet liveChatId(String liveChatId) {
    
    this.liveChatId = liveChatId;
    return this;
  }

   /**
   * The ID of the live chat this moderator can act on.
   * @return liveChatId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the live chat this moderator can act on.")

  public String getLiveChatId() {
    return liveChatId;
  }


  public void setLiveChatId(String liveChatId) {
    this.liveChatId = liveChatId;
  }


  public LiveChatModeratorSnippet moderatorDetails(ChannelProfileDetails moderatorDetails) {
    
    this.moderatorDetails = moderatorDetails;
    return this;
  }

   /**
   * Get moderatorDetails
   * @return moderatorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChannelProfileDetails getModeratorDetails() {
    return moderatorDetails;
  }


  public void setModeratorDetails(ChannelProfileDetails moderatorDetails) {
    this.moderatorDetails = moderatorDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveChatModeratorSnippet liveChatModeratorSnippet = (LiveChatModeratorSnippet) o;
    return Objects.equals(this.liveChatId, liveChatModeratorSnippet.liveChatId) &&
        Objects.equals(this.moderatorDetails, liveChatModeratorSnippet.moderatorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liveChatId, moderatorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatModeratorSnippet {\n");
    sb.append("    liveChatId: ").append(toIndentedString(liveChatId)).append("\n");
    sb.append("    moderatorDetails: ").append(toIndentedString(moderatorDetails)).append("\n");
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

