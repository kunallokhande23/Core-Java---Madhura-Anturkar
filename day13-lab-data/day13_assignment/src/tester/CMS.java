package tester;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import static utils.CMSUtils.populateCustomerList;
import static utils.CMSValidationRules.checkForDup;
import static com.app.core.Customer.sdf;

public class CMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated list of custs
			List<Customer> customerList = populateCustomerList();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1:Add Customer 2. Display All 3. Sort customers as per email 10.Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1: // register customer
						System.out.println(
								"Enter Customer details : name,  email,  password,  regAmount,  dob(dd-MM-yyyy), service type");
						customerList.add(new Customer(sc.next(), checkForDup(sc.next(), customerList), sc.next(),
								sc.nextDouble(), sdf.parse(sc.next()), ServicePlan.valueOf(sc.next().toUpperCase())));
						System.out.println("customer reg done...............");
						break;
					case 2:
						System.out.println("All customers");
						for (Customer c : customerList)
							System.out.println(c);

						break;
					case 3:
						Collections.sort(customerList);
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// removel pending inputs from the scanner : till new line
					sc.nextLine();
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
