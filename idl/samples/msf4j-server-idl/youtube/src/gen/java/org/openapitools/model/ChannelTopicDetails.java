package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Freebase topic information related to the channel.
 */
@ApiModel(description = "Freebase topic information related to the channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ChannelTopicDetails   {
  @JsonProperty("topicCategories")
  private List<String> topicCategories = null;

  @JsonProperty("topicIds")
  private List<String> topicIds = null;

  public ChannelTopicDetails topicCategories(List<String> topicCategories) {
    this.topicCategories = topicCategories;
    return this;
  }

  public ChannelTopicDetails addTopicCategoriesItem(String topicCategoriesItem) {
    if (this.topicCategories == null) {
      this.topicCategories = new ArrayList<String>();
    }
    this.topicCategories.add(topicCategoriesItem);
    return this;
  }

   /**
   * A list of Wikipedia URLs that describe the channel's content.
   * @return topicCategories
  **/
  @ApiModelProperty(value = "A list of Wikipedia URLs that describe the channel's content.")
  public List<String> getTopicCategories() {
    return topicCategories;
  }

  public void setTopicCategories(List<String> topicCategories) {
    this.topicCategories = topicCategories;
  }

  public ChannelTopicDetails topicIds(List<String> topicIds) {
    this.topicIds = topicIds;
    return this;
  }

  public ChannelTopicDetails addTopicIdsItem(String topicIdsItem) {
    if (this.topicIds == null) {
      this.topicIds = new ArrayList<String>();
    }
    this.topicIds.add(topicIdsItem);
    return this;
  }

   /**
   * A list of Freebase topic IDs associated with the channel. You can retrieve information about each topic using the Freebase Topic API.
   * @return topicIds
  **/
  @ApiModelProperty(value = "A list of Freebase topic IDs associated with the channel. You can retrieve information about each topic using the Freebase Topic API.")
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
    ChannelTopicDetails channelTopicDetails = (ChannelTopicDetails) o;
    return Objects.equals(this.topicCategories, channelTopicDetails.topicCategories) &&
        Objects.equals(this.topicIds, channelTopicDetails.topicIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicCategories, topicIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelTopicDetails {\n");
    
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

