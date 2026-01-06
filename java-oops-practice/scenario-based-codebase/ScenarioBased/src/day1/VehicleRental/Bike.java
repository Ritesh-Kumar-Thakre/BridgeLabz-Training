package day1.VehicleRental;

public class Bike extends Vehicle implements Rentable{
	public Bike(String vehicleNumber) {
        super(vehicleNumber, 20.0);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }

    @Override
    public String getVehicleType() { return "Bike"; }
}
