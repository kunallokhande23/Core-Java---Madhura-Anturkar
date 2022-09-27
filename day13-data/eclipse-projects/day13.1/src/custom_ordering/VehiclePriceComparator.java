package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehiclePriceComparator implements Comparator<Vehicle>{
	@Override
	public int compare(Vehicle v1,Vehicle v2)
	{
		System.out.println("in compare : price desc ");
		if(v1.getPrice()<v2.getPrice())
			return 1;
		if(v1.getPrice()==v2.getPrice())
			return 0;
		return -1;
			
	}

}
