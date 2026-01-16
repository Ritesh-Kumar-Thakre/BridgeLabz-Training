package day9.PayXpress;

import java.time.LocalDate;

public class ElectricityBill extends Bill {
	protected String holdersName;
	protected String meterNumber;

	public ElectricityBill(String holdersName, String meterNumber, String type, double amount, LocalDate dueDate,
			boolean isPaid, double penalty) {
		super(type, amount, dueDate, isPaid, penalty);
		this.holdersName = holdersName;
		this.meterNumber = meterNumber;
	}

	@Override
	public void sendReminder() {
		if (getDueDate().isBefore(LocalDate.now())) {
			System.out.println("Pay your bill otherwise Electricity may cut off and penalty will also increse!!");
		}
	}

	@Override
	public void displayBill() {
		System.out.println("Holders Name: " + holdersName);
		System.out.println("Meter Number: " + meterNumber);
		super.displayBill();
	}
}
