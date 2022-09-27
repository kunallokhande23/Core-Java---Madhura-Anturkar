package com.app.banking;

import java.time.LocalDate;

import custom_exceptions.BankingException;

import static utils.BankingValidationRules.validateBalance;

/*
 * BankAccount : acctNo(int) , customer name , type(enum) , creationDate(java.time.LocalDate) , 
 * balance(double)
 */
public class BankAccount {
	private int acctNo;
	private String customerName;
	private AcType type;
	private LocalDate creationDate;
	private double balance;
	public BankAccount(int acctNo, String customerName, AcType type, LocalDate creationDate, double balance) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.creationDate = creationDate;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", type=" + type + ", creationDate="
				+ creationDate + ", balance=" + balance + "]";
	}
	//B.L methods 
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	public void withdraw(double amount) throws BankingException
	{
		validateBalance(this.balance-amount);
		this.balance -= amount;
	}
	//funds transfer
	public void fundsTransfer(BankAccount destAcct,double amount) throws BankingException
	{
		this.withdraw(amount);
		destAcct.deposit(amount);
	}
	public int getAcctNo() {
		return acctNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public AcType getType() {
		return type;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public double getBalance() {
		return balance;
	}
	

}
