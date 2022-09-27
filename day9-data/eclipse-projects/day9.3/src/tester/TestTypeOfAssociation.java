package tester;

import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;

public class TestTypeOfAssociation {

	public static void main(String[] args) {
		// Currently what is the type of association between Vehicle n it's Address ?
		//composition
		//Can you create , instance of Address w/o the owning Vehicle ? NO  => composition
	//	DeliveryAddress adr=new DeliveryAddress(null, null, null, null);
		//how to prevent (ie. how to replace aggregation by composition ) --- using nested classes !
		//outer : Vehicle class , non static nested class(inner) : DeliveryAddress
		Vehicle.DeliveryAddress adr=new Vehicle("abc-12345", Color.BLACK,50000,new Date()).
				new DeliveryAddress("a1","b1","c1","65646");
		

	}

}
