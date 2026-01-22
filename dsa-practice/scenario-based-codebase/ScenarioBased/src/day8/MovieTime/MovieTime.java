package day8.MovieTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MovieTime {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a", Locale.US);
		Show s1 = new Show("Dhurandar", LocalTime.parse("12:25 PM", formatter));
		Show s2 = new Show("Toxic", LocalTime.parse("02:05 PM", formatter));
		Show s3 = new Show("Love And War", LocalTime.parse("11:25 AM", formatter));
		Show s4 = new Show("Border 2", LocalTime.parse("09:25 AM", formatter));
		Show s5 = new Show("Dhurandar 2", LocalTime.parse("09:35 PM", formatter));

		ShowList list = new ShowList();
		list.shows.add(s1);
		list.shows.add(s2);
		list.shows.add(s3);
		list.shows.add(s4);
		list.shows.add(s5);

		list.insertionSort(list.shows);
		list.printShows();
	}
}