package com.streamapiproblems.streamapi.filteringexpiringmemberships;

import java.time.LocalDate;
import java.util.*;

public class Gym {
	public static void main(String[] args) {
		Membership m1 = new Membership("Ritesh", "Gold", 5000, LocalDate.of(2025, 6, 1));
		Membership m2 = new Membership("Ram", "Platinum", 10000, LocalDate.of(2025, 7, 13));
		Membership m3 = new Membership("Raj", "Silver", 2500, LocalDate.of(2025, 3, 11));
		Membership m4 = new Membership("Shyam", "Gold", 5000, LocalDate.of(2025, 9, 21));
		Membership m5 = new Membership("Om", "Silver", 2500, LocalDate.of(2025, 3, 29));
		Membership m6 = new Membership("Sahil", "Gold", 5000, LocalDate.of(2025, 2, 5));

		List<Membership> memberList = Arrays.asList(m1, m2, m3, m4, m5, m6);

		System.out.println("Membership Expired need action:\n");
		memberList.stream().filter(e -> e.startDate.isBefore(LocalDate.now().minusMonths(6)))
				.forEach(System.out::println);
		;

	}
}
