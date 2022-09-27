package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;
import static utils.VehicleValidations.validateAllInputs;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter showroom capacity");
			// create suitable D.S (data structure) for storing Vehicle type of refs.
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];// 1 array obj : filled with nulls
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				try {
					System.out.println("Options 1. Add Vehicle 2.Display all vehicles 10.Exit");
					System.out.println("Choose");
					switch (sc.nextInt()) {
					case 1:
						if (counter < vehicles.length) {
							System.out.println(
									"Enter vehicle details : chasisNo,  color,  price,  manufactureDate(day-mon-yr)");
							Vehicle validVehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next());
							// => success
							vehicles[counter++] = validVehicle;
							System.out.println("vehicle added to the showroom.....");

						} else
							System.out.println("Showroom full!!!!!!");

						break;
					case 2:
						System.out.println("Showroom Details");
						for (Vehicle v : vehicles)
							if (v != null)
								System.out.println(v);//v.toString

						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} // sc.close()

	}

}
