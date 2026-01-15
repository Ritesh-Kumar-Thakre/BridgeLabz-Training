package day8.BudgetWise;

public class AnnualBudget extends Budget {

	private int year;

	public AnnualBudget(int year, double income) {
		super(income);
		this.year = year;
	}

	@Override
	public void generateReport() {
		System.out.println("\n=== Annual Report (" + year + ") ===");
		System.out.println("Total Income: " + income);
		System.out.println("Total Expenses: " + getTotalExpenses());
		System.out.println("Net Savings: " + getNetSavings());
	}
}
