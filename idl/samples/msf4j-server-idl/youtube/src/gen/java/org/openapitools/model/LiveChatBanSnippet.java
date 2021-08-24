package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChannelProfileDetails;

/**
 * LiveChatBanSnippet
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveChatBanSnippet   {
  @JsonProperty("banDurationSeconds")
  private String banDurationSeconds;

  @JsonProperty("bannedUserDetails")
  private ChannelProfileDetails bannedUserDetails;

  @JsonProperty("liveChatId")
  private String liveChatId;

  /**
   * The type of ban.
   */
  public enum TypeEnum {
    LIVECHATBANTYPEUNSPECIFIED("liveChatBanTypeUnspecified"),
    
    PERMANENT("permanent"),
    
    TEMPORARY("temporary");

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

  public LiveChatBanSnippet banDurationSeconds(String banDurationSeconds) {
    this.banDurationSeconds = banDurationSeconds;
    return this;
  }

   /**
   * The duration of a ban, only filled if the ban has type TEMPORARY.
   * @return banDurationSeconds
  **/
  @ApiModelProperty(value = "The duration of a ban, only filled if the ban has type TEMPORARY.")
  public String getBanDurationSeconds() {
    return banDurationSeconds;
  }

  public void setBanDurationSeconds(String banDurationSeconds) {
    this.banDurationSeconds = banDurationSeconds;
  }

  public LiveChatBanSnippet bannedUserDetails(ChannelProfileDetails bannedUserDetails) {
    this.bannedUserDetails = bannedUserDetails;
    return this;
  }

   /**
   * Get bannedUserDetails
   * @return bannedUserDetails
  **/
  @ApiModelProperty(value = "")
  public ChannelProfileDetails getBannedUserDetails() {
    return bannedUserDetails;
  }

  public void setBannedUserDetails(ChannelProfileDetails bannedUserDetails) {
    this.bannedUserDetails = bannedUserDetails;
  }

  public LiveChatBanSnippet liveChatId(String liveChatId) {
    this.liveChatId = liveChatId;
    return this;
  }

   /**
   * The chat this ban is pertinent to.
   * @return liveChatId
  **/
  @ApiModelProperty(value = "The chat this ban is pertinent to.")
  public String getLiveChatId() {
    return liveChatId;
  }

  public void setLiveChatId(String liveChatId) {
    this.liveChatId = liveChatId;
  }

  public LiveChatBanSnippet type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of ban.
   * @return type
  **/
  @ApiModelProperty(value = "The type of ban.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveChatBanSnippet liveChatBanSnippet = (LiveChatBanSnippet) o;
    return Objects.equals(this.banDurationSeconds, liveChatBanSnippet.banDurationSeconds) &&
        Objects.equals(this.bannedUserDetails, liveChatBanSnippet.bannedUserDetails) &&
        Objects.equals(this.liveChatId, liveChatBanSnippet.liveChatId) &&
        Objects.equals(this.type, liveChatBanSnippet.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banDurationSeconds, bannedUserDetails, liveChatId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatBanSnippet {\n");
    
    sb.append("    banDurationSeconds: ").append(toIndentedString(banDurationSeconds)).append("\n");
    sb.append("    bannedUserDetails: ").append(toIndentedString(bannedUserDetails)).append("\n");
    sb.append("    liveChatId: ").append(toIndentedString(liveChatId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

