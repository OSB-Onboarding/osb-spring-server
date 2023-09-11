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
 * ServiceBindingMetadata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class ServiceBindingMetadata   {
  @JsonProperty("expires_at")
  private String expiresAt = null;

  @JsonProperty("renew_before")
  private String renewBefore = null;

  public ServiceBindingMetadata expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
  **/
  @ApiModelProperty(value = "")


  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public ServiceBindingMetadata renewBefore(String renewBefore) {
    this.renewBefore = renewBefore;
    return this;
  }

  /**
   * Get renewBefore
   * @return renewBefore
  **/
  @ApiModelProperty(value = "")


  public String getRenewBefore() {
    return renewBefore;
  }

  public void setRenewBefore(String renewBefore) {
    this.renewBefore = renewBefore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingMetadata serviceBindingMetadata = (ServiceBindingMetadata) o;
    return Objects.equals(this.expiresAt, serviceBindingMetadata.expiresAt) &&
        Objects.equals(this.renewBefore, serviceBindingMetadata.renewBefore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, renewBefore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingMetadata {\n");
    
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    renewBefore: ").append(toIndentedString(renewBefore)).append("\n");
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

