package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SuperStickerMetadata
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class SuperStickerMetadata   {
  @JsonProperty("altText")
  private String altText;

  @JsonProperty("altTextLanguage")
  private String altTextLanguage;

  @JsonProperty("stickerId")
  private String stickerId;

  public SuperStickerMetadata altText(String altText) {
    this.altText = altText;
    return this;
  }

  /**
   * Internationalized alt text that describes the sticker image and any animation associated with it.
   * @return altText
  */
  @ApiModelProperty(value = "Internationalized alt text that describes the sticker image and any animation associated with it.")


  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public SuperStickerMetadata altTextLanguage(String altTextLanguage) {
    this.altTextLanguage = altTextLanguage;
    return this;
  }

  /**
   * Specifies the localization language in which the alt text is returned.
   * @return altTextLanguage
  */
  @ApiModelProperty(value = "Specifies the localization language in which the alt text is returned.")


  public String getAltTextLanguage() {
    return altTextLanguage;
  }

  public void setAltTextLanguage(String altTextLanguage) {
    this.altTextLanguage = altTextLanguage;
  }

  public SuperStickerMetadata stickerId(String stickerId) {
    this.stickerId = stickerId;
    return this;
  }

  /**
   * Unique identifier of the Super Sticker. This is a shorter form of the alt_text that includes pack name and a recognizable characteristic of the sticker.
   * @return stickerId
  */
  @ApiModelProperty(value = "Unique identifier of the Super Sticker. This is a shorter form of the alt_text that includes pack name and a recognizable characteristic of the sticker.")


  public String getStickerId() {
    return stickerId;
  }

  public void setStickerId(String stickerId) {
    this.stickerId = stickerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperStickerMetadata superStickerMetadata = (SuperStickerMetadata) o;
    return Objects.equals(this.altText, superStickerMetadata.altText) &&
        Objects.equals(this.altTextLanguage, superStickerMetadata.altTextLanguage) &&
        Objects.equals(this.stickerId, superStickerMetadata.stickerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altText, altTextLanguage, stickerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperStickerMetadata {\n");
    
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    altTextLanguage: ").append(toIndentedString(altTextLanguage)).append("\n");
    sb.append("    stickerId: ").append(toIndentedString(stickerId)).append("\n");
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

