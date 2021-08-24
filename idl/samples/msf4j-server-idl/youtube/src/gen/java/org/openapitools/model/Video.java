package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.VideoAgeGating;
import org.openapitools.model.VideoContentDetails;
import org.openapitools.model.VideoFileDetails;
import org.openapitools.model.VideoLiveStreamingDetails;
import org.openapitools.model.VideoLocalization;
import org.openapitools.model.VideoMonetizationDetails;
import org.openapitools.model.VideoPlayer;
import org.openapitools.model.VideoProcessingDetails;
import org.openapitools.model.VideoRecordingDetails;
import org.openapitools.model.VideoSnippet;
import org.openapitools.model.VideoStatistics;
import org.openapitools.model.VideoStatus;
import org.openapitools.model.VideoSuggestions;
import org.openapitools.model.VideoTopicDetails;

/**
 * A *video* resource represents a YouTube video.
 */
@ApiModel(description = "A *video* resource represents a YouTube video.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class Video   {
  @JsonProperty("ageGating")
  private VideoAgeGating ageGating;

  @JsonProperty("contentDetails")
  private VideoContentDetails contentDetails;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("fileDetails")
  private VideoFileDetails fileDetails;

  @JsonProperty("id")
  private String id;

  @JsonProperty("kind")
  private String kind = "youtube#video";

  @JsonProperty("liveStreamingDetails")
  private VideoLiveStreamingDetails liveStreamingDetails;

  @JsonProperty("localizations")
  private Map<String, VideoLocalization> localizations = null;

  @JsonProperty("monetizationDetails")
  private VideoMonetizationDetails monetizationDetails;

  @JsonProperty("player")
  private VideoPlayer player;

  @JsonProperty("processingDetails")
  private VideoProcessingDetails processingDetails;

  @JsonProperty("projectDetails")
  private Object projectDetails;

  @JsonProperty("recordingDetails")
  private VideoRecordingDetails recordingDetails;

  @JsonProperty("snippet")
  private VideoSnippet snippet;

  @JsonProperty("statistics")
  private VideoStatistics statistics;

  @JsonProperty("status")
  private VideoStatus status;

  @JsonProperty("suggestions")
  private VideoSuggestions suggestions;

  @JsonProperty("topicDetails")
  private VideoTopicDetails topicDetails;

  public Video ageGating(VideoAgeGating ageGating) {
    this.ageGating = ageGating;
    return this;
  }

   /**
   * Get ageGating
   * @return ageGating
  **/
  @ApiModelProperty(value = "")
  public VideoAgeGating getAgeGating() {
    return ageGating;
  }

  public void setAgeGating(VideoAgeGating ageGating) {
    this.ageGating = ageGating;
  }

  public Video contentDetails(VideoContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

   /**
   * Get contentDetails
   * @return contentDetails
  **/
  @ApiModelProperty(value = "")
  public VideoContentDetails getContentDetails() {
    return contentDetails;
  }

  public void setContentDetails(VideoContentDetails contentDetails) {
    this.contentDetails = contentDetails;
  }

  public Video etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * Etag of this resource.
   * @return etag
  **/
  @ApiModelProperty(value = "Etag of this resource.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Video fileDetails(VideoFileDetails fileDetails) {
    this.fileDetails = fileDetails;
    return this;
  }

   /**
   * Get fileDetails
   * @return fileDetails
  **/
  @ApiModelProperty(value = "")
  public VideoFileDetails getFileDetails() {
    return fileDetails;
  }

  public void setFileDetails(VideoFileDetails fileDetails) {
    this.fileDetails = fileDetails;
  }

  public Video id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the video.
   * @return id
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the video.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Video kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Identifies what kind of resource this is. Value: the fixed string \"youtube#video\".
   * @return kind
  **/
  @ApiModelProperty(value = "Identifies what kind of resource this is. Value: the fixed string \"youtube#video\".")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Video liveStreamingDetails(VideoLiveStreamingDetails liveStreamingDetails) {
    this.liveStreamingDetails = liveStreamingDetails;
    return this;
  }

   /**
   * Get liveStreamingDetails
   * @return liveStreamingDetails
  **/
  @ApiModelProperty(value = "")
  public VideoLiveStreamingDetails getLiveStreamingDetails() {
    return liveStreamingDetails;
  }

  public void setLiveStreamingDetails(VideoLiveStreamingDetails liveStreamingDetails) {
    this.liveStreamingDetails = liveStreamingDetails;
  }

  public Video localizations(Map<String, VideoLocalization> localizations) {
    this.localizations = localizations;
    return this;
  }

  public Video putLocalizationsItem(String key, VideoLocalization localizationsItem) {
    if (this.localizations == null) {
      this.localizations = new HashMap<String, VideoLocalization>();
    }
    this.localizations.put(key, localizationsItem);
    return this;
  }

   /**
   * The localizations object contains localized versions of the basic details about the video, such as its title and description.
   * @return localizations
  **/
  @ApiModelProperty(value = "The localizations object contains localized versions of the basic details about the video, such as its title and description.")
  public Map<String, VideoLocalization> getLocalizations() {
    return localizations;
  }

  public void setLocalizations(Map<String, VideoLocalization> localizations) {
    this.localizations = localizations;
  }

  public Video monetizationDetails(VideoMonetizationDetails monetizationDetails) {
    this.monetizationDetails = monetizationDetails;
    return this;
  }

   /**
   * Get monetizationDetails
   * @return monetizationDetails
  **/
  @ApiModelProperty(value = "")
  public VideoMonetizationDetails getMonetizationDetails() {
    return monetizationDetails;
  }

  public void setMonetizationDetails(VideoMonetizationDetails monetizationDetails) {
    this.monetizationDetails = monetizationDetails;
  }

  public Video player(VideoPlayer player) {
    this.player = player;
    return this;
  }

   /**
   * Get player
   * @return player
  **/
  @ApiModelProperty(value = "")
  public VideoPlayer getPlayer() {
    return player;
  }

  public void setPlayer(VideoPlayer player) {
    this.player = player;
  }

  public Video processingDetails(VideoProcessingDetails processingDetails) {
    this.processingDetails = processingDetails;
    return this;
  }

   /**
   * Get processingDetails
   * @return processingDetails
  **/
  @ApiModelProperty(value = "")
  public VideoProcessingDetails getProcessingDetails() {
    return processingDetails;
  }

  public void setProcessingDetails(VideoProcessingDetails processingDetails) {
    this.processingDetails = processingDetails;
  }

  public Video projectDetails(Object projectDetails) {
    this.projectDetails = projectDetails;
    return this;
  }

   /**
   * DEPRECATED. b/157517979: This part was never populated after it was added. However, it sees non-zero traffic because there is generated client code in the wild that refers to it [1]. We keep this field and do NOT remove it because otherwise V3 would return an error when this part gets requested [2]. [1] https://developers.google.com/resources/api-libraries/documentation/youtube/v3/csharp/latest/classGoogle_1_1Apis_1_1YouTube_1_1v3_1_1Data_1_1VideoProjectDetails.html [2] http://google3/video/youtube/src/python/servers/data_api/common.py?l=1565-1569&rcl=344141677
   * @return projectDetails
  **/
  @ApiModelProperty(value = "DEPRECATED. b/157517979: This part was never populated after it was added. However, it sees non-zero traffic because there is generated client code in the wild that refers to it [1]. We keep this field and do NOT remove it because otherwise V3 would return an error when this part gets requested [2]. [1] https://developers.google.com/resources/api-libraries/documentation/youtube/v3/csharp/latest/classGoogle_1_1Apis_1_1YouTube_1_1v3_1_1Data_1_1VideoProjectDetails.html [2] http://google3/video/youtube/src/python/servers/data_api/common.py?l=1565-1569&rcl=344141677")
  public Object getProjectDetails() {
    return projectDetails;
  }

  public void setProjectDetails(Object projectDetails) {
    this.projectDetails = projectDetails;
  }

  public Video recordingDetails(VideoRecordingDetails recordingDetails) {
    this.recordingDetails = recordingDetails;
    return this;
  }

   /**
   * Get recordingDetails
   * @return recordingDetails
  **/
  @ApiModelProperty(value = "")
  public VideoRecordingDetails getRecordingDetails() {
    return recordingDetails;
  }

  public void setRecordingDetails(VideoRecordingDetails recordingDetails) {
    this.recordingDetails = recordingDetails;
  }

  public Video snippet(VideoSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @ApiModelProperty(value = "")
  public VideoSnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(VideoSnippet snippet) {
    this.snippet = snippet;
  }

  public Video statistics(VideoStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(value = "")
  public VideoStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(VideoStatistics statistics) {
    this.statistics = statistics;
  }

  public Video status(VideoStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public VideoStatus getStatus() {
    return status;
  }

  public void setStatus(VideoStatus status) {
    this.status = status;
  }

  public Video suggestions(VideoSuggestions suggestions) {
    this.suggestions = suggestions;
    return this;
  }

   /**
   * Get suggestions
   * @return suggestions
  **/
  @ApiModelProperty(value = "")
  public VideoSuggestions getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(VideoSuggestions suggestions) {
    this.suggestions = suggestions;
  }

  public Video topicDetails(VideoTopicDetails topicDetails) {
    this.topicDetails = topicDetails;
    return this;
  }

   /**
   * Get topicDetails
   * @return topicDetails
  **/
  @ApiModelProperty(value = "")
  public VideoTopicDetails getTopicDetails() {
    return topicDetails;
  }

  public void setTopicDetails(VideoTopicDetails topicDetails) {
    this.topicDetails = topicDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.ageGating, video.ageGating) &&
        Objects.equals(this.contentDetails, video.contentDetails) &&
        Objects.equals(this.etag, video.etag) &&
        Objects.equals(this.fileDetails, video.fileDetails) &&
        Objects.equals(this.id, video.id) &&
        Objects.equals(this.kind, video.kind) &&
        Objects.equals(this.liveStreamingDetails, video.liveStreamingDetails) &&
        Objects.equals(this.localizations, video.localizations) &&
        Objects.equals(this.monetizationDetails, video.monetizationDetails) &&
        Objects.equals(this.player, video.player) &&
        Objects.equals(this.processingDetails, video.processingDetails) &&
        Objects.equals(this.projectDetails, video.projectDetails) &&
        Objects.equals(this.recordingDetails, video.recordingDetails) &&
        Objects.equals(this.snippet, video.snippet) &&
        Objects.equals(this.statistics, video.statistics) &&
        Objects.equals(this.status, video.status) &&
        Objects.equals(this.suggestions, video.suggestions) &&
        Objects.equals(this.topicDetails, video.topicDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageGating, contentDetails, etag, fileDetails, id, kind, liveStreamingDetails, localizations, monetizationDetails, player, processingDetails, projectDetails, recordingDetails, snippet, statistics, status, suggestions, topicDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("    ageGating: ").append(toIndentedString(ageGating)).append("\n");
    sb.append("    contentDetails: ").append(toIndentedString(contentDetails)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    fileDetails: ").append(toIndentedString(fileDetails)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    liveStreamingDetails: ").append(toIndentedString(liveStreamingDetails)).append("\n");
    sb.append("    localizations: ").append(toIndentedString(localizations)).append("\n");
    sb.append("    monetizationDetails: ").append(toIndentedString(monetizationDetails)).append("\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
    sb.append("    processingDetails: ").append(toIndentedString(processingDetails)).append("\n");
    sb.append("    projectDetails: ").append(toIndentedString(projectDetails)).append("\n");
    sb.append("    recordingDetails: ").append(toIndentedString(recordingDetails)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    topicDetails: ").append(toIndentedString(topicDetails)).append("\n");
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

