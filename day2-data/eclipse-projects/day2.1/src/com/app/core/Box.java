package com.app.core;

/*
 * Create a class to represent 3D Box , in a package : com.app.core
class Box ---tight encapsulation(achieved by making all non static data members:instance vars private)
state -- width,height , depth --- double : private 
paramterized constr --3 arg constr.
Instance Methods(=non static methods)
1. To return Box details in String form (dimensions of Box)

method declaration --- access specifier(private/default/protected/public) , ret type , name , args
method definition --body

2. To return computed volume of the box.
 */
public class Box {
	// DATA : state of the object
	private double width, depth, height;

	// add a paramterized ctor : to init complete state of the box
	public Box(double width, double d, double height) {
		this.width = width;
		depth = d;// this.depth=d;
		this.height = height;
	}
	//behavior : non static (instance) methods
	// add a method To return Box details in String form (dimensions of Box)
	public String getBoxDimesions()
	{
		return "Box Dims "+this.width+" "+this.depth+" "+this.height;//javac impl add this for : width, depth, height
	}
	//add instance method to return computed volume of the box
	public double getBoxVolume()
	{
		return width*depth*height;
	}
	

}
