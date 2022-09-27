package iterators;

import static utils.CollectionUtils.populateVehicles;
import static utils.VehicleValidations.validateColor;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

public class Test3 {

	public static void main(String[] args) {
		// get populated vehicle list
		try (Scanner sc = new Scanner(System.in)) {

			List<Vehicle> vehicles = populateVehicles();
			// display the vehicles --
			// Can you use 1. for loop 2. for-each loop 3. Iterator 4. ListIterator
			// any of above!
			System.out.println("Orig list");
			for (Vehicle v : vehicles)
				System.out.println(v);
			// accept color of a vehicle from the user n remove all the vehicles of the
			// specified clr.
			System.out.println("Enter color");
			Color c = validateColor(sc.next());
			// Can u use for-each ? NO ! , for-each works on a copy !
			// only ways : Iterator or for loop
			Iterator<Vehicle> vehicleItr = vehicles.iterator();
			while (vehicleItr.hasNext())
				if (vehicleItr.next().getColor() == c)
					vehicleItr.remove();
			System.out.println("List after remove ");
			for (Vehicle v : vehicles)
				System.out.println(v);
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
