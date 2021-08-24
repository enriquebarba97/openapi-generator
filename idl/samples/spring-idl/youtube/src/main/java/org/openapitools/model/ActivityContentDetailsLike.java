package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResourceId;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about a resource that received a positive (like) rating.
 */
@ApiModel(description = "Information about a resource that received a positive (like) rating.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ActivityContentDetailsLike   {
  @JsonProperty("resourceId")
  private ResourceId resourceId;

  public ActivityContentDetailsLike resourceId(ResourceId resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResourceId getResourceId() {
    return resourceId;
  }

  public void setResourceId(ResourceId resourceId) {
    this.resourceId = resourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityContentDetailsLike activityContentDetailsLike = (ActivityContentDetailsLike) o;
    return Objects.equals(this.resourceId, activityContentDetailsLike.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityContentDetailsLike {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

