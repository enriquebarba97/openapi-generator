package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccessPolicy;

/**
 * Details about monetization of a YouTube Video.
 */
@ApiModel(description = "Details about monetization of a YouTube Video.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class VideoMonetizationDetails   {
  @JsonProperty("access")
  private AccessPolicy access;

  public VideoMonetizationDetails access(AccessPolicy access) {
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @ApiModelProperty(value = "")
  public AccessPolicy getAccess() {
    return access;
  }

  public void setAccess(AccessPolicy access) {
    this.access = access;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoMonetizationDetails videoMonetizationDetails = (VideoMonetizationDetails) o;
    return Objects.equals(this.access, videoMonetizationDetails.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoMonetizationDetails {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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

