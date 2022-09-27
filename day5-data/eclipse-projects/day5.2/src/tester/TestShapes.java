package tester;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class TestShapes {

	public static void main(String[] args) {
		//BoundedShape shape=new BoundedShape(10,20); 
		// create some bounded shapes using dyn init of array
		BoundedShape[] shapes= {new Circle(10, 20, 10.6),new Rectangle(30, 60, 10, 13.4)};//3 objs
		for(BoundedShape s : shapes)
		{
			System.out.println(s);//s.toString
			System.out.println(s.area());
		}

	}

}
