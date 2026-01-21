package day7.EduResults;

import java.util.*;

public class List {
	ArrayList<StudentsScore> districtList = new ArrayList<>();

	public void printList() {
		System.out.println("\nDistrict List");
		for (int i = 0; i < districtList.size(); i++) {
			System.out.println(i+1+". Name: " + districtList.get(i).name + "\n   Score: " + districtList.get(i).score);
		}
	}
}
