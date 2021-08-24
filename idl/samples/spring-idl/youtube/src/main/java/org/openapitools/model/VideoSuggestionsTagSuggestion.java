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
 * A single tag suggestion with it&#39;s relevance information.
 */
@ApiModel(description = "A single tag suggestion with it's relevance information.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class VideoSuggestionsTagSuggestion   {
  @JsonProperty("categoryRestricts")
  @Valid
  private List<String> categoryRestricts = null;

  @JsonProperty("tag")
  private String tag;

  public VideoSuggestionsTagSuggestion categoryRestricts(List<String> categoryRestricts) {
    this.categoryRestricts = categoryRestricts;
    return this;
  }

  public VideoSuggestionsTagSuggestion addCategoryRestrictsItem(String categoryRestrictsItem) {
    if (this.categoryRestricts == null) {
      this.categoryRestricts = new ArrayList<>();
    }
    this.categoryRestricts.add(categoryRestrictsItem);
    return this;
  }

  /**
   * A set of video categories for which the tag is relevant. You can use this information to display appropriate tag suggestions based on the video category that the video uploader associates with the video. By default, tag suggestions are relevant for all categories if there are no restricts defined for the keyword.
   * @return categoryRestricts
  */
  @ApiModelProperty(value = "A set of video categories for which the tag is relevant. You can use this information to display appropriate tag suggestions based on the video category that the video uploader associates with the video. By default, tag suggestions are relevant for all categories if there are no restricts defined for the keyword.")


  public List<String> getCategoryRestricts() {
    return categoryRestricts;
  }

  public void setCategoryRestricts(List<String> categoryRestricts) {
    this.categoryRestricts = categoryRestricts;
  }

  public VideoSuggestionsTagSuggestion tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The keyword tag suggested for the video.
   * @return tag
  */
  @ApiModelProperty(value = "The keyword tag suggested for the video.")


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoSuggestionsTagSuggestion videoSuggestionsTagSuggestion = (VideoSuggestionsTagSuggestion) o;
    return Objects.equals(this.categoryRestricts, videoSuggestionsTagSuggestion.categoryRestricts) &&
        Objects.equals(this.tag, videoSuggestionsTagSuggestion.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryRestricts, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoSuggestionsTagSuggestion {\n");
    
    sb.append("    categoryRestricts: ").append(toIndentedString(categoryRestricts)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

