package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SchemaParameters;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceBindingSchemaObject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class ServiceBindingSchemaObject   {
  @JsonProperty("create")
  private SchemaParameters create = null;

  public ServiceBindingSchemaObject create(SchemaParameters create) {
    this.create = create;
    return this;
  }

  /**
   * Get create
   * @return create
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SchemaParameters getCreate() {
    return create;
  }

  public void setCreate(SchemaParameters create) {
    this.create = create;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingSchemaObject serviceBindingSchemaObject = (ServiceBindingSchemaObject) o;
    return Objects.equals(this.create, serviceBindingSchemaObject.create);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingSchemaObject {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
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

