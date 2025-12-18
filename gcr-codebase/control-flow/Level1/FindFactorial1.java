import java.util.*;
public class FindFactorial1{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		// Taking user input
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int factorial= 1;
		
		// Checking input and applying while loop
		int temp=number;
		if(number<0){
			System.out.println("Entered number is not a positive integer");
			return;
		}
		while(temp!=0){
			factorial=factorial*temp;
			temp--;
		}
		
		// Printing the results
		System.out.println("Factorial of "+number+" is "+factorial);
		sc.close();
	}
}