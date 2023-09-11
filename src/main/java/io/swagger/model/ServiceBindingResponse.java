package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ServiceBindingEndpoint;
import io.swagger.model.ServiceBindingMetadata;
import io.swagger.model.ServiceBindingVolumeMount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceBindingResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class ServiceBindingResponse   {
  @JsonProperty("metadata")
  private ServiceBindingMetadata metadata = null;

  @JsonProperty("credentials")
  private Object credentials = null;

  @JsonProperty("syslog_drain_url")
  private String syslogDrainUrl = null;

  @JsonProperty("route_service_url")
  private String routeServiceUrl = null;

  @JsonProperty("volume_mounts")
  @Valid
  private List<ServiceBindingVolumeMount> volumeMounts = null;

  @JsonProperty("endpoints")
  @Valid
  private List<ServiceBindingEndpoint> endpoints = null;

  public ServiceBindingResponse metadata(ServiceBindingMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceBindingMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ServiceBindingMetadata metadata) {
    this.metadata = metadata;
  }

  public ServiceBindingResponse credentials(Object credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")


  public Object getCredentials() {
    return credentials;
  }

  public void setCredentials(Object credentials) {
    this.credentials = credentials;
  }

  public ServiceBindingResponse syslogDrainUrl(String syslogDrainUrl) {
    this.syslogDrainUrl = syslogDrainUrl;
    return this;
  }

  /**
   * Get syslogDrainUrl
   * @return syslogDrainUrl
  **/
  @ApiModelProperty(value = "")


  public String getSyslogDrainUrl() {
    return syslogDrainUrl;
  }

  public void setSyslogDrainUrl(String syslogDrainUrl) {
    this.syslogDrainUrl = syslogDrainUrl;
  }

  public ServiceBindingResponse routeServiceUrl(String routeServiceUrl) {
    this.routeServiceUrl = routeServiceUrl;
    return this;
  }

  /**
   * Get routeServiceUrl
   * @return routeServiceUrl
  **/
  @ApiModelProperty(value = "")


  public String getRouteServiceUrl() {
    return routeServiceUrl;
  }

  public void setRouteServiceUrl(String routeServiceUrl) {
    this.routeServiceUrl = routeServiceUrl;
  }

  public ServiceBindingResponse volumeMounts(List<ServiceBindingVolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public ServiceBindingResponse addVolumeMountsItem(ServiceBindingVolumeMount volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<ServiceBindingVolumeMount>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

  /**
   * Get volumeMounts
   * @return volumeMounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ServiceBindingVolumeMount> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List<ServiceBindingVolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  public ServiceBindingResponse endpoints(List<ServiceBindingEndpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public ServiceBindingResponse addEndpointsItem(ServiceBindingEndpoint endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<ServiceBindingEndpoint>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

  /**
   * Get endpoints
   * @return endpoints
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ServiceBindingEndpoint> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<ServiceBindingEndpoint> endpoints) {
    this.endpoints = endpoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingResponse serviceBindingResponse = (ServiceBindingResponse) o;
    return Objects.equals(this.metadata, serviceBindingResponse.metadata) &&
        Objects.equals(this.credentials, serviceBindingResponse.credentials) &&
        Objects.equals(this.syslogDrainUrl, serviceBindingResponse.syslogDrainUrl) &&
        Objects.equals(this.routeServiceUrl, serviceBindingResponse.routeServiceUrl) &&
        Objects.equals(this.volumeMounts, serviceBindingResponse.volumeMounts) &&
        Objects.equals(this.endpoints, serviceBindingResponse.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, credentials, syslogDrainUrl, routeServiceUrl, volumeMounts, endpoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingResponse {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    syslogDrainUrl: ").append(toIndentedString(syslogDrainUrl)).append("\n");
    sb.append("    routeServiceUrl: ").append(toIndentedString(routeServiceUrl)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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

