import java.util.*;
public class SimpleInterest{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs
		System.out.println("Enter principal:");
		int principal=sc.nextInt();
		System.out.println("Enter rate:");
		int rate=sc.nextInt();
		System.out.println("Enter time:");
		int time=sc.nextInt();
		
		// Applying the required logic
		int simpleInterest=calculateSI(principal,rate,time);
		
		// Printing the result
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	}
	
	// Method to calculate simple interest
	static int calculateSI(int principal, int rate, int time){
		int simpleInterest=(principal*rate*time)/100;
		return simpleInterest;
	}
}