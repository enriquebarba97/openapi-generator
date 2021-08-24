package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResourceId;

/**
 * Details about a social network post.
 */
@ApiModel(description = "Details about a social network post.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ActivityContentDetailsSocial   {
  @JsonProperty("author")
  private String author;

  @JsonProperty("imageUrl")
  private String imageUrl;

  @JsonProperty("referenceUrl")
  private String referenceUrl;

  @JsonProperty("resourceId")
  private ResourceId resourceId;

  /**
   * The name of the social network.
   */
  public enum TypeEnum {
    TYPEUNSPECIFIED("typeUnspecified"),
    
    GOOGLEPLUS("googlePlus"),
    
    FACEBOOK("facebook"),
    
    TWITTER("twitter");

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

  public ActivityContentDetailsSocial author(String author) {
    this.author = author;
    return this;
  }

   /**
   * The author of the social network post.
   * @return author
  **/
  @ApiModelProperty(value = "The author of the social network post.")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public ActivityContentDetailsSocial imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * An image of the post's author.
   * @return imageUrl
  **/
  @ApiModelProperty(value = "An image of the post's author.")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ActivityContentDetailsSocial referenceUrl(String referenceUrl) {
    this.referenceUrl = referenceUrl;
    return this;
  }

   /**
   * The URL of the social network post.
   * @return referenceUrl
  **/
  @ApiModelProperty(value = "The URL of the social network post.")
  public String getReferenceUrl() {
    return referenceUrl;
  }

  public void setReferenceUrl(String referenceUrl) {
    this.referenceUrl = referenceUrl;
  }

  public ActivityContentDetailsSocial resourceId(ResourceId resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getResourceId() {
    return resourceId;
  }

  public void setResourceId(ResourceId resourceId) {
    this.resourceId = resourceId;
  }

  public ActivityContentDetailsSocial type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The name of the social network.
   * @return type
  **/
  @ApiModelProperty(value = "The name of the social network.")
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
    ActivityContentDetailsSocial activityContentDetailsSocial = (ActivityContentDetailsSocial) o;
    return Objects.equals(this.author, activityContentDetailsSocial.author) &&
        Objects.equals(this.imageUrl, activityContentDetailsSocial.imageUrl) &&
        Objects.equals(this.referenceUrl, activityContentDetailsSocial.referenceUrl) &&
        Objects.equals(this.resourceId, activityContentDetailsSocial.resourceId) &&
        Objects.equals(this.type, activityContentDetailsSocial.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, imageUrl, referenceUrl, resourceId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityContentDetailsSocial {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    referenceUrl: ").append(toIndentedString(referenceUrl)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

