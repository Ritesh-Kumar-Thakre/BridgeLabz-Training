package com.bridgelabz.oops.objectmodeling.bankaccountholders;

public class BankAssociationDemo {
	 public static void main(String[] args) {

		 Bank sbi = new Bank("State Bank of India");
		 Bank hdfc = new Bank("HDFC Bank");
		 
		 Customer ritesh = new Customer("Ritesh");
		 Customer ram = new Customer("Ram");

		 // Bank communicates with Customer through openAccount()
		 sbi.openAccount(ritesh, "SBI101", 5000);
		 sbi.openAccount(ritesh, "SBI102", 12000);

		 hdfc.openAccount(ram, "HDFC201", 8000);
		 
		 // Customer communicates via viewBalance()
		 ritesh.viewBalance();
		 ram.viewBalance();
	    }
}
