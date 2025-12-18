import java.util.*;
public class CheckNaturalNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a Number:");
		int number= sc.nextInt();
		boolean isNatural=false;
		
		// Applying Conditional Statements
		if (number>0){
			isNatural=true;
		}
		
		// Printing the results and close the Scanner Stream
		if(isNatural){
			System.out.println("The sum of "+number+" natural numbers is "+sumOfnNaturalNumbers(number));
		}else{
			System.out.println("The number "+number+" is not a natural number.");
		}
		sc.close();
	}
	
	// Method to calculate sum of N natural numbers
	public static int sumOfnNaturalNumbers(int n){
		int sum=n*(n+1)/2;
		return sum;
	}
}