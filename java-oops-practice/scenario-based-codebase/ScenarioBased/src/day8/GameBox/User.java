package day8.GameBox;

import java.util.*;

public class User {
	private String name;
	private List<Game> ownedGames = new ArrayList<>();

	public User(String name) {
		this.name = name;
	}

	public void buyGame(Game game) {
		ownedGames.add(game);
		System.out.println(name + " purchased: " + game);
	}

	public void showOwnedGames() {
		System.out.println("\n--- " + name + "'s Games ---");
		for (Game g : ownedGames) {
			System.out.println(g);
		}
	}
}
