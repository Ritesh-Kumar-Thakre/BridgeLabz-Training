package com.day1.scenarios.banking;

public class Loan {
	private double amount;
	private String loanId;

	public Loan(double amount, String loanId) {
		this.amount = amount;
		this.loanId = loanId;
	}

	public String getInfo() {
		return "Loan " + loanId + " of Rs. " + amount;
	}
}
