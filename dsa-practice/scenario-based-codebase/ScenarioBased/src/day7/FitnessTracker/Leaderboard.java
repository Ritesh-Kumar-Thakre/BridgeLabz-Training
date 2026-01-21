package day7.FitnessTracker;

import java.util.*;

public class Leaderboard {
	ArrayList<User> users = new ArrayList<>();

	public void leaderboard(ArrayList<User> users) {
		for (int turn = 0; turn < users.size(); turn++) {
			for (int i = 0; i < users.size() - 1 - turn; i++) {
				if (users.get(i).steps > users.get(i + 1).steps) {
					User temp = users.get(i);
					users.set(i, users.get(i + 1));
					users.set(i + 1, temp);
				}
			}
		}
	}

	public void printLeaderboard() {
		System.out.println("===== Steps Leaderboard =====");
		for (int i = 0; i < users.size(); i++) {
			System.out.println("\nName: " + users.get(i).name + "\nSteps Count: " + users.get(i).steps);
		}
	}
}
