package com.functionalinterfaces.staticinterfaces.dateformatutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatUtility {
	static String formate(LocalDate date, String str) {
		return date.format(DateTimeFormatter.ofPattern(str));

	}
}
//handle exception using pip operator
