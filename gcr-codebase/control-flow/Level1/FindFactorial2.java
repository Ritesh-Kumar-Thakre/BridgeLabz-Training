import java.util.*;
public class FindFactorial2{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		// Taking user input
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int factorial= 1;
		
		// Checking input and appling for loop
		if(number<0){
			System.out.println("Entered number is not a positive integer");
			return;
		}
		for(int i =1;i<=number;i++){
			factorial= factorial*i;
		}
		
		// Printing the results
		System.out.println("Factorial of "+number+" is "+factorial);
		sc.close();
	}
}