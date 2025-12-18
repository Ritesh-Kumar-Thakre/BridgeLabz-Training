import java.util.*;
public class CheckLargest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs
		System.out.println("Enter Three Numbers:");
		int number1=sc.nextInt();
		int number2= sc.nextInt();
		int number3=sc.nextInt();
		String first="No";
		String second="No";
		String third="No";
		
		// Applying Conditional Statements
		if(number1>number2&&number1>number3){
			first="Yes";
		}
		if (number2>number1&& number2>number3){
			second="Yes";
		}
		if (number3>number1&& number3>number2){
			third="Yes";
		}
		
		//Printing the results and close the Scanner Stream
		System.out.println("Is the first number the largest? "+first+
							"\nIs the second number the largest? "+second+
								"\nIs the third number the largest? "+third);
		sc.close();
	
	}
}