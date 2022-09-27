package tester;

import static com.app.core.Vehicle.sdf;

import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

public class DupVehicles2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
				// accept vehicle details from user , create it's instance n display the details
			System.out.println("Enter vehicle details : chasisNo,  color,  price,  manufactureDate(day-mon-yr)");
				Object v1 = new Vehicle(sc.next(),Color.valueOf(sc.next().toUpperCase()), sc.nextDouble(),sdf.parse(sc.next()));
			//=> success
			System.out.println(v1);//v1.toString
			System.out.println("Enter another vehicle details : chasisNo,  color,  price,  manufactureDate(day-mon-yr)");
			Object v2 = new Vehicle(sc.next(),Color.valueOf(sc.next().toUpperCase()), sc.nextDouble(),sdf.parse(sc.next()));
			System.out.println(v2);//v2.toString
			System.out.println(v1.equals(v2));//Should ret true iff : chasis no is same , ow. false
	//		System.out.println(v1.hashCode()+" "+v2.hashCode());
			String s="hello";
			System.out.println(v1.equals(s));
			Vehicle dummyVehicle=null;
			System.out.println(v1.equals(dummyVehicle));

		} // sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
