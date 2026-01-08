package day5.ParkEase;

public abstract class Vehicle implements IPayable {

	protected String vehicleNumber;
	protected double baseRate;

	protected Vehicle(String vehicleNumber, double baseRate) {
		this.vehicleNumber = vehicleNumber;
		this.baseRate = baseRate;
	}
}
