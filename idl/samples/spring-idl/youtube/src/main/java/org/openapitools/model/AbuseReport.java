package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AbuseType;
import org.openapitools.model.Entity;
import org.openapitools.model.RelatedEntity;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AbuseReport
 */
@javax.annotation.Generated(value = "com.us.idl.javaidl.SpringIDLCodegen", date = "2021-08-24T20:54:45.053675300+02:00[Europe/Paris]")
public class AbuseReport   {
  @JsonProperty("abuseTypes")
  @Valid
  private List<AbuseType> abuseTypes = null;

  @JsonProperty("description")
  private String description;

  @JsonProperty("relatedEntities")
  @Valid
  private List<RelatedEntity> relatedEntities = null;

  @JsonProperty("subject")
  private Entity subject;

  public AbuseReport abuseTypes(List<AbuseType> abuseTypes) {
    this.abuseTypes = abuseTypes;
    return this;
  }

  public AbuseReport addAbuseTypesItem(AbuseType abuseTypesItem) {
    if (this.abuseTypes == null) {
      this.abuseTypes = new ArrayList<>();
    }
    this.abuseTypes.add(abuseTypesItem);
    return this;
  }

  /**
   * Get abuseTypes
   * @return abuseTypes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AbuseType> getAbuseTypes() {
    return abuseTypes;
  }

  public void setAbuseTypes(List<AbuseType> abuseTypes) {
    this.abuseTypes = abuseTypes;
  }

  public AbuseReport description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AbuseReport relatedEntities(List<RelatedEntity> relatedEntities) {
    this.relatedEntities = relatedEntities;
    return this;
  }

  public AbuseReport addRelatedEntitiesItem(RelatedEntity relatedEntitiesItem) {
    if (this.relatedEntities == null) {
      this.relatedEntities = new ArrayList<>();
    }
    this.relatedEntities.add(relatedEntitiesItem);
    return this;
  }

  /**
   * Get relatedEntities
   * @return relatedEntities
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedEntity> getRelatedEntities() {
    return relatedEntities;
  }

  public void setRelatedEntities(List<RelatedEntity> relatedEntities) {
    this.relatedEntities = relatedEntities;
  }

  public AbuseReport subject(Entity subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  @ApiModelProperty(value = "")

  @Valid

  public Entity getSubject() {
    return subject;
  }

  public void setSubject(Entity subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbuseReport abuseReport = (AbuseReport) o;
    return Objects.equals(this.abuseTypes, abuseReport.abuseTypes) &&
        Objects.equals(this.description, abuseReport.description) &&
        Objects.equals(this.relatedEntities, abuseReport.relatedEntities) &&
        Objects.equals(this.subject, abuseReport.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abuseTypes, description, relatedEntities, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbuseReport {\n");
    
    sb.append("    abuseTypes: ").append(toIndentedString(abuseTypes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    relatedEntities: ").append(toIndentedString(relatedEntities)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

