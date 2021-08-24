package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.VideoFileDetailsAudioStream;
import org.openapitools.model.VideoFileDetailsVideoStream;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes original video file properties, including technical details about audio and video streams, but also metadata information like content length, digitization time, or geotagging information.
 */
@ApiModel(description = "Describes original video file properties, including technical details about audio and video streams, but also metadata information like content length, digitization time, or geotagging information.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoFileDetails   {
  @JsonProperty("audioStreams")
  @Valid
  private List<VideoFileDetailsAudioStream> audioStreams = null;

  @JsonProperty("bitrateBps")
  private String bitrateBps;

  @JsonProperty("container")
  private String container;

  @JsonProperty("creationTime")
  private String creationTime;

  @JsonProperty("durationMs")
  private String durationMs;

  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("fileSize")
  private String fileSize;

  /**
   * The uploaded file's type as detected by YouTube's video processing engine. Currently, YouTube only processes video files, but this field is present whether a video file or another type of file was uploaded.
   */
  public enum FileTypeEnum {
    VIDEO("video"),
    
    AUDIO("audio"),
    
    IMAGE("image"),
    
    ARCHIVE("archive"),
    
    DOCUMENT("document"),
    
    PROJECT("project"),
    
    OTHER("other");

    private String value;

    FileTypeEnum(String value) {
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
    public static FileTypeEnum fromValue(String value) {
      for (FileTypeEnum b : FileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("fileType")
  private FileTypeEnum fileType;

  @JsonProperty("videoStreams")
  @Valid
  private List<VideoFileDetailsVideoStream> videoStreams = null;

  public VideoFileDetails audioStreams(List<VideoFileDetailsAudioStream> audioStreams) {
    this.audioStreams = audioStreams;
    return this;
  }

  public VideoFileDetails addAudioStreamsItem(VideoFileDetailsAudioStream audioStreamsItem) {
    if (this.audioStreams == null) {
      this.audioStreams = new ArrayList<>();
    }
    this.audioStreams.add(audioStreamsItem);
    return this;
  }

  /**
   * A list of audio streams contained in the uploaded video file. Each item in the list contains detailed metadata about an audio stream.
   * @return audioStreams
  */
  @ApiModelProperty(value = "A list of audio streams contained in the uploaded video file. Each item in the list contains detailed metadata about an audio stream.")

  @Valid

  public List<VideoFileDetailsAudioStream> getAudioStreams() {
    return audioStreams;
  }

  public void setAudioStreams(List<VideoFileDetailsAudioStream> audioStreams) {
    this.audioStreams = audioStreams;
  }

  public VideoFileDetails bitrateBps(String bitrateBps) {
    this.bitrateBps = bitrateBps;
    return this;
  }

  /**
   * The uploaded video file's combined (video and audio) bitrate in bits per second.
   * @return bitrateBps
  */
  @ApiModelProperty(value = "The uploaded video file's combined (video and audio) bitrate in bits per second.")


  public String getBitrateBps() {
    return bitrateBps;
  }

  public void setBitrateBps(String bitrateBps) {
    this.bitrateBps = bitrateBps;
  }

  public VideoFileDetails container(String container) {
    this.container = container;
    return this;
  }

  /**
   * The uploaded video file's container format.
   * @return container
  */
  @ApiModelProperty(value = "The uploaded video file's container format.")


  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public VideoFileDetails creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The date and time when the uploaded video file was created. The value is specified in ISO 8601 format. Currently, the following ISO 8601 formats are supported: - Date only: YYYY-MM-DD - Naive time: YYYY-MM-DDTHH:MM:SS - Time with timezone: YYYY-MM-DDTHH:MM:SS+HH:MM 
   * @return creationTime
  */
  @ApiModelProperty(value = "The date and time when the uploaded video file was created. The value is specified in ISO 8601 format. Currently, the following ISO 8601 formats are supported: - Date only: YYYY-MM-DD - Naive time: YYYY-MM-DDTHH:MM:SS - Time with timezone: YYYY-MM-DDTHH:MM:SS+HH:MM ")


  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public VideoFileDetails durationMs(String durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * The length of the uploaded video in milliseconds.
   * @return durationMs
  */
  @ApiModelProperty(value = "The length of the uploaded video in milliseconds.")


  public String getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(String durationMs) {
    this.durationMs = durationMs;
  }

  public VideoFileDetails fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The uploaded file's name. This field is present whether a video file or another type of file was uploaded.
   * @return fileName
  */
  @ApiModelProperty(value = "The uploaded file's name. This field is present whether a video file or another type of file was uploaded.")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public VideoFileDetails fileSize(String fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * The uploaded file's size in bytes. This field is present whether a video file or another type of file was uploaded.
   * @return fileSize
  */
  @ApiModelProperty(value = "The uploaded file's size in bytes. This field is present whether a video file or another type of file was uploaded.")


  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  public VideoFileDetails fileType(FileTypeEnum fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * The uploaded file's type as detected by YouTube's video processing engine. Currently, YouTube only processes video files, but this field is present whether a video file or another type of file was uploaded.
   * @return fileType
  */
  @ApiModelProperty(value = "The uploaded file's type as detected by YouTube's video processing engine. Currently, YouTube only processes video files, but this field is present whether a video file or another type of file was uploaded.")


  public FileTypeEnum getFileType() {
    return fileType;
  }

  public void setFileType(FileTypeEnum fileType) {
    this.fileType = fileType;
  }

  public VideoFileDetails videoStreams(List<VideoFileDetailsVideoStream> videoStreams) {
    this.videoStreams = videoStreams;
    return this;
  }

  public VideoFileDetails addVideoStreamsItem(VideoFileDetailsVideoStream videoStreamsItem) {
    if (this.videoStreams == null) {
      this.videoStreams = new ArrayList<>();
    }
    this.videoStreams.add(videoStreamsItem);
    return this;
  }

  /**
   * A list of video streams contained in the uploaded video file. Each item in the list contains detailed metadata about a video stream.
   * @return videoStreams
  */
  @ApiModelProperty(value = "A list of video streams contained in the uploaded video file. Each item in the list contains detailed metadata about a video stream.")

  @Valid

  public List<VideoFileDetailsVideoStream> getVideoStreams() {
    return videoStreams;
  }

  public void setVideoStreams(List<VideoFileDetailsVideoStream> videoStreams) {
    this.videoStreams = videoStreams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoFileDetails videoFileDetails = (VideoFileDetails) o;
    return Objects.equals(this.audioStreams, videoFileDetails.audioStreams) &&
        Objects.equals(this.bitrateBps, videoFileDetails.bitrateBps) &&
        Objects.equals(this.container, videoFileDetails.container) &&
        Objects.equals(this.creationTime, videoFileDetails.creationTime) &&
        Objects.equals(this.durationMs, videoFileDetails.durationMs) &&
        Objects.equals(this.fileName, videoFileDetails.fileName) &&
        Objects.equals(this.fileSize, videoFileDetails.fileSize) &&
        Objects.equals(this.fileType, videoFileDetails.fileType) &&
        Objects.equals(this.videoStreams, videoFileDetails.videoStreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioStreams, bitrateBps, container, creationTime, durationMs, fileName, fileSize, fileType, videoStreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoFileDetails {\n");
    
    sb.append("    audioStreams: ").append(toIndentedString(audioStreams)).append("\n");
    sb.append("    bitrateBps: ").append(toIndentedString(bitrateBps)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    videoStreams: ").append(toIndentedString(videoStreams)).append("\n");
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

