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
 * A thumbnail is an image representing a YouTube resource.
 */
@ApiModel(description = "A thumbnail is an image representing a YouTube resource.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class Thumbnail   {
  @JsonProperty("height")
  private Integer height;

  @JsonProperty("url")
  private String url;

  @JsonProperty("width")
  private Integer width;

  public Thumbnail height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * (Optional) Height of the thumbnail image.
   * @return height
  */
  @ApiModelProperty(value = "(Optional) Height of the thumbnail image.")


  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Thumbnail url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The thumbnail image's URL.
   * @return url
  */
  @ApiModelProperty(value = "The thumbnail image's URL.")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Thumbnail width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * (Optional) Width of the thumbnail image.
   * @return width
  */
  @ApiModelProperty(value = "(Optional) Width of the thumbnail image.")


  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Thumbnail thumbnail = (Thumbnail) o;
    return Objects.equals(this.height, thumbnail.height) &&
        Objects.equals(this.url, thumbnail.url) &&
        Objects.equals(this.width, thumbnail.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thumbnail {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

