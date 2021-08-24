package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JSON template for the status part of a channel.
 */
@ApiModel(description = "JSON template for the status part of a channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ChannelStatus   {
  @JsonProperty("isLinked")
  private Boolean isLinked;

  /**
   * The long uploads status of this channel. See https://support.google.com/youtube/answer/71673 for more information.
   */
  public enum LongUploadsStatusEnum {
    LONGUPLOADSUNSPECIFIED("longUploadsUnspecified"),
    
    ALLOWED("allowed"),
    
    ELIGIBLE("eligible"),
    
    DISALLOWED("disallowed");

    private String value;

    LongUploadsStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LongUploadsStatusEnum fromValue(String text) {
      for (LongUploadsStatusEnum b : LongUploadsStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("longUploadsStatus")
  private LongUploadsStatusEnum longUploadsStatus;

  @JsonProperty("madeForKids")
  private Boolean madeForKids;

  /**
   * Privacy status of the channel.
   */
  public enum PrivacyStatusEnum {
    PUBLIC("public"),
    
    UNLISTED("unlisted"),
    
    PRIVATE("private");

    private String value;

    PrivacyStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PrivacyStatusEnum fromValue(String text) {
      for (PrivacyStatusEnum b : PrivacyStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("privacyStatus")
  private PrivacyStatusEnum privacyStatus;

  @JsonProperty("selfDeclaredMadeForKids")
  private Boolean selfDeclaredMadeForKids;

  public ChannelStatus isLinked(Boolean isLinked) {
    this.isLinked = isLinked;
    return this;
  }

   /**
   * If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the user doesn't have a public YouTube identity.
   * @return isLinked
  **/
  @ApiModelProperty(value = "If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the user doesn't have a public YouTube identity.")
  public Boolean getIsLinked() {
    return isLinked;
  }

  public void setIsLinked(Boolean isLinked) {
    this.isLinked = isLinked;
  }

  public ChannelStatus longUploadsStatus(LongUploadsStatusEnum longUploadsStatus) {
    this.longUploadsStatus = longUploadsStatus;
    return this;
  }

   /**
   * The long uploads status of this channel. See https://support.google.com/youtube/answer/71673 for more information.
   * @return longUploadsStatus
  **/
  @ApiModelProperty(value = "The long uploads status of this channel. See https://support.google.com/youtube/answer/71673 for more information.")
  public LongUploadsStatusEnum getLongUploadsStatus() {
    return longUploadsStatus;
  }

  public void setLongUploadsStatus(LongUploadsStatusEnum longUploadsStatus) {
    this.longUploadsStatus = longUploadsStatus;
  }

  public ChannelStatus madeForKids(Boolean madeForKids) {
    this.madeForKids = madeForKids;
    return this;
  }

   /**
   * Get madeForKids
   * @return madeForKids
  **/
  @ApiModelProperty(value = "")
  public Boolean getMadeForKids() {
    return madeForKids;
  }

  public void setMadeForKids(Boolean madeForKids) {
    this.madeForKids = madeForKids;
  }

  public ChannelStatus privacyStatus(PrivacyStatusEnum privacyStatus) {
    this.privacyStatus = privacyStatus;
    return this;
  }

   /**
   * Privacy status of the channel.
   * @return privacyStatus
  **/
  @ApiModelProperty(value = "Privacy status of the channel.")
  public PrivacyStatusEnum getPrivacyStatus() {
    return privacyStatus;
  }

  public void setPrivacyStatus(PrivacyStatusEnum privacyStatus) {
    this.privacyStatus = privacyStatus;
  }

  public ChannelStatus selfDeclaredMadeForKids(Boolean selfDeclaredMadeForKids) {
    this.selfDeclaredMadeForKids = selfDeclaredMadeForKids;
    return this;
  }

   /**
   * Get selfDeclaredMadeForKids
   * @return selfDeclaredMadeForKids
  **/
  @ApiModelProperty(value = "")
  public Boolean getSelfDeclaredMadeForKids() {
    return selfDeclaredMadeForKids;
  }

  public void setSelfDeclaredMadeForKids(Boolean selfDeclaredMadeForKids) {
    this.selfDeclaredMadeForKids = selfDeclaredMadeForKids;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelStatus channelStatus = (ChannelStatus) o;
    return Objects.equals(this.isLinked, channelStatus.isLinked) &&
        Objects.equals(this.longUploadsStatus, channelStatus.longUploadsStatus) &&
        Objects.equals(this.madeForKids, channelStatus.madeForKids) &&
        Objects.equals(this.privacyStatus, channelStatus.privacyStatus) &&
        Objects.equals(this.selfDeclaredMadeForKids, channelStatus.selfDeclaredMadeForKids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLinked, longUploadsStatus, madeForKids, privacyStatus, selfDeclaredMadeForKids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelStatus {\n");
    
    sb.append("    isLinked: ").append(toIndentedString(isLinked)).append("\n");
    sb.append("    longUploadsStatus: ").append(toIndentedString(longUploadsStatus)).append("\n");
    sb.append("    madeForKids: ").append(toIndentedString(madeForKids)).append("\n");
    sb.append("    privacyStatus: ").append(toIndentedString(privacyStatus)).append("\n");
    sb.append("    selfDeclaredMadeForKids: ").append(toIndentedString(selfDeclaredMadeForKids)).append("\n");
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

