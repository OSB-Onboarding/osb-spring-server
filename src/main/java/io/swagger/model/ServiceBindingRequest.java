package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Context;
import io.swagger.model.ServiceBindingResourceObject;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceBindingRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class ServiceBindingRequest   {
  @JsonProperty("context")
  private Context context = null;

  @JsonProperty("service_id")
  private String serviceId = null;

  @JsonProperty("plan_id")
  private String planId = null;

  @JsonProperty("app_guid")
  private String appGuid = null;

  @JsonProperty("bind_resource")
  private ServiceBindingResourceObject bindResource = null;

  @JsonProperty("parameters")
  private Object parameters = null;

  @JsonProperty("predecessor_binding_id")
  private String predecessorBindingId = null;

  public ServiceBindingRequest context(Context context) {
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

  public ServiceBindingRequest serviceId(String serviceId) {
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

  public ServiceBindingRequest planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Get planId
   * @return planId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public ServiceBindingRequest appGuid(String appGuid) {
    this.appGuid = appGuid;
    return this;
  }

  /**
   * Get appGuid
   * @return appGuid
  **/
  @ApiModelProperty(value = "")


  public String getAppGuid() {
    return appGuid;
  }

  public void setAppGuid(String appGuid) {
    this.appGuid = appGuid;
  }

  public ServiceBindingRequest bindResource(ServiceBindingResourceObject bindResource) {
    this.bindResource = bindResource;
    return this;
  }

  /**
   * Get bindResource
   * @return bindResource
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceBindingResourceObject getBindResource() {
    return bindResource;
  }

  public void setBindResource(ServiceBindingResourceObject bindResource) {
    this.bindResource = bindResource;
  }

  public ServiceBindingRequest parameters(Object parameters) {
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

  public ServiceBindingRequest predecessorBindingId(String predecessorBindingId) {
    this.predecessorBindingId = predecessorBindingId;
    return this;
  }

  /**
   * Get predecessorBindingId
   * @return predecessorBindingId
  **/
  @ApiModelProperty(value = "")


  public String getPredecessorBindingId() {
    return predecessorBindingId;
  }

  public void setPredecessorBindingId(String predecessorBindingId) {
    this.predecessorBindingId = predecessorBindingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingRequest serviceBindingRequest = (ServiceBindingRequest) o;
    return Objects.equals(this.context, serviceBindingRequest.context) &&
        Objects.equals(this.serviceId, serviceBindingRequest.serviceId) &&
        Objects.equals(this.planId, serviceBindingRequest.planId) &&
        Objects.equals(this.appGuid, serviceBindingRequest.appGuid) &&
        Objects.equals(this.bindResource, serviceBindingRequest.bindResource) &&
        Objects.equals(this.parameters, serviceBindingRequest.parameters) &&
        Objects.equals(this.predecessorBindingId, serviceBindingRequest.predecessorBindingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, serviceId, planId, appGuid, bindResource, parameters, predecessorBindingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingRequest {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    appGuid: ").append(toIndentedString(appGuid)).append("\n");
    sb.append("    bindResource: ").append(toIndentedString(bindResource)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    predecessorBindingId: ").append(toIndentedString(predecessorBindingId)).append("\n");
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

