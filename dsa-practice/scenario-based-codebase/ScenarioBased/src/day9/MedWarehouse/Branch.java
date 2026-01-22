package day9.MedWarehouse;

import java.util.*;

public class Branch {
	ArrayList<Medicine> medicines = new ArrayList<>();

	public void printBranch() {
		for (Medicine m : medicines) {
			System.out.println(m);
		}
	}
}
