package day8.GameBox;

public class ArcadeGame extends Game {
	private int powerUps;

	public ArcadeGame(String title, double price, double rating, int powerUps) {
		super(title, "Arcade", price, rating);
		this.powerUps = powerUps;
	}

	@Override
	public void playDemo(String genre) {
		System.out.println("Arcade Demo: Fast action with " + powerUps + " power-ups!");
	}
}
