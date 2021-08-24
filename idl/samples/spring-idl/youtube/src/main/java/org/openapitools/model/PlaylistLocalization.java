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
 * Playlist localization setting
 */
@ApiModel(description = "Playlist localization setting")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class PlaylistLocalization   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("title")
  private String title;

  public PlaylistLocalization description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The localized strings for playlist's description.
   * @return description
  */
  @ApiModelProperty(value = "The localized strings for playlist's description.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PlaylistLocalization title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The localized strings for playlist's title.
   * @return title
  */
  @ApiModelProperty(value = "The localized strings for playlist's title.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistLocalization playlistLocalization = (PlaylistLocalization) o;
    return Objects.equals(this.description, playlistLocalization.description) &&
        Objects.equals(this.title, playlistLocalization.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistLocalization {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

