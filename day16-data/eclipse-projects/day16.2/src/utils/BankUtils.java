package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.banking.AcType;
import com.app.banking.BankAccount;
import static com.app.banking.AcType.*;

public class BankUtils {
	// add a static method to return populated Map .
	public static Map<Integer, BankAccount> populateAccountMap() {
		// create empty HM
		HashMap<Integer, BankAccount> accounts = new HashMap<>();
		// acctNo, String customerName, AcType type, LocalDate creationDate, double
		// balance
		System.out.println("added "
				+ accounts.putIfAbsent(101, new BankAccount(101, "Mihir", SAVING, LocalDate.parse("2020-01-01"), 15000)));
		System.out.println("added "
				+ accounts.putIfAbsent(10, new BankAccount(10, "Rama", CURRENT, LocalDate.parse("2021-01-01"), 16000)));
		System.out.println("added "
				+ accounts.putIfAbsent(50, new BankAccount(50, "Raj", SAVING, LocalDate.parse("2019-11-21"), 17000)));
		System.out.println("added "
				+ accounts.putIfAbsent(55, new BankAccount(55, "Anish", FD, LocalDate.parse("2020-06-25"), 150000)));
		System.out.println("added "
				+ accounts.putIfAbsent(25, new BankAccount(25, "Riya", SAVING, LocalDate.parse("2019-04-01"), 13000)));
	
		System.out.println("added "
				+ accounts.putIfAbsent(10, new BankAccount(10, "Ketan", LOAN, LocalDate.parse("2022-01-01"), 12000)));
		System.out.println("size "+accounts.size());//5
		return accounts;
	}
	//add a static method , to return list of Bank accounts which are alrdy populated in a map.
	public static List<BankAccount> populateListFromMap(Map<Integer, BankAccount> acctMap)
	{
		return new ArrayList<>(acctMap.values());
	}

}
