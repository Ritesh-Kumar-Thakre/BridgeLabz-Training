package day1.VehicleRental;

public class Truck extends Vehicle implements Rentable{
	public Truck(String vehicleNumber) {
        super(vehicleNumber, 100.0); 
    }

    @Override
    public double calculateRent(int days) {
        double heavyDutyTax = 1.2; 
        return (baseRate * days) * heavyDutyTax;
    }

    @Override
    public String getVehicleType() { 
    	return "Truck"; 
    }
}
