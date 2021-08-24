package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.I18nLanguageSnippet;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An *i18nLanguage* resource identifies a UI language currently supported by YouTube.
 */
@ApiModel(description = "An *i18nLanguage* resource identifies a UI language currently supported by YouTube.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class I18nLanguage   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#i18nLanguage";

  @JsonProperty("snippet")
  private I18nLanguageSnippet snippet;

  public I18nLanguage etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Etag of this resource.
   * @return etag
  */
  @ApiModelProperty(value = "Etag of this resource.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public I18nLanguage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the i18n language.
   * @return id
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the i18n language.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public I18nLanguage kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#i18nLanguage\".
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#i18nLanguage\".")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public I18nLanguage snippet(I18nLanguageSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @ApiModelProperty(value = "")

  @Valid

  public I18nLanguageSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(I18nLanguageSnippet snippet) {
    this.snippet = snippet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    I18nLanguage i18nLanguage = (I18nLanguage) o;
    return Objects.equals(this.etag, i18nLanguage.etag) &&
        Objects.equals(this.id, i18nLanguage.id) &&
        Objects.equals(this.kind, i18nLanguage.kind) &&
        Objects.equals(this.snippet, i18nLanguage.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, id, kind, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class I18nLanguage {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
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

