package day1.ewalletapp;
import java.util.*;

public abstract class Wallet {
	private double balance;
	protected double transferLimit;
	private List<String> transactionHistory;
	
	Wallet(double initialBalance, double referalBonus){
		this.balance = (initialBalance + referalBonus);
		this.transactionHistory = new ArrayList<>();
		transactionHistory.add("Wallet Initialized with: " + balance);
	}
	
	protected double getBalance() {
		return balance;
	}
	
	protected void updateBalance(double amount) {
		this.balance += amount;
	}
	
	public void addLog(String log) {
		transactionHistory.add(log);
	}
	
	public void viewHistory() {
		System.out.println("Transaction History....................");
		transactionHistory.forEach(System.out::println);
	}

	public abstract void processTransaction(double amount);
}
