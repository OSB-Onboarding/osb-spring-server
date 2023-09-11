package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DashboardClient;
import io.swagger.model.Metadata;
import io.swagger.model.Plan;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Service
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class Service   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  /**
   * Gets or Sets requires
   */
  public enum RequiresEnum {
    SYSLOG_DRAIN("syslog_drain"),
    
    ROUTE_FORWARDING("route_forwarding"),
    
    VOLUME_MOUNT("volume_mount");

    private String value;

    RequiresEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RequiresEnum fromValue(String text) {
      for (RequiresEnum b : RequiresEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("requires")
  @Valid
  private List<RequiresEnum> requires = null;

  @JsonProperty("bindable")
  private Boolean bindable = null;

  @JsonProperty("instances_retrievable")
  private Boolean instancesRetrievable = null;

  @JsonProperty("bindings_retrievable")
  private Boolean bindingsRetrievable = null;

  @JsonProperty("allow_context_updates")
  private Boolean allowContextUpdates = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  @JsonProperty("dashboard_client")
  private DashboardClient dashboardClient = null;

  @JsonProperty("binding_rotatable")
  private Boolean bindingRotatable = null;

  @JsonProperty("plan_updateable")
  private Boolean planUpdateable = null;

  @JsonProperty("plans")
  @Valid
  private List<Plan> plans = new ArrayList<Plan>();

  public Service name(String name) {
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

  public Service id(String id) {
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

  public Service description(String description) {
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

  public Service tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Service addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Service requires(List<RequiresEnum> requires) {
    this.requires = requires;
    return this;
  }

  public Service addRequiresItem(RequiresEnum requiresItem) {
    if (this.requires == null) {
      this.requires = new ArrayList<RequiresEnum>();
    }
    this.requires.add(requiresItem);
    return this;
  }

  /**
   * Get requires
   * @return requires
  **/
  @ApiModelProperty(value = "")


  public List<RequiresEnum> getRequires() {
    return requires;
  }

  public void setRequires(List<RequiresEnum> requires) {
    this.requires = requires;
  }

  public Service bindable(Boolean bindable) {
    this.bindable = bindable;
    return this;
  }

  /**
   * Get bindable
   * @return bindable
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isBindable() {
    return bindable;
  }

  public void setBindable(Boolean bindable) {
    this.bindable = bindable;
  }

  public Service instancesRetrievable(Boolean instancesRetrievable) {
    this.instancesRetrievable = instancesRetrievable;
    return this;
  }

  /**
   * Get instancesRetrievable
   * @return instancesRetrievable
  **/
  @ApiModelProperty(value = "")


  public Boolean isInstancesRetrievable() {
    return instancesRetrievable;
  }

  public void setInstancesRetrievable(Boolean instancesRetrievable) {
    this.instancesRetrievable = instancesRetrievable;
  }

  public Service bindingsRetrievable(Boolean bindingsRetrievable) {
    this.bindingsRetrievable = bindingsRetrievable;
    return this;
  }

  /**
   * Get bindingsRetrievable
   * @return bindingsRetrievable
  **/
  @ApiModelProperty(value = "")


  public Boolean isBindingsRetrievable() {
    return bindingsRetrievable;
  }

  public void setBindingsRetrievable(Boolean bindingsRetrievable) {
    this.bindingsRetrievable = bindingsRetrievable;
  }

  public Service allowContextUpdates(Boolean allowContextUpdates) {
    this.allowContextUpdates = allowContextUpdates;
    return this;
  }

  /**
   * Get allowContextUpdates
   * @return allowContextUpdates
  **/
  @ApiModelProperty(value = "")


  public Boolean isAllowContextUpdates() {
    return allowContextUpdates;
  }

  public void setAllowContextUpdates(Boolean allowContextUpdates) {
    this.allowContextUpdates = allowContextUpdates;
  }

  public Service metadata(Metadata metadata) {
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

  public Service dashboardClient(DashboardClient dashboardClient) {
    this.dashboardClient = dashboardClient;
    return this;
  }

  /**
   * Get dashboardClient
   * @return dashboardClient
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DashboardClient getDashboardClient() {
    return dashboardClient;
  }

  public void setDashboardClient(DashboardClient dashboardClient) {
    this.dashboardClient = dashboardClient;
  }

  public Service bindingRotatable(Boolean bindingRotatable) {
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

  public Service planUpdateable(Boolean planUpdateable) {
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

  public Service plans(List<Plan> plans) {
    this.plans = plans;
    return this;
  }

  public Service addPlansItem(Plan plansItem) {
    this.plans.add(plansItem);
    return this;
  }

  /**
   * Get plans
   * @return plans
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Plan> getPlans() {
    return plans;
  }

  public void setPlans(List<Plan> plans) {
    this.plans = plans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.name, service.name) &&
        Objects.equals(this.id, service.id) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.tags, service.tags) &&
        Objects.equals(this.requires, service.requires) &&
        Objects.equals(this.bindable, service.bindable) &&
        Objects.equals(this.instancesRetrievable, service.instancesRetrievable) &&
        Objects.equals(this.bindingsRetrievable, service.bindingsRetrievable) &&
        Objects.equals(this.allowContextUpdates, service.allowContextUpdates) &&
        Objects.equals(this.metadata, service.metadata) &&
        Objects.equals(this.dashboardClient, service.dashboardClient) &&
        Objects.equals(this.bindingRotatable, service.bindingRotatable) &&
        Objects.equals(this.planUpdateable, service.planUpdateable) &&
        Objects.equals(this.plans, service.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, description, tags, requires, bindable, instancesRetrievable, bindingsRetrievable, allowContextUpdates, metadata, dashboardClient, bindingRotatable, planUpdateable, plans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    requires: ").append(toIndentedString(requires)).append("\n");
    sb.append("    bindable: ").append(toIndentedString(bindable)).append("\n");
    sb.append("    instancesRetrievable: ").append(toIndentedString(instancesRetrievable)).append("\n");
    sb.append("    bindingsRetrievable: ").append(toIndentedString(bindingsRetrievable)).append("\n");
    sb.append("    allowContextUpdates: ").append(toIndentedString(allowContextUpdates)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dashboardClient: ").append(toIndentedString(dashboardClient)).append("\n");
    sb.append("    bindingRotatable: ").append(toIndentedString(bindingRotatable)).append("\n");
    sb.append("    planUpdateable: ").append(toIndentedString(planUpdateable)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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

