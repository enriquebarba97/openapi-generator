package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VideoAbuseReportSecondaryReason
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoAbuseReportSecondaryReason   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("label")
  private String label;

  public VideoAbuseReportSecondaryReason id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this abuse report secondary reason.
   * @return id
  */
  @ApiModelProperty(value = "The ID of this abuse report secondary reason.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VideoAbuseReportSecondaryReason label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The localized label for this abuse report secondary reason.
   * @return label
  */
  @ApiModelProperty(value = "The localized label for this abuse report secondary reason.")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAbuseReportSecondaryReason videoAbuseReportSecondaryReason = (VideoAbuseReportSecondaryReason) o;
    return Objects.equals(this.id, videoAbuseReportSecondaryReason.id) &&
        Objects.equals(this.label, videoAbuseReportSecondaryReason.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAbuseReportSecondaryReason {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

