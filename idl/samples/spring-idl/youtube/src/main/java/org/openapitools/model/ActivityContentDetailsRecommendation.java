package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResourceId;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information that identifies the recommended resource.
 */
@ApiModel(description = "Information that identifies the recommended resource.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class ActivityContentDetailsRecommendation   {
  /**
   * The reason that the resource is recommended to the user.
   */
  public enum ReasonEnum {
    REASONUNSPECIFIED("reasonUnspecified"),
    
    VIDEOFAVORITED("videoFavorited"),
    
    VIDEOLIKED("videoLiked"),
    
    VIDEOWATCHED("videoWatched");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("reason")
  private ReasonEnum reason;

  @JsonProperty("resourceId")
  private ResourceId resourceId;

  @JsonProperty("seedResourceId")
  private ResourceId seedResourceId;

  public ActivityContentDetailsRecommendation reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason that the resource is recommended to the user.
   * @return reason
  */
  @ApiModelProperty(value = "The reason that the resource is recommended to the user.")


  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public ActivityContentDetailsRecommendation resourceId(ResourceId resourceId) {
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

  public ActivityContentDetailsRecommendation seedResourceId(ResourceId seedResourceId) {
    this.seedResourceId = seedResourceId;
    return this;
  }

  /**
   * Get seedResourceId
   * @return seedResourceId
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResourceId getSeedResourceId() {
    return seedResourceId;
  }

  public void setSeedResourceId(ResourceId seedResourceId) {
    this.seedResourceId = seedResourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityContentDetailsRecommendation activityContentDetailsRecommendation = (ActivityContentDetailsRecommendation) o;
    return Objects.equals(this.reason, activityContentDetailsRecommendation.reason) &&
        Objects.equals(this.resourceId, activityContentDetailsRecommendation.resourceId) &&
        Objects.equals(this.seedResourceId, activityContentDetailsRecommendation.seedResourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, resourceId, seedResourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityContentDetailsRecommendation {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    seedResourceId: ").append(toIndentedString(seedResourceId)).append("\n");
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

