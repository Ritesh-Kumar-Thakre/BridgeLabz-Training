import java.util.*;
public class FeeDiscountCalculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter fee amount:");
		double fee= sc.nextDouble();
		System.out.println("Enter discount percent:");
		double discountPercent= sc.nextDouble();
		
		// Applying the required logic
		double discountAmount=(fee*discountPercent)/100;
		double finalAmount=fee-discountAmount;
		
		// Printing the results
		System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+finalAmount);
	}
}