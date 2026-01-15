package day8.BudgetWise;

public class MonthlyBudget extends Budget {

	private String month;

	public MonthlyBudget(String month, double income) {
		super(income);
		this.month = month;
	}

	@Override
	public void generateReport() {
		System.out.println("\n--- Monthly Report (" + month + ") ---");
		System.out.println("Income: " + income);
		System.out.println("Expenses: " + getTotalExpenses());
		System.out.println("Savings: " + getNetSavings());
	}
}
