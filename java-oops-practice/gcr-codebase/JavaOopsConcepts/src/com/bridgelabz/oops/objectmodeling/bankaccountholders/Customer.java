package com.bridgelabz.oops.objectmodeling.bankaccountholders;
import java.util.*;
public class Customer {
	private String name;
	private List<Account> accountList= new ArrayList<>();
	
	public Customer(String name) {
		this.name=name;
	}
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public void viewBalance() {
		System.out.println("\nCutomer: "+name+" -- Accounts Summary");
		
		for(Account acc: accountList) {
			System.out.println("Bank: " + acc.getBank().getBankName()+ " | Balance: ₹" + acc.getBalance());
		}
	}
}
