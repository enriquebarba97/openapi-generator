package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.ChannelProfileDetails;
import org.openapitools.model.SuperStickerMetadata;

/**
 * SuperChatEventSnippet
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class SuperChatEventSnippet   {
  @JsonProperty("amountMicros")
  private String amountMicros;

  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("commentText")
  private String commentText;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("displayString")
  private String displayString;

  @JsonProperty("isSuperStickerEvent")
  private Boolean isSuperStickerEvent;

  @JsonProperty("messageType")
  private Integer messageType;

  @JsonProperty("superStickerMetadata")
  private SuperStickerMetadata superStickerMetadata;

  @JsonProperty("supporterDetails")
  private ChannelProfileDetails supporterDetails;

  public SuperChatEventSnippet amountMicros(String amountMicros) {
    this.amountMicros = amountMicros;
    return this;
  }

   /**
   * The purchase amount, in micros of the purchase currency. e.g., 1 is represented as 1000000.
   * @return amountMicros
  **/
  @ApiModelProperty(value = "The purchase amount, in micros of the purchase currency. e.g., 1 is represented as 1000000.")
  public String getAmountMicros() {
    return amountMicros;
  }

  public void setAmountMicros(String amountMicros) {
    this.amountMicros = amountMicros;
  }

  public SuperChatEventSnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Channel id where the event occurred.
   * @return channelId
  **/
  @ApiModelProperty(value = "Channel id where the event occurred.")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public SuperChatEventSnippet commentText(String commentText) {
    this.commentText = commentText;
    return this;
  }

   /**
   * The text contents of the comment left by the user.
   * @return commentText
  **/
  @ApiModelProperty(value = "The text contents of the comment left by the user.")
  public String getCommentText() {
    return commentText;
  }

  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }

  public SuperChatEventSnippet createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the event occurred.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The date and time when the event occurred.")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public SuperChatEventSnippet currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency in which the purchase was made. ISO 4217.
   * @return currency
  **/
  @ApiModelProperty(value = "The currency in which the purchase was made. ISO 4217.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SuperChatEventSnippet displayString(String displayString) {
    this.displayString = displayString;
    return this;
  }

   /**
   * A rendered string that displays the purchase amount and currency (e.g., \"$1.00\"). The string is rendered for the given language.
   * @return displayString
  **/
  @ApiModelProperty(value = "A rendered string that displays the purchase amount and currency (e.g., \"$1.00\"). The string is rendered for the given language.")
  public String getDisplayString() {
    return displayString;
  }

  public void setDisplayString(String displayString) {
    this.displayString = displayString;
  }

  public SuperChatEventSnippet isSuperStickerEvent(Boolean isSuperStickerEvent) {
    this.isSuperStickerEvent = isSuperStickerEvent;
    return this;
  }

   /**
   * True if this event is a Super Sticker event.
   * @return isSuperStickerEvent
  **/
  @ApiModelProperty(value = "True if this event is a Super Sticker event.")
  public Boolean getIsSuperStickerEvent() {
    return isSuperStickerEvent;
  }

  public void setIsSuperStickerEvent(Boolean isSuperStickerEvent) {
    this.isSuperStickerEvent = isSuperStickerEvent;
  }

  public SuperChatEventSnippet messageType(Integer messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * The tier for the paid message, which is based on the amount of money spent to purchase the message.
   * @return messageType
  **/
  @ApiModelProperty(value = "The tier for the paid message, which is based on the amount of money spent to purchase the message.")
  public Integer getMessageType() {
    return messageType;
  }

  public void setMessageType(Integer messageType) {
    this.messageType = messageType;
  }

  public SuperChatEventSnippet superStickerMetadata(SuperStickerMetadata superStickerMetadata) {
    this.superStickerMetadata = superStickerMetadata;
    return this;
  }

   /**
   * Get superStickerMetadata
   * @return superStickerMetadata
  **/
  @ApiModelProperty(value = "")
  public SuperStickerMetadata getSuperStickerMetadata() {
    return superStickerMetadata;
  }

  public void setSuperStickerMetadata(SuperStickerMetadata superStickerMetadata) {
    this.superStickerMetadata = superStickerMetadata;
  }

  public SuperChatEventSnippet supporterDetails(ChannelProfileDetails supporterDetails) {
    this.supporterDetails = supporterDetails;
    return this;
  }

   /**
   * Get supporterDetails
   * @return supporterDetails
  **/
  @ApiModelProperty(value = "")
  public ChannelProfileDetails getSupporterDetails() {
    return supporterDetails;
  }

  public void setSupporterDetails(ChannelProfileDetails supporterDetails) {
    this.supporterDetails = supporterDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperChatEventSnippet superChatEventSnippet = (SuperChatEventSnippet) o;
    return Objects.equals(this.amountMicros, superChatEventSnippet.amountMicros) &&
        Objects.equals(this.channelId, superChatEventSnippet.channelId) &&
        Objects.equals(this.commentText, superChatEventSnippet.commentText) &&
        Objects.equals(this.createdAt, superChatEventSnippet.createdAt) &&
        Objects.equals(this.currency, superChatEventSnippet.currency) &&
        Objects.equals(this.displayString, superChatEventSnippet.displayString) &&
        Objects.equals(this.isSuperStickerEvent, superChatEventSnippet.isSuperStickerEvent) &&
        Objects.equals(this.messageType, superChatEventSnippet.messageType) &&
        Objects.equals(this.superStickerMetadata, superChatEventSnippet.superStickerMetadata) &&
        Objects.equals(this.supporterDetails, superChatEventSnippet.supporterDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountMicros, channelId, commentText, createdAt, currency, displayString, isSuperStickerEvent, messageType, superStickerMetadata, supporterDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperChatEventSnippet {\n");
    
    sb.append("    amountMicros: ").append(toIndentedString(amountMicros)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    displayString: ").append(toIndentedString(displayString)).append("\n");
    sb.append("    isSuperStickerEvent: ").append(toIndentedString(isSuperStickerEvent)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    superStickerMetadata: ").append(toIndentedString(superStickerMetadata)).append("\n");
    sb.append("    supporterDetails: ").append(toIndentedString(supporterDetails)).append("\n");
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

