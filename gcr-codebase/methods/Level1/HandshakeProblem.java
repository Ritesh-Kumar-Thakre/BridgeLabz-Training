import java.util.*;
public class HandshakeProblem{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs
		System.out.println("Enter number of students:");
		int numberOfStudents =sc.nextInt();
		
		// Applying the required logic
		int handshake=calculateHandshakes(numberOfStudents);
		
		// Printing the result
		System.out.println("The number of possible handshakes are "+handshake);
	}
	
	// Method to calculate simple interest
	static int calculateHandshakes(int n){
		int total=(n * (n - 1)) / 2;
		return total;
	}
}