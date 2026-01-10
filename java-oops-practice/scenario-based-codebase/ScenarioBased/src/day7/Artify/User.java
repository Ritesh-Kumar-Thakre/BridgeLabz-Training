package day7.Artify;

public class User {
	String name;
	double walletBalance;
	
	public User(String name, double walletBalance) {
		this.name=name;
		this.walletBalance=walletBalance;
	}
	
	public void printUser() {
		System.out.println("--------New Owner-------");
		System.out.println("Name: "+name);
		System.out.println("Wallet Balance: "+walletBalance);
	}
}
