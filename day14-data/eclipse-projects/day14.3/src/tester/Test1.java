package tester;
import static utils.BankUtils.populateAccountMap;

import java.util.Map;

import com.app.banking.BankAccount;

public class Test1 {

	public static void main(String[] args) {
		Map<Integer, BankAccount> accountMap = populateAccountMap();
		System.out.println(accountMap);

	}

}
