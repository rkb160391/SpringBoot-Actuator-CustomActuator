package com.rkb.actuator.customactuatorendpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "rkb160391", enableByDefault = true)
public class CustomEndpoint {

	@ReadOperation
	public CustomEndpointReponse features() {
		return new CustomEndpointReponse(1111, "Welcome to custom actuator", "200");
	}

}

class CustomEndpointReponse {
	private int id;
	private String status;
	private String statusCode;

	public CustomEndpointReponse(int id, String status, String statusCode) {
		super();
		this.id = id;
		this.status = status;
		this.statusCode = statusCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

}
