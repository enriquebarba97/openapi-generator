package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about the content to witch a subscription refers.
 */
@ApiModel(description = "Details about the content to witch a subscription refers.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class SubscriptionContentDetails   {
  /**
   * The type of activity this subscription is for (only uploads, everything).
   */
  public enum ActivityTypeEnum {
    SUBSCRIPTIONACTIVITYTYPEUNSPECIFIED("subscriptionActivityTypeUnspecified"),
    
    ALL("all"),
    
    UPLOADS("uploads");

    private String value;

    ActivityTypeEnum(String value) {
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
    public static ActivityTypeEnum fromValue(String value) {
      for (ActivityTypeEnum b : ActivityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("activityType")
  private ActivityTypeEnum activityType;

  @JsonProperty("newItemCount")
  private Integer newItemCount;

  @JsonProperty("totalItemCount")
  private Integer totalItemCount;

  public SubscriptionContentDetails activityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * The type of activity this subscription is for (only uploads, everything).
   * @return activityType
  */
  @ApiModelProperty(value = "The type of activity this subscription is for (only uploads, everything).")


  public ActivityTypeEnum getActivityType() {
    return activityType;
  }

  public void setActivityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
  }

  public SubscriptionContentDetails newItemCount(Integer newItemCount) {
    this.newItemCount = newItemCount;
    return this;
  }

  /**
   * The number of new items in the subscription since its content was last read.
   * @return newItemCount
  */
  @ApiModelProperty(value = "The number of new items in the subscription since its content was last read.")


  public Integer getNewItemCount() {
    return newItemCount;
  }

  public void setNewItemCount(Integer newItemCount) {
    this.newItemCount = newItemCount;
  }

  public SubscriptionContentDetails totalItemCount(Integer totalItemCount) {
    this.totalItemCount = totalItemCount;
    return this;
  }

  /**
   * The approximate number of items that the subscription points to.
   * @return totalItemCount
  */
  @ApiModelProperty(value = "The approximate number of items that the subscription points to.")


  public Integer getTotalItemCount() {
    return totalItemCount;
  }

  public void setTotalItemCount(Integer totalItemCount) {
    this.totalItemCount = totalItemCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionContentDetails subscriptionContentDetails = (SubscriptionContentDetails) o;
    return Objects.equals(this.activityType, subscriptionContentDetails.activityType) &&
        Objects.equals(this.newItemCount, subscriptionContentDetails.newItemCount) &&
        Objects.equals(this.totalItemCount, subscriptionContentDetails.totalItemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityType, newItemCount, totalItemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionContentDetails {\n");
    
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    newItemCount: ").append(toIndentedString(newItemCount)).append("\n");
    sb.append("    totalItemCount: ").append(toIndentedString(totalItemCount)).append("\n");
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

