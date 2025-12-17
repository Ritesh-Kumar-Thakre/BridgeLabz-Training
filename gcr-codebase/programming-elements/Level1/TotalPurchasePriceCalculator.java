import java.util.*;
public class TotalPurchasePriceCalculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter unit price:");
		double unitPrice= sc.nextDouble();
		System.out.println("Enter quantity:");
		int quantity= sc.nextInt();
		
		// Applying the required logic
		double totalPrice=unitPrice*quantity;
		
		// Printing the results
		System.out.println("The total purchase price is INR "+totalPrice+" if the quantity is "+quantity+" and unit price is INR "+unitPrice);
	}
}