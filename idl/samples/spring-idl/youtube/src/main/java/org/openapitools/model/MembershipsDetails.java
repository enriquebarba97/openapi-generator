package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.MembershipsDuration;
import org.openapitools.model.MembershipsDurationAtLevel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MembershipsDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class MembershipsDetails   {
  @JsonProperty("accessibleLevels")
  @Valid
  private List<String> accessibleLevels = null;

  @JsonProperty("highestAccessibleLevel")
  private String highestAccessibleLevel;

  @JsonProperty("highestAccessibleLevelDisplayName")
  private String highestAccessibleLevelDisplayName;

  @JsonProperty("membershipsDuration")
  private MembershipsDuration membershipsDuration;

  @JsonProperty("membershipsDurationAtLevels")
  @Valid
  private List<MembershipsDurationAtLevel> membershipsDurationAtLevels = null;

  public MembershipsDetails accessibleLevels(List<String> accessibleLevels) {
    this.accessibleLevels = accessibleLevels;
    return this;
  }

  public MembershipsDetails addAccessibleLevelsItem(String accessibleLevelsItem) {
    if (this.accessibleLevels == null) {
      this.accessibleLevels = new ArrayList<>();
    }
    this.accessibleLevels.add(accessibleLevelsItem);
    return this;
  }

  /**
   * Ids of all levels that the user has access to. This includes the currently active level and all other levels that are included because of a higher purchase.
   * @return accessibleLevels
  */
  @ApiModelProperty(value = "Ids of all levels that the user has access to. This includes the currently active level and all other levels that are included because of a higher purchase.")


  public List<String> getAccessibleLevels() {
    return accessibleLevels;
  }

  public void setAccessibleLevels(List<String> accessibleLevels) {
    this.accessibleLevels = accessibleLevels;
  }

  public MembershipsDetails highestAccessibleLevel(String highestAccessibleLevel) {
    this.highestAccessibleLevel = highestAccessibleLevel;
    return this;
  }

  /**
   * Id of the highest level that the user has access to at the moment.
   * @return highestAccessibleLevel
  */
  @ApiModelProperty(value = "Id of the highest level that the user has access to at the moment.")


  public String getHighestAccessibleLevel() {
    return highestAccessibleLevel;
  }

  public void setHighestAccessibleLevel(String highestAccessibleLevel) {
    this.highestAccessibleLevel = highestAccessibleLevel;
  }

  public MembershipsDetails highestAccessibleLevelDisplayName(String highestAccessibleLevelDisplayName) {
    this.highestAccessibleLevelDisplayName = highestAccessibleLevelDisplayName;
    return this;
  }

  /**
   * Display name for the highest level that the user has access to at the moment.
   * @return highestAccessibleLevelDisplayName
  */
  @ApiModelProperty(value = "Display name for the highest level that the user has access to at the moment.")


  public String getHighestAccessibleLevelDisplayName() {
    return highestAccessibleLevelDisplayName;
  }

  public void setHighestAccessibleLevelDisplayName(String highestAccessibleLevelDisplayName) {
    this.highestAccessibleLevelDisplayName = highestAccessibleLevelDisplayName;
  }

  public MembershipsDetails membershipsDuration(MembershipsDuration membershipsDuration) {
    this.membershipsDuration = membershipsDuration;
    return this;
  }

  /**
   * Get membershipsDuration
   * @return membershipsDuration
  */
  @ApiModelProperty(value = "")

  @Valid

  public MembershipsDuration getMembershipsDuration() {
    return membershipsDuration;
  }

  public void setMembershipsDuration(MembershipsDuration membershipsDuration) {
    this.membershipsDuration = membershipsDuration;
  }

  public MembershipsDetails membershipsDurationAtLevels(List<MembershipsDurationAtLevel> membershipsDurationAtLevels) {
    this.membershipsDurationAtLevels = membershipsDurationAtLevels;
    return this;
  }

  public MembershipsDetails addMembershipsDurationAtLevelsItem(MembershipsDurationAtLevel membershipsDurationAtLevelsItem) {
    if (this.membershipsDurationAtLevels == null) {
      this.membershipsDurationAtLevels = new ArrayList<>();
    }
    this.membershipsDurationAtLevels.add(membershipsDurationAtLevelsItem);
    return this;
  }

  /**
   * Data about memberships duration on particular pricing levels.
   * @return membershipsDurationAtLevels
  */
  @ApiModelProperty(value = "Data about memberships duration on particular pricing levels.")

  @Valid

  public List<MembershipsDurationAtLevel> getMembershipsDurationAtLevels() {
    return membershipsDurationAtLevels;
  }

  public void setMembershipsDurationAtLevels(List<MembershipsDurationAtLevel> membershipsDurationAtLevels) {
    this.membershipsDurationAtLevels = membershipsDurationAtLevels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembershipsDetails membershipsDetails = (MembershipsDetails) o;
    return Objects.equals(this.accessibleLevels, membershipsDetails.accessibleLevels) &&
        Objects.equals(this.highestAccessibleLevel, membershipsDetails.highestAccessibleLevel) &&
        Objects.equals(this.highestAccessibleLevelDisplayName, membershipsDetails.highestAccessibleLevelDisplayName) &&
        Objects.equals(this.membershipsDuration, membershipsDetails.membershipsDuration) &&
        Objects.equals(this.membershipsDurationAtLevels, membershipsDetails.membershipsDurationAtLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibleLevels, highestAccessibleLevel, highestAccessibleLevelDisplayName, membershipsDuration, membershipsDurationAtLevels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipsDetails {\n");
    
    sb.append("    accessibleLevels: ").append(toIndentedString(accessibleLevels)).append("\n");
    sb.append("    highestAccessibleLevel: ").append(toIndentedString(highestAccessibleLevel)).append("\n");
    sb.append("    highestAccessibleLevelDisplayName: ").append(toIndentedString(highestAccessibleLevelDisplayName)).append("\n");
    sb.append("    membershipsDuration: ").append(toIndentedString(membershipsDuration)).append("\n");
    sb.append("    membershipsDurationAtLevels: ").append(toIndentedString(membershipsDurationAtLevels)).append("\n");
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

