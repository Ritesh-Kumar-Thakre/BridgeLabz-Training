package day1.VehicleRental;

public class Car extends Vehicle implements Rentable{
	public Car(String vehicleNumber) {
        super(vehicleNumber, 50.0); 
    }

    @Override
    public double calculateRent(int days) {
        double surcharge = 10.0;
        return (baseRate * days) + surcharge; 
    }

    @Override
    public String getVehicleType() { return "Car"; }
}
