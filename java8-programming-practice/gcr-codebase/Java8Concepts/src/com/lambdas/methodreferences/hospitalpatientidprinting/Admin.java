package com.lambdas.methodreferences.hospitalpatientidprinting;

import java.util.*;

public class Admin {
	public static void main(String[] args) {
		Patient p1 = new Patient("p1", 21, 1001);
		Patient p2 = new Patient("p2", 24, 1002);
		Patient p3 = new Patient("p3", 35, 1003);
		Patient p4 = new Patient("p4", 63, 1004);
		Patient p5 = new Patient("p5", 35, 1005);
		List<Patient> pList = Arrays.asList(p1, p2, p3, p4, p5);

		pList.forEach(Patient::printId);
	}
}
