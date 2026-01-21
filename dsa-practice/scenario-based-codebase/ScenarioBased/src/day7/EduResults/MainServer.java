package day7.EduResults;

import java.util.*;

public class MainServer {
	ArrayList<StudentsScore> mainList = new ArrayList<>();

	public void collectFromDistrict(List district) {
		mainList.addAll(district.districtList);
	}

	public void mergeShot(int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		mergeShot(si, mid);
		mergeShot(mid + 1, ei);
		merge(si, mid, ei);
	}

	public void merge(int si, int mid, int ei) {
		ArrayList<StudentsScore> temp = new ArrayList<>();
		int i = si;
		int j = mid + 1;

		while (i <= mid && j <= ei) {
			if (mainList.get(i).score >= (mainList.get(j).score)) {
				temp.add(mainList.get(i));
				i++;
			} else {
				temp.add(mainList.get(j));
				j++;
			}
		}
		while (i <= mid) {
			temp.add(mainList.get(i));
			i++;
		}
		while (j <= ei) {
			temp.add(mainList.get(j));
			j++;
		}
		for (int k = 0; k < temp.size(); k++) {
			mainList.set(si + k, temp.get(k));
		}
	}

	public void printMainList() {
		System.out.println("\nMain List");
		for (int i = 0; i < mainList.size(); i++) {
			System.out.println("Name: " + mainList.get(i).name + "\nScore: " + mainList.get(i).score);
		}
	}
}
