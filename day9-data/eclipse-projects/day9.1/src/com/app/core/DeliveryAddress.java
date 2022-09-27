package com.app.core;

public class DeliveryAddress {
	private String city;
	private String state;
	private String country;
	private String zipCode;
	public DeliveryAddress(String city, String state, String country, String zipCode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return " [city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode
				+ "]";
	}
	

}
