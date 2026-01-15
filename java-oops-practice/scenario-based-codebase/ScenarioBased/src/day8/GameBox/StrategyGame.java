package day8.GameBox;

public class StrategyGame extends Game {
	private String difficulty;

	public StrategyGame(String title, double price, double rating, String difficulty) {
		super(title, "Strategy", price, rating);
		this.difficulty = difficulty;
	}

	@Override
	public void playDemo(String genre) {
		System.out.println("Strategy Demo: " + difficulty + " level battle preview.");
	}
}
