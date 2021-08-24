package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChannelContentDetailsRelatedPlaylists;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about the content of a channel.
 */
@ApiModel(description = "Details about the content of a channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ChannelContentDetails   {
  @JsonProperty("relatedPlaylists")
  private ChannelContentDetailsRelatedPlaylists relatedPlaylists;

  public ChannelContentDetails relatedPlaylists(ChannelContentDetailsRelatedPlaylists relatedPlaylists) {
    this.relatedPlaylists = relatedPlaylists;
    return this;
  }

  /**
   * Get relatedPlaylists
   * @return relatedPlaylists
  */
  @ApiModelProperty(value = "")

  @Valid

  public ChannelContentDetailsRelatedPlaylists getRelatedPlaylists() {
    return relatedPlaylists;
  }

  public void setRelatedPlaylists(ChannelContentDetailsRelatedPlaylists relatedPlaylists) {
    this.relatedPlaylists = relatedPlaylists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelContentDetails channelContentDetails = (ChannelContentDetails) o;
    return Objects.equals(this.relatedPlaylists, channelContentDetails.relatedPlaylists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedPlaylists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelContentDetails {\n");
    
    sb.append("    relatedPlaylists: ").append(toIndentedString(relatedPlaylists)).append("\n");
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

