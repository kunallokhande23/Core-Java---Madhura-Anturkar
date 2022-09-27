package tester;

import com.app.core.DeliveryAddress;

public class TestTypeOfAssociation {

	public static void main(String[] args) {
		// Currently what is the type of assoication between Vehicle n it's Address ?
		//aggregation
		//Can you create , instance of Address w/o the owning Vehicle ? YES => aggregation
		DeliveryAddress adr=new DeliveryAddress(null, null, null, null);
		//how to prevent (ie. how to replace aggregation by composition ) --- using nested classes !
		

	}

}
