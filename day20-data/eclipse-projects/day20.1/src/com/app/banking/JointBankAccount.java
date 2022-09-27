package com.app.banking;

import static java.lang.Thread.*;

public class JointBankAccount {
	private double balance;

	public JointBankAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	// update balance
	//orig bal = 10000 , amt=1000
	public synchronized void updateBalance(double amt) throws Exception {
		System.out.println("Updating bal : " + currentThread().getName());
		balance = balance + amt;//11K
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(20);
		balance = balance - amt;//10K
		System.out.println("Updations over by " + currentThread().getName());
	}//bal =10K

	// chk balance
	public  synchronized double checkBalance() throws Exception {
		System.out.println("Checking balance : by "+ currentThread().getName());
		Thread.sleep(37);
		return balance;

	}

}
