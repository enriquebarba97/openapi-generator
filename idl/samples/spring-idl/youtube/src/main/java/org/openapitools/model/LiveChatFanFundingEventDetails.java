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
 * LiveChatFanFundingEventDetails
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class LiveChatFanFundingEventDetails   {
  @JsonProperty("amountDisplayString")
  private String amountDisplayString;

  @JsonProperty("amountMicros")
  private String amountMicros;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("userComment")
  private String userComment;

  public LiveChatFanFundingEventDetails amountDisplayString(String amountDisplayString) {
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

  public LiveChatFanFundingEventDetails amountMicros(String amountMicros) {
    this.amountMicros = amountMicros;
    return this;
  }

  /**
   * The amount of the fund.
   * @return amountMicros
  */
  @ApiModelProperty(value = "The amount of the fund.")


  public String getAmountMicros() {
    return amountMicros;
  }

  public void setAmountMicros(String amountMicros) {
    this.amountMicros = amountMicros;
  }

  public LiveChatFanFundingEventDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency in which the fund was made.
   * @return currency
  */
  @ApiModelProperty(value = "The currency in which the fund was made.")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public LiveChatFanFundingEventDetails userComment(String userComment) {
    this.userComment = userComment;
    return this;
  }

  /**
   * The comment added by the user to this fan funding event.
   * @return userComment
  */
  @ApiModelProperty(value = "The comment added by the user to this fan funding event.")


  public String getUserComment() {
    return userComment;
  }

  public void setUserComment(String userComment) {
    this.userComment = userComment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveChatFanFundingEventDetails liveChatFanFundingEventDetails = (LiveChatFanFundingEventDetails) o;
    return Objects.equals(this.amountDisplayString, liveChatFanFundingEventDetails.amountDisplayString) &&
        Objects.equals(this.amountMicros, liveChatFanFundingEventDetails.amountMicros) &&
        Objects.equals(this.currency, liveChatFanFundingEventDetails.currency) &&
        Objects.equals(this.userComment, liveChatFanFundingEventDetails.userComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDisplayString, amountMicros, currency, userComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveChatFanFundingEventDetails {\n");
    
    sb.append("    amountDisplayString: ").append(toIndentedString(amountDisplayString)).append("\n");
    sb.append("    amountMicros: ").append(toIndentedString(amountMicros)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    userComment: ").append(toIndentedString(userComment)).append("\n");
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

