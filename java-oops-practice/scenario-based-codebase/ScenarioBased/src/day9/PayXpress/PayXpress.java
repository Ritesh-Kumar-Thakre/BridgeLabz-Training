package day9.PayXpress;

import java.time.LocalDate;

public class PayXpress {
	public static void main(String[] args) {
		ElectricityBill e = new ElectricityBill("Ritesh", "PBS2395", "Postpaid", 1500.0, LocalDate.parse("2026-01-03"),
				false, 100);
		InternetBill i = new InternetBill("Ritesh", 100, "Postpaid", 799, LocalDate.parse("2026-01-05"), false, 20);
		WaterBill w = new WaterBill("Ritesh", 3, "Postpaid", 900, LocalDate.parse("2026-01-07"), false, 50);

		e.displayBill();
		if (!e.isPaid()) {
			e.sendReminder();
		} else {
			System.out.println("Bill paid");
		}
		System.out.println("Bill paid: " + e.pay());

		i.displayBill();
		if (!i.isPaid()) {
			i.sendReminder();
		} else {
			System.out.println("Bill paid");
		}
		System.out.println("Bill paid: " + i.pay());

		w.displayBill();
		if (!w.isPaid()) {
			w.sendReminder();
		} else {
			System.out.println("Bill paid");
		}
		System.out.println("Bill paid: " + w.pay());
	}
}
