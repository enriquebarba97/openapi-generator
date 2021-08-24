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
 * Describes the spatial position of a visual widget inside a video. It is a union of various position types, out of which only will be set one.
 */
@ApiModel(description = "Describes the spatial position of a visual widget inside a video. It is a union of various position types, out of which only will be set one.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class InvideoPosition   {
  /**
   * Describes in which corner of the video the visual widget will appear.
   */
  public enum CornerPositionEnum {
    TOPLEFT("topLeft"),
    
    TOPRIGHT("topRight"),
    
    BOTTOMLEFT("bottomLeft"),
    
    BOTTOMRIGHT("bottomRight");

    private String value;

    CornerPositionEnum(String value) {
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
    public static CornerPositionEnum fromValue(String value) {
      for (CornerPositionEnum b : CornerPositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("cornerPosition")
  private CornerPositionEnum cornerPosition;

  /**
   * Defines the position type.
   */
  public enum TypeEnum {
    CORNER("corner");

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

  public InvideoPosition cornerPosition(CornerPositionEnum cornerPosition) {
    this.cornerPosition = cornerPosition;
    return this;
  }

  /**
   * Describes in which corner of the video the visual widget will appear.
   * @return cornerPosition
  */
  @ApiModelProperty(value = "Describes in which corner of the video the visual widget will appear.")


  public CornerPositionEnum getCornerPosition() {
    return cornerPosition;
  }

  public void setCornerPosition(CornerPositionEnum cornerPosition) {
    this.cornerPosition = cornerPosition;
  }

  public InvideoPosition type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Defines the position type.
   * @return type
  */
  @ApiModelProperty(value = "Defines the position type.")


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
    InvideoPosition invideoPosition = (InvideoPosition) o;
    return Objects.equals(this.cornerPosition, invideoPosition.cornerPosition) &&
        Objects.equals(this.type, invideoPosition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cornerPosition, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvideoPosition {\n");
    
    sb.append("    cornerPosition: ").append(toIndentedString(cornerPosition)).append("\n");
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

