package day1.VehicleRental;

public abstract class Vehicle {
	private String vehicleNumber;
    protected double baseRate; 
    private boolean isAvailable;

    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
        this.isAvailable = true;
    }

    
    public String getPlateNumber() { 
    	return vehicleNumber; 
    }
    public boolean isAvailable() { 
    	return isAvailable; 
    }
    public void setAvailable(boolean available) { 
    	isAvailable = available; 
    }

    public abstract String getVehicleType();
}
