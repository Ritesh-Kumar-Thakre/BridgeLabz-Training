 import java.util.*;
public class AthleteProblem{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sides of the triangle:");
		System.out.print("Perpendicular: ");
		double perpendicular=sc.nextDouble();
		System.out.print("base: ");
		double base=sc.nextDouble();
		System.out.print("hypotenuse: ");
		double hypotenuse=sc.nextDouble();
		System.out.println("Enter distance:");
		double distance=sc.nextDouble();
		double perimeter;
		int rounds;
		
		// Applying the required logic
		perimeter = perpendicular+base+hypotenuse;
		rounds=(int)Math.ceil(numberOfRounds(distance,perimeter));
		
		// Printing the result
		System.out.println("The number of rounds user needs to do to complete "+distance+" km distance are "+rounds);
	}
	
	// Method to calculate rounds 
	static double numberOfRounds(double distance,double perimeter){
		distance=distance*1000;
		double round = distance/perimeter;
		return round;
	}
}