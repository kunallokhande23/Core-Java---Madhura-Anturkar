package tester;

import static utils.CollectionUtils.*;
import static utils.VehicleValidations.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Vehicle;

import custom_exceptions.VehicleValidationException;
import custom_ordering.VehicleDatePriceComparator;
import custom_ordering.VehiclePriceComparator;

public class Showroom {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// create AL to store vehicle type of refs
			List<Vehicle> vehicles = populateVehicles();// size 5 ,init capa 10 : 1 AL object
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1. Add Vehicle 2.Display al vehicles 3. Get Vehicle Details by PK "
						+ "4. Update Price 5. Delete Vehicle Details 6. Apply discount on selected vehicle "
						+ "7. Purchase a Vehicle 8. Display vehicle's  chasis no n price 9. Sort Vehicles as per chasis no "
						+ "10. Sort as per price desc 11. Sort vehicles as per date n price 12.Sort as per price asc using ano inner class 100. Exit");
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
						vehicle.setPrice(validatePrice(sc.nextDouble()));
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
					case 7:
						System.out.println("Enter Chasis No");
						vehicle = findByChasisNo(sc.next(), vehicles);
						// => vehicle found by chasis no
						// null chking of delivery adr
						if (vehicle.getAddress() == null) {
							// =>vehicle is not yet sold --prompt for adr
							System.out.println("Enter delivery adr : city,  state,  country,  zipCode");
							vehicle.linkDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
							System.out.println("delivery adr assigned to the vehicle ...");
						} else
							throw new VehicleValidationException("Vehicle already sold !!!!!!!!!!!!");
						break;
					case 8:
						System.out.println("Enter city");
						String city = sc.next();
						// add a flag or counter to find out if any vehicle matched !!!!!!!!! : Lab work
						for (Vehicle v : vehicles)
							if (v.getAddress() != null && v.getAddress().getCity().equals(city)) {
								System.out.println("Chasis No " + v.getChasisNo() + " Price " + v.getPrice());
								// counter++
							}
						break;
					case 9:
						// Natural ordering : chasis no
						Collections.sort(vehicles);
						break;
					case 10:
						// Custom ordering : desc price
						Collections.sort(vehicles, new VehiclePriceComparator());
						break;
					case 11:
						// custom ordering date n price based
						Collections.sort(vehicles, new VehicleDatePriceComparator());
						break;
					case 12:
						Collections.sort(vehicles, new Comparator<Vehicle>() 
						{//anonymous inner cls begin 

							@Override
							public int compare(Vehicle o1, Vehicle o2) {
								System.out.println("in ano inner : price asc");
								return ((Double) o1.getPrice()).compareTo(o2.getPrice());
							}

						}//anonymous inner cls ends
						);
						break;

					case 100:
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
