package day2.CabbyGo;

public class CabbyGoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SUV suv = new SUV("john", "LK90245", 4.1f, "MP 34 BH 1197");
		Sedan car = new Sedan("Kumar", "JG57245", 4.1f, "MP 51 BH 7593");
		suv.bookRide(5.5);
		suv.endRide();
		suv.showVehicleDetails();
		car.showVehicleDetails();
	}

}
