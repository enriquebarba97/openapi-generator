package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MembershipsDurationAtLevel
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class MembershipsDurationAtLevel   {
  @JsonProperty("level")
  private String level;

  @JsonProperty("memberSince")
  private String memberSince;

  @JsonProperty("memberTotalDurationMonths")
  private Integer memberTotalDurationMonths;

  public MembershipsDurationAtLevel level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Pricing level ID.
   * @return level
  **/
  @ApiModelProperty(value = "Pricing level ID.")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public MembershipsDurationAtLevel memberSince(String memberSince) {
    this.memberSince = memberSince;
    return this;
  }

   /**
   * The date and time when the user became a continuous member for the given level.
   * @return memberSince
  **/
  @ApiModelProperty(value = "The date and time when the user became a continuous member for the given level.")
  public String getMemberSince() {
    return memberSince;
  }

  public void setMemberSince(String memberSince) {
    this.memberSince = memberSince;
  }

  public MembershipsDurationAtLevel memberTotalDurationMonths(Integer memberTotalDurationMonths) {
    this.memberTotalDurationMonths = memberTotalDurationMonths;
    return this;
  }

   /**
   * The cumulative time the user has been a member for the given level in complete months (the time is rounded down to the nearest integer).
   * @return memberTotalDurationMonths
  **/
  @ApiModelProperty(value = "The cumulative time the user has been a member for the given level in complete months (the time is rounded down to the nearest integer).")
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
    MembershipsDurationAtLevel membershipsDurationAtLevel = (MembershipsDurationAtLevel) o;
    return Objects.equals(this.level, membershipsDurationAtLevel.level) &&
        Objects.equals(this.memberSince, membershipsDurationAtLevel.memberSince) &&
        Objects.equals(this.memberTotalDurationMonths, membershipsDurationAtLevel.memberTotalDurationMonths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, memberSince, memberTotalDurationMonths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipsDurationAtLevel {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

