package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Customer : id(int) name(string),email(string),password(string),registrationAmount(double),dob(Date)
 * ,type (ServicePlan : enum)
 */
public class Customer implements Comparable<Customer>{
	private int id;
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date dob;
	private ServicePlan type;
	//add id generator : 1 copy
	private static int idGenerator;
	//for parsing n formatting : SDF : 1copy --static
	public static SimpleDateFormat sdf;
	static {
		idGenerator=1;
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	public Customer(String name, String email, String password, double regAmount, Date dob, ServicePlan type) {
		super();
		this.id=idGenerator++;
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.type = type;
	}
	//overloaded ctor , wrapping PK of the Customer
	public Customer(String email) {
		super();
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", regAmount=" + regAmount + ", dob="
				+ sdf.format(dob) + ", type=" + type + "]";
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public double getRegAmount() {
		return regAmount;
	}
	public Date getDob() {
		return dob;
	}
	public ServicePlan getType() {
		return type;
	}
	//to test equality of customers : replace ref equality by content equality
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in customer's equals");
		if(o instanceof Customer)
		{
			Customer c=(Customer) o;
			return this.email.equals(c.email);
		}
		return false;//indicating incompatible type (i.e o IS NOT a Customer!!!!!!!!!!!!!!!!!)		
	}
	
	//imple compareTo
	@Override
	public int compareTo(Customer anotherCustomer)
	{
		System.out.println("in cust's compareTo");
		return this.email.compareTo(anotherCustomer.email);
	}

}
