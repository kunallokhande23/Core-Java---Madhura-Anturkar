package utils;

import java.text.ParseException;
import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exceptions.VehicleValidationException;
import static com.app.core.Vehicle.sdf;

public class VehicleValidations {
	public static final double MIN_PRICE;
	public static final double MAX_PRICE;
	static {
		MIN_PRICE = 10000;
		MAX_PRICE = 100000;
	}

	// add public static method for validating all i/ps
	public static Vehicle validateAllInputs(String chasisNo, String color, double price, String manufactureDate)
			throws VehicleValidationException, ParseException {
		//skipping validation for chasis no : currently!!!!
		Color clr = validateColor(color);
		double validPrice = validatePrice(price);
		Date validDate = validateDate(manufactureDate);
		//=> al i/ps valid
		return new Vehicle(chasisNo, clr, validPrice, validDate);		
	}

	// add public static method for validating price
	public static double validatePrice(double price) throws VehicleValidationException {
		if (price < MIN_PRICE || price > MAX_PRICE)
			throw new VehicleValidationException("Invalid Price !!!!!!!!!!!!");
		// => price : valid
		return price;
	}

	// add public static method for validating color
	public static Color validateColor(String clr) throws IllegalArgumentException {
		return Color.valueOf(clr.toUpperCase());
	}

	// add public static method to validate manufacture date : manufactureDate :
	// must be in current financial year(1st Apr 2022 ---31st Mar 2023)
	// method decl :
	public static Date validateDate(String date) throws ParseException, VehicleValidationException {
		// 1. parsing (conversion String ---> Date)
		Date d1 = sdf.parse(date);
		// => conversion success ---> proceed to validations
		Date start = sdf.parse("1-4-2022");
		Date end = sdf.parse("31-3-2023");
		// chk range
		if (d1.before(start) || d1.after(end))
			throw new VehicleValidationException("Manufacturing Date out of range!!!!!!!!!!!!!!");
		return d1;
	}

}
