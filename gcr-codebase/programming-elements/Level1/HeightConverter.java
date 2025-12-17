import java.util.*;
public class HeightConverter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking User Input
		System.out.println("Enter height:");
		double height= sc.nextDouble();
		
		// Applying the required logic
		double inches=height/2.54;
		double feet=inches/12;
		
		// Printing the results
		System.out.println("Your Height in cm is "+height+" while in feet is "+ feet+ " and inches is "+inches);
	}
}