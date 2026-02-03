package com.functionalinterfaces.staticinterfaces.dateformatutility;

import java.time.LocalDate;

public class FormatDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		String formate = DateFormatUtility.formate(date, "dd-MM-yyyy");
		System.out.println(formate);
	}
}
