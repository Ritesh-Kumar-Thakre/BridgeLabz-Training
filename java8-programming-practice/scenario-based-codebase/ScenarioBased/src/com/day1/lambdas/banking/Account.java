package com.day1.lambdas.banking;

public class Account {
	String holderName;
	double balance;

	public Account(String holderName, double balance) {
		this.holderName = holderName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return holderName + " - Balance: ₹" + balance;
	}
}
