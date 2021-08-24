package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ThirdPartyLinkSnippet;
import org.openapitools.model.ThirdPartyLinkStatus;

/**
 * A *third party account link* resource represents a link between a YouTube account or a channel and an account on a third-party service.
 */
@ApiModel(description = "A *third party account link* resource represents a link between a YouTube account or a channel and an account on a third-party service.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ThirdPartyLink   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("kind")
  private String kind = "youtube#thirdPartyLink";

  @JsonProperty("linkingToken")
  private String linkingToken;

  @JsonProperty("snippet")
  private ThirdPartyLinkSnippet snippet;

  @JsonProperty("status")
  private ThirdPartyLinkStatus status;

  public ThirdPartyLink etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * Etag of this resource
   * @return etag
  **/
  @ApiModelProperty(value = "Etag of this resource")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public ThirdPartyLink kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#thirdPartyLink\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#thirdPartyLink\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ThirdPartyLink linkingToken(String linkingToken) {
    this.linkingToken = linkingToken;
    return this;
  }

   /**
   * The linking_token identifies a YouTube account and channel with which the third party account is linked.
   * @return linkingToken
  **/
  @ApiModelProperty(value = "The linking_token identifies a YouTube account and channel with which the third party account is linked.")
  public String getLinkingToken() {
    return linkingToken;
  }

  public void setLinkingToken(String linkingToken) {
    this.linkingToken = linkingToken;
  }

  public ThirdPartyLink snippet(ThirdPartyLinkSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public ThirdPartyLinkSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(ThirdPartyLinkSnippet snippet) {
    this.snippet = snippet;
  }

  public ThirdPartyLink status(ThirdPartyLinkStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public ThirdPartyLinkStatus getStatus() {
    return status;
  }

  public void setStatus(ThirdPartyLinkStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyLink thirdPartyLink = (ThirdPartyLink) o;
    return Objects.equals(this.etag, thirdPartyLink.etag) &&
        Objects.equals(this.kind, thirdPartyLink.kind) &&
        Objects.equals(this.linkingToken, thirdPartyLink.linkingToken) &&
        Objects.equals(this.snippet, thirdPartyLink.snippet) &&
        Objects.equals(this.status, thirdPartyLink.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, kind, linkingToken, snippet, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyLink {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    linkingToken: ").append(toIndentedString(linkingToken)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

