package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelSection targeting setting.
 */
@ApiModel(description = "ChannelSection targeting setting.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class ChannelSectionTargeting   {
  @JsonProperty("countries")
  private List<String> countries = null;

  @JsonProperty("languages")
  private List<String> languages = null;

  @JsonProperty("regions")
  private List<String> regions = null;

  public ChannelSectionTargeting countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public ChannelSectionTargeting addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<String>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * The country the channel section is targeting.
   * @return countries
  **/
  @ApiModelProperty(value = "The country the channel section is targeting.")
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public ChannelSectionTargeting languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public ChannelSectionTargeting addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * The language the channel section is targeting.
   * @return languages
  **/
  @ApiModelProperty(value = "The language the channel section is targeting.")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public ChannelSectionTargeting regions(List<String> regions) {
    this.regions = regions;
    return this;
  }

  public ChannelSectionTargeting addRegionsItem(String regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<String>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * The region the channel section is targeting.
   * @return regions
  **/
  @ApiModelProperty(value = "The region the channel section is targeting.")
  public List<String> getRegions() {
    return regions;
  }

  public void setRegions(List<String> regions) {
    this.regions = regions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelSectionTargeting channelSectionTargeting = (ChannelSectionTargeting) o;
    return Objects.equals(this.countries, channelSectionTargeting.countries) &&
        Objects.equals(this.languages, channelSectionTargeting.languages) &&
        Objects.equals(this.regions, channelSectionTargeting.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, languages, regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelSectionTargeting {\n");
    
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

