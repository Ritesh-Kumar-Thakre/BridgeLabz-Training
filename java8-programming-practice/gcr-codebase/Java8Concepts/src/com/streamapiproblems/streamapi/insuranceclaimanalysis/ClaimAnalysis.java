package com.streamapiproblems.streamapi.insuranceclaimanalysis;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ClaimAnalysis {
	public static void main(String[] args) {
		Claim c1 = new Claim("Ritesh", 590000, LocalDate.now(), "Health Insurance");
		Claim c2 = new Claim("Ram", 1500000, LocalDate.now(), "Car Insurance");
		Claim c3 = new Claim("Raj", 480000, LocalDate.now(), "Health Insurance");
		Claim c4 = new Claim("Som", 320000, LocalDate.now(), "Car Insurance");
		Claim c5 = new Claim("Om", 750000, LocalDate.now(), "Health Insurance");
		Claim c6 = new Claim("Pawan", 900000, LocalDate.now(), "Life Insurance");
		Claim c7 = new Claim("Raja", 800000, LocalDate.now(), "Life Insurance");
		Claim c8 = new Claim("Saroj", 1540000, LocalDate.now(), "Life Insurance");
		Claim c9 = new Claim("Ramu", 450000, LocalDate.now(), "Health Insurance");
		Claim c10 = new Claim("Sohan", 380000, LocalDate.now(), "Life Insurance");
		Claim c11 = new Claim("Chomu", 710000, LocalDate.now(), "Car Insurance");
		Claim c12 = new Claim("Chaman", 990000, LocalDate.now(), "Life Insurance");

		List<Claim> claimList = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12);
		Map<String, Double> result = claimList.stream()
				.collect(Collectors.groupingBy(Claim::getClaimType, Collectors.averagingDouble(Claim::getClaimAmount)));
		result.forEach((type, avg) -> System.out.println(type + " -> Average Amount: " + avg));

	}
}
