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
 * Error
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class Error   {
  @JsonProperty("error")
  private String error = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("instance_usable")
  private Boolean instanceUsable = null;

  @JsonProperty("update_repeatable")
  private Boolean updateRepeatable = null;

  public Error error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Error description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Error instanceUsable(Boolean instanceUsable) {
    this.instanceUsable = instanceUsable;
    return this;
  }

  /**
   * Get instanceUsable
   * @return instanceUsable
  **/
  @ApiModelProperty(value = "")


  public Boolean isInstanceUsable() {
    return instanceUsable;
  }

  public void setInstanceUsable(Boolean instanceUsable) {
    this.instanceUsable = instanceUsable;
  }

  public Error updateRepeatable(Boolean updateRepeatable) {
    this.updateRepeatable = updateRepeatable;
    return this;
  }

  /**
   * Get updateRepeatable
   * @return updateRepeatable
  **/
  @ApiModelProperty(value = "")


  public Boolean isUpdateRepeatable() {
    return updateRepeatable;
  }

  public void setUpdateRepeatable(Boolean updateRepeatable) {
    this.updateRepeatable = updateRepeatable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.error, error.error) &&
        Objects.equals(this.description, error.description) &&
        Objects.equals(this.instanceUsable, error.instanceUsable) &&
        Objects.equals(this.updateRepeatable, error.updateRepeatable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, description, instanceUsable, updateRepeatable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instanceUsable: ").append(toIndentedString(instanceUsable)).append("\n");
    sb.append("    updateRepeatable: ").append(toIndentedString(updateRepeatable)).append("\n");
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

