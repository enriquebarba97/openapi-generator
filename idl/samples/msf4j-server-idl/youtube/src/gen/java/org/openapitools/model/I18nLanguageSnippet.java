package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Basic details about an i18n language, such as language code and human-readable name.
 */
@ApiModel(description = "Basic details about an i18n language, such as language code and human-readable name.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class I18nLanguageSnippet   {
  @JsonProperty("hl")
  private String hl;

  @JsonProperty("name")
  private String name;

  public I18nLanguageSnippet hl(String hl) {
    this.hl = hl;
    return this;
  }

   /**
   * A short BCP-47 code that uniquely identifies a language.
   * @return hl
  **/
  @ApiModelProperty(value = "A short BCP-47 code that uniquely identifies a language.")
  public String getHl() {
    return hl;
  }

  public void setHl(String hl) {
    this.hl = hl;
  }

  public I18nLanguageSnippet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The human-readable name of the language in the language itself.
   * @return name
  **/
  @ApiModelProperty(value = "The human-readable name of the language in the language itself.")
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
    I18nLanguageSnippet i18nLanguageSnippet = (I18nLanguageSnippet) o;
    return Objects.equals(this.hl, i18nLanguageSnippet.hl) &&
        Objects.equals(this.name, i18nLanguageSnippet.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hl, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class I18nLanguageSnippet {\n");
    
    sb.append("    hl: ").append(toIndentedString(hl)).append("\n");
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

