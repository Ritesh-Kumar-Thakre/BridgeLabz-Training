import java.util.*;
public class DistanceConverter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter distance in feet:");
		double distanceInFeet=sc.nextDouble();
		
		// Applying the required logic
		double distanceInYards=distanceInFeet/3;
		double distanceInMiles=distanceInYards/1760;
		
		// Printing the results
		System.out.println("Given Distance "+distanceInFeet+" feet in Yards is "+distanceInYards+" yards and in Miles is "+distanceInMiles+" miles");
	}
}