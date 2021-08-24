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
 * A channel banner returned as the response to a channel_banner.insert call.
 */
@ApiModel(description = "A channel banner returned as the response to a channel_banner.insert call.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ChannelBannerResource   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("kind")
  private String kind = "youtube#channelBannerResource";

  @JsonProperty("url")
  private String url;

  public ChannelBannerResource etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Get etag
   * @return etag
  */
  @ApiModelProperty(value = "")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public ChannelBannerResource kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#channelBannerResource\".
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#channelBannerResource\".")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ChannelBannerResource url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of this banner image.
   * @return url
  */
  @ApiModelProperty(value = "The URL of this banner image.")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelBannerResource channelBannerResource = (ChannelBannerResource) o;
    return Objects.equals(this.etag, channelBannerResource.etag) &&
        Objects.equals(this.kind, channelBannerResource.kind) &&
        Objects.equals(this.url, channelBannerResource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, kind, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelBannerResource {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

