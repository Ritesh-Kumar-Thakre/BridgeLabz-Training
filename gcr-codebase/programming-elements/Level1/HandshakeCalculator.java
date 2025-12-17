import java.util.*;
public class HandshakeCalculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter total number of students:");
		int numberOfStudents= sc.nextInt();
		
		// Applying the required logic
		int handshakes = (numberOfStudents *(numberOfStudents - 1))/2;
		
		// Printing the results
		System.out.println("The number of possible handshakes are "+handshakes);
	}
}