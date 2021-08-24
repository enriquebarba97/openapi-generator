package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChannelToStoreLinkDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic information about a third party account link, including its type and type-specific information.
 */
@ApiModel(description = "Basic information about a third party account link, including its type and type-specific information.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ThirdPartyLinkSnippet   {
  @JsonProperty("channelToStoreLink")
  private ChannelToStoreLinkDetails channelToStoreLink;

  /**
   * Type of the link named after the entities that are being linked.
   */
  public enum TypeEnum {
    LINKUNSPECIFIED("linkUnspecified"),
    
    CHANNELTOSTORELINK("channelToStoreLink");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  public ThirdPartyLinkSnippet channelToStoreLink(ChannelToStoreLinkDetails channelToStoreLink) {
    this.channelToStoreLink = channelToStoreLink;
    return this;
  }

  /**
   * Get channelToStoreLink
   * @return channelToStoreLink
  */
  @ApiModelProperty(value = "")

  @Valid

  public ChannelToStoreLinkDetails getChannelToStoreLink() {
    return channelToStoreLink;
  }

  public void setChannelToStoreLink(ChannelToStoreLinkDetails channelToStoreLink) {
    this.channelToStoreLink = channelToStoreLink;
  }

  public ThirdPartyLinkSnippet type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the link named after the entities that are being linked.
   * @return type
  */
  @ApiModelProperty(value = "Type of the link named after the entities that are being linked.")


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
    ThirdPartyLinkSnippet thirdPartyLinkSnippet = (ThirdPartyLinkSnippet) o;
    return Objects.equals(this.channelToStoreLink, thirdPartyLinkSnippet.channelToStoreLink) &&
        Objects.equals(this.type, thirdPartyLinkSnippet.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelToStoreLink, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyLinkSnippet {\n");
    
    sb.append("    channelToStoreLink: ").append(toIndentedString(channelToStoreLink)).append("\n");
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

