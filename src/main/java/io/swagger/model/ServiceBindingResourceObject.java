package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceBindingResourceObject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class ServiceBindingResourceObject   {
  @JsonProperty("app_guid")
  private String appGuid = null;

  @JsonProperty("route")
  private String route = null;

  public ServiceBindingResourceObject appGuid(String appGuid) {
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

  public ServiceBindingResourceObject route(String route) {
    this.route = route;
    return this;
  }

  /**
   * Get route
   * @return route
  **/
  @ApiModelProperty(value = "")


  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingResourceObject serviceBindingResourceObject = (ServiceBindingResourceObject) o;
    return Objects.equals(this.appGuid, serviceBindingResourceObject.appGuid) &&
        Objects.equals(this.route, serviceBindingResourceObject.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appGuid, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingResourceObject {\n");
    
    sb.append("    appGuid: ").append(toIndentedString(appGuid)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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

