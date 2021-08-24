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

/**
 * Describes the spatial position of a visual widget inside a video. It is a union of various position types, out of which only will be set one.
 */
@ApiModel(description = "Describes the spatial position of a visual widget inside a video. It is a union of various position types, out of which only will be set one.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaIDLCodegen", date = "2021-08-24T20:55:04.712703200+02:00[Europe/Paris]")
public class InvideoPosition {
  /**
   * Describes in which corner of the video the visual widget will appear.
   */
  @JsonAdapter(CornerPositionEnum.Adapter.class)
  public enum CornerPositionEnum {
    TOPLEFT("topLeft"),
    
    TOPRIGHT("topRight"),
    
    BOTTOMLEFT("bottomLeft"),
    
    BOTTOMRIGHT("bottomRight");

    private String value;

    CornerPositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CornerPositionEnum fromValue(String value) {
      for (CornerPositionEnum b : CornerPositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CornerPositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CornerPositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CornerPositionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CornerPositionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CORNER_POSITION = "cornerPosition";
  @SerializedName(SERIALIZED_NAME_CORNER_POSITION)
  private CornerPositionEnum cornerPosition;

  /**
   * Defines the position type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CORNER("corner");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public InvideoPosition cornerPosition(CornerPositionEnum cornerPosition) {
    
    this.cornerPosition = cornerPosition;
    return this;
  }

   /**
   * Describes in which corner of the video the visual widget will appear.
   * @return cornerPosition
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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

