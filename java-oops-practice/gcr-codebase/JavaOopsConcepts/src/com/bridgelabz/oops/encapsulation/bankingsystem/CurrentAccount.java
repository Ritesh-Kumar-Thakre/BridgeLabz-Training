package com.bridgelabz.oops.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable{
	
	private static final double interestRate = 0.03;
	
	CurrentAccount(String accountNumber, String holderName, double balance){
		super(accountNumber, holderName, balance);
	}
	
	@Override
	public double calculateInterest() {
		return balance * interestRate;
	}
	
	@Override
	public void applyForLoan() {
		System.out.println("Loan Applied for Current Account");
	}
	
	@Override
	public double calculateLoanEligibility() {
		return balance * 10; // 10x 
	}
	
}
