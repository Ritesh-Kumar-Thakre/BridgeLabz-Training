package day5.LoanBuddy;

public class AutoLoan extends LoanApplication {

	public AutoLoan(Applicant applicant, int term) {
		super(applicant, term, 10.0);
	}

	@Override
	public boolean approveLoan() {
		if (applicant.getCreditScore() >= 650) {
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
