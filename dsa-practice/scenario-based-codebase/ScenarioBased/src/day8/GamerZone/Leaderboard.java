package day8.GamerZone;

import java.util.*;

public class Leaderboard {
	ArrayList<Players> list = new ArrayList<>();

	public void quickSort(ArrayList<Players> list, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int pivot = partition(list, si, ei);
		quickSort(list, si, pivot - 1);
		quickSort(list, pivot, ei);
	}

	public int partition(ArrayList<Players> list, int si, int ei) {
		Players pivot = list.get(ei);
		int i = si - 1;
		for (int j = si; j < ei; j++) {
			if (list.get(j).score >= pivot.score) {
				i++;
				Players temp = list.get(j);
				list.set(j, list.get(i));
				list.set(i, temp);
			}
		}
		i++;
		Players temp = pivot;
		list.set(ei, list.get(i));
		list.set(i, temp);
		return i;
	}

	public void printPlayers() {
		System.out.println("==== Top Scorer Players ====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("\nName: " + list.get(i).name + "\nScore: " + list.get(i).score);
		}
	}
}
