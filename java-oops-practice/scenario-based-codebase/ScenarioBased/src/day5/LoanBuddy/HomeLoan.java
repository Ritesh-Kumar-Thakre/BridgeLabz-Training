package day5.LoanBuddy;

public class HomeLoan extends LoanApplication {

	public HomeLoan(Applicant applicant, int term) {
		super(applicant, term, 8.5);
	}

	@Override
	public boolean approveLoan() {
		if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 40000) {
			setApproved(true);
			return true;
		}
		setApproved(false);
		return false;
	}

	@Override
	public double calculateEMI() {
		return emiFormula(applicant.getLoanAmount(), interestRate, term);
	}
}
