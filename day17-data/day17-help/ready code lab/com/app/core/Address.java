package com.app.core;

public class Address {

	
	private String city, state, phoneNo;

	public Address(String city, String state, String phoneNo) {
		super();
		this.city = city;
		this.state = state;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", phoneNo=" + phoneNo + "]";
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

}
