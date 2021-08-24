package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The third-party link status object contains information about the status of the link.
 */
@ApiModel(description = "The third-party link status object contains information about the status of the link.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ThirdPartyLinkStatus   {
  /**
   * Gets or Sets linkStatus
   */
  public enum LinkStatusEnum {
    UNKNOWN("unknown"),
    
    FAILED("failed"),
    
    PENDING("pending"),
    
    LINKED("linked");

    private String value;

    LinkStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LinkStatusEnum fromValue(String text) {
      for (LinkStatusEnum b : LinkStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("linkStatus")
  private LinkStatusEnum linkStatus;

  public ThirdPartyLinkStatus linkStatus(LinkStatusEnum linkStatus) {
    this.linkStatus = linkStatus;
    return this;
  }

   /**
   * Get linkStatus
   * @return linkStatus
  **/
  @ApiModelProperty(value = "")
  public LinkStatusEnum getLinkStatus() {
    return linkStatus;
  }

  public void setLinkStatus(LinkStatusEnum linkStatus) {
    this.linkStatus = linkStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyLinkStatus thirdPartyLinkStatus = (ThirdPartyLinkStatus) o;
    return Objects.equals(this.linkStatus, thirdPartyLinkStatus.linkStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyLinkStatus {\n");
    
    sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
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

