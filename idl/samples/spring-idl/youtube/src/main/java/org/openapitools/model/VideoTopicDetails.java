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
 * Freebase topic information related to the video.
 */
@ApiModel(description = "Freebase topic information related to the video.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoTopicDetails   {
  @JsonProperty("relevantTopicIds")
  @Valid
  private List<String> relevantTopicIds = null;

  @JsonProperty("topicCategories")
  @Valid
  private List<String> topicCategories = null;

  @JsonProperty("topicIds")
  @Valid
  private List<String> topicIds = null;

  public VideoTopicDetails relevantTopicIds(List<String> relevantTopicIds) {
    this.relevantTopicIds = relevantTopicIds;
    return this;
  }

  public VideoTopicDetails addRelevantTopicIdsItem(String relevantTopicIdsItem) {
    if (this.relevantTopicIds == null) {
      this.relevantTopicIds = new ArrayList<>();
    }
    this.relevantTopicIds.add(relevantTopicIdsItem);
    return this;
  }

  /**
   * Similar to topic_id, except that these topics are merely relevant to the video. These are topics that may be mentioned in, or appear in the video. You can retrieve information about each topic using Freebase Topic API.
   * @return relevantTopicIds
  */
  @ApiModelProperty(value = "Similar to topic_id, except that these topics are merely relevant to the video. These are topics that may be mentioned in, or appear in the video. You can retrieve information about each topic using Freebase Topic API.")


  public List<String> getRelevantTopicIds() {
    return relevantTopicIds;
  }

  public void setRelevantTopicIds(List<String> relevantTopicIds) {
    this.relevantTopicIds = relevantTopicIds;
  }

  public VideoTopicDetails topicCategories(List<String> topicCategories) {
    this.topicCategories = topicCategories;
    return this;
  }

  public VideoTopicDetails addTopicCategoriesItem(String topicCategoriesItem) {
    if (this.topicCategories == null) {
      this.topicCategories = new ArrayList<>();
    }
    this.topicCategories.add(topicCategoriesItem);
    return this;
  }

  /**
   * A list of Wikipedia URLs that provide a high-level description of the video's content.
   * @return topicCategories
  */
  @ApiModelProperty(value = "A list of Wikipedia URLs that provide a high-level description of the video's content.")


  public List<String> getTopicCategories() {
    return topicCategories;
  }

  public void setTopicCategories(List<String> topicCategories) {
    this.topicCategories = topicCategories;
  }

  public VideoTopicDetails topicIds(List<String> topicIds) {
    this.topicIds = topicIds;
    return this;
  }

  public VideoTopicDetails addTopicIdsItem(String topicIdsItem) {
    if (this.topicIds == null) {
      this.topicIds = new ArrayList<>();
    }
    this.topicIds.add(topicIdsItem);
    return this;
  }

  /**
   * A list of Freebase topic IDs that are centrally associated with the video. These are topics that are centrally featured in the video, and it can be said that the video is mainly about each of these. You can retrieve information about each topic using the < a href=\"http://wiki.freebase.com/wiki/Topic_API\">Freebase Topic API.
   * @return topicIds
  */
  @ApiModelProperty(value = "A list of Freebase topic IDs that are centrally associated with the video. These are topics that are centrally featured in the video, and it can be said that the video is mainly about each of these. You can retrieve information about each topic using the < a href=\"http://wiki.freebase.com/wiki/Topic_API\">Freebase Topic API.")


  public List<String> getTopicIds() {
    return topicIds;
  }

  public void setTopicIds(List<String> topicIds) {
    this.topicIds = topicIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoTopicDetails videoTopicDetails = (VideoTopicDetails) o;
    return Objects.equals(this.relevantTopicIds, videoTopicDetails.relevantTopicIds) &&
        Objects.equals(this.topicCategories, videoTopicDetails.topicCategories) &&
        Objects.equals(this.topicIds, videoTopicDetails.topicIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relevantTopicIds, topicCategories, topicIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoTopicDetails {\n");
    
    sb.append("    relevantTopicIds: ").append(toIndentedString(relevantTopicIds)).append("\n");
    sb.append("    topicCategories: ").append(toIndentedString(topicCategories)).append("\n");
    sb.append("    topicIds: ").append(toIndentedString(topicIds)).append("\n");
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

