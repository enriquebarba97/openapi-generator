package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Paging details for lists of resources, including total number of items available and number of resources returned in a single page.
 */
@ApiModel(description = "Paging details for lists of resources, including total number of items available and number of resources returned in a single page.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class PageInfo   {
  @JsonProperty("resultsPerPage")
  private Integer resultsPerPage;

  @JsonProperty("totalResults")
  private Integer totalResults;

  public PageInfo resultsPerPage(Integer resultsPerPage) {
    this.resultsPerPage = resultsPerPage;
    return this;
  }

   /**
   * The number of results included in the API response.
   * @return resultsPerPage
  **/
  @ApiModelProperty(value = "The number of results included in the API response.")
  public Integer getResultsPerPage() {
    return resultsPerPage;
  }

  public void setResultsPerPage(Integer resultsPerPage) {
    this.resultsPerPage = resultsPerPage;
  }

  public PageInfo totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * The total number of results in the result set.
   * @return totalResults
  **/
  @ApiModelProperty(value = "The total number of results in the result set.")
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageInfo pageInfo = (PageInfo) o;
    return Objects.equals(this.resultsPerPage, pageInfo.resultsPerPage) &&
        Objects.equals(this.totalResults, pageInfo.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultsPerPage, totalResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageInfo {\n");
    
    sb.append("    resultsPerPage: ").append(toIndentedString(resultsPerPage)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

