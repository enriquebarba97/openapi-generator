package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.LiveChatFanFundingEventDetails;
import org.openapitools.model.LiveChatMessageDeletedDetails;
import org.openapitools.model.LiveChatMessageRetractedDetails;
import org.openapitools.model.LiveChatSuperChatDetails;
import org.openapitools.model.LiveChatSuperStickerDetails;
import org.openapitools.model.LiveChatTextMessageDetails;
import org.openapitools.model.LiveChatUserBannedMessageDetails;

/**
 * LiveChatMessageSnippet
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveChatMessageSnippet   {
  @JsonProperty("authorChannelId")
  private String authorChannelId;

  @JsonProperty("displayMessage")
  private String displayMessage;

  @JsonProperty("fanFundingEventDetails")
  private LiveChatFanFundingEventDetails fanFundingEventDetails;

  @JsonProperty("hasDisplayContent")
  private Boolean hasDisplayContent;

  @JsonProperty("liveChatId")
  private String liveChatId;

  @JsonProperty("messageDeletedDetails")
  private LiveChatMessageDeletedDetails messageDeletedDetails;

  @JsonProperty("messageRetractedDetails")
  private LiveChatMessageRetractedDetails messageRetractedDetails;

  @JsonProperty("publishedAt")
  private Date publishedAt;

  @JsonProperty("superChatDetails")
  private LiveChatSuperChatDetails superChatDetails;

  @JsonProperty("superStickerDetails")
  private LiveChatSuperStickerDetails superStickerDetails;

  @JsonProperty("textMessageDetails")
  private LiveChatTextMessageDetails textMessageDetails;

  /**
   * The type of message, this will always be present, it determines the contents of the message as well as which fields will be present.
   */
  public enum TypeEnum {
    INVALIDTYPE("invalidType"),
    
    TEXTMESSAGEEVENT("textMessageEvent"),
    
    TOMBSTONE("tombstone"),
    
    FANFUNDINGEVENT("fanFundingEvent"),
    
    CHATENDEDEVENT("chatEndedEvent"),
    
    SPONSORONLYMODESTARTEDEVENT("sponsorOnlyModeStartedEvent"),
    
    SPONSORONLYMODEENDEDEVENT("sponsorOnlyModeEndedEvent"),
    
    NEWSPONSOREVENT("newSponsorEvent"),
    
    MESSAGEDELETEDEVENT("messageDeletedEvent"),
    
    MESSAGERETRACTEDEVENT("messageRetractedEvent"),
    
    USERBANNEDEVENT("userBannedEvent"),
    
    SUPERCHATEVENT("superChatEvent"),
    
    SUPERSTICKEREVENT("superStickerEvent");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("userBannedDetails")
  private LiveChatUserBannedMessageDetails userBannedDetails;

  public LiveChatMessageSnippet authorChannelId(String authorChannelId) {
    this.authorChannelId = authorChannelId;
    return this;
  }

   /**
   * The ID of the user that authored this message, this field is not always filled. textMessageEvent - the user that wrote the message fanFundingEvent - the user that funded the broadcast newSponsorEvent - the user that just became a sponsor messageDeletedEvent - the moderator that took the action messageRetractedEvent - the author that retracted their message userBannedEvent - the moderator that took the action superChatEvent - the user that made the purchase
   * @return authorChannelId
  **/
  @ApiModelProperty(value = "The ID of the user that authored this message, this field is not always filled. textMessageEvent - the user that wrote the message fanFundingEvent - the user that funded the broadcast newSponsorEvent - the user that just became a sponsor messageDeletedEvent - the moderator that took the action messageRetractedEvent - the author that retracted their message userBannedEvent - the moderator that took the action superChatEvent - the user that made the purchase")
  public String getAuthorChannelId() {
    return authorChannelId;
  }

  public void setAuthorChannelId(String authorChannelId) {
    this.authorChannelId = authorChannelId;
  }

  public LiveChatMessageSnippet displayMessage(String displayMessage) {
    this.displayMessage = displayMessage;
    return this;
  }

   /**
   * Contains a string that can be displayed to the user. If this field is not present the message is silent, at the moment only messages of type TOMBSTONE and CHAT_ENDED_EVENT are silent.
   * @return displayMessage
  **/
  @ApiModelProperty(value = "Contains a string that can be displayed to the user. If this field is not present the message is silent, at the moment only messages of type TOMBSTONE and CHAT_ENDED_EVENT are silent.")
  public String getDisplayMessage() {
    return displayMessage;
  }

  public void setDisplayMessage(String displayMessage) {
    this.displayMessage = displayMessage;
  }

  public LiveChatMessageSnippet fanFundingEventDetails(LiveChatFanFundingEventDetails fanFundingEventDetails) {
    this.fanFundingEventDetails = fanFundingEventDetails;
    return this;
  }

   /**
   * Get fanFundingEventDetails
   * @return fanFundingEventDetails
  **/
  @ApiModelProperty(value = "")
  public LiveChatFanFundingEventDetails getFanFundingEventDetails() {
    return fanFundingEventDetails;
  }

  public void setFanFundingEventDetails(LiveChatFanFundingEventDetails fanFundingEventDetails) {
    this.fanFundingEventDetails = fanFundingEventDetails;
  }

  public LiveChatMessageSnippet hasDisplayContent(Boolean hasDisplayContent) {
    this.hasDisplayContent = hasDisplayContent;
    return this;
  }

   /**
   * Whether the message has display content that should be displayed to users.
   * @return hasDisplayContent
  **/
  @ApiModelProperty(value = "Whether the message has display content that should be displayed to users.")
  public Boolean getHasDisplayContent() {
    return hasDisplayContent;
  }

  public void setHasDisplayContent(Boolean hasDisplayContent) {
    this.hasDisplayContent = hasDisplayContent;
  }

  public LiveChatMessageSnippet liveChatId(String liveChatId) {
    this.liveChatId = liveChatId;
    return this;
  }

   /**
   * Get liveChatId
   * @return liveChatId
  **/
  @ApiModelProperty(value = "")
  public String getLiveChatId() {
    return liveChatId;
  }

  public void setLiveChatId(String liveChatId) {
    this.liveChatId = liveChatId;
  }

  public LiveChatMessageSnippet messageDeletedDetails(LiveChatMessageDeletedDetails messageDeletedDetails) {
    this.messageDeletedDetails = messageDeletedDetails;
    return this;
  }

   /**
   * Get messageDeletedDetails
   * @return messageDeletedDetails
  **/
  @ApiModelProperty(value = "")
  public LiveChatMessageDeletedDetails getMessageDeletedDetails() {
    return messageDeletedDetails;
  }

  public void setMessageDeletedDetails(LiveChatMessageDeletedDetails messageDeletedDetails) {
    this.messageDeletedDetails = messageDeletedDetails;
  }

  public LiveChatMessageSnippet messageRetractedDetails(LiveChatMessageRetractedDetails messageRetractedDetails) {
    this.messageRetractedDetails = messageRetractedDetails;
    return this;
  }

   /**
   * Get messageRetractedDetails
   * @return messageRetractedDetails
  **/
  @ApiModelProperty(value = "")
  public LiveChatMessageRetractedDetails getMessageRetractedDetails() {
    return messageRetractedDetails;
  }

  public void setMessageRetractedDetails(LiveChatMessageRetractedDetails messageRetractedDetails) {
    this.messageRetractedDetails = messageRetractedDetails;
  }

  public LiveChatMessageSnippet publishedAt(Date publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * The date and time when the message was orignally published.
   * @return publishedAt
  **/
  @ApiModelProperty(value = "The date and time when the message was orignally published.")
  public Date getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(Date publishedAt) {
    this.publishedAt = publishedAt;
  }

  public LiveChatMessageSnippet superChatDetails(LiveChatSuperChatDetails superChatDetails) {
    this.superChatDetails = superChatDetails;
    return this;
  }

   /**
   * Get superChatDetails
   * @return superChatDetails
  **/
  @ApiModelProperty(value = "")
  public LiveChatSuperChatDetails getSuperChatDetails() {
    return superChatDetails;
  }

  public void setSuperChatDetails(LiveChatSuperChatDetails superChatDetails) {
    this.superChatDetails = superChatDetails;
  }

  public LiveChatMessageSnippet superStickerDetails(LiveChatSuperStickerDetails superStickerDetails) {
    this.superStickerDetails = superStickerDetails;
    return this;
  }

   /**
   * Get superStickerDetails
   * @return superStickerDetails
  **/
  @ApiModelProperty(value = "")
  public LiveChatSuperStickerDetails getSuperStickerDetails() {
    return superStickerDetails;
  }

  public void setSuperStickerDetails(LiveChatSuperStickerDetails superStickerDetails) {
    this.superStickerDetails = superStickerDetails;
  }

  public LiveChatMessageSnippet textMessageDetails(LiveChatTextMessageDetails textMessageDetails) {
    this.textMessageDetails = textMessageDetails;
    return this;
  }

   /**
   * Get textMessageDetails
   * @return textMessageDetails
  **/
  @ApiModelProperty(value = "")
  public LiveChatTextMessageDetails getTextMessageDetails() {
    return textMessageDetails;
  }

  public void setTextMessageDetails(LiveChatTextMessageDetails textMessageDetails) {
    this.textMessageDetails = textMessageDetails;
  }

  public LiveChatMessageSnippet type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of message, this will always be present, it determines the contents of the message as well as which fields will be present.
   * @return type
  **/
  @ApiModelProperty(value = "The type of message, this will always be present, it determines the contents of the message as well as which fields will be present.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public LiveChatMessageSnippet userBannedDetails(LiveChatUserBannedMessageDetails userBannedDetails) {
    this.userBannedDetails = userBannedDetails;
    return this;
  }

   /**
   * Get userBannedDetails
   * @return userBannedDetails
  **/
  @ApiModelProperty(value = "")
  public LiveChatUserBannedMessageDetails getUserBannedDetails() {
    return userBannedDetails;
  }

  public void setUserBannedDetails(LiveChatUserBannedMessageDetails userBannedDetails) {
    this.userBannedDetails = userBannedDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveChatMessageSnippet liveChatMessageSnippet = (LiveChatMessageSnippet) o;
    return Objects.equals(this.authorChannelId, liveChatMessageSnippet.authorChannelId) &&
        Objects.equals(this.displayMessage, liveChatMessageSnippet.displayMessage) &&
        Objects.equals(this.fanFundingEventDetails, liveChatMessageSnippet.fanFundingEventDetails) &&
        Objects.equals(this.hasDisplayContent, liveChatMessageSnippet.hasDisplayContent) &&
        Objects.equals(this.liveChatId, liveChatMessageSnippet.liveChatId) &&
        Objects.equals(this.messageDeletedDetails, liveChatMessageSnippet.messageDeletedDetails) &&
        Objects.equals(this.messageRetractedDetails, liveChatMessageSnippet.messageRetractedDetails) &&
        Objects.equals(this.publishedAt, liveChatMessageSnippet.publishedAt) &&
        Objects.equals(this.superChatDetails, liveChatMessageSnippet.superChatDetails) &&
        Objects.equals(this.superStickerDetails, liveChatMessageSnippet.superStickerDetails) &&
        Objects.equals(this.textMessageDetails, liveChatMessageSnippet.textMessageDetails) &&
        Objects.equals(this.type, liveChatMessageSnippet.type) &&
        Objects.equals(this.userBannedDetails, liveChatMessageSnippet.userBannedDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorChannelId, displayMessage, fanFundingEventDetails, hasDisplayContent, liveChatId, messageDeletedDetails, messageRetractedDetails, publishedAt, superChatDetails, superStickerDetails, textMessageDetails, type, userBannedDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatMessageSnippet {\n");
    
    sb.append("    authorChannelId: ").append(toIndentedString(authorChannelId)).append("\n");
    sb.append("    displayMessage: ").append(toIndentedString(displayMessage)).append("\n");
    sb.append("    fanFundingEventDetails: ").append(toIndentedString(fanFundingEventDetails)).append("\n");
    sb.append("    hasDisplayContent: ").append(toIndentedString(hasDisplayContent)).append("\n");
    sb.append("    liveChatId: ").append(toIndentedString(liveChatId)).append("\n");
    sb.append("    messageDeletedDetails: ").append(toIndentedString(messageDeletedDetails)).append("\n");
    sb.append("    messageRetractedDetails: ").append(toIndentedString(messageRetractedDetails)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    superChatDetails: ").append(toIndentedString(superChatDetails)).append("\n");
    sb.append("    superStickerDetails: ").append(toIndentedString(superStickerDetails)).append("\n");
    sb.append("    textMessageDetails: ").append(toIndentedString(textMessageDetails)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userBannedDetails: ").append(toIndentedString(userBannedDetails)).append("\n");
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

