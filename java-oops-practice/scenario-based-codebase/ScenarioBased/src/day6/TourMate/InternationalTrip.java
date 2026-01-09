package day6.TourMate;

public class InternationalTrip extends Trip {

	public InternationalTrip(String destination, int duration, Transport transport, Hotel hotel,
			java.util.List<Activity> activities) {
		super(destination, duration, transport, hotel, activities);
	}

	@Override
	public void book() {
		System.out.println("International trip booked for " + destination);
		System.out.println("Visa + Travel tax applied (15%)");
		budget += budget * 0.15;
	}

	@Override
	public void cancel() {
		System.out.println("International trip cancelled. Partial refund issued.");
	}
}
