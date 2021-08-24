package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Basic details about a video category, such as its localized title. Next Id: 17
 */
@ApiModel(description = "Basic details about a video category, such as its localized title. Next Id: 17")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class VideoStatus   {
  @JsonProperty("embeddable")
  private Boolean embeddable;

  /**
   * This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.
   */
  public enum FailureReasonEnum {
    CONVERSION("conversion"),
    
    INVALIDFILE("invalidFile"),
    
    EMPTYFILE("emptyFile"),
    
    TOOSMALL("tooSmall"),
    
    CODEC("codec"),
    
    UPLOADABORTED("uploadAborted");

    private String value;

    FailureReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FailureReasonEnum fromValue(String text) {
      for (FailureReasonEnum b : FailureReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("failureReason")
  private FailureReasonEnum failureReason;

  /**
   * The video's license. @mutable youtube.videos.insert youtube.videos.update
   */
  public enum LicenseEnum {
    YOUTUBE("youtube"),
    
    CREATIVECOMMON("creativeCommon");

    private String value;

    LicenseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LicenseEnum fromValue(String text) {
      for (LicenseEnum b : LicenseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("license")
  private LicenseEnum license;

  @JsonProperty("madeForKids")
  private Boolean madeForKids;

  /**
   * The video's privacy status.
   */
  public enum PrivacyStatusEnum {
    PUBLIC("public"),
    
    UNLISTED("unlisted"),
    
    PRIVATE("private");

    private String value;

    PrivacyStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PrivacyStatusEnum fromValue(String text) {
      for (PrivacyStatusEnum b : PrivacyStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("privacyStatus")
  private PrivacyStatusEnum privacyStatus;

  @JsonProperty("publicStatsViewable")
  private Boolean publicStatsViewable;

  @JsonProperty("publishAt")
  private Date publishAt;

  /**
   * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.
   */
  public enum RejectionReasonEnum {
    COPYRIGHT("copyright"),
    
    INAPPROPRIATE("inappropriate"),
    
    DUPLICATE("duplicate"),
    
    TERMSOFUSE("termsOfUse"),
    
    UPLOADERACCOUNTSUSPENDED("uploaderAccountSuspended"),
    
    LENGTH("length"),
    
    CLAIM("claim"),
    
    UPLOADERACCOUNTCLOSED("uploaderAccountClosed"),
    
    TRADEMARK("trademark"),
    
    LEGAL("legal");

    private String value;

    RejectionReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RejectionReasonEnum fromValue(String text) {
      for (RejectionReasonEnum b : RejectionReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("rejectionReason")
  private RejectionReasonEnum rejectionReason;

  @JsonProperty("selfDeclaredMadeForKids")
  private Boolean selfDeclaredMadeForKids;

  /**
   * The status of the uploaded video.
   */
  public enum UploadStatusEnum {
    UPLOADED("uploaded"),
    
    PROCESSED("processed"),
    
    FAILED("failed"),
    
    REJECTED("rejected"),
    
    DELETED("deleted");

    private String value;

    UploadStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UploadStatusEnum fromValue(String text) {
      for (UploadStatusEnum b : UploadStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("uploadStatus")
  private UploadStatusEnum uploadStatus;

  public VideoStatus embeddable(Boolean embeddable) {
    this.embeddable = embeddable;
    return this;
  }

   /**
   * This value indicates if the video can be embedded on another website. @mutable youtube.videos.insert youtube.videos.update
   * @return embeddable
  **/
  @ApiModelProperty(value = "This value indicates if the video can be embedded on another website. @mutable youtube.videos.insert youtube.videos.update")
  public Boolean getEmbeddable() {
    return embeddable;
  }

  public void setEmbeddable(Boolean embeddable) {
    this.embeddable = embeddable;
  }

  public VideoStatus failureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.
   * @return failureReason
  **/
  @ApiModelProperty(value = "This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.")
  public FailureReasonEnum getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(FailureReasonEnum failureReason) {
    this.failureReason = failureReason;
  }

  public VideoStatus license(LicenseEnum license) {
    this.license = license;
    return this;
  }

   /**
   * The video's license. @mutable youtube.videos.insert youtube.videos.update
   * @return license
  **/
  @ApiModelProperty(value = "The video's license. @mutable youtube.videos.insert youtube.videos.update")
  public LicenseEnum getLicense() {
    return license;
  }

  public void setLicense(LicenseEnum license) {
    this.license = license;
  }

  public VideoStatus madeForKids(Boolean madeForKids) {
    this.madeForKids = madeForKids;
    return this;
  }

   /**
   * Get madeForKids
   * @return madeForKids
  **/
  @ApiModelProperty(value = "")
  public Boolean getMadeForKids() {
    return madeForKids;
  }

  public void setMadeForKids(Boolean madeForKids) {
    this.madeForKids = madeForKids;
  }

  public VideoStatus privacyStatus(PrivacyStatusEnum privacyStatus) {
    this.privacyStatus = privacyStatus;
    return this;
  }

   /**
   * The video's privacy status.
   * @return privacyStatus
  **/
  @ApiModelProperty(value = "The video's privacy status.")
  public PrivacyStatusEnum getPrivacyStatus() {
    return privacyStatus;
  }

  public void setPrivacyStatus(PrivacyStatusEnum privacyStatus) {
    this.privacyStatus = privacyStatus;
  }

  public VideoStatus publicStatsViewable(Boolean publicStatsViewable) {
    this.publicStatsViewable = publicStatsViewable;
    return this;
  }

   /**
   * This value indicates if the extended video statistics on the watch page can be viewed by everyone. Note that the view count, likes, etc will still be visible if this is disabled. @mutable youtube.videos.insert youtube.videos.update
   * @return publicStatsViewable
  **/
  @ApiModelProperty(value = "This value indicates if the extended video statistics on the watch page can be viewed by everyone. Note that the view count, likes, etc will still be visible if this is disabled. @mutable youtube.videos.insert youtube.videos.update")
  public Boolean getPublicStatsViewable() {
    return publicStatsViewable;
  }

  public void setPublicStatsViewable(Boolean publicStatsViewable) {
    this.publicStatsViewable = publicStatsViewable;
  }

  public VideoStatus publishAt(Date publishAt) {
    this.publishAt = publishAt;
    return this;
  }

   /**
   * The date and time when the video is scheduled to publish. It can be set only if the privacy status of the video is private..
   * @return publishAt
  **/
  @ApiModelProperty(value = "The date and time when the video is scheduled to publish. It can be set only if the privacy status of the video is private..")
  public Date getPublishAt() {
    return publishAt;
  }

  public void setPublishAt(Date publishAt) {
    this.publishAt = publishAt;
  }

  public VideoStatus rejectionReason(RejectionReasonEnum rejectionReason) {
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.
   * @return rejectionReason
  **/
  @ApiModelProperty(value = "This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.")
  public RejectionReasonEnum getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(RejectionReasonEnum rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

  public VideoStatus selfDeclaredMadeForKids(Boolean selfDeclaredMadeForKids) {
    this.selfDeclaredMadeForKids = selfDeclaredMadeForKids;
    return this;
  }

   /**
   * Get selfDeclaredMadeForKids
   * @return selfDeclaredMadeForKids
  **/
  @ApiModelProperty(value = "")
  public Boolean getSelfDeclaredMadeForKids() {
    return selfDeclaredMadeForKids;
  }

  public void setSelfDeclaredMadeForKids(Boolean selfDeclaredMadeForKids) {
    this.selfDeclaredMadeForKids = selfDeclaredMadeForKids;
  }

  public VideoStatus uploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }

   /**
   * The status of the uploaded video.
   * @return uploadStatus
  **/
  @ApiModelProperty(value = "The status of the uploaded video.")
  public UploadStatusEnum getUploadStatus() {
    return uploadStatus;
  }

  public void setUploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoStatus videoStatus = (VideoStatus) o;
    return Objects.equals(this.embeddable, videoStatus.embeddable) &&
        Objects.equals(this.failureReason, videoStatus.failureReason) &&
        Objects.equals(this.license, videoStatus.license) &&
        Objects.equals(this.madeForKids, videoStatus.madeForKids) &&
        Objects.equals(this.privacyStatus, videoStatus.privacyStatus) &&
        Objects.equals(this.publicStatsViewable, videoStatus.publicStatsViewable) &&
        Objects.equals(this.publishAt, videoStatus.publishAt) &&
        Objects.equals(this.rejectionReason, videoStatus.rejectionReason) &&
        Objects.equals(this.selfDeclaredMadeForKids, videoStatus.selfDeclaredMadeForKids) &&
        Objects.equals(this.uploadStatus, videoStatus.uploadStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddable, failureReason, license, madeForKids, privacyStatus, publicStatsViewable, publishAt, rejectionReason, selfDeclaredMadeForKids, uploadStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoStatus {\n");
    
    sb.append("    embeddable: ").append(toIndentedString(embeddable)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    madeForKids: ").append(toIndentedString(madeForKids)).append("\n");
    sb.append("    privacyStatus: ").append(toIndentedString(privacyStatus)).append("\n");
    sb.append("    publicStatsViewable: ").append(toIndentedString(publicStatsViewable)).append("\n");
    sb.append("    publishAt: ").append(toIndentedString(publishAt)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    selfDeclaredMadeForKids: ").append(toIndentedString(selfDeclaredMadeForKids)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
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

