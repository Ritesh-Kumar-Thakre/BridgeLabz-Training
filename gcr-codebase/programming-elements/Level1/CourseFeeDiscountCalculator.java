import java.util.*;
public class CourseFeeDiscountCalculator{
	public static void main(String [] args){
		// Initializing values
		double fee=125000;
		double discountPercent=10;
		
		// Applying the required logic
		double discountAmount=(fee*discountPercent)/100;
		double finalFee= fee-discountAmount;
		
		// Printing the results
		System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+finalFee);
	}
}