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
 * LiveChatUserBannedMessageDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaIDLCodegen", date = "2021-08-24T20:55:04.712703200+02:00[Europe/Paris]")
public class LiveChatUserBannedMessageDetails {
  public static final String SERIALIZED_NAME_BAN_DURATION_SECONDS = "banDurationSeconds";
  @SerializedName(SERIALIZED_NAME_BAN_DURATION_SECONDS)
  private String banDurationSeconds;

  /**
   * The type of ban.
   */
  @JsonAdapter(BanTypeEnum.Adapter.class)
  public enum BanTypeEnum {
    PERMANENT("permanent"),
    
    TEMPORARY("temporary");

    private String value;

    BanTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BanTypeEnum fromValue(String value) {
      for (BanTypeEnum b : BanTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BanTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BanTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BanTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BanTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BAN_TYPE = "banType";
  @SerializedName(SERIALIZED_NAME_BAN_TYPE)
  private BanTypeEnum banType;

  public static final String SERIALIZED_NAME_BANNED_USER_DETAILS = "bannedUserDetails";
  @SerializedName(SERIALIZED_NAME_BANNED_USER_DETAILS)
  private ChannelProfileDetails bannedUserDetails;


  public LiveChatUserBannedMessageDetails banDurationSeconds(String banDurationSeconds) {
    
    this.banDurationSeconds = banDurationSeconds;
    return this;
  }

   /**
   * The duration of the ban. This property is only present if the banType is temporary.
   * @return banDurationSeconds
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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

