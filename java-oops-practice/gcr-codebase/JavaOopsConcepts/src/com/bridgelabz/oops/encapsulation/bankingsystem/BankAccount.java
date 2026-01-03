package com.bridgelabz.oops.encapsulation.bankingsystem;

public abstract class BankAccount {
	private String accountNumber;
	private String holderName;
	protected double balance;
	
	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance; 
	}
	
	public String getAccNumber() {
		return accountNumber;
	}
	
	public String getholderName() {
		return holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Amount Deposited Successfully");
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			this.balance -= amount;
			System.out.println("Amount Withdraw Successfully");
		}
	}
	
	public abstract double calculateInterest();
}
