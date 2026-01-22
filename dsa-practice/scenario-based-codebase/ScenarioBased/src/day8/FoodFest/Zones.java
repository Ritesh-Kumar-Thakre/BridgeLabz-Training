package day8.FoodFest;

import java.util.*;

public class Zones {

	ArrayList<Stall> zone = new ArrayList<>();

	public void printZone() {
		for (int i = 0; i < zone.size(); i++) {
			System.out.println("\nStall Name: " + zone.get(i).name + "\nFootFall's" + zone.get(i).footfall);
		}
	}
}
