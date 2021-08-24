package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PlaylistContentDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class PlaylistContentDetails   {
  @JsonProperty("itemCount")
  private Integer itemCount;

  public PlaylistContentDetails itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * The number of videos in the playlist.
   * @return itemCount
  **/
  @ApiModelProperty(value = "The number of videos in the playlist.")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistContentDetails playlistContentDetails = (PlaylistContentDetails) o;
    return Objects.equals(this.itemCount, playlistContentDetails.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistContentDetails {\n");
    
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
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

