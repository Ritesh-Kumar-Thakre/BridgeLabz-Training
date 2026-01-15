package day8.BudgetWise;

public class BudgetWiseApp {

	public static void main(String[] args) {

		MonthlyBudget budget = new MonthlyBudget("March", 50000);

		budget.addCategoryLimit("Food", 8000);
		budget.addCategoryLimit("Travel", 5000);

		budget.addTransaction(new Transaction(3000, "expense", "10-03", "Food"));
		budget.addTransaction(new Transaction(4000, "expense", "12-03", "Food"));
		budget.addTransaction(new Transaction(6000, "expense", "15-03", "Travel"));

		budget.generateReport();
		budget.detectOverspend();

		AnnualBudget yearly = new AnnualBudget(2025, 600000);

		yearly.addTransaction(new Transaction(100000, "expense", "Jan", "Rent"));
		yearly.addTransaction(new Transaction(80000, "expense", "Feb", "Travel"));

		yearly.generateReport();
	}
}
