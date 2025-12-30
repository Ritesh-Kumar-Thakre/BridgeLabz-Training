/*8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.*/

import java.util.*;
public class ShopDashboard{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total items");
		int item= sc.nextInt();
		String list[]=new String[item];
		double prices[]=new double[item];
		double totalPrice=0;
		double discountTotal=0;
		
		// Applying the required logic
		System.out.println("Enter items name");
		for(int i=0;i<item;i++){
			list[i]=sc.next();
		}
		System.out.println("Enter prices");
		for(int i=0;i<item;i++){
			prices[i]=sc.nextDouble();
			totalPrice+=prices[i];
		}
		double discountAmount = calculateDiscount(totalPrice,discountTotal);
        double payableAmount = totalPrice - discountAmount;
		
		// Printing the results
        System.out.println("\n------- SHOP BILL SUMMARY -------");
        System.out.printf("%-20s %-10s%n", "Item Name", "Price");
        System.out.println("---------------------------------");
        for(int i = 0; i < item; i++) {
            System.out.printf("%-20s %-10.2f%n", list[i], prices[i]);
        }
        System.out.println("---------------------------------");
        System.out.printf("%-20s %-10.2f%n", "Total Amount", totalPrice);
        System.out.printf("%-20s %-10.2f%n", "Discount", discountAmount);
        System.out.printf("%-20s %-10.2f%n", "Amount Payable", payableAmount);
        System.out.println("---------------------------------");
        sc.close();
	}
	
	// Method for discount
	public static double calculateDiscount(double totalPrice,double discountTotal){
		if(totalPrice<10000.0){
			discountTotal=totalPrice*0.10;
		}else if(totalPrice<20000){
			discountTotal=totalPrice*0.15;
		}else{
			discountTotal=totalPrice*0.20;
		}
		return discountTotal;
	}
}