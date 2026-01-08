package day5.ParkEase;

public class Bike extends Vehicle {

	public Bike(String vehicleNumber) {
		super(vehicleNumber, 30);
	}

	@Override
	public double calculateCharges(int hours) {
		return baseRate * hours;
	}
}
