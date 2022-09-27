package com.app.core;
/*
 * chasisNo(string) : unique, color(string) , price(double) , manufactureDate(Date)
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle { // outer class begins
	// Vehicle HAS-A chasisNo (composition)
	private String chasisNo;
	private Color color;
	private double price;
	private Date manufactureDate;
	// static data member : SDF
	public static SimpleDateFormat sdf;
	// add explicitly HAS-A (association) relationship between Vehicle 1 -----> 1
	// DeliveryAddress
	private DeliveryAddress address;

	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Vehicle(String chasisNo, Color color, double price, Date manufactureDate) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}

	// add overloaded ctor : to wrap PK : chasisNo
	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
	//	System.out.println(city);
		StringBuilder sb = new StringBuilder("Delivery Address :  ");
		if (address == null)
			sb.append(" Not yet linked !");
		else
			sb.append(address);
		return "Vehicle chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ sdf.format(manufactureDate) + sb;
	}
	//add setter for price
	public void setPrice(double price) {
		this.price = price;
	}
	
	

	public String getChasisNo() {
		return chasisNo;
	}

	public double getPrice() {
		return price;
	}

	public Color getColor() {
		return color;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	// add overriding form of equals , to replace ref equality (inherited from
	// Object class) by content equality : unique ID => chasis no
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals");
		if (o instanceof Vehicle) {
			Vehicle anotherVehicle = (Vehicle) o;
			return this.chasisNo.equals(anotherVehicle.chasisNo);
			// && this.manufactureDate.equals(anotherVehicle.manufactureDate);
		}
		return false;
	}

	

	// getter for address
	public DeliveryAddress getAddress() {
		return address;
	}

	// add public non static method to link delivery address to the sold vehicle
	public void linkDeliveryAddress(String city, String state, String country1, String zipCode) {
//	System.out.println(this.country);
		// assign delivery address to "this" vehicle
		this.address = new DeliveryAddress(city, state, country1, zipCode);
	//	System.out.println(address.country);
	}

	// embed non static nested class : inner class : DeliveryAddress
	public class DeliveryAddress { // inner class begin
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
			return " [city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + "]";
		}
		//inner class : getter for city

		public String getCity() {
			return city;
		}
		

	} // inner class ends
} // outer class ends
