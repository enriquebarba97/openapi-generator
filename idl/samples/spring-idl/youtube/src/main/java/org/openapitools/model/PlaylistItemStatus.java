package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about the playlist item&#39;s privacy status.
 */
@ApiModel(description = "Information about the playlist item's privacy status.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class PlaylistItemStatus   {
  /**
   * This resource's privacy status.
   */
  public enum PrivacyStatusEnum {
    PUBLIC("public"),
    
    UNLISTED("unlisted"),
    
    PRIVATE("private");

    private String value;

    PrivacyStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PrivacyStatusEnum fromValue(String value) {
      for (PrivacyStatusEnum b : PrivacyStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("privacyStatus")
  private PrivacyStatusEnum privacyStatus;

  public PlaylistItemStatus privacyStatus(PrivacyStatusEnum privacyStatus) {
    this.privacyStatus = privacyStatus;
    return this;
  }

  /**
   * This resource's privacy status.
   * @return privacyStatus
  */
  @ApiModelProperty(value = "This resource's privacy status.")


  public PrivacyStatusEnum getPrivacyStatus() {
    return privacyStatus;
  }

  public void setPrivacyStatus(PrivacyStatusEnum privacyStatus) {
    this.privacyStatus = privacyStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistItemStatus playlistItemStatus = (PlaylistItemStatus) o;
    return Objects.equals(this.privacyStatus, playlistItemStatus.privacyStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privacyStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistItemStatus {\n");
    
    sb.append("    privacyStatus: ").append(toIndentedString(privacyStatus)).append("\n");
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

