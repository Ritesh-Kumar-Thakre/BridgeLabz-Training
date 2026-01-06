package day1.ewalletapp;

public class EwalletDemo {
	
	public static void main(String[] args) {
        
		User ravi = new User("Ravi", new PersonalWallet(500.0, 50.0)); 
        User shop = new User("TechLtd", new BusinessWallet(10000.0, 0.0));

        System.out.println("Ravi Balance before: " + ravi.getWallet().getBalance());
        
        ((Transferrable) ravi.getWallet()).transferTo(shop, 200.0);

        System.out.println("Ravi Balance after: " + ravi.getWallet().getBalance());
        System.out.println("TechLtd Balance: " + shop.getWallet().getBalance());

        ravi.getWallet().viewHistory();
    }
}
