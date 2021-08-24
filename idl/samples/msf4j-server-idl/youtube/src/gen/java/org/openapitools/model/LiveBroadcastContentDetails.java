package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.MonitorStreamInfo;

/**
 * Detailed settings of a broadcast.
 */
@ApiModel(description = "Detailed settings of a broadcast.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LiveBroadcastContentDetails   {
  @JsonProperty("boundStreamId")
  private String boundStreamId;

  @JsonProperty("boundStreamLastUpdateTimeMs")
  private Date boundStreamLastUpdateTimeMs;

  /**
   * Gets or Sets closedCaptionsType
   */
  public enum ClosedCaptionsTypeEnum {
    CLOSEDCAPTIONSTYPEUNSPECIFIED("closedCaptionsTypeUnspecified"),
    
    CLOSEDCAPTIONSDISABLED("closedCaptionsDisabled"),
    
    CLOSEDCAPTIONSHTTPPOST("closedCaptionsHttpPost"),
    
    CLOSEDCAPTIONSEMBEDDED("closedCaptionsEmbedded");

    private String value;

    ClosedCaptionsTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ClosedCaptionsTypeEnum fromValue(String text) {
      for (ClosedCaptionsTypeEnum b : ClosedCaptionsTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("closedCaptionsType")
  private ClosedCaptionsTypeEnum closedCaptionsType;

  @JsonProperty("enableAutoStart")
  private Boolean enableAutoStart;

  @JsonProperty("enableAutoStop")
  private Boolean enableAutoStop;

  @JsonProperty("enableClosedCaptions")
  private Boolean enableClosedCaptions;

  @JsonProperty("enableContentEncryption")
  private Boolean enableContentEncryption;

  @JsonProperty("enableDvr")
  private Boolean enableDvr;

  @JsonProperty("enableEmbed")
  private Boolean enableEmbed;

  @JsonProperty("enableLowLatency")
  private Boolean enableLowLatency;

  /**
   * If both this and enable_low_latency are set, they must match. LATENCY_NORMAL should match enable_low_latency=false LATENCY_LOW should match enable_low_latency=true LATENCY_ULTRA_LOW should have enable_low_latency omitted.
   */
  public enum LatencyPreferenceEnum {
    LATENCYPREFERENCEUNSPECIFIED("latencyPreferenceUnspecified"),
    
    NORMAL("normal"),
    
    LOW("low"),
    
    ULTRALOW("ultraLow");

    private String value;

    LatencyPreferenceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LatencyPreferenceEnum fromValue(String text) {
      for (LatencyPreferenceEnum b : LatencyPreferenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("latencyPreference")
  private LatencyPreferenceEnum latencyPreference;

  @JsonProperty("mesh")
  private byte[] mesh;

  @JsonProperty("monitorStream")
  private MonitorStreamInfo monitorStream;

  /**
   * The projection format of this broadcast. This defaults to rectangular.
   */
  public enum ProjectionEnum {
    PROJECTIONUNSPECIFIED("projectionUnspecified"),
    
    RECTANGULAR("rectangular"),
    
    _360("360"),
    
    MESH("mesh");

    private String value;

    ProjectionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProjectionEnum fromValue(String text) {
      for (ProjectionEnum b : ProjectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("projection")
  private ProjectionEnum projection;

  @JsonProperty("recordFromStart")
  private Boolean recordFromStart;

  @JsonProperty("startWithSlate")
  private Boolean startWithSlate;

  /**
   * The 3D stereo layout of this broadcast. This defaults to mono.
   */
  public enum StereoLayoutEnum {
    STEREOLAYOUTUNSPECIFIED("stereoLayoutUnspecified"),
    
    MONO("mono"),
    
    LEFTRIGHT("leftRight"),
    
    TOPBOTTOM("topBottom");

    private String value;

    StereoLayoutEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StereoLayoutEnum fromValue(String text) {
      for (StereoLayoutEnum b : StereoLayoutEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("stereoLayout")
  private StereoLayoutEnum stereoLayout;

  public LiveBroadcastContentDetails boundStreamId(String boundStreamId) {
    this.boundStreamId = boundStreamId;
    return this;
  }

   /**
   * This value uniquely identifies the live stream bound to the broadcast.
   * @return boundStreamId
  **/
  @ApiModelProperty(value = "This value uniquely identifies the live stream bound to the broadcast.")
  public String getBoundStreamId() {
    return boundStreamId;
  }

  public void setBoundStreamId(String boundStreamId) {
    this.boundStreamId = boundStreamId;
  }

  public LiveBroadcastContentDetails boundStreamLastUpdateTimeMs(Date boundStreamLastUpdateTimeMs) {
    this.boundStreamLastUpdateTimeMs = boundStreamLastUpdateTimeMs;
    return this;
  }

   /**
   * The date and time that the live stream referenced by boundStreamId was last updated.
   * @return boundStreamLastUpdateTimeMs
  **/
  @ApiModelProperty(value = "The date and time that the live stream referenced by boundStreamId was last updated.")
  public Date getBoundStreamLastUpdateTimeMs() {
    return boundStreamLastUpdateTimeMs;
  }

  public void setBoundStreamLastUpdateTimeMs(Date boundStreamLastUpdateTimeMs) {
    this.boundStreamLastUpdateTimeMs = boundStreamLastUpdateTimeMs;
  }

  public LiveBroadcastContentDetails closedCaptionsType(ClosedCaptionsTypeEnum closedCaptionsType) {
    this.closedCaptionsType = closedCaptionsType;
    return this;
  }

   /**
   * Get closedCaptionsType
   * @return closedCaptionsType
  **/
  @ApiModelProperty(value = "")
  public ClosedCaptionsTypeEnum getClosedCaptionsType() {
    return closedCaptionsType;
  }

  public void setClosedCaptionsType(ClosedCaptionsTypeEnum closedCaptionsType) {
    this.closedCaptionsType = closedCaptionsType;
  }

  public LiveBroadcastContentDetails enableAutoStart(Boolean enableAutoStart) {
    this.enableAutoStart = enableAutoStart;
    return this;
  }

   /**
   * This setting indicates whether auto start is enabled for this broadcast. The default value for this property is false. This setting can only be used by Events.
   * @return enableAutoStart
  **/
  @ApiModelProperty(value = "This setting indicates whether auto start is enabled for this broadcast. The default value for this property is false. This setting can only be used by Events.")
  public Boolean getEnableAutoStart() {
    return enableAutoStart;
  }

  public void setEnableAutoStart(Boolean enableAutoStart) {
    this.enableAutoStart = enableAutoStart;
  }

  public LiveBroadcastContentDetails enableAutoStop(Boolean enableAutoStop) {
    this.enableAutoStop = enableAutoStop;
    return this;
  }

   /**
   * This setting indicates whether auto stop is enabled for this broadcast. The default value for this property is false. This setting can only be used by Events.
   * @return enableAutoStop
  **/
  @ApiModelProperty(value = "This setting indicates whether auto stop is enabled for this broadcast. The default value for this property is false. This setting can only be used by Events.")
  public Boolean getEnableAutoStop() {
    return enableAutoStop;
  }

  public void setEnableAutoStop(Boolean enableAutoStop) {
    this.enableAutoStop = enableAutoStop;
  }

  public LiveBroadcastContentDetails enableClosedCaptions(Boolean enableClosedCaptions) {
    this.enableClosedCaptions = enableClosedCaptions;
    return this;
  }

   /**
   * This setting indicates whether HTTP POST closed captioning is enabled for this broadcast. The ingestion URL of the closed captions is returned through the liveStreams API. This is mutually exclusive with using the closed_captions_type property, and is equivalent to setting closed_captions_type to CLOSED_CAPTIONS_HTTP_POST.
   * @return enableClosedCaptions
  **/
  @ApiModelProperty(value = "This setting indicates whether HTTP POST closed captioning is enabled for this broadcast. The ingestion URL of the closed captions is returned through the liveStreams API. This is mutually exclusive with using the closed_captions_type property, and is equivalent to setting closed_captions_type to CLOSED_CAPTIONS_HTTP_POST.")
  public Boolean getEnableClosedCaptions() {
    return enableClosedCaptions;
  }

  public void setEnableClosedCaptions(Boolean enableClosedCaptions) {
    this.enableClosedCaptions = enableClosedCaptions;
  }

  public LiveBroadcastContentDetails enableContentEncryption(Boolean enableContentEncryption) {
    this.enableContentEncryption = enableContentEncryption;
    return this;
  }

   /**
   * This setting indicates whether YouTube should enable content encryption for the broadcast.
   * @return enableContentEncryption
  **/
  @ApiModelProperty(value = "This setting indicates whether YouTube should enable content encryption for the broadcast.")
  public Boolean getEnableContentEncryption() {
    return enableContentEncryption;
  }

  public void setEnableContentEncryption(Boolean enableContentEncryption) {
    this.enableContentEncryption = enableContentEncryption;
  }

  public LiveBroadcastContentDetails enableDvr(Boolean enableDvr) {
    this.enableDvr = enableDvr;
    return this;
  }

   /**
   * This setting determines whether viewers can access DVR controls while watching the video. DVR controls enable the viewer to control the video playback experience by pausing, rewinding, or fast forwarding content. The default value for this property is true. *Important:* You must set the value to true and also set the enableArchive property's value to true if you want to make playback available immediately after the broadcast ends.
   * @return enableDvr
  **/
  @ApiModelProperty(value = "This setting determines whether viewers can access DVR controls while watching the video. DVR controls enable the viewer to control the video playback experience by pausing, rewinding, or fast forwarding content. The default value for this property is true. *Important:* You must set the value to true and also set the enableArchive property's value to true if you want to make playback available immediately after the broadcast ends.")
  public Boolean getEnableDvr() {
    return enableDvr;
  }

  public void setEnableDvr(Boolean enableDvr) {
    this.enableDvr = enableDvr;
  }

  public LiveBroadcastContentDetails enableEmbed(Boolean enableEmbed) {
    this.enableEmbed = enableEmbed;
    return this;
  }

   /**
   * This setting indicates whether the broadcast video can be played in an embedded player. If you choose to archive the video (using the enableArchive property), this setting will also apply to the archived video.
   * @return enableEmbed
  **/
  @ApiModelProperty(value = "This setting indicates whether the broadcast video can be played in an embedded player. If you choose to archive the video (using the enableArchive property), this setting will also apply to the archived video.")
  public Boolean getEnableEmbed() {
    return enableEmbed;
  }

  public void setEnableEmbed(Boolean enableEmbed) {
    this.enableEmbed = enableEmbed;
  }

  public LiveBroadcastContentDetails enableLowLatency(Boolean enableLowLatency) {
    this.enableLowLatency = enableLowLatency;
    return this;
  }

   /**
   * Indicates whether this broadcast has low latency enabled.
   * @return enableLowLatency
  **/
  @ApiModelProperty(value = "Indicates whether this broadcast has low latency enabled.")
  public Boolean getEnableLowLatency() {
    return enableLowLatency;
  }

  public void setEnableLowLatency(Boolean enableLowLatency) {
    this.enableLowLatency = enableLowLatency;
  }

  public LiveBroadcastContentDetails latencyPreference(LatencyPreferenceEnum latencyPreference) {
    this.latencyPreference = latencyPreference;
    return this;
  }

   /**
   * If both this and enable_low_latency are set, they must match. LATENCY_NORMAL should match enable_low_latency=false LATENCY_LOW should match enable_low_latency=true LATENCY_ULTRA_LOW should have enable_low_latency omitted.
   * @return latencyPreference
  **/
  @ApiModelProperty(value = "If both this and enable_low_latency are set, they must match. LATENCY_NORMAL should match enable_low_latency=false LATENCY_LOW should match enable_low_latency=true LATENCY_ULTRA_LOW should have enable_low_latency omitted.")
  public LatencyPreferenceEnum getLatencyPreference() {
    return latencyPreference;
  }

  public void setLatencyPreference(LatencyPreferenceEnum latencyPreference) {
    this.latencyPreference = latencyPreference;
  }

  public LiveBroadcastContentDetails mesh(byte[] mesh) {
    this.mesh = mesh;
    return this;
  }

   /**
   * The mesh for projecting the video if projection is mesh. The mesh value must be a UTF-8 string containing the base-64 encoding of 3D mesh data that follows the Spherical Video V2 RFC specification for an mshp box, excluding the box size and type but including the following four reserved zero bytes for the version and flags.
   * @return mesh
  **/
  @ApiModelProperty(value = "The mesh for projecting the video if projection is mesh. The mesh value must be a UTF-8 string containing the base-64 encoding of 3D mesh data that follows the Spherical Video V2 RFC specification for an mshp box, excluding the box size and type but including the following four reserved zero bytes for the version and flags.")
  public byte[] getMesh() {
    return mesh;
  }

  public void setMesh(byte[] mesh) {
    this.mesh = mesh;
  }

  public LiveBroadcastContentDetails monitorStream(MonitorStreamInfo monitorStream) {
    this.monitorStream = monitorStream;
    return this;
  }

   /**
   * Get monitorStream
   * @return monitorStream
  **/
  @ApiModelProperty(value = "")
  public MonitorStreamInfo getMonitorStream() {
    return monitorStream;
  }

  public void setMonitorStream(MonitorStreamInfo monitorStream) {
    this.monitorStream = monitorStream;
  }

  public LiveBroadcastContentDetails projection(ProjectionEnum projection) {
    this.projection = projection;
    return this;
  }

   /**
   * The projection format of this broadcast. This defaults to rectangular.
   * @return projection
  **/
  @ApiModelProperty(value = "The projection format of this broadcast. This defaults to rectangular.")
  public ProjectionEnum getProjection() {
    return projection;
  }

  public void setProjection(ProjectionEnum projection) {
    this.projection = projection;
  }

  public LiveBroadcastContentDetails recordFromStart(Boolean recordFromStart) {
    this.recordFromStart = recordFromStart;
    return this;
  }

   /**
   * Automatically start recording after the event goes live. The default value for this property is true. *Important:* You must also set the enableDvr property's value to true if you want the playback to be available immediately after the broadcast ends. If you set this property's value to true but do not also set the enableDvr property to true, there may be a delay of around one day before the archived video will be available for playback.
   * @return recordFromStart
  **/
  @ApiModelProperty(value = "Automatically start recording after the event goes live. The default value for this property is true. *Important:* You must also set the enableDvr property's value to true if you want the playback to be available immediately after the broadcast ends. If you set this property's value to true but do not also set the enableDvr property to true, there may be a delay of around one day before the archived video will be available for playback.")
  public Boolean getRecordFromStart() {
    return recordFromStart;
  }

  public void setRecordFromStart(Boolean recordFromStart) {
    this.recordFromStart = recordFromStart;
  }

  public LiveBroadcastContentDetails startWithSlate(Boolean startWithSlate) {
    this.startWithSlate = startWithSlate;
    return this;
  }

   /**
   * This setting indicates whether the broadcast should automatically begin with an in-stream slate when you update the broadcast's status to live. After updating the status, you then need to send a liveCuepoints.insert request that sets the cuepoint's eventState to end to remove the in-stream slate and make your broadcast stream visible to viewers.
   * @return startWithSlate
  **/
  @ApiModelProperty(value = "This setting indicates whether the broadcast should automatically begin with an in-stream slate when you update the broadcast's status to live. After updating the status, you then need to send a liveCuepoints.insert request that sets the cuepoint's eventState to end to remove the in-stream slate and make your broadcast stream visible to viewers.")
  public Boolean getStartWithSlate() {
    return startWithSlate;
  }

  public void setStartWithSlate(Boolean startWithSlate) {
    this.startWithSlate = startWithSlate;
  }

  public LiveBroadcastContentDetails stereoLayout(StereoLayoutEnum stereoLayout) {
    this.stereoLayout = stereoLayout;
    return this;
  }

   /**
   * The 3D stereo layout of this broadcast. This defaults to mono.
   * @return stereoLayout
  **/
  @ApiModelProperty(value = "The 3D stereo layout of this broadcast. This defaults to mono.")
  public StereoLayoutEnum getStereoLayout() {
    return stereoLayout;
  }

  public void setStereoLayout(StereoLayoutEnum stereoLayout) {
    this.stereoLayout = stereoLayout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveBroadcastContentDetails liveBroadcastContentDetails = (LiveBroadcastContentDetails) o;
    return Objects.equals(this.boundStreamId, liveBroadcastContentDetails.boundStreamId) &&
        Objects.equals(this.boundStreamLastUpdateTimeMs, liveBroadcastContentDetails.boundStreamLastUpdateTimeMs) &&
        Objects.equals(this.closedCaptionsType, liveBroadcastContentDetails.closedCaptionsType) &&
        Objects.equals(this.enableAutoStart, liveBroadcastContentDetails.enableAutoStart) &&
        Objects.equals(this.enableAutoStop, liveBroadcastContentDetails.enableAutoStop) &&
        Objects.equals(this.enableClosedCaptions, liveBroadcastContentDetails.enableClosedCaptions) &&
        Objects.equals(this.enableContentEncryption, liveBroadcastContentDetails.enableContentEncryption) &&
        Objects.equals(this.enableDvr, liveBroadcastContentDetails.enableDvr) &&
        Objects.equals(this.enableEmbed, liveBroadcastContentDetails.enableEmbed) &&
        Objects.equals(this.enableLowLatency, liveBroadcastContentDetails.enableLowLatency) &&
        Objects.equals(this.latencyPreference, liveBroadcastContentDetails.latencyPreference) &&
        Objects.equals(this.mesh, liveBroadcastContentDetails.mesh) &&
        Objects.equals(this.monitorStream, liveBroadcastContentDetails.monitorStream) &&
        Objects.equals(this.projection, liveBroadcastContentDetails.projection) &&
        Objects.equals(this.recordFromStart, liveBroadcastContentDetails.recordFromStart) &&
        Objects.equals(this.startWithSlate, liveBroadcastContentDetails.startWithSlate) &&
        Objects.equals(this.stereoLayout, liveBroadcastContentDetails.stereoLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundStreamId, boundStreamLastUpdateTimeMs, closedCaptionsType, enableAutoStart, enableAutoStop, enableClosedCaptions, enableContentEncryption, enableDvr, enableEmbed, enableLowLatency, latencyPreference, mesh, monitorStream, projection, recordFromStart, startWithSlate, stereoLayout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveBroadcastContentDetails {\n");
    
    sb.append("    boundStreamId: ").append(toIndentedString(boundStreamId)).append("\n");
    sb.append("    boundStreamLastUpdateTimeMs: ").append(toIndentedString(boundStreamLastUpdateTimeMs)).append("\n");
    sb.append("    closedCaptionsType: ").append(toIndentedString(closedCaptionsType)).append("\n");
    sb.append("    enableAutoStart: ").append(toIndentedString(enableAutoStart)).append("\n");
    sb.append("    enableAutoStop: ").append(toIndentedString(enableAutoStop)).append("\n");
    sb.append("    enableClosedCaptions: ").append(toIndentedString(enableClosedCaptions)).append("\n");
    sb.append("    enableContentEncryption: ").append(toIndentedString(enableContentEncryption)).append("\n");
    sb.append("    enableDvr: ").append(toIndentedString(enableDvr)).append("\n");
    sb.append("    enableEmbed: ").append(toIndentedString(enableEmbed)).append("\n");
    sb.append("    enableLowLatency: ").append(toIndentedString(enableLowLatency)).append("\n");
    sb.append("    latencyPreference: ").append(toIndentedString(latencyPreference)).append("\n");
    sb.append("    mesh: ").append(toIndentedString(mesh)).append("\n");
    sb.append("    monitorStream: ").append(toIndentedString(monitorStream)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    recordFromStart: ").append(toIndentedString(recordFromStart)).append("\n");
    sb.append("    startWithSlate: ").append(toIndentedString(startWithSlate)).append("\n");
    sb.append("    stereoLayout: ").append(toIndentedString(stereoLayout)).append("\n");
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

