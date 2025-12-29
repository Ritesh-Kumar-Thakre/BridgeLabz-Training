package com.bridgelabz.oops.constructor.levelone;

public class SavingsAccount extends BankAccount {
	public SavingsAccount(String accountNumber,String accountHolder,double balance) {
		super(accountNumber, accountHolder, balance);
	}
	
	public void accountDetails() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Balance: "+getBalance());
	}
	public static void main(String[] args) {
		SavingsAccount saving=new SavingsAccount("SBIN0231383", "Ritesh Thakre", 39789.43);
		saving.print();

	}
}
