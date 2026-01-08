package day5.LoanBuddy;

public abstract class LoanApplication implements IApprovable {

	protected Applicant applicant;
	protected int term;
	protected double interestRate;
	private boolean approved;

	protected LoanApplication(Applicant applicant, int term, double interestRate) {
		this.applicant = applicant;
		this.term = term;
		this.interestRate = interestRate;
	}

	protected double emiFormula(double principal, double rate, int months) {
		double r = rate / (12 * 100);
		return principal * r * Math.pow(1 + r, months) / (Math.pow(1 + r, months) - 1);
	}

	protected void setApproved(boolean status) {
		this.approved = status;
	}

	public boolean isApproved() {
		return approved;
	}
}
