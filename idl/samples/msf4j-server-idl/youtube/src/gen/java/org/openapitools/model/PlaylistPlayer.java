package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PlaylistPlayer
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class PlaylistPlayer   {
  @JsonProperty("embedHtml")
  private String embedHtml;

  public PlaylistPlayer embedHtml(String embedHtml) {
    this.embedHtml = embedHtml;
    return this;
  }

   /**
   * An <iframe> tag that embeds a player that will play the playlist.
   * @return embedHtml
  **/
  @ApiModelProperty(value = "An <iframe> tag that embeds a player that will play the playlist.")
  public String getEmbedHtml() {
    return embedHtml;
  }

  public void setEmbedHtml(String embedHtml) {
    this.embedHtml = embedHtml;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistPlayer playlistPlayer = (PlaylistPlayer) o;
    return Objects.equals(this.embedHtml, playlistPlayer.embedHtml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedHtml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistPlayer {\n");
    
    sb.append("    embedHtml: ").append(toIndentedString(embedHtml)).append("\n");
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

