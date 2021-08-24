package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccessPolicy;
import org.openapitools.model.ContentRating;
import org.openapitools.model.VideoContentDetailsRegionRestriction;

/**
 * Details about the content of a YouTube Video.
 */
@ApiModel(description = "Details about the content of a YouTube Video.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class VideoContentDetails   {
  /**
   * The value of captions indicates whether the video has captions or not.
   */
  public enum CaptionEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    CaptionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CaptionEnum fromValue(String text) {
      for (CaptionEnum b : CaptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("caption")
  private CaptionEnum caption;

  @JsonProperty("contentRating")
  private ContentRating contentRating;

  @JsonProperty("countryRestriction")
  private AccessPolicy countryRestriction;

  /**
   * The value of definition indicates whether the video is available in high definition or only in standard definition.
   */
  public enum DefinitionEnum {
    SD("sd"),
    
    HD("hd");

    private String value;

    DefinitionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DefinitionEnum fromValue(String text) {
      for (DefinitionEnum b : DefinitionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("definition")
  private DefinitionEnum definition;

  @JsonProperty("dimension")
  private String dimension;

  @JsonProperty("duration")
  private String duration;

  @JsonProperty("hasCustomThumbnail")
  private Boolean hasCustomThumbnail;

  @JsonProperty("licensedContent")
  private Boolean licensedContent;

  /**
   * Specifies the projection format of the video.
   */
  public enum ProjectionEnum {
    RECTANGULAR("rectangular"),
    
    _360("360");

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

  @JsonProperty("regionRestriction")
  private VideoContentDetailsRegionRestriction regionRestriction;

  public VideoContentDetails caption(CaptionEnum caption) {
    this.caption = caption;
    return this;
  }

   /**
   * The value of captions indicates whether the video has captions or not.
   * @return caption
  **/
  @ApiModelProperty(value = "The value of captions indicates whether the video has captions or not.")
  public CaptionEnum getCaption() {
    return caption;
  }

  public void setCaption(CaptionEnum caption) {
    this.caption = caption;
  }

  public VideoContentDetails contentRating(ContentRating contentRating) {
    this.contentRating = contentRating;
    return this;
  }

   /**
   * Get contentRating
   * @return contentRating
  **/
  @ApiModelProperty(value = "")
  public ContentRating getContentRating() {
    return contentRating;
  }

  public void setContentRating(ContentRating contentRating) {
    this.contentRating = contentRating;
  }

  public VideoContentDetails countryRestriction(AccessPolicy countryRestriction) {
    this.countryRestriction = countryRestriction;
    return this;
  }

   /**
   * Get countryRestriction
   * @return countryRestriction
  **/
  @ApiModelProperty(value = "")
  public AccessPolicy getCountryRestriction() {
    return countryRestriction;
  }

  public void setCountryRestriction(AccessPolicy countryRestriction) {
    this.countryRestriction = countryRestriction;
  }

  public VideoContentDetails definition(DefinitionEnum definition) {
    this.definition = definition;
    return this;
  }

   /**
   * The value of definition indicates whether the video is available in high definition or only in standard definition.
   * @return definition
  **/
  @ApiModelProperty(value = "The value of definition indicates whether the video is available in high definition or only in standard definition.")
  public DefinitionEnum getDefinition() {
    return definition;
  }

  public void setDefinition(DefinitionEnum definition) {
    this.definition = definition;
  }

  public VideoContentDetails dimension(String dimension) {
    this.dimension = dimension;
    return this;
  }

   /**
   * The value of dimension indicates whether the video is available in 3D or in 2D.
   * @return dimension
  **/
  @ApiModelProperty(value = "The value of dimension indicates whether the video is available in 3D or in 2D.")
  public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  public VideoContentDetails duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The length of the video. The tag value is an ISO 8601 duration in the format PT#M#S, in which the letters PT indicate that the value specifies a period of time, and the letters M and S refer to length in minutes and seconds, respectively. The # characters preceding the M and S letters are both integers that specify the number of minutes (or seconds) of the video. For example, a value of PT15M51S indicates that the video is 15 minutes and 51 seconds long.
   * @return duration
  **/
  @ApiModelProperty(value = "The length of the video. The tag value is an ISO 8601 duration in the format PT#M#S, in which the letters PT indicate that the value specifies a period of time, and the letters M and S refer to length in minutes and seconds, respectively. The # characters preceding the M and S letters are both integers that specify the number of minutes (or seconds) of the video. For example, a value of PT15M51S indicates that the video is 15 minutes and 51 seconds long.")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public VideoContentDetails hasCustomThumbnail(Boolean hasCustomThumbnail) {
    this.hasCustomThumbnail = hasCustomThumbnail;
    return this;
  }

   /**
   * Indicates whether the video uploader has provided a custom thumbnail image for the video. This property is only visible to the video uploader.
   * @return hasCustomThumbnail
  **/
  @ApiModelProperty(value = "Indicates whether the video uploader has provided a custom thumbnail image for the video. This property is only visible to the video uploader.")
  public Boolean getHasCustomThumbnail() {
    return hasCustomThumbnail;
  }

  public void setHasCustomThumbnail(Boolean hasCustomThumbnail) {
    this.hasCustomThumbnail = hasCustomThumbnail;
  }

  public VideoContentDetails licensedContent(Boolean licensedContent) {
    this.licensedContent = licensedContent;
    return this;
  }

   /**
   * The value of is_license_content indicates whether the video is licensed content.
   * @return licensedContent
  **/
  @ApiModelProperty(value = "The value of is_license_content indicates whether the video is licensed content.")
  public Boolean getLicensedContent() {
    return licensedContent;
  }

  public void setLicensedContent(Boolean licensedContent) {
    this.licensedContent = licensedContent;
  }

  public VideoContentDetails projection(ProjectionEnum projection) {
    this.projection = projection;
    return this;
  }

   /**
   * Specifies the projection format of the video.
   * @return projection
  **/
  @ApiModelProperty(value = "Specifies the projection format of the video.")
  public ProjectionEnum getProjection() {
    return projection;
  }

  public void setProjection(ProjectionEnum projection) {
    this.projection = projection;
  }

  public VideoContentDetails regionRestriction(VideoContentDetailsRegionRestriction regionRestriction) {
    this.regionRestriction = regionRestriction;
    return this;
  }

   /**
   * Get regionRestriction
   * @return regionRestriction
  **/
  @ApiModelProperty(value = "")
  public VideoContentDetailsRegionRestriction getRegionRestriction() {
    return regionRestriction;
  }

  public void setRegionRestriction(VideoContentDetailsRegionRestriction regionRestriction) {
    this.regionRestriction = regionRestriction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoContentDetails videoContentDetails = (VideoContentDetails) o;
    return Objects.equals(this.caption, videoContentDetails.caption) &&
        Objects.equals(this.contentRating, videoContentDetails.contentRating) &&
        Objects.equals(this.countryRestriction, videoContentDetails.countryRestriction) &&
        Objects.equals(this.definition, videoContentDetails.definition) &&
        Objects.equals(this.dimension, videoContentDetails.dimension) &&
        Objects.equals(this.duration, videoContentDetails.duration) &&
        Objects.equals(this.hasCustomThumbnail, videoContentDetails.hasCustomThumbnail) &&
        Objects.equals(this.licensedContent, videoContentDetails.licensedContent) &&
        Objects.equals(this.projection, videoContentDetails.projection) &&
        Objects.equals(this.regionRestriction, videoContentDetails.regionRestriction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, contentRating, countryRestriction, definition, dimension, duration, hasCustomThumbnail, licensedContent, projection, regionRestriction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoContentDetails {\n");
    
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    contentRating: ").append(toIndentedString(contentRating)).append("\n");
    sb.append("    countryRestriction: ").append(toIndentedString(countryRestriction)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    hasCustomThumbnail: ").append(toIndentedString(hasCustomThumbnail)).append("\n");
    sb.append("    licensedContent: ").append(toIndentedString(licensedContent)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    regionRestriction: ").append(toIndentedString(regionRestriction)).append("\n");
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

