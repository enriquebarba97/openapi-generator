package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TestItem
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class TestItem   {
  @JsonProperty("gaia")
  private String gaia;

  @JsonProperty("id")
  private String id;

  @JsonProperty("snippet")
  private Object snippet;

  public TestItem gaia(String gaia) {
    this.gaia = gaia;
    return this;
  }

   /**
   * Get gaia
   * @return gaia
  **/
  @ApiModelProperty(value = "")
  public String getGaia() {
    return gaia;
  }

  public void setGaia(String gaia) {
    this.gaia = gaia;
  }

  public TestItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TestItem snippet(Object snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public Object getSnippet() {
    return snippet;
  }

  public void setSnippet(Object snippet) {
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
    TestItem testItem = (TestItem) o;
    return Objects.equals(this.gaia, testItem.gaia) &&
        Objects.equals(this.id, testItem.id) &&
        Objects.equals(this.snippet, testItem.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gaia, id, snippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestItem {\n");
    
    sb.append("    gaia: ").append(toIndentedString(gaia)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

