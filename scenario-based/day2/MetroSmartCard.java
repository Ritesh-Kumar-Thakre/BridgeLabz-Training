import java.util.*;
public class MetroSmartCard{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter distance");
		int distance = sc.nextInt();
		int balance=100;
		
		// Applying the required logic
		int totalFare=fare(distance);
		System.out.println("Fare for the distance is "+totalFare);
		if(totalFare>balance){
			System.out.println("Low Balance");
		}else{
			System.out.println("Enjoy your journey");
			System.out.println("Remaning amount: "+deduct(totalFare,balance));
		}
		sc.close();
	}
	
	// Method to calculate fare
	static int fare(int distance){
		int fare = (distance <= 5) ? 10 : (distance <= 10) ? 20 : 30;
		return fare;
	}
	
	// Method to deduct from smart card balance
	static int deduct(int fare,int balance){
		return balance-=fare;
	}
}