package day8.GamerZone;

public class GamerZone {
	public static void main(String[] args) {
		Players p1 = new Players("VK", 2500);
		Players p2 = new Players("MD", 3000);
		Players p3 = new Players("RS", 2700);
		Players p4 = new Players("ST", 4000);
		Players p5 = new Players("R", 4700);
		Players p6 = new Players("M", 5000);
		Players p7 = new Players("N", 4200);
		Players p8 = new Players("S", 5100);

		Leaderboard leaderboard = new Leaderboard();
		leaderboard.list.add(p1);
		leaderboard.list.add(p2);
		leaderboard.list.add(p3);
		leaderboard.list.add(p4);
		leaderboard.list.add(p5);
		leaderboard.list.add(p6);
		leaderboard.list.add(p7);
		leaderboard.list.add(p8);

		leaderboard.quickSort(leaderboard.list, 0, leaderboard.list.size() - 1);
		leaderboard.printPlayers();

	}
}
