package com.bridgelabz.oops.encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable{
	
	private static final double interestRate = 0.07;
	
	public SavingsAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}
	
	@Override 
	public double calculateInterest() {
		return balance*interestRate;
	}
	
	@Override
	public void applyForLoan() {
		System.out.println("Loan Applied for Savings Account");
	}
	
	@Override
	public double calculateLoanEligibility() {
		return balance * 5;  // 5x 
	}
	
}
