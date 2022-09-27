package utils;

import java.util.List;

import com.app.core.Customer;

import custom_exceptions.CustomerHandlingException;

public class CMSValidationRules {
//add static method to chk for dup customer
	public static String checkForDup(String email,List<Customer> customers) throws CustomerHandlingException
	{
		//since it's searching by PK --email -- contains --internally will call Customer's equals
		Customer c=new Customer(email);
		if(customers.contains(c))
			throw new CustomerHandlingException("Dup Email found !!!!!!!!!!!!!!");
		//=> new email
		return email;	
	}
}
