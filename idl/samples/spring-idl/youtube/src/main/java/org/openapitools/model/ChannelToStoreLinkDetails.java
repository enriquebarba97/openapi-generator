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
 * Information specific to a store on a merchandising platform linked to a YouTube channel.
 */
@ApiModel(description = "Information specific to a store on a merchandising platform linked to a YouTube channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ChannelToStoreLinkDetails   {
  @JsonProperty("storeName")
  private String storeName;

  @JsonProperty("storeUrl")
  private String storeUrl;

  public ChannelToStoreLinkDetails storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

  /**
   * Name of the store.
   * @return storeName
  */
  @ApiModelProperty(value = "Name of the store.")


  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public ChannelToStoreLinkDetails storeUrl(String storeUrl) {
    this.storeUrl = storeUrl;
    return this;
  }

  /**
   * Landing page of the store.
   * @return storeUrl
  */
  @ApiModelProperty(value = "Landing page of the store.")


  public String getStoreUrl() {
    return storeUrl;
  }

  public void setStoreUrl(String storeUrl) {
    this.storeUrl = storeUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelToStoreLinkDetails channelToStoreLinkDetails = (ChannelToStoreLinkDetails) o;
    return Objects.equals(this.storeName, channelToStoreLinkDetails.storeName) &&
        Objects.equals(this.storeUrl, channelToStoreLinkDetails.storeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeName, storeUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelToStoreLinkDetails {\n");
    
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    storeUrl: ").append(toIndentedString(storeUrl)).append("\n");
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

