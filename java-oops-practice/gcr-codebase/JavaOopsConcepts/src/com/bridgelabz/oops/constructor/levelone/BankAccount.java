package com.bridgelabz.oops.constructor.levelone;

public class BankAccount {
	public  String accountNumber;
	protected String accountHolder;
	private double balance;
	
	public BankAccount(String accountNumber,String accountHolder,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public void print () {
		System.out.println("accountNumber: "+accountNumber);
		System.out.println("accountHolder: "+accountHolder);
		System.out.println("balance: "+balance);
	}
}
