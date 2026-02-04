package com.day1.scenarios.banking;

import java.util.Optional;
public class Account {

	private String accountNumber;
	private Double balance;
	private String nominee;
	private Loan loan;
	private String creditCard;

	public Account(String accountNumber, Double balance, String nominee, Loan loan, String creditCard) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.nominee = nominee;
		this.loan = loan;
		this.creditCard = creditCard;
	}

	public Optional<String> getNominee() {
		return Optional.ofNullable(nominee);
	}

	public Optional<Loan> getLoan() {
		return Optional.ofNullable(loan);
	}

	public Optional<Double> getBalance() {
		return Optional.ofNullable(balance);
	}

	public Optional<String> getCreditCard() {
		return Optional.ofNullable(creditCard);
	}

}
