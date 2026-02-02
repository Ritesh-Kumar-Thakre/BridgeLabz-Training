package com.lambdas.lambdaexpressions.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;

public class HospitalApp {
	public static void main(String[] args) {
		Patient p1 = new Patient("Ritesh", 22, false);
		Patient p2 = new Patient("Ram", 22, true);
		Patient p3 = new Patient("Rohit", 22, true);
		List<Patient> patientList = Arrays.asList(p1, p2, p3);

		for (int i = 0; i < patientList.size(); i++) {
			System.out.println(patientList.get(i));
			Predicate<Patient> alert = (p) -> p.critical;
			if (alert.test(patientList.get(i))) {
				System.out.println("Alert:- Need Action: Visit hospital now");
			} else {
				System.out.println("Alert:- Take good care");
			}
			System.err.println();
		}
	}
}
