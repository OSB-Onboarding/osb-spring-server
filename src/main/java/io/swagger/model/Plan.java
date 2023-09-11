package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MaintenanceInfo;
import io.swagger.model.Metadata;
import io.swagger.model.SchemasObject;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Plan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class Plan   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  @JsonProperty("free")
  private Boolean free = true;

  @JsonProperty("bindable")
  private Boolean bindable = null;

  @JsonProperty("plan_updateable")
  private Boolean planUpdateable = null;

  @JsonProperty("schemas")
  private SchemasObject schemas = null;

  @JsonProperty("maximum_polling_duration")
  private Integer maximumPollingDuration = null;

  @JsonProperty("maintenance_info")
  private MaintenanceInfo maintenanceInfo = null;

  @JsonProperty("binding_rotatable")
  private Boolean bindingRotatable = false;

  public Plan id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Plan name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Plan description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Plan metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public Plan free(Boolean free) {
    this.free = free;
    return this;
  }

  /**
   * Get free
   * @return free
  **/
  @ApiModelProperty(value = "")


  public Boolean isFree() {
    return free;
  }

  public void setFree(Boolean free) {
    this.free = free;
  }

  public Plan bindable(Boolean bindable) {
    this.bindable = bindable;
    return this;
  }

  /**
   * Get bindable
   * @return bindable
  **/
  @ApiModelProperty(value = "")


  public Boolean isBindable() {
    return bindable;
  }

  public void setBindable(Boolean bindable) {
    this.bindable = bindable;
  }

  public Plan planUpdateable(Boolean planUpdateable) {
    this.planUpdateable = planUpdateable;
    return this;
  }

  /**
   * Get planUpdateable
   * @return planUpdateable
  **/
  @ApiModelProperty(value = "")


  public Boolean isPlanUpdateable() {
    return planUpdateable;
  }

  public void setPlanUpdateable(Boolean planUpdateable) {
    this.planUpdateable = planUpdateable;
  }

  public Plan schemas(SchemasObject schemas) {
    this.schemas = schemas;
    return this;
  }

  /**
   * Get schemas
   * @return schemas
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SchemasObject getSchemas() {
    return schemas;
  }

  public void setSchemas(SchemasObject schemas) {
    this.schemas = schemas;
  }

  public Plan maximumPollingDuration(Integer maximumPollingDuration) {
    this.maximumPollingDuration = maximumPollingDuration;
    return this;
  }

  /**
   * Get maximumPollingDuration
   * @return maximumPollingDuration
  **/
  @ApiModelProperty(value = "")


  public Integer getMaximumPollingDuration() {
    return maximumPollingDuration;
  }

  public void setMaximumPollingDuration(Integer maximumPollingDuration) {
    this.maximumPollingDuration = maximumPollingDuration;
  }

  public Plan maintenanceInfo(MaintenanceInfo maintenanceInfo) {
    this.maintenanceInfo = maintenanceInfo;
    return this;
  }

  /**
   * Get maintenanceInfo
   * @return maintenanceInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MaintenanceInfo getMaintenanceInfo() {
    return maintenanceInfo;
  }

  public void setMaintenanceInfo(MaintenanceInfo maintenanceInfo) {
    this.maintenanceInfo = maintenanceInfo;
  }

  public Plan bindingRotatable(Boolean bindingRotatable) {
    this.bindingRotatable = bindingRotatable;
    return this;
  }

  /**
   * Get bindingRotatable
   * @return bindingRotatable
  **/
  @ApiModelProperty(value = "")


  public Boolean isBindingRotatable() {
    return bindingRotatable;
  }

  public void setBindingRotatable(Boolean bindingRotatable) {
    this.bindingRotatable = bindingRotatable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.id, plan.id) &&
        Objects.equals(this.name, plan.name) &&
        Objects.equals(this.description, plan.description) &&
        Objects.equals(this.metadata, plan.metadata) &&
        Objects.equals(this.free, plan.free) &&
        Objects.equals(this.bindable, plan.bindable) &&
        Objects.equals(this.planUpdateable, plan.planUpdateable) &&
        Objects.equals(this.schemas, plan.schemas) &&
        Objects.equals(this.maximumPollingDuration, plan.maximumPollingDuration) &&
        Objects.equals(this.maintenanceInfo, plan.maintenanceInfo) &&
        Objects.equals(this.bindingRotatable, plan.bindingRotatable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, metadata, free, bindable, planUpdateable, schemas, maximumPollingDuration, maintenanceInfo, bindingRotatable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    bindable: ").append(toIndentedString(bindable)).append("\n");
    sb.append("    planUpdateable: ").append(toIndentedString(planUpdateable)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    maximumPollingDuration: ").append(toIndentedString(maximumPollingDuration)).append("\n");
    sb.append("    maintenanceInfo: ").append(toIndentedString(maintenanceInfo)).append("\n");
    sb.append("    bindingRotatable: ").append(toIndentedString(bindingRotatable)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

