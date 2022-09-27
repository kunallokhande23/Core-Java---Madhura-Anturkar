package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.app.core.Vehicle;

import utils.CollectionUtils;
import static utils.CollectionUtils.populateVehicles;

public class SortIntegerList {

	public static void main(String[] args) {
		try {
			int[] data = { 12, 3, 45, 123, -80, 90, 100 };
			ArrayList<Integer> list = new ArrayList<>();
			for (int i : data)
				list.add(i);// int ---> Integer : javac : autoboxing
			System.out.println(list);// ordered list
			// Collection frmwork => ready made imple of std algo : DSA --
			// Collections : class from java.utils
			// Collections.sort(List<T> list)
			Collections.sort(list);
			System.out.println(list);// asc : sorted
			// let's try sorting our UDT list : List<Vehicle>
			// get populated list of vehicles
			List<Vehicle> vehicles = populateVehicles();
			//display vehicles
			System.out.println("Vehicle List ");
			for(Vehicle v : vehicles)
				System.out.println(v);//ordered list
			Collections.sort(vehicles);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
