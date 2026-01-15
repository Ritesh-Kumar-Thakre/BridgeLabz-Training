package day8.BudgetWise;

import java.util.*;

public class Budget implements IAnalyzable {

	protected double income;
	protected Map<String, Double> categoryLimits = new HashMap<>();
	protected List<Transaction> transactions = new ArrayList<>();

	public Budget(double income) {
		this.income = income;
	}

	public void addCategoryLimit(String category, double limit) {
		categoryLimits.put(category, limit);
	}

	// Encapsulation – expenses added only via method
	public void addTransaction(Transaction t) {
		transactions.add(t);
	}

	public double getTotalExpenses() {
		double sum = 0;
		for (Transaction t : transactions) {
			if (t.getType().equalsIgnoreCase("expense")) {
				sum += t.getAmount();
			}
		}
		return sum;
	}

	public double getNetSavings() {
		return income - getTotalExpenses(); // operator used
	}

	@Override
	public void detectOverspend() {
		Map<String, Double> spent = new HashMap<>();

		for (Transaction t : transactions) {
			if (t.getType().equalsIgnoreCase("expense")) {
				spent.put(t.getCategory(), spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount());
			}
		}

		System.out.println("\nOverspend Report:");
		for (String cat : spent.keySet()) {
			if (categoryLimits.containsKey(cat) && spent.get(cat) > categoryLimits.get(cat)) {
				System.out.println(cat + " exceeded limit!");
			}
		}
	}

	@Override
	public void generateReport() {
		System.out.println("Basic Budget Report");
	}
}
