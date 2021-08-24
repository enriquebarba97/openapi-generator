package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes a temporal position of a visual widget inside a video.
 */
@ApiModel(description = "Describes a temporal position of a visual widget inside a video.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class InvideoTiming   {
  @JsonProperty("durationMs")
  private String durationMs;

  @JsonProperty("offsetMs")
  private String offsetMs;

  /**
   * Describes a timing type. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field represents an offset from the end of the video.
   */
  public enum TypeEnum {
    OFFSETFROMSTART("offsetFromStart"),
    
    OFFSETFROMEND("offsetFromEnd");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  public InvideoTiming durationMs(String durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * Defines the duration in milliseconds for which the promotion should be displayed. If missing, the client should use the default.
   * @return durationMs
  */
  @ApiModelProperty(value = "Defines the duration in milliseconds for which the promotion should be displayed. If missing, the client should use the default.")


  public String getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(String durationMs) {
    this.durationMs = durationMs;
  }

  public InvideoTiming offsetMs(String offsetMs) {
    this.offsetMs = offsetMs;
    return this;
  }

  /**
   * Defines the time at which the promotion will appear. Depending on the value of type the value of the offsetMs field will represent a time offset from the start or from the end of the video, expressed in milliseconds.
   * @return offsetMs
  */
  @ApiModelProperty(value = "Defines the time at which the promotion will appear. Depending on the value of type the value of the offsetMs field will represent a time offset from the start or from the end of the video, expressed in milliseconds.")


  public String getOffsetMs() {
    return offsetMs;
  }

  public void setOffsetMs(String offsetMs) {
    this.offsetMs = offsetMs;
  }

  public InvideoTiming type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Describes a timing type. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field represents an offset from the end of the video.
   * @return type
  */
  @ApiModelProperty(value = "Describes a timing type. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field represents an offset from the end of the video.")


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
    InvideoTiming invideoTiming = (InvideoTiming) o;
    return Objects.equals(this.durationMs, invideoTiming.durationMs) &&
        Objects.equals(this.offsetMs, invideoTiming.offsetMs) &&
        Objects.equals(this.type, invideoTiming.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMs, offsetMs, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvideoTiming {\n");
    
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    offsetMs: ").append(toIndentedString(offsetMs)).append("\n");
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

