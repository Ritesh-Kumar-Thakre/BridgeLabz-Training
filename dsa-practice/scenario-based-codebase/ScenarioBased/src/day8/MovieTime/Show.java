package day8.MovieTime;

import java.time.LocalTime;

public class Show {
	protected String name;
	protected LocalTime time;

	public Show(String name, LocalTime time) {
		this.name = name;
		this.time = time;
	}
}
