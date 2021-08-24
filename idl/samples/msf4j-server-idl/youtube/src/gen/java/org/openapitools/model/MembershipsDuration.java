package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MembershipsDuration
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class MembershipsDuration   {
  @JsonProperty("memberSince")
  private String memberSince;

  @JsonProperty("memberTotalDurationMonths")
  private Integer memberTotalDurationMonths;

  public MembershipsDuration memberSince(String memberSince) {
    this.memberSince = memberSince;
    return this;
  }

   /**
   * The date and time when the user became a continuous member across all levels.
   * @return memberSince
  **/
  @ApiModelProperty(value = "The date and time when the user became a continuous member across all levels.")
  public String getMemberSince() {
    return memberSince;
  }

  public void setMemberSince(String memberSince) {
    this.memberSince = memberSince;
  }

  public MembershipsDuration memberTotalDurationMonths(Integer memberTotalDurationMonths) {
    this.memberTotalDurationMonths = memberTotalDurationMonths;
    return this;
  }

   /**
   * The cumulative time the user has been a member across all levels in complete months (the time is rounded down to the nearest integer).
   * @return memberTotalDurationMonths
  **/
  @ApiModelProperty(value = "The cumulative time the user has been a member across all levels in complete months (the time is rounded down to the nearest integer).")
  public Integer getMemberTotalDurationMonths() {
    return memberTotalDurationMonths;
  }

  public void setMemberTotalDurationMonths(Integer memberTotalDurationMonths) {
    this.memberTotalDurationMonths = memberTotalDurationMonths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembershipsDuration membershipsDuration = (MembershipsDuration) o;
    return Objects.equals(this.memberSince, membershipsDuration.memberSince) &&
        Objects.equals(this.memberTotalDurationMonths, membershipsDuration.memberTotalDurationMonths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberSince, memberTotalDurationMonths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipsDuration {\n");
    
    sb.append("    memberSince: ").append(toIndentedString(memberSince)).append("\n");
    sb.append("    memberTotalDurationMonths: ").append(toIndentedString(memberTotalDurationMonths)).append("\n");
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

