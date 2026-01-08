package day5.ParkEase;

public class ParkEaseApp {

	public static void main(String[] args) {

		ParkingManager manager = new ParkingManager();

		manager.addSlot(new ParkingSlot(1, "Car"));
		manager.addSlot(new ParkingSlot(2, "Bike"));
		manager.addSlot(new ParkingSlot(3, "Truck"));

		Vehicle car = new Car("MH12AB1234");
		Vehicle bike = new Bike("MH14XY9999");

		ParkingSlot carSlot = manager.findAvailableSlot("Car");
		if (carSlot != null) {
			carSlot.assignVehicle(car);
			double bill = carSlot.releaseVehicle(6);
			System.out.println("Parking Charges: ₹" + bill);
		}

		manager.showAvailability();
	}
}
