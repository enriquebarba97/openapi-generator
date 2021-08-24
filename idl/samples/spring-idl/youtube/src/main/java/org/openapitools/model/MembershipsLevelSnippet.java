package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LevelDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MembershipsLevelSnippet
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class MembershipsLevelSnippet   {
  @JsonProperty("creatorChannelId")
  private String creatorChannelId;

  @JsonProperty("levelDetails")
  private LevelDetails levelDetails;

  public MembershipsLevelSnippet creatorChannelId(String creatorChannelId) {
    this.creatorChannelId = creatorChannelId;
    return this;
  }

  /**
   * The id of the channel that's offering channel memberships.
   * @return creatorChannelId
  */
  @ApiModelProperty(value = "The id of the channel that's offering channel memberships.")


  public String getCreatorChannelId() {
    return creatorChannelId;
  }

  public void setCreatorChannelId(String creatorChannelId) {
    this.creatorChannelId = creatorChannelId;
  }

  public MembershipsLevelSnippet levelDetails(LevelDetails levelDetails) {
    this.levelDetails = levelDetails;
    return this;
  }

  /**
   * Get levelDetails
   * @return levelDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public LevelDetails getLevelDetails() {
    return levelDetails;
  }

  public void setLevelDetails(LevelDetails levelDetails) {
    this.levelDetails = levelDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembershipsLevelSnippet membershipsLevelSnippet = (MembershipsLevelSnippet) o;
    return Objects.equals(this.creatorChannelId, membershipsLevelSnippet.creatorChannelId) &&
        Objects.equals(this.levelDetails, membershipsLevelSnippet.levelDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorChannelId, levelDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipsLevelSnippet {\n");
    
    sb.append("    creatorChannelId: ").append(toIndentedString(creatorChannelId)).append("\n");
    sb.append("    levelDetails: ").append(toIndentedString(levelDetails)).append("\n");
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

