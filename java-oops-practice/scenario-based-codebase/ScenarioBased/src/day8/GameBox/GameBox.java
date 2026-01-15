package day8.GameBox;

public class GameBox {
	public static void main(String[] args) {

		ArcadeGame g1 = new ArcadeGame("Pac-Man", 0, 8.2, 10);
		ArcadeGame g2 = new ArcadeGame("Street Fighter", 500, 9.1, 20);

		StrategyGame g3 = new StrategyGame("Age of Empires", 700, 8.7, "Hard");
		StrategyGame g4 = new StrategyGame("Clash of Kings", 0, 7.9, "Medium");

		g2.applySeasonalOffer("winter");
		g3.applySeasonalOffer("summer");

		g1.playDemo(g1.genre);
		g2.playDemo(g2.genre);
		g3.playDemo(g3.genre);
		g4.playDemo(g4.genre);

		g1.download();
		g3.download();
		
		System.out.println();
		User user = new User("Ritesh");
		user.buyGame(g1);
		user.buyGame(g2);
		user.buyGame(g3);

		user.showOwnedGames();
	}
}
