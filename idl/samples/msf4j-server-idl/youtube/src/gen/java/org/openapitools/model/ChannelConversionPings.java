package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ChannelConversionPing;

/**
 * The conversionPings object encapsulates information about conversion pings that need to be respected by the channel.
 */
@ApiModel(description = "The conversionPings object encapsulates information about conversion pings that need to be respected by the channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ChannelConversionPings   {
  @JsonProperty("pings")
  private List<ChannelConversionPing> pings = null;

  public ChannelConversionPings pings(List<ChannelConversionPing> pings) {
    this.pings = pings;
    return this;
  }

  public ChannelConversionPings addPingsItem(ChannelConversionPing pingsItem) {
    if (this.pings == null) {
      this.pings = new ArrayList<ChannelConversionPing>();
    }
    this.pings.add(pingsItem);
    return this;
  }

   /**
   * Pings that the app shall fire (authenticated by biscotti cookie). Each ping has a context, in which the app must fire the ping, and a url identifying the ping.
   * @return pings
  **/
  @ApiModelProperty(value = "Pings that the app shall fire (authenticated by biscotti cookie). Each ping has a context, in which the app must fire the ping, and a url identifying the ping.")
  public List<ChannelConversionPing> getPings() {
    return pings;
  }

  public void setPings(List<ChannelConversionPing> pings) {
    this.pings = pings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelConversionPings channelConversionPings = (ChannelConversionPings) o;
    return Objects.equals(this.pings, channelConversionPings.pings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelConversionPings {\n");
    
    sb.append("    pings: ").append(toIndentedString(pings)).append("\n");
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

