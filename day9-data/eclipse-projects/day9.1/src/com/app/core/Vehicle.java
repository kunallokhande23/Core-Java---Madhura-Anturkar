package com.app.core;
/*
 * chasisNo(string) : unique, color(string) , price(double) , manufactureDate(Date)
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	//Vehicle HAS-A chasisNo (composition)
	private String chasisNo;
	private Color color;
	private double price;
	private Date manufactureDate;
	// static data member : SDF
	public static SimpleDateFormat sdf;
	//add explicitly HAS-A (association) relationship between Vehicle  1 -----> 1   DeliveryAddress
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
	//add overloaded ctor : to wrap PK : chasisNo
	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}


	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder("Delivery Address :  ");
		if(address == null)
			sb.append(" Not yet linked !");
		else 
			sb.append(address);
		return "Vehicle chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ sdf.format(manufactureDate) +sb;
	}

	

	// add overriding form of equals , to replace ref equality (inherited from
	// Object class) by content equality : uniquq ID => chasis no
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals");
		if (o instanceof Vehicle) {
			Vehicle anotherVehicle = (Vehicle) o;
			return this.chasisNo.equals(anotherVehicle.chasisNo); 
				//	&& this.manufactureDate.equals(anotherVehicle.manufactureDate);
		}
		return false;
	}
	//add public  non static  method to link delivery address to the sold vehicle
    public void linkDeliveryAddress(String city, String state, String country, String zipCode)
    {
    	//assign delivery address to "this" vehicle
    	this.address=new DeliveryAddress(city, state, country, zipCode);
    }
}
