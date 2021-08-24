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
 * LiveChatMessageAuthorDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveChatMessageAuthorDetails   {
  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("channelUrl")
  private String channelUrl;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("isChatModerator")
  private Boolean isChatModerator;

  @JsonProperty("isChatOwner")
  private Boolean isChatOwner;

  @JsonProperty("isChatSponsor")
  private Boolean isChatSponsor;

  @JsonProperty("isVerified")
  private Boolean isVerified;

  @JsonProperty("profileImageUrl")
  private String profileImageUrl;

  public LiveChatMessageAuthorDetails channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The YouTube channel ID.
   * @return channelId
  */
  @ApiModelProperty(value = "The YouTube channel ID.")


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public LiveChatMessageAuthorDetails channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

  /**
   * The channel's URL.
   * @return channelUrl
  */
  @ApiModelProperty(value = "The channel's URL.")


  public String getChannelUrl() {
    return channelUrl;
  }

  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }

  public LiveChatMessageAuthorDetails displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The channel's display name.
   * @return displayName
  */
  @ApiModelProperty(value = "The channel's display name.")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public LiveChatMessageAuthorDetails isChatModerator(Boolean isChatModerator) {
    this.isChatModerator = isChatModerator;
    return this;
  }

  /**
   * Whether the author is a moderator of the live chat.
   * @return isChatModerator
  */
  @ApiModelProperty(value = "Whether the author is a moderator of the live chat.")


  public Boolean getIsChatModerator() {
    return isChatModerator;
  }

  public void setIsChatModerator(Boolean isChatModerator) {
    this.isChatModerator = isChatModerator;
  }

  public LiveChatMessageAuthorDetails isChatOwner(Boolean isChatOwner) {
    this.isChatOwner = isChatOwner;
    return this;
  }

  /**
   * Whether the author is the owner of the live chat.
   * @return isChatOwner
  */
  @ApiModelProperty(value = "Whether the author is the owner of the live chat.")


  public Boolean getIsChatOwner() {
    return isChatOwner;
  }

  public void setIsChatOwner(Boolean isChatOwner) {
    this.isChatOwner = isChatOwner;
  }

  public LiveChatMessageAuthorDetails isChatSponsor(Boolean isChatSponsor) {
    this.isChatSponsor = isChatSponsor;
    return this;
  }

  /**
   * Whether the author is a sponsor of the live chat.
   * @return isChatSponsor
  */
  @ApiModelProperty(value = "Whether the author is a sponsor of the live chat.")


  public Boolean getIsChatSponsor() {
    return isChatSponsor;
  }

  public void setIsChatSponsor(Boolean isChatSponsor) {
    this.isChatSponsor = isChatSponsor;
  }

  public LiveChatMessageAuthorDetails isVerified(Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

  /**
   * Whether the author's identity has been verified by YouTube.
   * @return isVerified
  */
  @ApiModelProperty(value = "Whether the author's identity has been verified by YouTube.")


  public Boolean getIsVerified() {
    return isVerified;
  }

  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }

  public LiveChatMessageAuthorDetails profileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
    return this;
  }

  /**
   * The channels's avatar URL.
   * @return profileImageUrl
  */
  @ApiModelProperty(value = "The channels's avatar URL.")


  public String getProfileImageUrl() {
    return profileImageUrl;
  }

  public void setProfileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveChatMessageAuthorDetails liveChatMessageAuthorDetails = (LiveChatMessageAuthorDetails) o;
    return Objects.equals(this.channelId, liveChatMessageAuthorDetails.channelId) &&
        Objects.equals(this.channelUrl, liveChatMessageAuthorDetails.channelUrl) &&
        Objects.equals(this.displayName, liveChatMessageAuthorDetails.displayName) &&
        Objects.equals(this.isChatModerator, liveChatMessageAuthorDetails.isChatModerator) &&
        Objects.equals(this.isChatOwner, liveChatMessageAuthorDetails.isChatOwner) &&
        Objects.equals(this.isChatSponsor, liveChatMessageAuthorDetails.isChatSponsor) &&
        Objects.equals(this.isVerified, liveChatMessageAuthorDetails.isVerified) &&
        Objects.equals(this.profileImageUrl, liveChatMessageAuthorDetails.profileImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelUrl, displayName, isChatModerator, isChatOwner, isChatSponsor, isVerified, profileImageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatMessageAuthorDetails {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isChatModerator: ").append(toIndentedString(isChatModerator)).append("\n");
    sb.append("    isChatOwner: ").append(toIndentedString(isChatOwner)).append("\n");
    sb.append("    isChatSponsor: ").append(toIndentedString(isChatSponsor)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    profileImageUrl: ").append(toIndentedString(profileImageUrl)).append("\n");
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

