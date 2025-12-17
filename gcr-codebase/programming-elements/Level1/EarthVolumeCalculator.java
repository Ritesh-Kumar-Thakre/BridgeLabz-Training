import java.util.*;
public class EarthVolumeCalculator{
	public static void main(String [] args){
		// Initializing value
		double radius=6378;
		
		// Applying the required logic
		double volume=(4/3)*3.14*(radius*radius*radius);
		double kilometer=volume;
		double miles= kilometer * 0.621371 * 0.621371 * 0.621371;
		
		// Printing the results
		System.out.println("The volume of earth in cubic kilometers is "+kilometer+" and cubic miles is "+miles);
	}
}