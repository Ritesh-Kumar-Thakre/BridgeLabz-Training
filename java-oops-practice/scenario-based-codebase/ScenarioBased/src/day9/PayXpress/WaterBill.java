package day9.PayXpress;

import java.time.LocalDate;

public class WaterBill extends Bill {
	protected String connectionsName;
	protected int numberOfConnetions;

	public WaterBill(String connectionsName, int numberOfConnetions, String type, double amount, LocalDate dueDate,
			boolean isPaid, double penalty) {
		super(type, amount, dueDate, isPaid, penalty);
		this.connectionsName = connectionsName;
		this.numberOfConnetions = numberOfConnetions;
	}

	@Override
	public void sendReminder() {
		if (getDueDate().isBefore(LocalDate.now())) {
			System.out.println("Pay your bill otherwise water supply may stop!!");
		}
	}

	@Override
	public void displayBill() {
		System.out.println("\nConnections Name: " + connectionsName);
		System.out.println("Number Of Connetions: " + numberOfConnetions);
		super.displayBill();
	}

}
