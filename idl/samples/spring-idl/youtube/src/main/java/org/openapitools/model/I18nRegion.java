package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.I18nRegionSnippet;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A *i18nRegion* resource identifies a region where YouTube is available.
 */
@ApiModel(description = "A *i18nRegion* resource identifies a region where YouTube is available.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class I18nRegion   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#i18nRegion";

  @JsonProperty("snippet")
  private I18nRegionSnippet snippet;

  public I18nRegion etag(String etag) {
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

  public I18nRegion id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the i18n region.
   * @return id
  */
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the i18n region.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public I18nRegion kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#i18nRegion\".
   * @return kind
  */
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#i18nRegion\".")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public I18nRegion snippet(I18nRegionSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @ApiModelProperty(value = "")

  @Valid

  public I18nRegionSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(I18nRegionSnippet snippet) {
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
    I18nRegion i18nRegion = (I18nRegion) o;
    return Objects.equals(this.etag, i18nRegion.etag) &&
        Objects.equals(this.id, i18nRegion.id) &&
        Objects.equals(this.kind, i18nRegion.kind) &&
        Objects.equals(this.snippet, i18nRegion.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, id, kind, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class I18nRegion {\n");
    
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

