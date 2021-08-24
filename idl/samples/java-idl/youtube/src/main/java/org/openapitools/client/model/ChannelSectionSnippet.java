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
import org.openapitools.client.model.ChannelSectionLocalization;

/**
 * Basic details about a channel section, including title, style and position.
 */
@ApiModel(description = "Basic details about a channel section, including title, style and position.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaIDLCodegen", date = "2021-08-24T20:55:04.712703200+02:00[Europe/Paris]")
public class ChannelSectionSnippet {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId;

  public static final String SERIALIZED_NAME_DEFAULT_LANGUAGE = "defaultLanguage";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LANGUAGE)
  private String defaultLanguage;

  public static final String SERIALIZED_NAME_LOCALIZED = "localized";
  @SerializedName(SERIALIZED_NAME_LOCALIZED)
  private ChannelSectionLocalization localized;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  /**
   * The style of the channel section.
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
    CHANNELSECTIONSTYLEUNSPECIFIED("channelsectionStyleUnspecified"),
    
    HORIZONTALROW("horizontalRow"),
    
    VERTICALLIST("verticalList");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StyleEnum fromValue(String value) {
      for (StyleEnum b : StyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StyleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StyleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STYLE = "style";
  @SerializedName(SERIALIZED_NAME_STYLE)
  private StyleEnum style;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  /**
   * The type of the channel section.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CHANNELSECTIONTYPEUNSPECIFIED("channelsectionTypeUnspecified"),
    
    SINGLEPLAYLIST("singlePlaylist"),
    
    MULTIPLEPLAYLISTS("multiplePlaylists"),
    
    POPULARUPLOADS("popularUploads"),
    
    RECENTUPLOADS("recentUploads"),
    
    LIKES("likes"),
    
    ALLPLAYLISTS("allPlaylists"),
    
    LIKEDPLAYLISTS("likedPlaylists"),
    
    RECENTPOSTS("recentPosts"),
    
    RECENTACTIVITY("recentActivity"),
    
    LIVEEVENTS("liveEvents"),
    
    UPCOMINGEVENTS("upcomingEvents"),
    
    COMPLETEDEVENTS("completedEvents"),
    
    MULTIPLECHANNELS("multipleChannels"),
    
    POSTEDVIDEOS("postedVideos"),
    
    POSTEDPLAYLISTS("postedPlaylists"),
    
    SUBSCRIPTIONS("subscriptions");

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


  public ChannelSectionSnippet channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * The ID that YouTube uses to uniquely identify the channel that published the channel section.
   * @return channelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID that YouTube uses to uniquely identify the channel that published the channel section.")

  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public ChannelSectionSnippet defaultLanguage(String defaultLanguage) {
    
    this.defaultLanguage = defaultLanguage;
    return this;
  }

   /**
   * The language of the channel section&#39;s default title and description.
   * @return defaultLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The language of the channel section's default title and description.")

  public String getDefaultLanguage() {
    return defaultLanguage;
  }


  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }


  public ChannelSectionSnippet localized(ChannelSectionLocalization localized) {
    
    this.localized = localized;
    return this;
  }

   /**
   * Get localized
   * @return localized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChannelSectionLocalization getLocalized() {
    return localized;
  }


  public void setLocalized(ChannelSectionLocalization localized) {
    this.localized = localized;
  }


  public ChannelSectionSnippet position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * The position of the channel section in the channel.
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The position of the channel section in the channel.")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public ChannelSectionSnippet style(StyleEnum style) {
    
    this.style = style;
    return this;
  }

   /**
   * The style of the channel section.
   * @return style
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The style of the channel section.")

  public StyleEnum getStyle() {
    return style;
  }


  public void setStyle(StyleEnum style) {
    this.style = style;
  }


  public ChannelSectionSnippet title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The channel section&#39;s title for multiple_playlists and multiple_channels.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The channel section's title for multiple_playlists and multiple_channels.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ChannelSectionSnippet type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the channel section.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the channel section.")

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
    ChannelSectionSnippet channelSectionSnippet = (ChannelSectionSnippet) o;
    return Objects.equals(this.channelId, channelSectionSnippet.channelId) &&
        Objects.equals(this.defaultLanguage, channelSectionSnippet.defaultLanguage) &&
        Objects.equals(this.localized, channelSectionSnippet.localized) &&
        Objects.equals(this.position, channelSectionSnippet.position) &&
        Objects.equals(this.style, channelSectionSnippet.style) &&
        Objects.equals(this.title, channelSectionSnippet.title) &&
        Objects.equals(this.type, channelSectionSnippet.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, defaultLanguage, localized, position, style, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelSectionSnippet {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    localized: ").append(toIndentedString(localized)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

