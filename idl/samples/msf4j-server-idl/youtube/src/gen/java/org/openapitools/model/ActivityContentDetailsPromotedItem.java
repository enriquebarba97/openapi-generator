package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Details about a resource which is being promoted.
 */
@ApiModel(description = "Details about a resource which is being promoted.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ActivityContentDetailsPromotedItem   {
  @JsonProperty("adTag")
  private String adTag;

  @JsonProperty("clickTrackingUrl")
  private String clickTrackingUrl;

  @JsonProperty("creativeViewUrl")
  private String creativeViewUrl;

  /**
   * The type of call-to-action, a message to the user indicating action that can be taken.
   */
  public enum CtaTypeEnum {
    CTATYPEUNSPECIFIED("ctaTypeUnspecified"),
    
    VISITADVERTISERSITE("visitAdvertiserSite");

    private String value;

    CtaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CtaTypeEnum fromValue(String text) {
      for (CtaTypeEnum b : CtaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("ctaType")
  private CtaTypeEnum ctaType;

  @JsonProperty("customCtaButtonText")
  private String customCtaButtonText;

  @JsonProperty("descriptionText")
  private String descriptionText;

  @JsonProperty("destinationUrl")
  private String destinationUrl;

  @JsonProperty("forecastingUrl")
  private List<String> forecastingUrl = null;

  @JsonProperty("impressionUrl")
  private List<String> impressionUrl = null;

  @JsonProperty("videoId")
  private String videoId;

  public ActivityContentDetailsPromotedItem adTag(String adTag) {
    this.adTag = adTag;
    return this;
  }

   /**
   * The URL the client should fetch to request a promoted item.
   * @return adTag
  **/
  @ApiModelProperty(value = "The URL the client should fetch to request a promoted item.")
  public String getAdTag() {
    return adTag;
  }

  public void setAdTag(String adTag) {
    this.adTag = adTag;
  }

  public ActivityContentDetailsPromotedItem clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

   /**
   * The URL the client should ping to indicate that the user clicked through on this promoted item.
   * @return clickTrackingUrl
  **/
  @ApiModelProperty(value = "The URL the client should ping to indicate that the user clicked through on this promoted item.")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public ActivityContentDetailsPromotedItem creativeViewUrl(String creativeViewUrl) {
    this.creativeViewUrl = creativeViewUrl;
    return this;
  }

   /**
   * The URL the client should ping to indicate that the user was shown this promoted item.
   * @return creativeViewUrl
  **/
  @ApiModelProperty(value = "The URL the client should ping to indicate that the user was shown this promoted item.")
  public String getCreativeViewUrl() {
    return creativeViewUrl;
  }

  public void setCreativeViewUrl(String creativeViewUrl) {
    this.creativeViewUrl = creativeViewUrl;
  }

  public ActivityContentDetailsPromotedItem ctaType(CtaTypeEnum ctaType) {
    this.ctaType = ctaType;
    return this;
  }

   /**
   * The type of call-to-action, a message to the user indicating action that can be taken.
   * @return ctaType
  **/
  @ApiModelProperty(value = "The type of call-to-action, a message to the user indicating action that can be taken.")
  public CtaTypeEnum getCtaType() {
    return ctaType;
  }

  public void setCtaType(CtaTypeEnum ctaType) {
    this.ctaType = ctaType;
  }

  public ActivityContentDetailsPromotedItem customCtaButtonText(String customCtaButtonText) {
    this.customCtaButtonText = customCtaButtonText;
    return this;
  }

   /**
   * The custom call-to-action button text. If specified, it will override the default button text for the cta_type.
   * @return customCtaButtonText
  **/
  @ApiModelProperty(value = "The custom call-to-action button text. If specified, it will override the default button text for the cta_type.")
  public String getCustomCtaButtonText() {
    return customCtaButtonText;
  }

  public void setCustomCtaButtonText(String customCtaButtonText) {
    this.customCtaButtonText = customCtaButtonText;
  }

  public ActivityContentDetailsPromotedItem descriptionText(String descriptionText) {
    this.descriptionText = descriptionText;
    return this;
  }

   /**
   * The text description to accompany the promoted item.
   * @return descriptionText
  **/
  @ApiModelProperty(value = "The text description to accompany the promoted item.")
  public String getDescriptionText() {
    return descriptionText;
  }

  public void setDescriptionText(String descriptionText) {
    this.descriptionText = descriptionText;
  }

  public ActivityContentDetailsPromotedItem destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

   /**
   * The URL the client should direct the user to, if the user chooses to visit the advertiser's website.
   * @return destinationUrl
  **/
  @ApiModelProperty(value = "The URL the client should direct the user to, if the user chooses to visit the advertiser's website.")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public ActivityContentDetailsPromotedItem forecastingUrl(List<String> forecastingUrl) {
    this.forecastingUrl = forecastingUrl;
    return this;
  }

  public ActivityContentDetailsPromotedItem addForecastingUrlItem(String forecastingUrlItem) {
    if (this.forecastingUrl == null) {
      this.forecastingUrl = new ArrayList<String>();
    }
    this.forecastingUrl.add(forecastingUrlItem);
    return this;
  }

   /**
   * The list of forecasting URLs. The client should ping all of these URLs when a promoted item is not available, to indicate that a promoted item could have been shown.
   * @return forecastingUrl
  **/
  @ApiModelProperty(value = "The list of forecasting URLs. The client should ping all of these URLs when a promoted item is not available, to indicate that a promoted item could have been shown.")
  public List<String> getForecastingUrl() {
    return forecastingUrl;
  }

  public void setForecastingUrl(List<String> forecastingUrl) {
    this.forecastingUrl = forecastingUrl;
  }

  public ActivityContentDetailsPromotedItem impressionUrl(List<String> impressionUrl) {
    this.impressionUrl = impressionUrl;
    return this;
  }

  public ActivityContentDetailsPromotedItem addImpressionUrlItem(String impressionUrlItem) {
    if (this.impressionUrl == null) {
      this.impressionUrl = new ArrayList<String>();
    }
    this.impressionUrl.add(impressionUrlItem);
    return this;
  }

   /**
   * The list of impression URLs. The client should ping all of these URLs to indicate that the user was shown this promoted item.
   * @return impressionUrl
  **/
  @ApiModelProperty(value = "The list of impression URLs. The client should ping all of these URLs to indicate that the user was shown this promoted item.")
  public List<String> getImpressionUrl() {
    return impressionUrl;
  }

  public void setImpressionUrl(List<String> impressionUrl) {
    this.impressionUrl = impressionUrl;
  }

  public ActivityContentDetailsPromotedItem videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the promoted video.
   * @return videoId
  **/
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the promoted video.")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityContentDetailsPromotedItem activityContentDetailsPromotedItem = (ActivityContentDetailsPromotedItem) o;
    return Objects.equals(this.adTag, activityContentDetailsPromotedItem.adTag) &&
        Objects.equals(this.clickTrackingUrl, activityContentDetailsPromotedItem.clickTrackingUrl) &&
        Objects.equals(this.creativeViewUrl, activityContentDetailsPromotedItem.creativeViewUrl) &&
        Objects.equals(this.ctaType, activityContentDetailsPromotedItem.ctaType) &&
        Objects.equals(this.customCtaButtonText, activityContentDetailsPromotedItem.customCtaButtonText) &&
        Objects.equals(this.descriptionText, activityContentDetailsPromotedItem.descriptionText) &&
        Objects.equals(this.destinationUrl, activityContentDetailsPromotedItem.destinationUrl) &&
        Objects.equals(this.forecastingUrl, activityContentDetailsPromotedItem.forecastingUrl) &&
        Objects.equals(this.impressionUrl, activityContentDetailsPromotedItem.impressionUrl) &&
        Objects.equals(this.videoId, activityContentDetailsPromotedItem.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adTag, clickTrackingUrl, creativeViewUrl, ctaType, customCtaButtonText, descriptionText, destinationUrl, forecastingUrl, impressionUrl, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityContentDetailsPromotedItem {\n");
    
    sb.append("    adTag: ").append(toIndentedString(adTag)).append("\n");
    sb.append("    clickTrackingUrl: ").append(toIndentedString(clickTrackingUrl)).append("\n");
    sb.append("    creativeViewUrl: ").append(toIndentedString(creativeViewUrl)).append("\n");
    sb.append("    ctaType: ").append(toIndentedString(ctaType)).append("\n");
    sb.append("    customCtaButtonText: ").append(toIndentedString(customCtaButtonText)).append("\n");
    sb.append("    descriptionText: ").append(toIndentedString(descriptionText)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    forecastingUrl: ").append(toIndentedString(forecastingUrl)).append("\n");
    sb.append("    impressionUrl: ").append(toIndentedString(impressionUrl)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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

