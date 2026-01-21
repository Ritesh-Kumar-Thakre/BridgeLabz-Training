package day7.FitnessTracker;

public class FitnessTracker {
	public static void main(String[] args) {
		User u1 = new User("Ritesh", 200);
		User u2 = new User("Raj", 179);
		User u3 = new User("Ram", 184);
		User u4 = new User("Rohan", 147);
		User u5 = new User("Sohan", 168);
		Leaderboard leaderboard = new Leaderboard();
		leaderboard.users.add(u1);
		leaderboard.users.add(u2);
		leaderboard.users.add(u3);
		leaderboard.users.add(u4);
		leaderboard.users.add(u5);
		leaderboard.printLeaderboard();

	}
}
