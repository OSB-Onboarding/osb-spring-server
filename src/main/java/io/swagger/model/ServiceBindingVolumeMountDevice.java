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
 * ServiceBindingVolumeMountDevice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class ServiceBindingVolumeMountDevice   {
  @JsonProperty("volume_id")
  private String volumeId = null;

  @JsonProperty("mount_config")
  private Object mountConfig = null;

  public ServiceBindingVolumeMountDevice volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  /**
   * Get volumeId
   * @return volumeId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }

  public ServiceBindingVolumeMountDevice mountConfig(Object mountConfig) {
    this.mountConfig = mountConfig;
    return this;
  }

  /**
   * Get mountConfig
   * @return mountConfig
  **/
  @ApiModelProperty(value = "")


  public Object getMountConfig() {
    return mountConfig;
  }

  public void setMountConfig(Object mountConfig) {
    this.mountConfig = mountConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingVolumeMountDevice serviceBindingVolumeMountDevice = (ServiceBindingVolumeMountDevice) o;
    return Objects.equals(this.volumeId, serviceBindingVolumeMountDevice.volumeId) &&
        Objects.equals(this.mountConfig, serviceBindingVolumeMountDevice.mountConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeId, mountConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingVolumeMountDevice {\n");
    
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    mountConfig: ").append(toIndentedString(mountConfig)).append("\n");
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

