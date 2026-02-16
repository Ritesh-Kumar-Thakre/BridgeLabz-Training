package com.jdbc.bank;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankMain {

	private static final Scanner scanner = new Scanner(System.in);
	private static final AccountDAO dao = new AccountDAO();

	public static void main(String[] args) {

		while (true) {
			System.out.println("\n===== Bank Management System =====");
			System.out.println("1. Transfer Money");
			System.out.println("2. Exit");
			System.out.print("Enter choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				transfer();
				break;
			case 2: {
				System.out.println("Exiting...");
				return;
			}
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	private static void transfer() {
		System.out.print("From Account ID: ");
		int fromId = scanner.nextInt();

		System.out.print("To Account ID: ");
		int toId = scanner.nextInt();

		System.out.print("Amount: ");
		BigDecimal amount = scanner.nextBigDecimal();

		dao.transferMoney(fromId, toId, amount);
	}
}
