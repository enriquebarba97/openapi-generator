package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Details about a channelsection, including playlists and channels.
 */
@ApiModel(description = "Details about a channelsection, including playlists and channels.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ChannelSectionContentDetails   {
  @JsonProperty("channels")
  private List<String> channels = null;

  @JsonProperty("playlists")
  private List<String> playlists = null;

  public ChannelSectionContentDetails channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public ChannelSectionContentDetails addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<String>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * The channel ids for type multiple_channels.
   * @return channels
  **/
  @ApiModelProperty(value = "The channel ids for type multiple_channels.")
  public List<String> getChannels() {
    return channels;
  }

  public void setChannels(List<String> channels) {
    this.channels = channels;
  }

  public ChannelSectionContentDetails playlists(List<String> playlists) {
    this.playlists = playlists;
    return this;
  }

  public ChannelSectionContentDetails addPlaylistsItem(String playlistsItem) {
    if (this.playlists == null) {
      this.playlists = new ArrayList<String>();
    }
    this.playlists.add(playlistsItem);
    return this;
  }

   /**
   * The playlist ids for type single_playlist and multiple_playlists. For singlePlaylist, only one playlistId is allowed.
   * @return playlists
  **/
  @ApiModelProperty(value = "The playlist ids for type single_playlist and multiple_playlists. For singlePlaylist, only one playlistId is allowed.")
  public List<String> getPlaylists() {
    return playlists;
  }

  public void setPlaylists(List<String> playlists) {
    this.playlists = playlists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelSectionContentDetails channelSectionContentDetails = (ChannelSectionContentDetails) o;
    return Objects.equals(this.channels, channelSectionContentDetails.channels) &&
        Objects.equals(this.playlists, channelSectionContentDetails.playlists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, playlists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelSectionContentDetails {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    playlists: ").append(toIndentedString(playlists)).append("\n");
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

