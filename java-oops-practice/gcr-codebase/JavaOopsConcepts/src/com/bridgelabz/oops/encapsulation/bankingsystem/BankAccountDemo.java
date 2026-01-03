package com.bridgelabz.oops.encapsulation.bankingsystem;

public class BankAccountDemo {
	public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA101", "Vedansh", 20000);
        BankAccount acc2 = new CurrentAccount("CA201", "Amit", 50000);

        processAccount(acc1);
        System.out.println("---------------------------------------");
        processAccount(acc2);
    }

    // Polymorphism 
    public static void processAccount(BankAccount account) {
        account.deposit(3400);
        account.withdraw(4900);

        System.out.println("Account Holder: " + account.getholderName());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Interest: " + account.calculateInterest());

        if (account instanceof Loanable) {
            Loanable loanAcc = (Loanable) account;
            loanAcc.applyForLoan();
            System.out.println("Loan Eligibility: ₹" + loanAcc.calculateLoanEligibility());
        }
    }
}
