import java.util.*;
public class SquareSideCalculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking User Input
		System.out.println("Enter perimeter:");
		int perimeter = sc.nextInt();
		
		// Applying the required logic
		int side = perimeter/4;
		
		// Printing the result
		System.out.println("The length of the side is "+side +" whose perimeter is " +perimeter);
		
		
	}
}