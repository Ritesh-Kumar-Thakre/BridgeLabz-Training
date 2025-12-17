import java.util.*;
public class KilometerToMileConverter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking User Input
		System.out.println("Enter distance in kilometers:");
		double km=sc.nextDouble();
		
		// Applying the required logic
		double miles= km/1.6;
		
		// Printing the result
		System.out.println("The total miles is "+miles+" mile for the given "+km+"km");
	}
}