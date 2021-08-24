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
 * Pings that the app shall fire (authenticated by biscotti cookie). Each ping has a context, in which the app must fire the ping, and a url identifying the ping.
 */
@ApiModel(description = "Pings that the app shall fire (authenticated by biscotti cookie). Each ping has a context, in which the app must fire the ping, and a url identifying the ping.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ChannelConversionPing   {
  /**
   * Defines the context of the ping.
   */
  public enum ContextEnum {
    SUBSCRIBE("subscribe"),
    
    UNSUBSCRIBE("unsubscribe"),
    
    CVIEW("cview");

    private String value;

    ContextEnum(String value) {
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
    public static ContextEnum fromValue(String value) {
      for (ContextEnum b : ContextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("context")
  private ContextEnum context;

  @JsonProperty("conversionUrl")
  private String conversionUrl;

  public ChannelConversionPing context(ContextEnum context) {
    this.context = context;
    return this;
  }

  /**
   * Defines the context of the ping.
   * @return context
  */
  @ApiModelProperty(value = "Defines the context of the ping.")


  public ContextEnum getContext() {
    return context;
  }

  public void setContext(ContextEnum context) {
    this.context = context;
  }

  public ChannelConversionPing conversionUrl(String conversionUrl) {
    this.conversionUrl = conversionUrl;
    return this;
  }

  /**
   * The url (without the schema) that the player shall send the ping to. It's at caller's descretion to decide which schema to use (http vs https) Example of a returned url: //googleads.g.doubleclick.net/pagead/ viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&labe=default The caller must append biscotti authentication (ms param in case of mobile, for example) to this ping.
   * @return conversionUrl
  */
  @ApiModelProperty(value = "The url (without the schema) that the player shall send the ping to. It's at caller's descretion to decide which schema to use (http vs https) Example of a returned url: //googleads.g.doubleclick.net/pagead/ viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&labe=default The caller must append biscotti authentication (ms param in case of mobile, for example) to this ping.")


  public String getConversionUrl() {
    return conversionUrl;
  }

  public void setConversionUrl(String conversionUrl) {
    this.conversionUrl = conversionUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelConversionPing channelConversionPing = (ChannelConversionPing) o;
    return Objects.equals(this.context, channelConversionPing.context) &&
        Objects.equals(this.conversionUrl, channelConversionPing.conversionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, conversionUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelConversionPing {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    conversionUrl: ").append(toIndentedString(conversionUrl)).append("\n");
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

