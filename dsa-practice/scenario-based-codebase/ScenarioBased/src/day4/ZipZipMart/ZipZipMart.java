package day4.ZipZipMart;

import java.time.LocalDate;

public class ZipZipMart {
	public static void main(String[] args) {
		Sales s1 = new Sales(LocalDate.parse("2025-01-02"), 43125);
		Sales s2 = new Sales(LocalDate.parse("2025-01-01"), 83493);
		Sales s3 = new Sales(LocalDate.parse("2025-02-06"), 84523);
		Sales s4 = new Sales(LocalDate.parse("2025-02-07"), 95462);
		Sales s5 = new Sales(LocalDate.parse("2025-02-12"), 65231);
		Sales s6 = new Sales(LocalDate.parse("2025-03-02"), 75423);
		Sales s7 = new Sales(LocalDate.parse("2025-01-18"), 45123);
		Sales s8 = new Sales(LocalDate.parse("2025-02-15"), 32564);
		Sales s9 = new Sales(LocalDate.parse("2025-03-09"), 24536);

		Systems system = new Systems();
		system.sales.add(s1);
		system.sales.add(s2);
		system.sales.add(s3);
		system.sales.add(s4);
		system.sales.add(s5);
		system.sales.add(s6);
		system.sales.add(s7);
		system.sales.add(s8);
		system.sales.add(s9);

		system.mergeSort(system.sales, 0, system.sales.size()-1);
		system.printRecord();
	}
}
