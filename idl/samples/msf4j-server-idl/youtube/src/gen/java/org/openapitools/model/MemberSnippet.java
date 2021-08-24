package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChannelProfileDetails;
import org.openapitools.model.MembershipsDetails;

/**
 * MemberSnippet
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class MemberSnippet   {
  @JsonProperty("creatorChannelId")
  private String creatorChannelId;

  @JsonProperty("memberDetails")
  private ChannelProfileDetails memberDetails;

  @JsonProperty("membershipsDetails")
  private MembershipsDetails membershipsDetails;

  public MemberSnippet creatorChannelId(String creatorChannelId) {
    this.creatorChannelId = creatorChannelId;
    return this;
  }

   /**
   * The id of the channel that's offering memberships.
   * @return creatorChannelId
  **/
  @ApiModelProperty(value = "The id of the channel that's offering memberships.")
  public String getCreatorChannelId() {
    return creatorChannelId;
  }

  public void setCreatorChannelId(String creatorChannelId) {
    this.creatorChannelId = creatorChannelId;
  }

  public MemberSnippet memberDetails(ChannelProfileDetails memberDetails) {
    this.memberDetails = memberDetails;
    return this;
  }

   /**
   * Get memberDetails
   * @return memberDetails
  **/
  @ApiModelProperty(value = "")
  public ChannelProfileDetails getMemberDetails() {
    return memberDetails;
  }

  public void setMemberDetails(ChannelProfileDetails memberDetails) {
    this.memberDetails = memberDetails;
  }

  public MemberSnippet membershipsDetails(MembershipsDetails membershipsDetails) {
    this.membershipsDetails = membershipsDetails;
    return this;
  }

   /**
   * Get membershipsDetails
   * @return membershipsDetails
  **/
  @ApiModelProperty(value = "")
  public MembershipsDetails getMembershipsDetails() {
    return membershipsDetails;
  }

  public void setMembershipsDetails(MembershipsDetails membershipsDetails) {
    this.membershipsDetails = membershipsDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberSnippet memberSnippet = (MemberSnippet) o;
    return Objects.equals(this.creatorChannelId, memberSnippet.creatorChannelId) &&
        Objects.equals(this.memberDetails, memberSnippet.memberDetails) &&
        Objects.equals(this.membershipsDetails, memberSnippet.membershipsDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorChannelId, memberDetails, membershipsDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSnippet {\n");
    
    sb.append("    creatorChannelId: ").append(toIndentedString(creatorChannelId)).append("\n");
    sb.append("    memberDetails: ").append(toIndentedString(memberDetails)).append("\n");
    sb.append("    membershipsDetails: ").append(toIndentedString(membershipsDetails)).append("\n");
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

