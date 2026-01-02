package com.bridgelabz.oops.objectmodeling.bankaccountholders;
import java.util.*;
public class Bank {
	private String bankName;
    private List<Customer> customerList = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    // Association communication method
    public void openAccount(Customer customer, String accNo, double amount) {

        Account newAccount = new Account(accNo, amount, this);

        customer.addAccount(newAccount);
        customerList.add(customer);

        System.out.println("Account opened in " + bankName +
                " for customer " + customer);
    }

}
