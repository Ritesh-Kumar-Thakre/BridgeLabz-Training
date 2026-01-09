package day6.TourMate;

public class DomesticTrip extends Trip {

	public DomesticTrip(String destination, int duration, Transport transport, Hotel hotel,
			java.util.List<Activity> activities) {
		super(destination, duration, transport, hotel, activities);
	}

	@Override
	public void book() {
		System.out.println("Domestic trip booked for " + destination);
		System.out.println("GST applied (5%)");
		budget += budget * 0.05;
	}

	@Override
	public void cancel() {
		System.out.println("Domestic trip cancelled. Refund processed.");
	}
}
