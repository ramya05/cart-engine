package com.mmt.services.product.cars;

import java.util.List;

import com.mmt.car.ws.Result;
import com.mmt.services.product.IResponse;

public class CarRS implements IResponse {

	private List<Result> response;
	private String serviceType;
	private String fromCity;
	private String toCity;
	
	public List<Result> getResponse() {
		return response;
	}

	public void setResponse(List<Result> response) {
		this.response = response;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
}
