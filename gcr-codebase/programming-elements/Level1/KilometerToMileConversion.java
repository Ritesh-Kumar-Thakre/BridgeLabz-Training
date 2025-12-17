import java.util.*;
public class KilometerToMileConversion{
	public static void main (String [] args){
		// Initializing value
		double kilometer= 10.8;
		
		// Printing Miles
		System.out.println("The distance "+ kilometer +"km in miles is "+convertToMile(kilometer));
	}
	
	// Method to Convert Kilometer to Mile
	public static double convertToMile(double kilometer){
		double mile=kilometer/1.6;
		return mile;
	}
}