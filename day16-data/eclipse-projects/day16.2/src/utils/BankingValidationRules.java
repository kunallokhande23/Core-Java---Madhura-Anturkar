package utils;

import custom_exceptions.BankingException;

public class BankingValidationRules {
	private static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}

	// add a static method for validating balance
	public static double validateBalance(double balance) throws BankingException {
		if (balance < MIN_BALANCE)
			throw new BankingException("Insufficient Balance !!!!!!!!!!!!");
		return balance;
	}

}
