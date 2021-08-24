package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.LiveStreamConfigurationIssue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LiveStreamHealthStatus
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveStreamHealthStatus   {
  @JsonProperty("configurationIssues")
  @Valid
  private List<LiveStreamConfigurationIssue> configurationIssues = null;

  @JsonProperty("lastUpdateTimeSeconds")
  private String lastUpdateTimeSeconds;

  /**
   * The status code of this stream
   */
  public enum StatusEnum {
    GOOD("good"),
    
    OK("ok"),
    
    BAD("bad"),
    
    NODATA("noData"),
    
    REVOKED("revoked");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public LiveStreamHealthStatus configurationIssues(List<LiveStreamConfigurationIssue> configurationIssues) {
    this.configurationIssues = configurationIssues;
    return this;
  }

  public LiveStreamHealthStatus addConfigurationIssuesItem(LiveStreamConfigurationIssue configurationIssuesItem) {
    if (this.configurationIssues == null) {
      this.configurationIssues = new ArrayList<>();
    }
    this.configurationIssues.add(configurationIssuesItem);
    return this;
  }

  /**
   * The configurations issues on this stream
   * @return configurationIssues
  */
  @ApiModelProperty(value = "The configurations issues on this stream")

  @Valid

  public List<LiveStreamConfigurationIssue> getConfigurationIssues() {
    return configurationIssues;
  }

  public void setConfigurationIssues(List<LiveStreamConfigurationIssue> configurationIssues) {
    this.configurationIssues = configurationIssues;
  }

  public LiveStreamHealthStatus lastUpdateTimeSeconds(String lastUpdateTimeSeconds) {
    this.lastUpdateTimeSeconds = lastUpdateTimeSeconds;
    return this;
  }

  /**
   * The last time this status was updated (in seconds)
   * @return lastUpdateTimeSeconds
  */
  @ApiModelProperty(value = "The last time this status was updated (in seconds)")


  public String getLastUpdateTimeSeconds() {
    return lastUpdateTimeSeconds;
  }

  public void setLastUpdateTimeSeconds(String lastUpdateTimeSeconds) {
    this.lastUpdateTimeSeconds = lastUpdateTimeSeconds;
  }

  public LiveStreamHealthStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status code of this stream
   * @return status
  */
  @ApiModelProperty(value = "The status code of this stream")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStreamHealthStatus liveStreamHealthStatus = (LiveStreamHealthStatus) o;
    return Objects.equals(this.configurationIssues, liveStreamHealthStatus.configurationIssues) &&
        Objects.equals(this.lastUpdateTimeSeconds, liveStreamHealthStatus.lastUpdateTimeSeconds) &&
        Objects.equals(this.status, liveStreamHealthStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationIssues, lastUpdateTimeSeconds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamHealthStatus {\n");
    
    sb.append("    configurationIssues: ").append(toIndentedString(configurationIssues)).append("\n");
    sb.append("    lastUpdateTimeSeconds: ").append(toIndentedString(lastUpdateTimeSeconds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

