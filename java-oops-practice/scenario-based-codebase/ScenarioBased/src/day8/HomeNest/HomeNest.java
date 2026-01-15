package day8.HomeNest;

public class HomeNest {
	public static void main(String[] args) {
		HomeNestManager manager = new HomeNestManager();

		Camera cam = new Camera(101, "Camera", 10);
		Light light = new Light(102, "Light", 20);
		Thermostat thermo = new Thermostat(103, "Thermostat", 30);
		Lock lock = new Lock(104, "Lock", 5);

		manager.register(cam);
		manager.register(light);
		manager.register(thermo);
		manager.register(lock);

		System.out.println("---- Turning ON ----");
		manager.turnAllOn();
		manager.showAll();

		System.out.println("\nTotal Energy: " + manager.getTotalEnergy());

		System.out.println("\n---- Turning OFF ----");
		manager.turnAllOff();
		manager.showAll();

		System.out.println("\n---- Resetting ----");
		manager.resetAll();
		manager.showAll();
	}
}
