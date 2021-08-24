package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A pair Property / Value.
 */
@ApiModel(description = "A pair Property / Value.")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class PropertyValue   {
  @JsonProperty("property")
  private String property;

  @JsonProperty("value")
  private String value;

  public PropertyValue property(String property) {
    this.property = property;
    return this;
  }

   /**
   * A property.
   * @return property
  **/
  @ApiModelProperty(value = "A property.")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public PropertyValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The property's value.
   * @return value
  **/
  @ApiModelProperty(value = "The property's value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyValue propertyValue = (PropertyValue) o;
    return Objects.equals(this.property, propertyValue.property) &&
        Objects.equals(this.value, propertyValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyValue {\n");
    
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

