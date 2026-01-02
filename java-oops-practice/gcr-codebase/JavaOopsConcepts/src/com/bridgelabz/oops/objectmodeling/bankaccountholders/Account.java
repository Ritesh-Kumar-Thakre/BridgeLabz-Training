package com.bridgelabz.oops.objectmodeling.bankaccountholders;

public class Account {
	private String accountNumber;
	private double balance;
	private Bank bank;
	
	public Account(String accountNumber,double balance,Bank bank) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.bank=bank;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Bank getBank() {
		return bank;
	}
}
