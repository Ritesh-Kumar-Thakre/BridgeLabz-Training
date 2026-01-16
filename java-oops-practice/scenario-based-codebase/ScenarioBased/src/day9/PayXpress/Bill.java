package day9.PayXpress;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bill implements IPayable {

	protected String type;
	protected double amount;
	private LocalDate dueDate;
	private boolean isPaid;
	protected double penalty;

	public Bill(String type, double amount, LocalDate dueDate, boolean isPaid, double penalty) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = isPaid;
		this.penalty = penalty;
	}

	public void displayBill() {
		System.out.println("Type: " + type);
		System.out.println("Amount: " + amount);
		System.out.println("Due Date: " + dueDate);
		System.out.println("Is Paid: " + isPaid);
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	@Override
	public double pay() {
		long daysLate = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
		int multiplier = (int) (daysLate / 10);
		double totalPenalty = penalty * (multiplier + 1);
		isPaid = true;
		return amount + totalPenalty;
	}

	@Override
	public void sendReminder() {

	}
}