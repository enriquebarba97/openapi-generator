package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.VideoAbuseReportSecondaryReason;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Basic details about a video category, such as its localized title.
 */
@ApiModel(description = "Basic details about a video category, such as its localized title.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoAbuseReportReasonSnippet   {
  @JsonProperty("label")
  private String label;

  @JsonProperty("secondaryReasons")
  @Valid
  private List<VideoAbuseReportSecondaryReason> secondaryReasons = null;

  public VideoAbuseReportReasonSnippet label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The localized label belonging to this abuse report reason.
   * @return label
  */
  @ApiModelProperty(value = "The localized label belonging to this abuse report reason.")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public VideoAbuseReportReasonSnippet secondaryReasons(List<VideoAbuseReportSecondaryReason> secondaryReasons) {
    this.secondaryReasons = secondaryReasons;
    return this;
  }

  public VideoAbuseReportReasonSnippet addSecondaryReasonsItem(VideoAbuseReportSecondaryReason secondaryReasonsItem) {
    if (this.secondaryReasons == null) {
      this.secondaryReasons = new ArrayList<>();
    }
    this.secondaryReasons.add(secondaryReasonsItem);
    return this;
  }

  /**
   * The secondary reasons associated with this reason, if any are available. (There might be 0 or more.)
   * @return secondaryReasons
  */
  @ApiModelProperty(value = "The secondary reasons associated with this reason, if any are available. (There might be 0 or more.)")

  @Valid

  public List<VideoAbuseReportSecondaryReason> getSecondaryReasons() {
    return secondaryReasons;
  }

  public void setSecondaryReasons(List<VideoAbuseReportSecondaryReason> secondaryReasons) {
    this.secondaryReasons = secondaryReasons;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAbuseReportReasonSnippet videoAbuseReportReasonSnippet = (VideoAbuseReportReasonSnippet) o;
    return Objects.equals(this.label, videoAbuseReportReasonSnippet.label) &&
        Objects.equals(this.secondaryReasons, videoAbuseReportReasonSnippet.secondaryReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, secondaryReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAbuseReportReasonSnippet {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    secondaryReasons: ").append(toIndentedString(secondaryReasons)).append("\n");
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

