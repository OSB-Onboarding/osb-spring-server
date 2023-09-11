package io.swagger.api;

import io.swagger.model.AsyncOperation;
import io.swagger.model.Catalog;
import io.swagger.model.Error;
import io.swagger.model.LastOperationResource;
import io.swagger.model.ServiceBindingRequest;
import io.swagger.model.ServiceBindingResource;
import io.swagger.model.ServiceBindingResponse;
import io.swagger.model.ServiceInstanceAsyncOperation;
import io.swagger.model.ServiceInstanceProvisionRequest;
import io.swagger.model.ServiceInstanceProvisionResponse;
import io.swagger.model.ServiceInstanceResource;
import io.swagger.model.ServiceInstanceUpdateRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-09-11T13:35:33.511Z")

@Controller
public class V2ApiController implements V2Api {

    private static final Logger log = LoggerFactory.getLogger(V2ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V2ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Catalog> catalogGet(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Catalog>(objectMapper.readValue("{\"empty\": false}", Catalog.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Catalog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Catalog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceBindingResponse> serviceBindingBinding(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "binding id of binding to create",required=true) @PathVariable("binding_id") String bindingId,@ApiParam(value = "parameters for the requested service binding" ,required=true )  @Valid @RequestBody ServiceBindingRequest body,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "asynchronous operations supported") @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceBindingResponse>(objectMapper.readValue("{\"empty\": false}", ServiceBindingResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceBindingResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceBindingResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceBindingResource> serviceBindingGet(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "binding id of binding to create",required=true) @PathVariable("binding_id") String bindingId,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "id of the service associated with the instance") @Valid @RequestParam(value = "service_id", required = false) String serviceId,@ApiParam(value = "id of the plan associated with the instance") @Valid @RequestParam(value = "plan_id", required = false) String planId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceBindingResource>(objectMapper.readValue("{\"empty\": false}", ServiceBindingResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceBindingResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceBindingResource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LastOperationResource> serviceBindingLastOperationGet(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "binding id of binding to create",required=true) @PathVariable("binding_id") String bindingId,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "id of the service associated with the instance") @Valid @RequestParam(value = "service_id", required = false) String serviceId,@ApiParam(value = "id of the plan associated with the instance") @Valid @RequestParam(value = "plan_id", required = false) String planId,@ApiParam(value = "a provided identifier for the operation") @Valid @RequestParam(value = "operation", required = false) String operation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LastOperationResource>(objectMapper.readValue("{\"empty\": false}", LastOperationResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LastOperationResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LastOperationResource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> serviceBindingUnbinding(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "binding id of binding to create",required=true) @PathVariable("binding_id") String bindingId,@NotNull @ApiParam(value = "id of the service associated with the instance being deleted", required = true) @Valid @RequestParam(value = "service_id", required = true) String serviceId,@NotNull @ApiParam(value = "id of the plan associated with the instance being deleted", required = true) @Valid @RequestParam(value = "plan_id", required = true) String planId,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "asynchronous operations supported") @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> serviceInstanceDeprovision(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@NotNull @ApiParam(value = "id of the service associated with the instance being deleted", required = true) @Valid @RequestParam(value = "service_id", required = true) String serviceId,@NotNull @ApiParam(value = "id of the plan associated with the instance being deleted", required = true) @Valid @RequestParam(value = "plan_id", required = true) String planId,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "asynchronous operations supported") @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceInstanceResource> serviceInstanceGet(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "id of the service associated with the instance") @Valid @RequestParam(value = "service_id", required = false) String serviceId,@ApiParam(value = "id of the plan associated with the instance") @Valid @RequestParam(value = "plan_id", required = false) String planId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceInstanceResource>(objectMapper.readValue("{\"empty\": false}", ServiceInstanceResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceInstanceResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceInstanceResource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LastOperationResource> serviceInstanceLastOperationGet(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "id of the service associated with the instance") @Valid @RequestParam(value = "service_id", required = false) String serviceId,@ApiParam(value = "id of the plan associated with the instance") @Valid @RequestParam(value = "plan_id", required = false) String planId,@ApiParam(value = "a provided identifier for the operation") @Valid @RequestParam(value = "operation", required = false) String operation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LastOperationResource>(objectMapper.readValue("{\"empty\": false}", LastOperationResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LastOperationResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LastOperationResource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceInstanceProvisionResponse> serviceInstanceProvision(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "parameters for the requested service instance provision" ,required=true )  @Valid @RequestBody ServiceInstanceProvisionRequest body,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "asynchronous operations supported") @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceInstanceProvisionResponse>(objectMapper.readValue("{\"empty\": false}", ServiceInstanceProvisionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceInstanceProvisionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceInstanceProvisionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> serviceInstanceUpdate(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "parameters for the requested service instance update" ,required=true )  @Valid @RequestBody ServiceInstanceUpdateRequest body,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "asynchronous operations supported") @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{  \"bytes\": [    123,    125  ],  \"empty\": false}", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
