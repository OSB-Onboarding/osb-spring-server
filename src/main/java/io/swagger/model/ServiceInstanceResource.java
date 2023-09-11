package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MaintenanceInfo;
import io.swagger.model.ServiceInstanceMetadata;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceInstanceResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class ServiceInstanceResource   {
  @JsonProperty("service_id")
  private String serviceId = null;

  @JsonProperty("plan_id")
  private String planId = null;

  @JsonProperty("dashboard_url")
  private String dashboardUrl = null;

  @JsonProperty("parameters")
  private Object parameters = null;

  @JsonProperty("maintenance_info")
  private MaintenanceInfo maintenanceInfo = null;

  @JsonProperty("metadata")
  private ServiceInstanceMetadata metadata = null;

  public ServiceInstanceResource serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(value = "")


  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public ServiceInstanceResource planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Get planId
   * @return planId
  **/
  @ApiModelProperty(value = "")


  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public ServiceInstanceResource dashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
    return this;
  }

  /**
   * Get dashboardUrl
   * @return dashboardUrl
  **/
  @ApiModelProperty(value = "")


  public String getDashboardUrl() {
    return dashboardUrl;
  }

  public void setDashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
  }

  public ServiceInstanceResource parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")


  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  public ServiceInstanceResource maintenanceInfo(MaintenanceInfo maintenanceInfo) {
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

  public ServiceInstanceResource metadata(ServiceInstanceMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceInstanceMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ServiceInstanceMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstanceResource serviceInstanceResource = (ServiceInstanceResource) o;
    return Objects.equals(this.serviceId, serviceInstanceResource.serviceId) &&
        Objects.equals(this.planId, serviceInstanceResource.planId) &&
        Objects.equals(this.dashboardUrl, serviceInstanceResource.dashboardUrl) &&
        Objects.equals(this.parameters, serviceInstanceResource.parameters) &&
        Objects.equals(this.maintenanceInfo, serviceInstanceResource.maintenanceInfo) &&
        Objects.equals(this.metadata, serviceInstanceResource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, planId, dashboardUrl, parameters, maintenanceInfo, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstanceResource {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    maintenanceInfo: ").append(toIndentedString(maintenanceInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

