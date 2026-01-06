package day1.ewalletapp;

public class PersonalWallet extends Wallet implements Transferrable{
	
	public PersonalWallet(double initialLoad, double bonus) {
        super(initialLoad, bonus);
        this.transferLimit = 1000.0; 
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount <= transferLimit && getBalance() >= amount) {
            this.updateBalance(-amount);
            receiver.getWallet().updateBalance(amount);
            this.addLog("Sent " + amount + " to " + receiver.getName());
            receiver.getWallet().addLog("Received " + amount + " from sender");
        } else {
            System.out.println("Transaction failed: Limit exceeded or Insufficient balance.");
        }
    }

    @Override
    public void processTransaction(double amount) { /* Implementation */ }
}
