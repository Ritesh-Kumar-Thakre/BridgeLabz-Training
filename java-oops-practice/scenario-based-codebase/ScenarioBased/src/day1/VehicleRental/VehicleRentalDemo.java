package day1.VehicleRental;

public class VehicleRentalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle myCar = new Car("MP04-ND-9123");
        Vehicle myTruck = new Truck("MP35-JS-9981");
        Vehicle myBike = new Bike("UP28-HS-3001");

        
        Customer user = new Customer("Ravi Gautam", "LA92001");

        System.out.println("Rental Receipt ---");
        user.rentVehicle(myCar, 5);    
        user.rentVehicle(myTruck, 3);  
        user.rentVehicle(myBike, 2);   

        System.out.println("\n Availability Test -----------");
        user.rentVehicle(myCar, 1);    
	}

}
