package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LocalizedProperty;

/**
 * Branding properties for images associated with the channel.
 */
@ApiModel(description = "Branding properties for images associated with the channel.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ImageSettings   {
  @JsonProperty("backgroundImageUrl")
  private LocalizedProperty backgroundImageUrl;

  @JsonProperty("bannerExternalUrl")
  private String bannerExternalUrl;

  @JsonProperty("bannerImageUrl")
  private String bannerImageUrl;

  @JsonProperty("bannerMobileExtraHdImageUrl")
  private String bannerMobileExtraHdImageUrl;

  @JsonProperty("bannerMobileHdImageUrl")
  private String bannerMobileHdImageUrl;

  @JsonProperty("bannerMobileImageUrl")
  private String bannerMobileImageUrl;

  @JsonProperty("bannerMobileLowImageUrl")
  private String bannerMobileLowImageUrl;

  @JsonProperty("bannerMobileMediumHdImageUrl")
  private String bannerMobileMediumHdImageUrl;

  @JsonProperty("bannerTabletExtraHdImageUrl")
  private String bannerTabletExtraHdImageUrl;

  @JsonProperty("bannerTabletHdImageUrl")
  private String bannerTabletHdImageUrl;

  @JsonProperty("bannerTabletImageUrl")
  private String bannerTabletImageUrl;

  @JsonProperty("bannerTabletLowImageUrl")
  private String bannerTabletLowImageUrl;

  @JsonProperty("bannerTvHighImageUrl")
  private String bannerTvHighImageUrl;

  @JsonProperty("bannerTvImageUrl")
  private String bannerTvImageUrl;

  @JsonProperty("bannerTvLowImageUrl")
  private String bannerTvLowImageUrl;

  @JsonProperty("bannerTvMediumImageUrl")
  private String bannerTvMediumImageUrl;

  @JsonProperty("largeBrandedBannerImageImapScript")
  private LocalizedProperty largeBrandedBannerImageImapScript;

  @JsonProperty("largeBrandedBannerImageUrl")
  private LocalizedProperty largeBrandedBannerImageUrl;

  @JsonProperty("smallBrandedBannerImageImapScript")
  private LocalizedProperty smallBrandedBannerImageImapScript;

  @JsonProperty("smallBrandedBannerImageUrl")
  private LocalizedProperty smallBrandedBannerImageUrl;

  @JsonProperty("trackingImageUrl")
  private String trackingImageUrl;

  @JsonProperty("watchIconImageUrl")
  private String watchIconImageUrl;

  public ImageSettings backgroundImageUrl(LocalizedProperty backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
    return this;
  }

   /**
   * Get backgroundImageUrl
   * @return backgroundImageUrl
  **/
  @ApiModelProperty(value = "")
  public LocalizedProperty getBackgroundImageUrl() {
    return backgroundImageUrl;
  }

  public void setBackgroundImageUrl(LocalizedProperty backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }

  public ImageSettings bannerExternalUrl(String bannerExternalUrl) {
    this.bannerExternalUrl = bannerExternalUrl;
    return this;
  }

   /**
   * This is generated when a ChannelBanner.Insert request has succeeded for the given channel.
   * @return bannerExternalUrl
  **/
  @ApiModelProperty(value = "This is generated when a ChannelBanner.Insert request has succeeded for the given channel.")
  public String getBannerExternalUrl() {
    return bannerExternalUrl;
  }

  public void setBannerExternalUrl(String bannerExternalUrl) {
    this.bannerExternalUrl = bannerExternalUrl;
  }

  public ImageSettings bannerImageUrl(String bannerImageUrl) {
    this.bannerImageUrl = bannerImageUrl;
    return this;
  }

   /**
   * Banner image. Desktop size (1060x175).
   * @return bannerImageUrl
  **/
  @ApiModelProperty(value = "Banner image. Desktop size (1060x175).")
  public String getBannerImageUrl() {
    return bannerImageUrl;
  }

  public void setBannerImageUrl(String bannerImageUrl) {
    this.bannerImageUrl = bannerImageUrl;
  }

  public ImageSettings bannerMobileExtraHdImageUrl(String bannerMobileExtraHdImageUrl) {
    this.bannerMobileExtraHdImageUrl = bannerMobileExtraHdImageUrl;
    return this;
  }

   /**
   * Banner image. Mobile size high resolution (1440x395).
   * @return bannerMobileExtraHdImageUrl
  **/
  @ApiModelProperty(value = "Banner image. Mobile size high resolution (1440x395).")
  public String getBannerMobileExtraHdImageUrl() {
    return bannerMobileExtraHdImageUrl;
  }

  public void setBannerMobileExtraHdImageUrl(String bannerMobileExtraHdImageUrl) {
    this.bannerMobileExtraHdImageUrl = bannerMobileExtraHdImageUrl;
  }

  public ImageSettings bannerMobileHdImageUrl(String bannerMobileHdImageUrl) {
    this.bannerMobileHdImageUrl = bannerMobileHdImageUrl;
    return this;
  }

   /**
   * Banner image. Mobile size high resolution (1280x360).
   * @return bannerMobileHdImageUrl
  **/
  @ApiModelProperty(value = "Banner image. Mobile size high resolution (1280x360).")
  public String getBannerMobileHdImageUrl() {
    return bannerMobileHdImageUrl;
  }

  public void setBannerMobileHdImageUrl(String bannerMobileHdImageUrl) {
    this.bannerMobileHdImageUrl = bannerMobileHdImageUrl;
  }

  public ImageSettings bannerMobileImageUrl(String bannerMobileImageUrl) {
    this.bannerMobileImageUrl = bannerMobileImageUrl;
    return this;
  }

   /**
   * Banner image. Mobile size (640x175).
   * @return bannerMobileImageUrl
  **/
  @ApiModelProperty(value = "Banner image. Mobile size (640x175).")
  public String getBannerMobileImageUrl() {
    return bannerMobileImageUrl;
  }

  public void setBannerMobileImageUrl(String bannerMobileImageUrl) {
    this.bannerMobileImageUrl = bannerMobileImageUrl;
  }

  public ImageSettings bannerMobileLowImageUrl(String bannerMobileLowImageUrl) {
    this.bannerMobileLowImageUrl = bannerMobileLowImageUrl;
    return this;
  }

   /**
   * Banner image. Mobile size low resolution (320x88).
   * @return bannerMobileLowImageUrl
  **/
  @ApiModelProperty(value = "Banner image. Mobile size low resolution (320x88).")
  public String getBannerMobileLowImageUrl() {
    return bannerMobileLowImageUrl;
  }

  public void setBannerMobileLowImageUrl(String bannerMobileLowImageUrl) {
    this.bannerMobileLowImageUrl = bannerMobileLowImageUrl;
  }

  public ImageSettings bannerMobileMediumHdImageUrl(String bannerMobileMediumHdImageUrl) {
    this.bannerMobileMediumHdImageUrl = bannerMobileMediumHdImageUrl;
    return this;
  }

   /**
   * Banner image. Mobile size medium/high resolution (960x263).
   * @return bannerMobileMediumHdImageUrl
  **/
  @ApiModelProperty(value = "Banner image. Mobile size medium/high resolution (960x263).")
  public String getBannerMobileMediumHdImageUrl() {
    return bannerMobileMediumHdImageUrl;
  }

  public void setBannerMobileMediumHdImageUrl(String bannerMobileMediumHdImageUrl) {
    this.bannerMobileMediumHdImageUrl = bannerMobileMediumHdImageUrl;
  }

  public ImageSettings bannerTabletExtraHdImageUrl(String bannerTabletExtraHdImageUrl) {
    this.bannerTabletExtraHdImageUrl = bannerTabletExtraHdImageUrl;
    return this;
  }

   /**
   * Banner image. Tablet size extra high resolution (2560x424).
   * @return bannerTabletExtraHdImageUrl
  **/
  @ApiModelProperty(value = "Banner image. Tablet size extra high resolution (2560x424).")
  public String getBannerTabletExtraHdImageUrl() {
    return bannerTabletExtraHdImageUrl;
  }

  public void setBannerTabletExtraHdImageUrl(String bannerTabletExtraHdImageUrl) {
    this.bannerTabletExtraHdImageUrl = bannerTabletExtraHdImageUrl;
  }

  public ImageSettings bannerTabletHdImageUrl(String bannerTabletHdImageUrl) {
    this.bannerTabletHdImageUrl = bannerTabletHdImageUrl;
    return this;
  }

   /**
   * Banner image. Tablet size high resolution (2276x377).
   * @return bannerTabletHdImageUrl
  **/
  @ApiModelProperty(value = "Banner image. Tablet size high resolution (2276x377).")
  public String getBannerTabletHdImageUrl() {
    return bannerTabletHdImageUrl;
  }

  public void setBannerTabletHdImageUrl(String bannerTabletHdImageUrl) {
    this.bannerTabletHdImageUrl = bannerTabletHdImageUrl;
  }

  public ImageSettings bannerTabletImageUrl(String bannerTabletImageUrl) {
    this.bannerTabletImageUrl = bannerTabletImageUrl;
    return this;
  }

   /**
   * Banner image. Tablet size (1707x283).
   * @return bannerTabletImageUrl
  **/
  @ApiModelProperty(value = "Banner image. Tablet size (1707x283).")
  public String getBannerTabletImageUrl() {
    return bannerTabletImageUrl;
  }

  public void setBannerTabletImageUrl(String bannerTabletImageUrl) {
    this.bannerTabletImageUrl = bannerTabletImageUrl;
  }

  public ImageSettings bannerTabletLowImageUrl(String bannerTabletLowImageUrl) {
    this.bannerTabletLowImageUrl = bannerTabletLowImageUrl;
    return this;
  }

   /**
   * Banner image. Tablet size low resolution (1138x188).
   * @return bannerTabletLowImageUrl
  **/
  @ApiModelProperty(value = "Banner image. Tablet size low resolution (1138x188).")
  public String getBannerTabletLowImageUrl() {
    return bannerTabletLowImageUrl;
  }

  public void setBannerTabletLowImageUrl(String bannerTabletLowImageUrl) {
    this.bannerTabletLowImageUrl = bannerTabletLowImageUrl;
  }

  public ImageSettings bannerTvHighImageUrl(String bannerTvHighImageUrl) {
    this.bannerTvHighImageUrl = bannerTvHighImageUrl;
    return this;
  }

   /**
   * Banner image. TV size high resolution (1920x1080).
   * @return bannerTvHighImageUrl
  **/
  @ApiModelProperty(value = "Banner image. TV size high resolution (1920x1080).")
  public String getBannerTvHighImageUrl() {
    return bannerTvHighImageUrl;
  }

  public void setBannerTvHighImageUrl(String bannerTvHighImageUrl) {
    this.bannerTvHighImageUrl = bannerTvHighImageUrl;
  }

  public ImageSettings bannerTvImageUrl(String bannerTvImageUrl) {
    this.bannerTvImageUrl = bannerTvImageUrl;
    return this;
  }

   /**
   * Banner image. TV size extra high resolution (2120x1192).
   * @return bannerTvImageUrl
  **/
  @ApiModelProperty(value = "Banner image. TV size extra high resolution (2120x1192).")
  public String getBannerTvImageUrl() {
    return bannerTvImageUrl;
  }

  public void setBannerTvImageUrl(String bannerTvImageUrl) {
    this.bannerTvImageUrl = bannerTvImageUrl;
  }

  public ImageSettings bannerTvLowImageUrl(String bannerTvLowImageUrl) {
    this.bannerTvLowImageUrl = bannerTvLowImageUrl;
    return this;
  }

   /**
   * Banner image. TV size low resolution (854x480).
   * @return bannerTvLowImageUrl
  **/
  @ApiModelProperty(value = "Banner image. TV size low resolution (854x480).")
  public String getBannerTvLowImageUrl() {
    return bannerTvLowImageUrl;
  }

  public void setBannerTvLowImageUrl(String bannerTvLowImageUrl) {
    this.bannerTvLowImageUrl = bannerTvLowImageUrl;
  }

  public ImageSettings bannerTvMediumImageUrl(String bannerTvMediumImageUrl) {
    this.bannerTvMediumImageUrl = bannerTvMediumImageUrl;
    return this;
  }

   /**
   * Banner image. TV size medium resolution (1280x720).
   * @return bannerTvMediumImageUrl
  **/
  @ApiModelProperty(value = "Banner image. TV size medium resolution (1280x720).")
  public String getBannerTvMediumImageUrl() {
    return bannerTvMediumImageUrl;
  }

  public void setBannerTvMediumImageUrl(String bannerTvMediumImageUrl) {
    this.bannerTvMediumImageUrl = bannerTvMediumImageUrl;
  }

  public ImageSettings largeBrandedBannerImageImapScript(LocalizedProperty largeBrandedBannerImageImapScript) {
    this.largeBrandedBannerImageImapScript = largeBrandedBannerImageImapScript;
    return this;
  }

   /**
   * Get largeBrandedBannerImageImapScript
   * @return largeBrandedBannerImageImapScript
  **/
  @ApiModelProperty(value = "")
  public LocalizedProperty getLargeBrandedBannerImageImapScript() {
    return largeBrandedBannerImageImapScript;
  }

  public void setLargeBrandedBannerImageImapScript(LocalizedProperty largeBrandedBannerImageImapScript) {
    this.largeBrandedBannerImageImapScript = largeBrandedBannerImageImapScript;
  }

  public ImageSettings largeBrandedBannerImageUrl(LocalizedProperty largeBrandedBannerImageUrl) {
    this.largeBrandedBannerImageUrl = largeBrandedBannerImageUrl;
    return this;
  }

   /**
   * Get largeBrandedBannerImageUrl
   * @return largeBrandedBannerImageUrl
  **/
  @ApiModelProperty(value = "")
  public LocalizedProperty getLargeBrandedBannerImageUrl() {
    return largeBrandedBannerImageUrl;
  }

  public void setLargeBrandedBannerImageUrl(LocalizedProperty largeBrandedBannerImageUrl) {
    this.largeBrandedBannerImageUrl = largeBrandedBannerImageUrl;
  }

  public ImageSettings smallBrandedBannerImageImapScript(LocalizedProperty smallBrandedBannerImageImapScript) {
    this.smallBrandedBannerImageImapScript = smallBrandedBannerImageImapScript;
    return this;
  }

   /**
   * Get smallBrandedBannerImageImapScript
   * @return smallBrandedBannerImageImapScript
  **/
  @ApiModelProperty(value = "")
  public LocalizedProperty getSmallBrandedBannerImageImapScript() {
    return smallBrandedBannerImageImapScript;
  }

  public void setSmallBrandedBannerImageImapScript(LocalizedProperty smallBrandedBannerImageImapScript) {
    this.smallBrandedBannerImageImapScript = smallBrandedBannerImageImapScript;
  }

  public ImageSettings smallBrandedBannerImageUrl(LocalizedProperty smallBrandedBannerImageUrl) {
    this.smallBrandedBannerImageUrl = smallBrandedBannerImageUrl;
    return this;
  }

   /**
   * Get smallBrandedBannerImageUrl
   * @return smallBrandedBannerImageUrl
  **/
  @ApiModelProperty(value = "")
  public LocalizedProperty getSmallBrandedBannerImageUrl() {
    return smallBrandedBannerImageUrl;
  }

  public void setSmallBrandedBannerImageUrl(LocalizedProperty smallBrandedBannerImageUrl) {
    this.smallBrandedBannerImageUrl = smallBrandedBannerImageUrl;
  }

  public ImageSettings trackingImageUrl(String trackingImageUrl) {
    this.trackingImageUrl = trackingImageUrl;
    return this;
  }

   /**
   * The URL for a 1px by 1px tracking pixel that can be used to collect statistics for views of the channel or video pages.
   * @return trackingImageUrl
  **/
  @ApiModelProperty(value = "The URL for a 1px by 1px tracking pixel that can be used to collect statistics for views of the channel or video pages.")
  public String getTrackingImageUrl() {
    return trackingImageUrl;
  }

  public void setTrackingImageUrl(String trackingImageUrl) {
    this.trackingImageUrl = trackingImageUrl;
  }

  public ImageSettings watchIconImageUrl(String watchIconImageUrl) {
    this.watchIconImageUrl = watchIconImageUrl;
    return this;
  }

   /**
   * Get watchIconImageUrl
   * @return watchIconImageUrl
  **/
  @ApiModelProperty(value = "")
  public String getWatchIconImageUrl() {
    return watchIconImageUrl;
  }

  public void setWatchIconImageUrl(String watchIconImageUrl) {
    this.watchIconImageUrl = watchIconImageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSettings imageSettings = (ImageSettings) o;
    return Objects.equals(this.backgroundImageUrl, imageSettings.backgroundImageUrl) &&
        Objects.equals(this.bannerExternalUrl, imageSettings.bannerExternalUrl) &&
        Objects.equals(this.bannerImageUrl, imageSettings.bannerImageUrl) &&
        Objects.equals(this.bannerMobileExtraHdImageUrl, imageSettings.bannerMobileExtraHdImageUrl) &&
        Objects.equals(this.bannerMobileHdImageUrl, imageSettings.bannerMobileHdImageUrl) &&
        Objects.equals(this.bannerMobileImageUrl, imageSettings.bannerMobileImageUrl) &&
        Objects.equals(this.bannerMobileLowImageUrl, imageSettings.bannerMobileLowImageUrl) &&
        Objects.equals(this.bannerMobileMediumHdImageUrl, imageSettings.bannerMobileMediumHdImageUrl) &&
        Objects.equals(this.bannerTabletExtraHdImageUrl, imageSettings.bannerTabletExtraHdImageUrl) &&
        Objects.equals(this.bannerTabletHdImageUrl, imageSettings.bannerTabletHdImageUrl) &&
        Objects.equals(this.bannerTabletImageUrl, imageSettings.bannerTabletImageUrl) &&
        Objects.equals(this.bannerTabletLowImageUrl, imageSettings.bannerTabletLowImageUrl) &&
        Objects.equals(this.bannerTvHighImageUrl, imageSettings.bannerTvHighImageUrl) &&
        Objects.equals(this.bannerTvImageUrl, imageSettings.bannerTvImageUrl) &&
        Objects.equals(this.bannerTvLowImageUrl, imageSettings.bannerTvLowImageUrl) &&
        Objects.equals(this.bannerTvMediumImageUrl, imageSettings.bannerTvMediumImageUrl) &&
        Objects.equals(this.largeBrandedBannerImageImapScript, imageSettings.largeBrandedBannerImageImapScript) &&
        Objects.equals(this.largeBrandedBannerImageUrl, imageSettings.largeBrandedBannerImageUrl) &&
        Objects.equals(this.smallBrandedBannerImageImapScript, imageSettings.smallBrandedBannerImageImapScript) &&
        Objects.equals(this.smallBrandedBannerImageUrl, imageSettings.smallBrandedBannerImageUrl) &&
        Objects.equals(this.trackingImageUrl, imageSettings.trackingImageUrl) &&
        Objects.equals(this.watchIconImageUrl, imageSettings.watchIconImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImageUrl, bannerExternalUrl, bannerImageUrl, bannerMobileExtraHdImageUrl, bannerMobileHdImageUrl, bannerMobileImageUrl, bannerMobileLowImageUrl, bannerMobileMediumHdImageUrl, bannerTabletExtraHdImageUrl, bannerTabletHdImageUrl, bannerTabletImageUrl, bannerTabletLowImageUrl, bannerTvHighImageUrl, bannerTvImageUrl, bannerTvLowImageUrl, bannerTvMediumImageUrl, largeBrandedBannerImageImapScript, largeBrandedBannerImageUrl, smallBrandedBannerImageImapScript, smallBrandedBannerImageUrl, trackingImageUrl, watchIconImageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSettings {\n");
    
    sb.append("    backgroundImageUrl: ").append(toIndentedString(backgroundImageUrl)).append("\n");
    sb.append("    bannerExternalUrl: ").append(toIndentedString(bannerExternalUrl)).append("\n");
    sb.append("    bannerImageUrl: ").append(toIndentedString(bannerImageUrl)).append("\n");
    sb.append("    bannerMobileExtraHdImageUrl: ").append(toIndentedString(bannerMobileExtraHdImageUrl)).append("\n");
    sb.append("    bannerMobileHdImageUrl: ").append(toIndentedString(bannerMobileHdImageUrl)).append("\n");
    sb.append("    bannerMobileImageUrl: ").append(toIndentedString(bannerMobileImageUrl)).append("\n");
    sb.append("    bannerMobileLowImageUrl: ").append(toIndentedString(bannerMobileLowImageUrl)).append("\n");
    sb.append("    bannerMobileMediumHdImageUrl: ").append(toIndentedString(bannerMobileMediumHdImageUrl)).append("\n");
    sb.append("    bannerTabletExtraHdImageUrl: ").append(toIndentedString(bannerTabletExtraHdImageUrl)).append("\n");
    sb.append("    bannerTabletHdImageUrl: ").append(toIndentedString(bannerTabletHdImageUrl)).append("\n");
    sb.append("    bannerTabletImageUrl: ").append(toIndentedString(bannerTabletImageUrl)).append("\n");
    sb.append("    bannerTabletLowImageUrl: ").append(toIndentedString(bannerTabletLowImageUrl)).append("\n");
    sb.append("    bannerTvHighImageUrl: ").append(toIndentedString(bannerTvHighImageUrl)).append("\n");
    sb.append("    bannerTvImageUrl: ").append(toIndentedString(bannerTvImageUrl)).append("\n");
    sb.append("    bannerTvLowImageUrl: ").append(toIndentedString(bannerTvLowImageUrl)).append("\n");
    sb.append("    bannerTvMediumImageUrl: ").append(toIndentedString(bannerTvMediumImageUrl)).append("\n");
    sb.append("    largeBrandedBannerImageImapScript: ").append(toIndentedString(largeBrandedBannerImageImapScript)).append("\n");
    sb.append("    largeBrandedBannerImageUrl: ").append(toIndentedString(largeBrandedBannerImageUrl)).append("\n");
    sb.append("    smallBrandedBannerImageImapScript: ").append(toIndentedString(smallBrandedBannerImageImapScript)).append("\n");
    sb.append("    smallBrandedBannerImageUrl: ").append(toIndentedString(smallBrandedBannerImageUrl)).append("\n");
    sb.append("    trackingImageUrl: ").append(toIndentedString(trackingImageUrl)).append("\n");
    sb.append("    watchIconImageUrl: ").append(toIndentedString(watchIconImageUrl)).append("\n");
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

