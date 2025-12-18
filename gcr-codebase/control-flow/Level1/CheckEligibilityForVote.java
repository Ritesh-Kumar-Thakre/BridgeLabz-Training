import java.util.*;
public class CheckEligibilityForVote{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a person's age:");
		int age = sc.nextInt();
		boolean canVote= false;
		
		// Applying Conditional Statements
		if(age>=18){
			canVote=true;
		}
		
		// Printing the results and close the Scanner Stream
		if(canVote){
			System.out.println("The person's age is "+age+" and can vote.");
		}else{
			System.out.println("The person's age is "+age+" and cannot vote.");
		}
		sc.close();
	}
}