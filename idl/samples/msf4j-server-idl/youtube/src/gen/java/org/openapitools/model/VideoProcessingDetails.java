package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VideoProcessingDetailsProcessingProgress;

/**
 * Describes processing status and progress and availability of some other Video resource parts.
 */
@ApiModel(description = "Describes processing status and progress and availability of some other Video resource parts.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class VideoProcessingDetails   {
  @JsonProperty("editorSuggestionsAvailability")
  private String editorSuggestionsAvailability;

  @JsonProperty("fileDetailsAvailability")
  private String fileDetailsAvailability;

  /**
   * The reason that YouTube failed to process the video. This property will only have a value if the processingStatus property's value is failed.
   */
  public enum ProcessingFailureReasonEnum {
    UPLOADFAILED("uploadFailed"),
    
    TRANSCODEFAILED("transcodeFailed"),
    
    STREAMINGFAILED("streamingFailed"),
    
    OTHER("other");

    private String value;

    ProcessingFailureReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProcessingFailureReasonEnum fromValue(String text) {
      for (ProcessingFailureReasonEnum b : ProcessingFailureReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("processingFailureReason")
  private ProcessingFailureReasonEnum processingFailureReason;

  @JsonProperty("processingIssuesAvailability")
  private String processingIssuesAvailability;

  @JsonProperty("processingProgress")
  private VideoProcessingDetailsProcessingProgress processingProgress;

  /**
   * The video's processing status. This value indicates whether YouTube was able to process the video or if the video is still being processed.
   */
  public enum ProcessingStatusEnum {
    PROCESSING("processing"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed"),
    
    TERMINATED("terminated");

    private String value;

    ProcessingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProcessingStatusEnum fromValue(String text) {
      for (ProcessingStatusEnum b : ProcessingStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("processingStatus")
  private ProcessingStatusEnum processingStatus;

  @JsonProperty("tagSuggestionsAvailability")
  private String tagSuggestionsAvailability;

  @JsonProperty("thumbnailsAvailability")
  private String thumbnailsAvailability;

  public VideoProcessingDetails editorSuggestionsAvailability(String editorSuggestionsAvailability) {
    this.editorSuggestionsAvailability = editorSuggestionsAvailability;
    return this;
  }

   /**
   * This value indicates whether video editing suggestions, which might improve video quality or the playback experience, are available for the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
   * @return editorSuggestionsAvailability
  **/
  @ApiModelProperty(value = "This value indicates whether video editing suggestions, which might improve video quality or the playback experience, are available for the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.")
  public String getEditorSuggestionsAvailability() {
    return editorSuggestionsAvailability;
  }

  public void setEditorSuggestionsAvailability(String editorSuggestionsAvailability) {
    this.editorSuggestionsAvailability = editorSuggestionsAvailability;
  }

  public VideoProcessingDetails fileDetailsAvailability(String fileDetailsAvailability) {
    this.fileDetailsAvailability = fileDetailsAvailability;
    return this;
  }

   /**
   * This value indicates whether file details are available for the uploaded video. You can retrieve a video's file details by requesting the fileDetails part in your videos.list() request.
   * @return fileDetailsAvailability
  **/
  @ApiModelProperty(value = "This value indicates whether file details are available for the uploaded video. You can retrieve a video's file details by requesting the fileDetails part in your videos.list() request.")
  public String getFileDetailsAvailability() {
    return fileDetailsAvailability;
  }

  public void setFileDetailsAvailability(String fileDetailsAvailability) {
    this.fileDetailsAvailability = fileDetailsAvailability;
  }

  public VideoProcessingDetails processingFailureReason(ProcessingFailureReasonEnum processingFailureReason) {
    this.processingFailureReason = processingFailureReason;
    return this;
  }

   /**
   * The reason that YouTube failed to process the video. This property will only have a value if the processingStatus property's value is failed.
   * @return processingFailureReason
  **/
  @ApiModelProperty(value = "The reason that YouTube failed to process the video. This property will only have a value if the processingStatus property's value is failed.")
  public ProcessingFailureReasonEnum getProcessingFailureReason() {
    return processingFailureReason;
  }

  public void setProcessingFailureReason(ProcessingFailureReasonEnum processingFailureReason) {
    this.processingFailureReason = processingFailureReason;
  }

  public VideoProcessingDetails processingIssuesAvailability(String processingIssuesAvailability) {
    this.processingIssuesAvailability = processingIssuesAvailability;
    return this;
  }

   /**
   * This value indicates whether the video processing engine has generated suggestions that might improve YouTube's ability to process the the video, warnings that explain video processing problems, or errors that cause video processing problems. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
   * @return processingIssuesAvailability
  **/
  @ApiModelProperty(value = "This value indicates whether the video processing engine has generated suggestions that might improve YouTube's ability to process the the video, warnings that explain video processing problems, or errors that cause video processing problems. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.")
  public String getProcessingIssuesAvailability() {
    return processingIssuesAvailability;
  }

  public void setProcessingIssuesAvailability(String processingIssuesAvailability) {
    this.processingIssuesAvailability = processingIssuesAvailability;
  }

  public VideoProcessingDetails processingProgress(VideoProcessingDetailsProcessingProgress processingProgress) {
    this.processingProgress = processingProgress;
    return this;
  }

   /**
   * Get processingProgress
   * @return processingProgress
  **/
  @ApiModelProperty(value = "")
  public VideoProcessingDetailsProcessingProgress getProcessingProgress() {
    return processingProgress;
  }

  public void setProcessingProgress(VideoProcessingDetailsProcessingProgress processingProgress) {
    this.processingProgress = processingProgress;
  }

  public VideoProcessingDetails processingStatus(ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

   /**
   * The video's processing status. This value indicates whether YouTube was able to process the video or if the video is still being processed.
   * @return processingStatus
  **/
  @ApiModelProperty(value = "The video's processing status. This value indicates whether YouTube was able to process the video or if the video is still being processed.")
  public ProcessingStatusEnum getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
  }

  public VideoProcessingDetails tagSuggestionsAvailability(String tagSuggestionsAvailability) {
    this.tagSuggestionsAvailability = tagSuggestionsAvailability;
    return this;
  }

   /**
   * This value indicates whether keyword (tag) suggestions are available for the video. Tags can be added to a video's metadata to make it easier for other users to find the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
   * @return tagSuggestionsAvailability
  **/
  @ApiModelProperty(value = "This value indicates whether keyword (tag) suggestions are available for the video. Tags can be added to a video's metadata to make it easier for other users to find the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.")
  public String getTagSuggestionsAvailability() {
    return tagSuggestionsAvailability;
  }

  public void setTagSuggestionsAvailability(String tagSuggestionsAvailability) {
    this.tagSuggestionsAvailability = tagSuggestionsAvailability;
  }

  public VideoProcessingDetails thumbnailsAvailability(String thumbnailsAvailability) {
    this.thumbnailsAvailability = thumbnailsAvailability;
    return this;
  }

   /**
   * This value indicates whether thumbnail images have been generated for the video.
   * @return thumbnailsAvailability
  **/
  @ApiModelProperty(value = "This value indicates whether thumbnail images have been generated for the video.")
  public String getThumbnailsAvailability() {
    return thumbnailsAvailability;
  }

  public void setThumbnailsAvailability(String thumbnailsAvailability) {
    this.thumbnailsAvailability = thumbnailsAvailability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoProcessingDetails videoProcessingDetails = (VideoProcessingDetails) o;
    return Objects.equals(this.editorSuggestionsAvailability, videoProcessingDetails.editorSuggestionsAvailability) &&
        Objects.equals(this.fileDetailsAvailability, videoProcessingDetails.fileDetailsAvailability) &&
        Objects.equals(this.processingFailureReason, videoProcessingDetails.processingFailureReason) &&
        Objects.equals(this.processingIssuesAvailability, videoProcessingDetails.processingIssuesAvailability) &&
        Objects.equals(this.processingProgress, videoProcessingDetails.processingProgress) &&
        Objects.equals(this.processingStatus, videoProcessingDetails.processingStatus) &&
        Objects.equals(this.tagSuggestionsAvailability, videoProcessingDetails.tagSuggestionsAvailability) &&
        Objects.equals(this.thumbnailsAvailability, videoProcessingDetails.thumbnailsAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editorSuggestionsAvailability, fileDetailsAvailability, processingFailureReason, processingIssuesAvailability, processingProgress, processingStatus, tagSuggestionsAvailability, thumbnailsAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoProcessingDetails {\n");
    
    sb.append("    editorSuggestionsAvailability: ").append(toIndentedString(editorSuggestionsAvailability)).append("\n");
    sb.append("    fileDetailsAvailability: ").append(toIndentedString(fileDetailsAvailability)).append("\n");
    sb.append("    processingFailureReason: ").append(toIndentedString(processingFailureReason)).append("\n");
    sb.append("    processingIssuesAvailability: ").append(toIndentedString(processingIssuesAvailability)).append("\n");
    sb.append("    processingProgress: ").append(toIndentedString(processingProgress)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    tagSuggestionsAvailability: ").append(toIndentedString(tagSuggestionsAvailability)).append("\n");
    sb.append("    thumbnailsAvailability: ").append(toIndentedString(thumbnailsAvailability)).append("\n");
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

