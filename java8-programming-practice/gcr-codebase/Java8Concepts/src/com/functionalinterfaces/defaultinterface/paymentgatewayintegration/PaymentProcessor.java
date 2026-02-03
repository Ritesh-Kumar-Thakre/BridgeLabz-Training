package com.functionalinterfaces.defaultinterface.paymentgatewayintegration;

public interface PaymentProcessor {
	default void refund(double amount) {
		System.out.println("Refund processed: " + amount);
	}

	void pay(double amount);
}
