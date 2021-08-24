package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ChannelSettings;
import org.openapitools.model.ImageSettings;
import org.openapitools.model.PropertyValue;
import org.openapitools.model.WatchSettings;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Branding properties of a YouTube channel.
 */
@ApiModel(description = "Branding properties of a YouTube channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ChannelBrandingSettings   {
  @JsonProperty("channel")
  private ChannelSettings channel;

  @JsonProperty("hints")
  @Valid
  private List<PropertyValue> hints = null;

  @JsonProperty("image")
  private ImageSettings image;

  @JsonProperty("watch")
  private WatchSettings watch;

  public ChannelBrandingSettings channel(ChannelSettings channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
  */
  @ApiModelProperty(value = "")

  @Valid

  public ChannelSettings getChannel() {
    return channel;
  }

  public void setChannel(ChannelSettings channel) {
    this.channel = channel;
  }

  public ChannelBrandingSettings hints(List<PropertyValue> hints) {
    this.hints = hints;
    return this;
  }

  public ChannelBrandingSettings addHintsItem(PropertyValue hintsItem) {
    if (this.hints == null) {
      this.hints = new ArrayList<>();
    }
    this.hints.add(hintsItem);
    return this;
  }

  /**
   * Additional experimental branding properties.
   * @return hints
  */
  @ApiModelProperty(value = "Additional experimental branding properties.")

  @Valid

  public List<PropertyValue> getHints() {
    return hints;
  }

  public void setHints(List<PropertyValue> hints) {
    this.hints = hints;
  }

  public ChannelBrandingSettings image(ImageSettings image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  */
  @ApiModelProperty(value = "")

  @Valid

  public ImageSettings getImage() {
    return image;
  }

  public void setImage(ImageSettings image) {
    this.image = image;
  }

  public ChannelBrandingSettings watch(WatchSettings watch) {
    this.watch = watch;
    return this;
  }

  /**
   * Get watch
   * @return watch
  */
  @ApiModelProperty(value = "")

  @Valid

  public WatchSettings getWatch() {
    return watch;
  }

  public void setWatch(WatchSettings watch) {
    this.watch = watch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelBrandingSettings channelBrandingSettings = (ChannelBrandingSettings) o;
    return Objects.equals(this.channel, channelBrandingSettings.channel) &&
        Objects.equals(this.hints, channelBrandingSettings.hints) &&
        Objects.equals(this.image, channelBrandingSettings.image) &&
        Objects.equals(this.watch, channelBrandingSettings.watch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, hints, image, watch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelBrandingSettings {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    hints: ").append(toIndentedString(hints)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    watch: ").append(toIndentedString(watch)).append("\n");
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

