import java.util.*;
public class UnitConvertor1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit name you want to convert : km / Miles / Meters / Feet");
		String unit= sc.next();
		System.out.println("Enter value:");
		int value = sc.nextInt();
		
		// Applying the required logic and Printing the results
		if(unit.equals("km")){
			System.out.println(value+" km "+convertKmToMiles(value)+" miles");
		}else if(unit.equals("Miles")){
			System.out.println(value+" miles: "+convertMilesToKm(value)+" km");
		}else if(unit.equals("Meters")){
			System.out.println(value+" meter: "+convertMetersToFeet(value)+" feet");
		}else if(unit.equals("Feet")){
			System.out.println(value+" feet: "+convertFeetToMeters(value)+" meter");
		}
		sc.close();
	}
	
	// Method to convert Km to Miles
	public static double convertKmToMiles(double km) {
		return km*0.621371;
	}
	
	// Method to convert Miles to km
	public static double convertMilesToKm(double miles) {
		return miles*1.60934;
	}
	
	// Method to convert meters to feet
	public static double convertMetersToFeet(double meter) {
		return meter*3.28084;
	}
	
	// Method to convert feet to meters
	public static double convertFeetToMeters(double feet) {
		return feet*0.3048;
	}
}