package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MemberSnippet;

/**
 * A *member* resource represents a member for a YouTube channel. A member provides recurring monetary support to a creator and receives special benefits.
 */
@ApiModel(description = "A *member* resource represents a member for a YouTube channel. A member provides recurring monetary support to a creator and receives special benefits.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class Member   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("kind")
  private String kind = "youtube#member";

  @JsonProperty("snippet")
  private MemberSnippet snippet;

  public Member etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * Etag of this resource.
   * @return etag
  **/
  @ApiModelProperty(value = "Etag of this resource.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Member kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#member\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#member\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Member snippet(MemberSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public MemberSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(MemberSnippet snippet) {
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
    Member member = (Member) o;
    return Objects.equals(this.etag, member.etag) &&
        Objects.equals(this.kind, member.kind) &&
        Objects.equals(this.snippet, member.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, kind, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

