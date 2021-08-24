package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SuperStickerMetadata;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LiveChatSuperStickerDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveChatSuperStickerDetails   {
  @JsonProperty("amountDisplayString")
  private String amountDisplayString;

  @JsonProperty("amountMicros")
  private String amountMicros;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("superStickerMetadata")
  private SuperStickerMetadata superStickerMetadata;

  @JsonProperty("tier")
  private Integer tier;

  public LiveChatSuperStickerDetails amountDisplayString(String amountDisplayString) {
    this.amountDisplayString = amountDisplayString;
    return this;
  }

  /**
   * A rendered string that displays the fund amount and currency to the user.
   * @return amountDisplayString
  */
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
   * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
   * @return amountMicros
  */
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
  */
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
  */
  @ApiModelProperty(value = "")

  @Valid

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
  */
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

