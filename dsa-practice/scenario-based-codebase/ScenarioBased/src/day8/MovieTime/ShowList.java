package day8.MovieTime;

import java.util.*;

public class ShowList {
	ArrayList<Show> shows = new ArrayList<>();

	public void insertionSort(ArrayList<Show> shows) {
		for (int i = 1; i < shows.size(); i++) {
			Show currentShow = shows.get(i);
			int prev = i - 1;
			while (prev >= 0 && shows.get(prev).time.isAfter(currentShow.time)) {
				shows.set(prev + 1, shows.get(prev));
				prev--;
			}
			shows.set(prev + 1, currentShow);
		}
	}

	public void printShows() {
		System.out.println("==== Shows ====");
		for (int i = 0; i < shows.size(); i++) {
			System.out.println("\nShow: "+shows.get(i).name +"\nTime: "+ shows.get(i).time);
		}
	}
}
