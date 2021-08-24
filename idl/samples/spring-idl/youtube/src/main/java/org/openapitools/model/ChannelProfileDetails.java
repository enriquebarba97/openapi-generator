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
 * ChannelProfileDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ChannelProfileDetails   {
  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("channelUrl")
  private String channelUrl;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("profileImageUrl")
  private String profileImageUrl;

  public ChannelProfileDetails channelId(String channelId) {
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

  public ChannelProfileDetails channelUrl(String channelUrl) {
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

  public ChannelProfileDetails displayName(String displayName) {
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

  public ChannelProfileDetails profileImageUrl(String profileImageUrl) {
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
    ChannelProfileDetails channelProfileDetails = (ChannelProfileDetails) o;
    return Objects.equals(this.channelId, channelProfileDetails.channelId) &&
        Objects.equals(this.channelUrl, channelProfileDetails.channelUrl) &&
        Objects.equals(this.displayName, channelProfileDetails.displayName) &&
        Objects.equals(this.profileImageUrl, channelProfileDetails.profileImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelUrl, displayName, profileImageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelProfileDetails {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

