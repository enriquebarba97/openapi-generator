package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.LanguageTag;
import org.openapitools.model.LocalizedString;

/**
 * LocalizedProperty
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class LocalizedProperty   {
  @JsonProperty("defaultLanguage")
  private LanguageTag defaultLanguage;

  @JsonProperty("localized")
  private List<LocalizedString> localized = null;

  public LocalizedProperty defaultLanguage(LanguageTag defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

   /**
   * Get defaultLanguage
   * @return defaultLanguage
  **/
  @ApiModelProperty(value = "")
  public LanguageTag getDefaultLanguage() {
    return defaultLanguage;
  }

  public void setDefaultLanguage(LanguageTag defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  public LocalizedProperty localized(List<LocalizedString> localized) {
    this.localized = localized;
    return this;
  }

  public LocalizedProperty addLocalizedItem(LocalizedString localizedItem) {
    if (this.localized == null) {
      this.localized = new ArrayList<LocalizedString>();
    }
    this.localized.add(localizedItem);
    return this;
  }

   /**
   * Get localized
   * @return localized
  **/
  @ApiModelProperty(value = "")
  public List<LocalizedString> getLocalized() {
    return localized;
  }

  public void setLocalized(List<LocalizedString> localized) {
    this.localized = localized;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalizedProperty localizedProperty = (LocalizedProperty) o;
    return Objects.equals(this.defaultLanguage, localizedProperty.defaultLanguage) &&
        Objects.equals(this.localized, localizedProperty.localized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLanguage, localized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalizedProperty {\n");
    
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    localized: ").append(toIndentedString(localized)).append("\n");
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

