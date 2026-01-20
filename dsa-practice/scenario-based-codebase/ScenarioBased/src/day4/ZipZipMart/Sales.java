package day4.ZipZipMart;

import java.time.LocalDate;

public class Sales {
	protected LocalDate date;
	protected double transactionAmount;

	public Sales(LocalDate date, double transactionAmount) {
		this.date = date;
		this.transactionAmount = transactionAmount;
	}
}
