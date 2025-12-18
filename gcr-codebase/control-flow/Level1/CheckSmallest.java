import java.util.*;
public class CheckSmallest{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs
		System.out.println("Enter Three Numbers:");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		boolean result= false;
		String ans="No";
		
		// Applying Conditional Statements
		if(number1<number2&&number1<number3){
			result=true;
		}
		if(result){
			ans="Yes";
		}
		
		// Printing the result and close the Scanner Stream
		System.out.println("Is the first number the smallest? "+ ans);
		sc.close();
	}
} 