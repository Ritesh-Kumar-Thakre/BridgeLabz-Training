import java.util.*;
public class PenDistributionCalculator{
	public static void main(String [] args){
		// Initializing values
		int pen = 14;
		int student=3;
		
		// Applying the required logic
		int remaining= pen%student;
		int distributed=pen/student;
		
		// Printing the Result
		System.out.println("The Pen Per Student is "+distributed+" and the remaining pen not distributed is "+remaining);
	}
}