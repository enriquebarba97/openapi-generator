package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Thumbnail;

/**
 * Internal representation of thumbnails for a YouTube resource.
 */
@ApiModel(description = "Internal representation of thumbnails for a YouTube resource.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ThumbnailDetails   {
  @JsonProperty("default")
  private Thumbnail _default;

  @JsonProperty("high")
  private Thumbnail high;

  @JsonProperty("maxres")
  private Thumbnail maxres;

  @JsonProperty("medium")
  private Thumbnail medium;

  @JsonProperty("standard")
  private Thumbnail standard;

  public ThumbnailDetails _default(Thumbnail _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(value = "")
  public Thumbnail getDefault() {
    return _default;
  }

  public void setDefault(Thumbnail _default) {
    this._default = _default;
  }

  public ThumbnailDetails high(Thumbnail high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @ApiModelProperty(value = "")
  public Thumbnail getHigh() {
    return high;
  }

  public void setHigh(Thumbnail high) {
    this.high = high;
  }

  public ThumbnailDetails maxres(Thumbnail maxres) {
    this.maxres = maxres;
    return this;
  }

   /**
   * Get maxres
   * @return maxres
  **/
  @ApiModelProperty(value = "")
  public Thumbnail getMaxres() {
    return maxres;
  }

  public void setMaxres(Thumbnail maxres) {
    this.maxres = maxres;
  }

  public ThumbnailDetails medium(Thumbnail medium) {
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @ApiModelProperty(value = "")
  public Thumbnail getMedium() {
    return medium;
  }

  public void setMedium(Thumbnail medium) {
    this.medium = medium;
  }

  public ThumbnailDetails standard(Thumbnail standard) {
    this.standard = standard;
    return this;
  }

   /**
   * Get standard
   * @return standard
  **/
  @ApiModelProperty(value = "")
  public Thumbnail getStandard() {
    return standard;
  }

  public void setStandard(Thumbnail standard) {
    this.standard = standard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThumbnailDetails thumbnailDetails = (ThumbnailDetails) o;
    return Objects.equals(this._default, thumbnailDetails._default) &&
        Objects.equals(this.high, thumbnailDetails.high) &&
        Objects.equals(this.maxres, thumbnailDetails.maxres) &&
        Objects.equals(this.medium, thumbnailDetails.medium) &&
        Objects.equals(this.standard, thumbnailDetails.standard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, high, maxres, medium, standard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThumbnailDetails {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    maxres: ").append(toIndentedString(maxres)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
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

