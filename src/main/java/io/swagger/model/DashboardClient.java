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
 * DashboardClient
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")


public class DashboardClient   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("secret")
  private String secret = null;

  @JsonProperty("redirect_uri")
  private String redirectUri = null;

  public DashboardClient id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DashboardClient secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public DashboardClient redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Get redirectUri
   * @return redirectUri
  **/
  @ApiModelProperty(value = "")


  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardClient dashboardClient = (DashboardClient) o;
    return Objects.equals(this.id, dashboardClient.id) &&
        Objects.equals(this.secret, dashboardClient.secret) &&
        Objects.equals(this.redirectUri, dashboardClient.redirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, secret, redirectUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardClient {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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

