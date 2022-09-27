package iterators;
import static utils.CollectionUtils.populateVehicles;

import java.util.Iterator;
import java.util.List;

import com.app.core.Vehicle;

public class Test2 {

	public static void main(String[] args) {
		// get populated vehicle list
		try {
			
			List<Vehicle> vehicles = populateVehicles();
			//Can you attach an iterator to list ? YES (since it's Iterable)
			Iterator<Vehicle> itr=vehicles.iterator();
	//		System.out.println("class name "+itr.getClass());//non static nested class (inner)  class that imple Iterator 
			//Itr placed before the 1st elem (-1)
	//		itr.remove();//java.lang.IllegalStateExc
			System.out.println("Vehicles via Iterator : ");
			while(itr.hasNext())//chks if the leme exists 
			{
				System.out.println(itr.next());//passes the itr over the elem , rets elem that it passed over.
				itr.remove();
		//		itr.remove(); un comment in the lab to understand the exc.
				
			}
			System.out.println(vehicles);//[] : empty list
	
				
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
