package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehicleDatePriceComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		System.out.println("in compare : date n price");
		int ret = o1.getManufactureDate().compareTo(o2.getManufactureDate());
		if (ret == 0) {
			// dates are same ---so now compare by price : asc
//			if (o1.getPrice() < o2.getPrice())
//				return -1;
//			if (o1.getPrice() == o2.getPrice())
//				return 0;
//			return 1;
			return ((Double)o1.getPrice()).compareTo(o2.getPrice());
		}
		return ret;
	}

}
