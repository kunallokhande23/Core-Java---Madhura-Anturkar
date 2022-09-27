package tester;

import static utils.CollectionUtils.*;
import static utils.VehicleValidations.*;

import java.util.List;
import java.util.Scanner;

import com.app.core.Vehicle;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create AL to store vehicle type of refs
			List<Vehicle> vehicles = populateVehicles();// size 0 ,init capa 10 : 1 AL object
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1. Add Vehicle 2.Display al vehicles 3. Get Vehicle Details by PK "
						+ "4. Update Price 5. Delete Vehicle Details 6. Apply discount on selected vehicle 10. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter vehicle details : chasisNo,  color,  price,  manufactureDate(day-mon-yr))");
						Vehicle vehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), vehicles);
						vehicles.add(vehicle);
						System.out.println("vehicle added in the showroom !");
						break;
					case 2:
						System.out.println("Showroom details");
						for (Vehicle v : vehicles)
							System.out.println(v);
						break;
					case 3: // get vehicle details from it's chasis no
						System.out.println("Enter chasis no , to find vehicle details");
						System.out.println(findByChasisNo(sc.next(), vehicles));
						break;
					case 4:
						System.out.println("Enter chasis no  n new price");
						vehicle = findByChasisNo(sc.next(), vehicles);
						// => vehicle found
						vehicle.setPrice(sc.nextDouble());// can add validation of the price! : validatePrice
						System.out.println("price updated....");
						break;
					case 5: // remove vehicle details : if found
						System.out.println("Enter chasis no");
						deleteVehicleDetails(sc.next(), vehicles);
						System.out.println("vehicle details deleted....");
						break;
					case 6:
						System.out.println("Enter date color n discount amount");
						applyDiscount(sc.next(), sc.next(), sc.nextDouble(), vehicles);
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println("err in  main " + e);
				}
				// to clear off pending inputs from scanner till new line
				sc.nextLine();

			}
		} // sc.close();

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main over....");

	}

}
