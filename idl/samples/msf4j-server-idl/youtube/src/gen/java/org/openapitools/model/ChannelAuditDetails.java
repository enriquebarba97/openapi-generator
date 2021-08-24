package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The auditDetails object encapsulates channel data that is relevant for YouTube Partners during the audit process.
 */
@ApiModel(description = "The auditDetails object encapsulates channel data that is relevant for YouTube Partners during the audit process.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ChannelAuditDetails   {
  @JsonProperty("communityGuidelinesGoodStanding")
  private Boolean communityGuidelinesGoodStanding;

  @JsonProperty("contentIdClaimsGoodStanding")
  private Boolean contentIdClaimsGoodStanding;

  @JsonProperty("copyrightStrikesGoodStanding")
  private Boolean copyrightStrikesGoodStanding;

  public ChannelAuditDetails communityGuidelinesGoodStanding(Boolean communityGuidelinesGoodStanding) {
    this.communityGuidelinesGoodStanding = communityGuidelinesGoodStanding;
    return this;
  }

   /**
   * Whether or not the channel respects the community guidelines.
   * @return communityGuidelinesGoodStanding
  **/
  @ApiModelProperty(value = "Whether or not the channel respects the community guidelines.")
  public Boolean getCommunityGuidelinesGoodStanding() {
    return communityGuidelinesGoodStanding;
  }

  public void setCommunityGuidelinesGoodStanding(Boolean communityGuidelinesGoodStanding) {
    this.communityGuidelinesGoodStanding = communityGuidelinesGoodStanding;
  }

  public ChannelAuditDetails contentIdClaimsGoodStanding(Boolean contentIdClaimsGoodStanding) {
    this.contentIdClaimsGoodStanding = contentIdClaimsGoodStanding;
    return this;
  }

   /**
   * Whether or not the channel has any unresolved claims.
   * @return contentIdClaimsGoodStanding
  **/
  @ApiModelProperty(value = "Whether or not the channel has any unresolved claims.")
  public Boolean getContentIdClaimsGoodStanding() {
    return contentIdClaimsGoodStanding;
  }

  public void setContentIdClaimsGoodStanding(Boolean contentIdClaimsGoodStanding) {
    this.contentIdClaimsGoodStanding = contentIdClaimsGoodStanding;
  }

  public ChannelAuditDetails copyrightStrikesGoodStanding(Boolean copyrightStrikesGoodStanding) {
    this.copyrightStrikesGoodStanding = copyrightStrikesGoodStanding;
    return this;
  }

   /**
   * Whether or not the channel has any copyright strikes.
   * @return copyrightStrikesGoodStanding
  **/
  @ApiModelProperty(value = "Whether or not the channel has any copyright strikes.")
  public Boolean getCopyrightStrikesGoodStanding() {
    return copyrightStrikesGoodStanding;
  }

  public void setCopyrightStrikesGoodStanding(Boolean copyrightStrikesGoodStanding) {
    this.copyrightStrikesGoodStanding = copyrightStrikesGoodStanding;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelAuditDetails channelAuditDetails = (ChannelAuditDetails) o;
    return Objects.equals(this.communityGuidelinesGoodStanding, channelAuditDetails.communityGuidelinesGoodStanding) &&
        Objects.equals(this.contentIdClaimsGoodStanding, channelAuditDetails.contentIdClaimsGoodStanding) &&
        Objects.equals(this.copyrightStrikesGoodStanding, channelAuditDetails.copyrightStrikesGoodStanding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communityGuidelinesGoodStanding, contentIdClaimsGoodStanding, copyrightStrikesGoodStanding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelAuditDetails {\n");
    
    sb.append("    communityGuidelinesGoodStanding: ").append(toIndentedString(communityGuidelinesGoodStanding)).append("\n");
    sb.append("    contentIdClaimsGoodStanding: ").append(toIndentedString(contentIdClaimsGoodStanding)).append("\n");
    sb.append("    copyrightStrikesGoodStanding: ").append(toIndentedString(copyrightStrikesGoodStanding)).append("\n");
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

