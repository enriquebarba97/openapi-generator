package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChannelProfileDetails;

/**
 * LiveChatModeratorSnippet
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveChatModeratorSnippet   {
  @JsonProperty("liveChatId")
  private String liveChatId;

  @JsonProperty("moderatorDetails")
  private ChannelProfileDetails moderatorDetails;

  public LiveChatModeratorSnippet liveChatId(String liveChatId) {
    this.liveChatId = liveChatId;
    return this;
  }

   /**
   * The ID of the live chat this moderator can act on.
   * @return liveChatId
  **/
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

