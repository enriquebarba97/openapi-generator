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
 * Basic details about an i18n region, such as region code and human-readable name.
 */
@ApiModel(description = "Basic details about an i18n region, such as region code and human-readable name.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class I18nRegionSnippet   {
  @JsonProperty("gl")
  private String gl;

  @JsonProperty("name")
  private String name;

  public I18nRegionSnippet gl(String gl) {
    this.gl = gl;
    return this;
  }

  /**
   * The region code as a 2-letter ISO country code.
   * @return gl
  */
  @ApiModelProperty(value = "The region code as a 2-letter ISO country code.")


  public String getGl() {
    return gl;
  }

  public void setGl(String gl) {
    this.gl = gl;
  }

  public I18nRegionSnippet name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The human-readable name of the region.
   * @return name
  */
  @ApiModelProperty(value = "The human-readable name of the region.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    I18nRegionSnippet i18nRegionSnippet = (I18nRegionSnippet) o;
    return Objects.equals(this.gl, i18nRegionSnippet.gl) &&
        Objects.equals(this.name, i18nRegionSnippet.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gl, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class I18nRegionSnippet {\n");
    
    sb.append("    gl: ").append(toIndentedString(gl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

