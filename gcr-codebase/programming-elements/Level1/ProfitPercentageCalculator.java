import java.util.*;
public class ProfitPercentageCalculator{
	public static void main(String [] args){
		// Initializing values
		int costPrice =129;
		int sellingPrice=191;
		
		// Applying the required logic
		int profit=(sellingPrice-costPrice);
		double profitPercentage= ((double)profit/costPrice)*100;
		
		// Printing the results
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice +"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
	}
}