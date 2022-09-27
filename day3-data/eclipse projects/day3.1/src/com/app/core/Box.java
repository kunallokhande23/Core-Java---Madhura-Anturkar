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

	// add overloaded ctor to init box as a cube
	public Box(double side) {
		// width=depth=height=side;//Against DRY : DO NOT REPEAT YOURSELF!
		// ctor chaining
		this(side, side, side);
	}

	// add another overloaded ctor : no args
	public Box() {
		// width=depth=height=-100;
		this(-100);
	}

	// behavior : non static (instance) methods
	// add a method To return Box details in String form (dimensions of Box)
	public String getBoxDimesions() {
		return "Box Dims " + this.width + " " + this.depth + " " + this.height;// javac impl add this for : width,
																				// depth, height
	}

	// add instance method to return computed volume of the box
	public double getBoxVolume() {
		return width * depth * height;
	}

	// add instance method to chk equality of 2 boxes
	public boolean isEqual(Box anotherBox)  //this=box1(invoker obj ref) , anotherBox=box2 (arg)
	{
		System.out.println("this "+this+" another box "+anotherBox);
		return this.width == anotherBox.width && this.height == anotherBox.height 
				&& this.depth == anotherBox.depth;//"this" : added ONLY for your understanding : Optional
	}
	//add instance method to create a new box with offset dims
	public Box createNewBox(double wOff,double dOff,double hOff)//wOff=3 , dOff=-4 hOff=5 , this=box1
	{
		//this ---> earlier created box
		//creating a new box obj inside a method n returning its ref to the caller
		Box box2=new Box(this.width+wOff, this.depth+dOff, this.height+hOff);
		
		return box2;
	}//rets the ref to the caller : it's copy is reted.

}
