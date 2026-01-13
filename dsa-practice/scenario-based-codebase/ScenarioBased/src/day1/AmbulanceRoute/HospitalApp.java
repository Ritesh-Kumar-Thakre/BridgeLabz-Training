package day1.AmbulanceRoute;

public class HospitalApp {
	public static void main(String[] args) {

		AmbulanceRoute route = new AmbulanceRoute();

		route.addUnit("Emergency");
		route.addUnit("Radiology");
		route.addUnit("Surgery");
		route.addUnit("ICU");

		route.displayUnits();

		route.routePatient();

		route.markUnavailable("Emergency");
		route.markUnavailable("Radiology");

		route.routePatient();

		route.removeUnit("Surgery");

		route.displayUnits();
		route.routePatient();
	}
}
