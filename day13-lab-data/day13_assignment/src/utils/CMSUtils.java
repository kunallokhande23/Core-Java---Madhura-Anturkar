package utils;

import static com.app.core.Customer.sdf;
import static com.app.core.ServicePlan.DIAMOND;
import static com.app.core.ServicePlan.GOLD;
import static com.app.core.ServicePlan.PLATINUM;
import static com.app.core.ServicePlan.SILVER;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Customer;

public class CMSUtils {
//add a static method to ret populated customer list
	public static List<Customer> populateCustomerList() throws ParseException
	{
		ArrayList<Customer> list=new ArrayList<>();
		//name, String email, String password, double regAmount, Date dob, ServicePlan type
		list.add(new Customer("Riya", "riya@gmail.com", "12345", 1500,sdf.parse("1-2-1994") ,DIAMOND));
		list.add(new Customer("Rutuj", "rutuj@gmail.com", "32345", 1000,sdf.parse("11-3-1994") ,GOLD));
		list.add(new Customer("Anish", "anish@gmail.com", "72345", 2000,sdf.parse("1-2-1993") ,PLATINUM));
		list.add(new Customer("Mihir", "mihir@gmail.com", "52345", 500,sdf.parse("17-12-1994") ,SILVER));
		list.add(new Customer("Raj", "raj@gmail.com", "92345", 1000,sdf.parse("20-11-1992") ,GOLD));
		list.add(new Customer("Sam", "sam@gmail.com", "19345", 1000,sdf.parse("1-12-1994") ,GOLD));
		return list;
	}
}
