package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Localized versions of certain video properties (e.g. title).
 */
@ApiModel(description = "Localized versions of certain video properties (e.g. title).")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class VideoLocalization   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("title")
  private String title;

  public VideoLocalization description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Localized version of the video's description.
   * @return description
  **/
  @ApiModelProperty(value = "Localized version of the video's description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VideoLocalization title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Localized version of the video's title.
   * @return title
  **/
  @ApiModelProperty(value = "Localized version of the video's title.")
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
    VideoLocalization videoLocalization = (VideoLocalization) o;
    return Objects.equals(this.description, videoLocalization.description) &&
        Objects.equals(this.title, videoLocalization.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoLocalization {\n");
    
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

