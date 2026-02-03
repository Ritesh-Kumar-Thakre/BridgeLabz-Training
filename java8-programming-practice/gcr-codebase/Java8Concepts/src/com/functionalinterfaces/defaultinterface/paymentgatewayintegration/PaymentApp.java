package com.functionalinterfaces.defaultinterface.paymentgatewayintegration;

public class PaymentApp {
	public static void main(String[] args) {

		PaymentProcessor processor = new PaymentProcessor() {
			@Override
			public void pay(double amount) {
				System.out.println("Paid: " + amount);
			}
		};

		processor.pay(1000);
		processor.refund(500);

	}
}
