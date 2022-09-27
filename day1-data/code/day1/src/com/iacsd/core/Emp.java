package com.iacsd.core;
public class Emp {
	//data members : state => instance vars
	//tight encap.
	private int id;
	private String name;
	private double salary;
	//add a parametrized ctor , to init state of emp
	public Emp(int empId,String name,double salary)
	{
		this.id=empId;//this keyword here is : optional
		this.name=name;//this : MANDATORY (o.w will get wrong results : name =null
		this.salary=salary;//this : MANDATORY (o.w will get wrong results : salary =0.0
	}
	//add a method to ret string form of emp details
	public String getEmpDetails() //non static (instance) method
	//can instance method directly access instance vars ? YESS
	{
		return "Emp Details id="+this.id+" name :" +this.name+" sal ="+this.salary;
		//using this keyowrd above : OPTIONAL : reco only for understanding
	}
}