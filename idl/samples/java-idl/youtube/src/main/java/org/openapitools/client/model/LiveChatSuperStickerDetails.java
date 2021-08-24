/*
 * YouTube Data API v3
 * The YouTube Data API v3 is an API that provides access to YouTube data, such as videos, playlists, and channels.
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.SuperStickerMetadata;

/**
 * LiveChatSuperStickerDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaIDLCodegen", date = "2021-08-24T20:55:04.712703200+02:00[Europe/Paris]")
public class LiveChatSuperStickerDetails {
  public static final String SERIALIZED_NAME_AMOUNT_DISPLAY_STRING = "amountDisplayString";
  @SerializedName(SERIALIZED_NAME_AMOUNT_DISPLAY_STRING)
  private String amountDisplayString;

  public static final String SERIALIZED_NAME_AMOUNT_MICROS = "amountMicros";
  @SerializedName(SERIALIZED_NAME_AMOUNT_MICROS)
  private String amountMicros;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SUPER_STICKER_METADATA = "superStickerMetadata";
  @SerializedName(SERIALIZED_NAME_SUPER_STICKER_METADATA)
  private SuperStickerMetadata superStickerMetadata;

  public static final String SERIALIZED_NAME_TIER = "tier";
  @SerializedName(SERIALIZED_NAME_TIER)
  private Integer tier;


  public LiveChatSuperStickerDetails amountDisplayString(String amountDisplayString) {
    
    this.amountDisplayString = amountDisplayString;
    return this;
  }

   /**
   * A rendered string that displays the fund amount and currency to the user.
   * @return amountDisplayString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A rendered string that displays the fund amount and currency to the user.")

  public String getAmountDisplayString() {
    return amountDisplayString;
  }


  public void setAmountDisplayString(String amountDisplayString) {
    this.amountDisplayString = amountDisplayString;
  }


  public LiveChatSuperStickerDetails amountMicros(String amountMicros) {
    
    this.amountMicros = amountMicros;
    return this;
  }

   /**
   * The amount purchased by the user, in micros (1,750,000 micros &#x3D; 1.75).
   * @return amountMicros
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount purchased by the user, in micros (1,750,000 micros = 1.75).")

  public String getAmountMicros() {
    return amountMicros;
  }


  public void setAmountMicros(String amountMicros) {
    this.amountMicros = amountMicros;
  }


  public LiveChatSuperStickerDetails currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency in which the purchase was made.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency in which the purchase was made.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public LiveChatSuperStickerDetails superStickerMetadata(SuperStickerMetadata superStickerMetadata) {
    
    this.superStickerMetadata = superStickerMetadata;
    return this;
  }

   /**
   * Get superStickerMetadata
   * @return superStickerMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SuperStickerMetadata getSuperStickerMetadata() {
    return superStickerMetadata;
  }


  public void setSuperStickerMetadata(SuperStickerMetadata superStickerMetadata) {
    this.superStickerMetadata = superStickerMetadata;
  }


  public LiveChatSuperStickerDetails tier(Integer tier) {
    
    this.tier = tier;
    return this;
  }

   /**
   * The tier in which the amount belongs. Lower amounts belong to lower tiers. The lowest tier is 1.
   * @return tier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tier in which the amount belongs. Lower amounts belong to lower tiers. The lowest tier is 1.")

  public Integer getTier() {
    return tier;
  }


  public void setTier(Integer tier) {
    this.tier = tier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveChatSuperStickerDetails liveChatSuperStickerDetails = (LiveChatSuperStickerDetails) o;
    return Objects.equals(this.amountDisplayString, liveChatSuperStickerDetails.amountDisplayString) &&
        Objects.equals(this.amountMicros, liveChatSuperStickerDetails.amountMicros) &&
        Objects.equals(this.currency, liveChatSuperStickerDetails.currency) &&
        Objects.equals(this.superStickerMetadata, liveChatSuperStickerDetails.superStickerMetadata) &&
        Objects.equals(this.tier, liveChatSuperStickerDetails.tier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDisplayString, amountMicros, currency, superStickerMetadata, tier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatSuperStickerDetails {\n");
    sb.append("    amountDisplayString: ").append(toIndentedString(amountDisplayString)).append("\n");
    sb.append("    amountMicros: ").append(toIndentedString(amountMicros)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    superStickerMetadata: ").append(toIndentedString(superStickerMetadata)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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

