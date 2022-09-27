package tester;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;
import static com.app.core.Vehicle.sdf;

public class AddVehicle {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
	//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			// accept vehicle details from user , create it's instance n display the details
			System.out.println("Enter vehicle details : chasisNo,  color,  price,  manufactureDate(day-mon-yr)");
			System.out.println("Available colors "+Arrays.toString(Color.values()));
			Vehicle v1 = new Vehicle(sc.next(),Color.valueOf(sc.next().toUpperCase()), sc.nextDouble(),sdf.parse(sc.next()));
			//=> success
			System.out.println(v1);//v1.toString

		} // sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
