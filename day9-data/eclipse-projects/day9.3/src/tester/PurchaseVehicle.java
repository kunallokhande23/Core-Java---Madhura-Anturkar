package tester;

import static com.app.core.Vehicle.sdf;

import java.util.Arrays;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

public class PurchaseVehicle {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// accept vehicle details from user , create it's instance n display the details
			System.out.println("Enter vehicle details : chasisNo,  color,  price,  manufactureDate(day-mon-yr)");
			
			Vehicle v1 = new Vehicle(sc.next(),Color.valueOf(sc.next().toUpperCase()), sc.nextDouble(),sdf.parse(sc.next()));
			//=> success
			System.out.println(v1);//v1.toString
			System.out.println("Enter delivery address : city state country zip code");
			v1.linkDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
			System.out.println(v1);

		} // sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
