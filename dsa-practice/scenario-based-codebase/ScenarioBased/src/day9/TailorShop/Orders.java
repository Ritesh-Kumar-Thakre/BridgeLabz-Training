package day9.TailorShop;

import java.time.LocalDate;

public class Orders {
	protected String type;
	protected LocalDate date;

	public Orders(String type, LocalDate date) {
		this.type = type;
		this.date = date;
	}
}
