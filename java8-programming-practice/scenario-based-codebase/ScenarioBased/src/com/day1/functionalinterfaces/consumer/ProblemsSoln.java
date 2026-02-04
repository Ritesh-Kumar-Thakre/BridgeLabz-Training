package com.day1.functionalinterfaces.consumer;

import java.time.LocalDateTime;
import java.util.function.Consumer;

public class ProblemsSoln {
	public static void main(String[] args) {
		Student st = new Student("Ritesh", 98, "12th");
		Consumer<Student> printStudent = e -> System.out.println(e);
		printStudent.accept(st);

		// 2. Log employee login
		Consumer<String> logLogin = name -> System.out
				.println("[LOG] " + name + " logged in at " + LocalDateTime.now());
		logLogin.accept("Amit Kumar");

		// 3. Order confirmation
		Consumer<Order> orderConfirm = order -> System.out
				.println("Order " + order.id + " confirmed for Rs. " + order.amount);
		orderConfirm.accept(new Order("ORD-1001", 2450));

		// 4. Display balance
		Consumer<Double> showBalance = bal -> System.out.println("Current balance: Rs. " + String.format("%.2f", bal));
		showBalance.accept(18450.75);

		// 5. Send notification
		Consumer<String> sendNotification = msg -> System.out.println("# Notification: " + msg);
		sendNotification.accept("Your password was changed successfully.");
	}
}
