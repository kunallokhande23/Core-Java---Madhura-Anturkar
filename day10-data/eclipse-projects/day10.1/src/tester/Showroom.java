package tester;

import static utils.VehicleValidations.*;

import java.util.Scanner;

import com.app.core.Vehicle;

import custom_exceptions.VehicleValidationException;

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
					System.out.println("Options 1. Add Vehicle 2.Display all vehicles 5. Purchase a Vehicle 10.Exit");
					System.out.println("Choose");
					switch (sc.nextInt()) {
					case 1:
						if (counter < vehicles.length) {
							System.out.println(
									"Enter vehicle details : chasisNo,  color,  price,  manufactureDate(day-mon-yr)");
							Vehicle validVehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(),
									vehicles);
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
								System.out.println(v);// v.toString

						break;
					case 5:
						System.out.println("Enter chasis no for purchasing a vehicle");
						Vehicle v1 = findByChasisNo(sc.next(), vehicles);
						// => vehicle found , now chk if it's sold alrdy
						if (v1.getAddress() != null) // => sold
							throw new VehicleValidationException("Vehicle already sold!!!!!!!!!");
						// => available , ask for address
						System.out.println("Enter delivery address : city state country zip code");
						v1.linkDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
						System.out.println("assigned delivery adr , vehicle ready for dispatch...");
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				//read off all pending tokens till the new line
				sc.nextLine();
			}

		} // sc.close()

	}

}
