package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.app.core.Vehicle;

import custom_ordering.VehiclePriceComparator;
import utils.CollectionUtils;
import static utils.CollectionUtils.populateVehicles;

public class SortList2 {

	public static void main(String[] args) {
		try {
			// get populated list of vehicles
			List<Vehicle> vehicles = populateVehicles();
			//display vehicles
			System.out.println("Vehicle List ");
			for(Vehicle v : vehicles)
				System.out.println(v);//ordered list
			//Collections.sort(List<T> , Comparator c)
			//c => instance of the class that imple. Comaprator
			Collections.sort(vehicles,new VehiclePriceComparator());
			System.out.println("Vehicle List Again ");
			for(Vehicle v : vehicles)
				System.out.println(v);//ordered list
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
