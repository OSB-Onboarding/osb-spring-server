package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MaintenanceInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceInstancePreviousValues
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class ServiceInstancePreviousValues   {
  @JsonProperty("service_id")
  private String serviceId = null;

  @JsonProperty("plan_id")
  private String planId = null;

  @JsonProperty("maintenance_info")
  private MaintenanceInfo maintenanceInfo = null;

  public ServiceInstancePreviousValues serviceId(String serviceId) {
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

  public ServiceInstancePreviousValues planId(String planId) {
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

  public ServiceInstancePreviousValues maintenanceInfo(MaintenanceInfo maintenanceInfo) {
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
    ServiceInstancePreviousValues serviceInstancePreviousValues = (ServiceInstancePreviousValues) o;
    return Objects.equals(this.serviceId, serviceInstancePreviousValues.serviceId) &&
        Objects.equals(this.planId, serviceInstancePreviousValues.planId) &&
        Objects.equals(this.maintenanceInfo, serviceInstancePreviousValues.maintenanceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, planId, maintenanceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstancePreviousValues {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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

