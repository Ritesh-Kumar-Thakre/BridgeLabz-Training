package day9.PayXpress;

import java.time.LocalDate;

public class InternetBill extends Bill {
	protected String userName;
	protected int speed;

	public InternetBill(String userName, int speed, String type, double amount, LocalDate dueDate, boolean isPaid,
			double penalty) {
		super(type, amount, dueDate, isPaid, penalty);
		this.userName = userName;
		this.speed = speed;
	}

	@Override
	public void sendReminder() {
		if (getDueDate().isBefore(LocalDate.now())) {
			System.out.println("Pay your internet bill otherwise all the services may suspended and penalty may apply!!");
		}
	}

	@Override
	public void displayBill() {
		System.out.println("\nUser Name: " + userName);
		System.out.println("Internet Speed: " + speed+"mb/s");
		super.displayBill();
	}

}
