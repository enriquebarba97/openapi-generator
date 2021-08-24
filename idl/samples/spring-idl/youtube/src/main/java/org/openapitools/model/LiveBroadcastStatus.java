package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Live broadcast state.
 */
@ApiModel(description = "Live broadcast state.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveBroadcastStatus   {
  /**
   * The broadcast's status. The status can be updated using the API's liveBroadcasts.transition method.
   */
  public enum LifeCycleStatusEnum {
    LIFECYCLESTATUSUNSPECIFIED("lifeCycleStatusUnspecified"),
    
    CREATED("created"),
    
    READY("ready"),
    
    TESTING("testing"),
    
    LIVE("live"),
    
    COMPLETE("complete"),
    
    REVOKED("revoked"),
    
    TESTSTARTING("testStarting"),
    
    LIVESTARTING("liveStarting");

    private String value;

    LifeCycleStatusEnum(String value) {
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
    public static LifeCycleStatusEnum fromValue(String value) {
      for (LifeCycleStatusEnum b : LifeCycleStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("lifeCycleStatus")
  private LifeCycleStatusEnum lifeCycleStatus;

  /**
   * Priority of the live broadcast event (internal state).
   */
  public enum LiveBroadcastPriorityEnum {
    LIVEBROADCASTPRIORITYUNSPECIFIED("liveBroadcastPriorityUnspecified"),
    
    LOW("low"),
    
    NORMAL("normal"),
    
    HIGH("high");

    private String value;

    LiveBroadcastPriorityEnum(String value) {
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
    public static LiveBroadcastPriorityEnum fromValue(String value) {
      for (LiveBroadcastPriorityEnum b : LiveBroadcastPriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("liveBroadcastPriority")
  private LiveBroadcastPriorityEnum liveBroadcastPriority;

  @JsonProperty("madeForKids")
  private Boolean madeForKids;

  /**
   * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video, so the privacy settings are identical to those supported for videos. In addition, you can set this field by modifying the broadcast resource or by setting the privacyStatus field of the corresponding video resource.
   */
  public enum PrivacyStatusEnum {
    PUBLIC("public"),
    
    UNLISTED("unlisted"),
    
    PRIVATE("private");

    private String value;

    PrivacyStatusEnum(String value) {
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
    public static PrivacyStatusEnum fromValue(String value) {
      for (PrivacyStatusEnum b : PrivacyStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("privacyStatus")
  private PrivacyStatusEnum privacyStatus;

  /**
   * The broadcast's recording status.
   */
  public enum RecordingStatusEnum {
    LIVEBROADCASTRECORDINGSTATUSUNSPECIFIED("liveBroadcastRecordingStatusUnspecified"),
    
    NOTRECORDING("notRecording"),
    
    RECORDING("recording"),
    
    RECORDED("recorded");

    private String value;

    RecordingStatusEnum(String value) {
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
    public static RecordingStatusEnum fromValue(String value) {
      for (RecordingStatusEnum b : RecordingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("recordingStatus")
  private RecordingStatusEnum recordingStatus;

  @JsonProperty("selfDeclaredMadeForKids")
  private Boolean selfDeclaredMadeForKids;

  public LiveBroadcastStatus lifeCycleStatus(LifeCycleStatusEnum lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
    return this;
  }

  /**
   * The broadcast's status. The status can be updated using the API's liveBroadcasts.transition method.
   * @return lifeCycleStatus
  */
  @ApiModelProperty(value = "The broadcast's status. The status can be updated using the API's liveBroadcasts.transition method.")


  public LifeCycleStatusEnum getLifeCycleStatus() {
    return lifeCycleStatus;
  }

  public void setLifeCycleStatus(LifeCycleStatusEnum lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
  }

  public LiveBroadcastStatus liveBroadcastPriority(LiveBroadcastPriorityEnum liveBroadcastPriority) {
    this.liveBroadcastPriority = liveBroadcastPriority;
    return this;
  }

  /**
   * Priority of the live broadcast event (internal state).
   * @return liveBroadcastPriority
  */
  @ApiModelProperty(value = "Priority of the live broadcast event (internal state).")


  public LiveBroadcastPriorityEnum getLiveBroadcastPriority() {
    return liveBroadcastPriority;
  }

  public void setLiveBroadcastPriority(LiveBroadcastPriorityEnum liveBroadcastPriority) {
    this.liveBroadcastPriority = liveBroadcastPriority;
  }

  public LiveBroadcastStatus madeForKids(Boolean madeForKids) {
    this.madeForKids = madeForKids;
    return this;
  }

  /**
   * Whether the broadcast is made for kids or not, decided by YouTube instead of the creator. This field is read only.
   * @return madeForKids
  */
  @ApiModelProperty(value = "Whether the broadcast is made for kids or not, decided by YouTube instead of the creator. This field is read only.")


  public Boolean getMadeForKids() {
    return madeForKids;
  }

  public void setMadeForKids(Boolean madeForKids) {
    this.madeForKids = madeForKids;
  }

  public LiveBroadcastStatus privacyStatus(PrivacyStatusEnum privacyStatus) {
    this.privacyStatus = privacyStatus;
    return this;
  }

  /**
   * The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video, so the privacy settings are identical to those supported for videos. In addition, you can set this field by modifying the broadcast resource or by setting the privacyStatus field of the corresponding video resource.
   * @return privacyStatus
  */
  @ApiModelProperty(value = "The broadcast's privacy status. Note that the broadcast represents exactly one YouTube video, so the privacy settings are identical to those supported for videos. In addition, you can set this field by modifying the broadcast resource or by setting the privacyStatus field of the corresponding video resource.")


  public PrivacyStatusEnum getPrivacyStatus() {
    return privacyStatus;
  }

  public void setPrivacyStatus(PrivacyStatusEnum privacyStatus) {
    this.privacyStatus = privacyStatus;
  }

  public LiveBroadcastStatus recordingStatus(RecordingStatusEnum recordingStatus) {
    this.recordingStatus = recordingStatus;
    return this;
  }

  /**
   * The broadcast's recording status.
   * @return recordingStatus
  */
  @ApiModelProperty(value = "The broadcast's recording status.")


  public RecordingStatusEnum getRecordingStatus() {
    return recordingStatus;
  }

  public void setRecordingStatus(RecordingStatusEnum recordingStatus) {
    this.recordingStatus = recordingStatus;
  }

  public LiveBroadcastStatus selfDeclaredMadeForKids(Boolean selfDeclaredMadeForKids) {
    this.selfDeclaredMadeForKids = selfDeclaredMadeForKids;
    return this;
  }

  /**
   * This field will be set to True if the creator declares the broadcast to be kids only: go/live-cw-work.
   * @return selfDeclaredMadeForKids
  */
  @ApiModelProperty(value = "This field will be set to True if the creator declares the broadcast to be kids only: go/live-cw-work.")


  public Boolean getSelfDeclaredMadeForKids() {
    return selfDeclaredMadeForKids;
  }

  public void setSelfDeclaredMadeForKids(Boolean selfDeclaredMadeForKids) {
    this.selfDeclaredMadeForKids = selfDeclaredMadeForKids;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveBroadcastStatus liveBroadcastStatus = (LiveBroadcastStatus) o;
    return Objects.equals(this.lifeCycleStatus, liveBroadcastStatus.lifeCycleStatus) &&
        Objects.equals(this.liveBroadcastPriority, liveBroadcastStatus.liveBroadcastPriority) &&
        Objects.equals(this.madeForKids, liveBroadcastStatus.madeForKids) &&
        Objects.equals(this.privacyStatus, liveBroadcastStatus.privacyStatus) &&
        Objects.equals(this.recordingStatus, liveBroadcastStatus.recordingStatus) &&
        Objects.equals(this.selfDeclaredMadeForKids, liveBroadcastStatus.selfDeclaredMadeForKids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifeCycleStatus, liveBroadcastPriority, madeForKids, privacyStatus, recordingStatus, selfDeclaredMadeForKids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveBroadcastStatus {\n");
    
    sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
    sb.append("    liveBroadcastPriority: ").append(toIndentedString(liveBroadcastPriority)).append("\n");
    sb.append("    madeForKids: ").append(toIndentedString(madeForKids)).append("\n");
    sb.append("    privacyStatus: ").append(toIndentedString(privacyStatus)).append("\n");
    sb.append("    recordingStatus: ").append(toIndentedString(recordingStatus)).append("\n");
    sb.append("    selfDeclaredMadeForKids: ").append(toIndentedString(selfDeclaredMadeForKids)).append("\n");
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

