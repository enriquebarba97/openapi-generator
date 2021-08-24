package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DEPRECATED Region restriction of the video.
 */
@ApiModel(description = "DEPRECATED Region restriction of the video.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoContentDetailsRegionRestriction   {
  @JsonProperty("allowed")
  @Valid
  private List<String> allowed = null;

  @JsonProperty("blocked")
  @Valid
  private List<String> blocked = null;

  public VideoContentDetailsRegionRestriction allowed(List<String> allowed) {
    this.allowed = allowed;
    return this;
  }

  public VideoContentDetailsRegionRestriction addAllowedItem(String allowedItem) {
    if (this.allowed == null) {
      this.allowed = new ArrayList<>();
    }
    this.allowed.add(allowedItem);
    return this;
  }

  /**
   * A list of region codes that identify countries where the video is viewable. If this property is present and a country is not listed in its value, then the video is blocked from appearing in that country. If this property is present and contains an empty list, the video is blocked in all countries.
   * @return allowed
  */
  @ApiModelProperty(value = "A list of region codes that identify countries where the video is viewable. If this property is present and a country is not listed in its value, then the video is blocked from appearing in that country. If this property is present and contains an empty list, the video is blocked in all countries.")


  public List<String> getAllowed() {
    return allowed;
  }

  public void setAllowed(List<String> allowed) {
    this.allowed = allowed;
  }

  public VideoContentDetailsRegionRestriction blocked(List<String> blocked) {
    this.blocked = blocked;
    return this;
  }

  public VideoContentDetailsRegionRestriction addBlockedItem(String blockedItem) {
    if (this.blocked == null) {
      this.blocked = new ArrayList<>();
    }
    this.blocked.add(blockedItem);
    return this;
  }

  /**
   * A list of region codes that identify countries where the video is blocked. If this property is present and a country is not listed in its value, then the video is viewable in that country. If this property is present and contains an empty list, the video is viewable in all countries.
   * @return blocked
  */
  @ApiModelProperty(value = "A list of region codes that identify countries where the video is blocked. If this property is present and a country is not listed in its value, then the video is viewable in that country. If this property is present and contains an empty list, the video is viewable in all countries.")


  public List<String> getBlocked() {
    return blocked;
  }

  public void setBlocked(List<String> blocked) {
    this.blocked = blocked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoContentDetailsRegionRestriction videoContentDetailsRegionRestriction = (VideoContentDetailsRegionRestriction) o;
    return Objects.equals(this.allowed, videoContentDetailsRegionRestriction.allowed) &&
        Objects.equals(this.blocked, videoContentDetailsRegionRestriction.blocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, blocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoContentDetailsRegionRestriction {\n");
    
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
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

