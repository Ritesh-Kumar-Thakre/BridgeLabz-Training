package day2.TrafficManager;

public class TrafficManager {
	public static void main(String[] args) {

		traffic roundabout = new traffic();
		VehicleQueue queue = new VehicleQueue(3);

		queue.addToQueue("Car1");
		queue.addToQueue("Car2");
		queue.addToQueue("Car3");
		queue.addToQueue("Car4");

		String car;
		while ((car = queue.removeFromQueue()) != null) {
			roundabout.addCar(car, "Ferrari");
		}

		roundabout.displayCars();

		roundabout.removeCar("Car2");
		roundabout.displayCars();

		roundabout.removeCar("Car1");
		roundabout.displayCars();
	}
}
