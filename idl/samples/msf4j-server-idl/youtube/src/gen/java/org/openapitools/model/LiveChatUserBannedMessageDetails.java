package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChannelProfileDetails;

/**
 * LiveChatUserBannedMessageDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveChatUserBannedMessageDetails   {
  @JsonProperty("banDurationSeconds")
  private String banDurationSeconds;

  /**
   * The type of ban.
   */
  public enum BanTypeEnum {
    PERMANENT("permanent"),
    
    TEMPORARY("temporary");

    private String value;

    BanTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BanTypeEnum fromValue(String text) {
      for (BanTypeEnum b : BanTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("banType")
  private BanTypeEnum banType;

  @JsonProperty("bannedUserDetails")
  private ChannelProfileDetails bannedUserDetails;

  public LiveChatUserBannedMessageDetails banDurationSeconds(String banDurationSeconds) {
    this.banDurationSeconds = banDurationSeconds;
    return this;
  }

   /**
   * The duration of the ban. This property is only present if the banType is temporary.
   * @return banDurationSeconds
  **/
  @ApiModelProperty(value = "The duration of the ban. This property is only present if the banType is temporary.")
  public String getBanDurationSeconds() {
    return banDurationSeconds;
  }

  public void setBanDurationSeconds(String banDurationSeconds) {
    this.banDurationSeconds = banDurationSeconds;
  }

  public LiveChatUserBannedMessageDetails banType(BanTypeEnum banType) {
    this.banType = banType;
    return this;
  }

   /**
   * The type of ban.
   * @return banType
  **/
  @ApiModelProperty(value = "The type of ban.")
  public BanTypeEnum getBanType() {
    return banType;
  }

  public void setBanType(BanTypeEnum banType) {
    this.banType = banType;
  }

  public LiveChatUserBannedMessageDetails bannedUserDetails(ChannelProfileDetails bannedUserDetails) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveChatUserBannedMessageDetails liveChatUserBannedMessageDetails = (LiveChatUserBannedMessageDetails) o;
    return Objects.equals(this.banDurationSeconds, liveChatUserBannedMessageDetails.banDurationSeconds) &&
        Objects.equals(this.banType, liveChatUserBannedMessageDetails.banType) &&
        Objects.equals(this.bannedUserDetails, liveChatUserBannedMessageDetails.bannedUserDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banDurationSeconds, banType, bannedUserDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatUserBannedMessageDetails {\n");
    
    sb.append("    banDurationSeconds: ").append(toIndentedString(banDurationSeconds)).append("\n");
    sb.append("    banType: ").append(toIndentedString(banType)).append("\n");
    sb.append("    bannedUserDetails: ").append(toIndentedString(bannedUserDetails)).append("\n");
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

