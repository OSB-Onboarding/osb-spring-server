package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ServiceBindingSchemaObject;
import io.swagger.model.ServiceInstanceSchemaObject;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SchemasObject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class SchemasObject   {
  @JsonProperty("service_instance")
  private ServiceInstanceSchemaObject serviceInstance = null;

  @JsonProperty("service_binding")
  private ServiceBindingSchemaObject serviceBinding = null;

  public SchemasObject serviceInstance(ServiceInstanceSchemaObject serviceInstance) {
    this.serviceInstance = serviceInstance;
    return this;
  }

  /**
   * Get serviceInstance
   * @return serviceInstance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceInstanceSchemaObject getServiceInstance() {
    return serviceInstance;
  }

  public void setServiceInstance(ServiceInstanceSchemaObject serviceInstance) {
    this.serviceInstance = serviceInstance;
  }

  public SchemasObject serviceBinding(ServiceBindingSchemaObject serviceBinding) {
    this.serviceBinding = serviceBinding;
    return this;
  }

  /**
   * Get serviceBinding
   * @return serviceBinding
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceBindingSchemaObject getServiceBinding() {
    return serviceBinding;
  }

  public void setServiceBinding(ServiceBindingSchemaObject serviceBinding) {
    this.serviceBinding = serviceBinding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemasObject schemasObject = (SchemasObject) o;
    return Objects.equals(this.serviceInstance, schemasObject.serviceInstance) &&
        Objects.equals(this.serviceBinding, schemasObject.serviceBinding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceInstance, serviceBinding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasObject {\n");
    
    sb.append("    serviceInstance: ").append(toIndentedString(serviceInstance)).append("\n");
    sb.append("    serviceBinding: ").append(toIndentedString(serviceBinding)).append("\n");
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

