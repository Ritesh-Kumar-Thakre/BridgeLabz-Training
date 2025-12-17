import java.util.*;
public class TriangleAreaCalculator{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter triangle's base:");
		double base=sc.nextDouble();
		System.out.println("Enter triangle's height:");
		double height=sc.nextDouble();
		
		// Applying the required logic
		double areaOfTriangle=0.5*base*height;
		double areaInSquareCentimeters = areaOfTriangle * 6.4516;
		
		// Printing the results
		System.out.println("Area of a Triangle in square inches is "+areaOfTriangle +" and area in square centimeters is "+areaInSquareCentimeters);
	}
}