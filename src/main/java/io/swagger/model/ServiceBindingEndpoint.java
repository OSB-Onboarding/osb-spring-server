package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceBindingEndpoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class ServiceBindingEndpoint   {
  @JsonProperty("host")
  private String host = null;

  @JsonProperty("ports")
  @Valid
  private List<String> ports = new ArrayList<String>();

  /**
   * Gets or Sets protocol
   */
  public enum ProtocolEnum {
    TCP("tcp"),
    
    UDP("udp"),
    
    ALL("all");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProtocolEnum fromValue(String text) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("protocol")
  private ProtocolEnum protocol = ProtocolEnum.TCP;

  public ServiceBindingEndpoint host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ServiceBindingEndpoint ports(List<String> ports) {
    this.ports = ports;
    return this;
  }

  public ServiceBindingEndpoint addPortsItem(String portsItem) {
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Get ports
   * @return ports
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getPorts() {
    return ports;
  }

  public void setPorts(List<String> ports) {
    this.ports = ports;
  }

  public ServiceBindingEndpoint protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")


  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingEndpoint serviceBindingEndpoint = (ServiceBindingEndpoint) o;
    return Objects.equals(this.host, serviceBindingEndpoint.host) &&
        Objects.equals(this.ports, serviceBindingEndpoint.ports) &&
        Objects.equals(this.protocol, serviceBindingEndpoint.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, ports, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingEndpoint {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

