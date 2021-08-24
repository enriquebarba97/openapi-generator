package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Rights management policy for YouTube resources.
 */
@ApiModel(description = "Rights management policy for YouTube resources.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class AccessPolicy   {
  @JsonProperty("allowed")
  private Boolean allowed;

  @JsonProperty("exception")
  private List<String> exception = null;

  public AccessPolicy allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

   /**
   * The value of allowed indicates whether the access to the policy is allowed or denied by default.
   * @return allowed
  **/
  @ApiModelProperty(value = "The value of allowed indicates whether the access to the policy is allowed or denied by default.")
  public Boolean getAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public AccessPolicy exception(List<String> exception) {
    this.exception = exception;
    return this;
  }

  public AccessPolicy addExceptionItem(String exceptionItem) {
    if (this.exception == null) {
      this.exception = new ArrayList<String>();
    }
    this.exception.add(exceptionItem);
    return this;
  }

   /**
   * A list of region codes that identify countries where the default policy do not apply.
   * @return exception
  **/
  @ApiModelProperty(value = "A list of region codes that identify countries where the default policy do not apply.")
  public List<String> getException() {
    return exception;
  }

  public void setException(List<String> exception) {
    this.exception = exception;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPolicy accessPolicy = (AccessPolicy) o;
    return Objects.equals(this.allowed, accessPolicy.allowed) &&
        Objects.equals(this.exception, accessPolicy.exception);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, exception);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPolicy {\n");
    
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
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

