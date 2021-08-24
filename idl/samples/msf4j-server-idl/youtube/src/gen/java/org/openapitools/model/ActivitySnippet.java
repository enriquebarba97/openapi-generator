package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.ThumbnailDetails;

/**
 * Basic details about an activity, including title, description, thumbnails, activity type and group. Next ID: 12
 */
@ApiModel(description = "Basic details about an activity, including title, description, thumbnails, activity type and group. Next ID: 12")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ActivitySnippet   {
  @JsonProperty("channelId")
  private String channelId;

  @JsonProperty("channelTitle")
  private String channelTitle;

  @JsonProperty("description")
  private String description;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("publishedAt")
  private Date publishedAt;

  @JsonProperty("thumbnails")
  private ThumbnailDetails thumbnails;

  @JsonProperty("title")
  private String title;

  /**
   * The type of activity that the resource describes.
   */
  public enum TypeEnum {
    TYPEUNSPECIFIED("typeUnspecified"),
    
    UPLOAD("upload"),
    
    LIKE("like"),
    
    FAVORITE("favorite"),
    
    COMMENT("comment"),
    
    SUBSCRIPTION("subscription"),
    
    PLAYLISTITEM("playlistItem"),
    
    RECOMMENDATION("recommendation"),
    
    BULLETIN("bulletin"),
    
    SOCIAL("social"),
    
    CHANNELITEM("channelItem"),
    
    PROMOTEDITEM("promotedItem");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  public ActivitySnippet channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the channel associated with the activity.
   * @return channelId
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the channel associated with the activity.")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public ActivitySnippet channelTitle(String channelTitle) {
    this.channelTitle = channelTitle;
    return this;
  }

   /**
   * Channel title for the channel responsible for this activity
   * @return channelTitle
  **/
  @ApiModelProperty(value = "Channel title for the channel responsible for this activity")
  public String getChannelTitle() {
    return channelTitle;
  }

  public void setChannelTitle(String channelTitle) {
    this.channelTitle = channelTitle;
  }

  public ActivitySnippet description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the resource primarily associated with the activity. @mutable youtube.activities.insert
   * @return description
  **/
  @ApiModelProperty(value = "The description of the resource primarily associated with the activity. @mutable youtube.activities.insert")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ActivitySnippet groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group ID associated with the activity. A group ID identifies user events that are associated with the same user and resource. For example, if a user rates a video and marks the same video as a favorite, the entries for those events would have the same group ID in the user's activity feed. In your user interface, you can avoid repetition by grouping events with the same groupId value.
   * @return groupId
  **/
  @ApiModelProperty(value = "The group ID associated with the activity. A group ID identifies user events that are associated with the same user and resource. For example, if a user rates a video and marks the same video as a favorite, the entries for those events would have the same group ID in the user's activity feed. In your user interface, you can avoid repetition by grouping events with the same groupId value.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ActivitySnippet publishedAt(Date publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * The date and time that the video was uploaded.
   * @return publishedAt
  **/
  @ApiModelProperty(value = "The date and time that the video was uploaded.")
  public Date getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(Date publishedAt) {
    this.publishedAt = publishedAt;
  }

  public ActivitySnippet thumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

   /**
   * Get thumbnails
   * @return thumbnails
  **/
  @ApiModelProperty(value = "")
  public ThumbnailDetails getThumbnails() {
    return thumbnails;
  }

  public void setThumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
  }

  public ActivitySnippet title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the resource primarily associated with the activity.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the resource primarily associated with the activity.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ActivitySnippet type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of activity that the resource describes.
   * @return type
  **/
  @ApiModelProperty(value = "The type of activity that the resource describes.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivitySnippet activitySnippet = (ActivitySnippet) o;
    return Objects.equals(this.channelId, activitySnippet.channelId) &&
        Objects.equals(this.channelTitle, activitySnippet.channelTitle) &&
        Objects.equals(this.description, activitySnippet.description) &&
        Objects.equals(this.groupId, activitySnippet.groupId) &&
        Objects.equals(this.publishedAt, activitySnippet.publishedAt) &&
        Objects.equals(this.thumbnails, activitySnippet.thumbnails) &&
        Objects.equals(this.title, activitySnippet.title) &&
        Objects.equals(this.type, activitySnippet.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelTitle, description, groupId, publishedAt, thumbnails, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivitySnippet {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelTitle: ").append(toIndentedString(channelTitle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

