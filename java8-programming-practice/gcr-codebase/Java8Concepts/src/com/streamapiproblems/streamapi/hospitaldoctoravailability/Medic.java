package com.streamapiproblems.streamapi.hospitaldoctoravailability;

import java.util.*;

public class Medic {
	public static void main(String[] args) {
		Doctor d1 = new Doctor("Ritesh", true, 9);
		Doctor d2 = new Doctor("Ram", false, 7);
		Doctor d3 = new Doctor("Raj", true, 8);
		Doctor d4 = new Doctor("Shyam", true, 7);
		Doctor d5 = new Doctor("Sohan", true, 9);
		Doctor d6 = new Doctor("Sonu", false, 7);
		Doctor d7 = new Doctor("Monu", true, 8);

		List<Doctor> docs = Arrays.asList(d1, d2, d3, d4, d5, d6, d7);

		docs.stream().filter(e -> e.availableWeekends).sorted(Comparator.comparingInt(e -> e.specialty))
				.forEach(System.out::println);
		;
	}
}
