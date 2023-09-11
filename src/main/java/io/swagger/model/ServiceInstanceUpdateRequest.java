package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Context;
import io.swagger.model.MaintenanceInfo;
import io.swagger.model.ServiceInstancePreviousValues;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceInstanceUpdateRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class ServiceInstanceUpdateRequest   {
  @JsonProperty("context")
  private Context context = null;

  @JsonProperty("service_id")
  private String serviceId = null;

  @JsonProperty("plan_id")
  private String planId = null;

  @JsonProperty("parameters")
  private Object parameters = null;

  @JsonProperty("previous_values")
  private ServiceInstancePreviousValues previousValues = null;

  @JsonProperty("maintenance_info")
  private MaintenanceInfo maintenanceInfo = null;

  public ServiceInstanceUpdateRequest context(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public ServiceInstanceUpdateRequest serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public ServiceInstanceUpdateRequest planId(String planId) {
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

  public ServiceInstanceUpdateRequest parameters(Object parameters) {
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

  public ServiceInstanceUpdateRequest previousValues(ServiceInstancePreviousValues previousValues) {
    this.previousValues = previousValues;
    return this;
  }

  /**
   * Get previousValues
   * @return previousValues
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceInstancePreviousValues getPreviousValues() {
    return previousValues;
  }

  public void setPreviousValues(ServiceInstancePreviousValues previousValues) {
    this.previousValues = previousValues;
  }

  public ServiceInstanceUpdateRequest maintenanceInfo(MaintenanceInfo maintenanceInfo) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstanceUpdateRequest serviceInstanceUpdateRequest = (ServiceInstanceUpdateRequest) o;
    return Objects.equals(this.context, serviceInstanceUpdateRequest.context) &&
        Objects.equals(this.serviceId, serviceInstanceUpdateRequest.serviceId) &&
        Objects.equals(this.planId, serviceInstanceUpdateRequest.planId) &&
        Objects.equals(this.parameters, serviceInstanceUpdateRequest.parameters) &&
        Objects.equals(this.previousValues, serviceInstanceUpdateRequest.previousValues) &&
        Objects.equals(this.maintenanceInfo, serviceInstanceUpdateRequest.maintenanceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, serviceId, planId, parameters, previousValues, maintenanceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstanceUpdateRequest {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    previousValues: ").append(toIndentedString(previousValues)).append("\n");
    sb.append("    maintenanceInfo: ").append(toIndentedString(maintenanceInfo)).append("\n");
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

