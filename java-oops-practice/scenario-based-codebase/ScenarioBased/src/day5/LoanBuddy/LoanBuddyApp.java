package day5.LoanBuddy;

public class LoanBuddyApp {

	public static void main(String[] args) {

		Applicant a1 = new Applicant("Ritesh", 720, 60000, 800000);

		LoanApplication loan = new HomeLoan(a1, 240);

		if (loan.approveLoan()) {
			System.out.println("Loan Approved");
			System.out.println("Monthly EMI: ₹" + loan.calculateEMI());
		} else {
			System.out.println("Loan Rejected");
		}
	}
}
