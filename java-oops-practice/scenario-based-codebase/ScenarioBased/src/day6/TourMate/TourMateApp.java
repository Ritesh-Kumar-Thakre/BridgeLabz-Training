package day6.TourMate;

import java.util.*;

public class TourMateApp {
	public static void main(String[] args) {

		Transport flight = new Transport("Flight", 30000);
		Hotel hotel = new Hotel("Grand Palace", 20000);

		List<Activity> activities = new ArrayList<>();
		activities.add(new Activity("City Tour", 5000));
		activities.add(new Activity("Adventure Park", 7000));

		Trip t1 = new DomesticTrip("Goa", 5, flight, hotel, activities);
		Trip t2 = new InternationalTrip("Paris", 7, flight, hotel, activities);

		System.out.println("\n--- Domestic Trip ---");
		t1.showTripDetails();
		t1.book();

		System.out.println("\n--- International Trip ---");
		t2.showTripDetails();
		t2.book();
		
		
	}
}
