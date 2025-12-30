/*10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.*/

import java.util.*;
public class RechargeSimulator{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile operator 'Jio' 'Airtle' 'VI'");
		String name=sc.next();
		int balance=4000;
		String want="";
		int plane=0;
		
		while(true){
			if(balance>349){
				switch(name){
					case "Jio":
					System.out.println("\nEnter your plane 1. 349, 2. 499, 3. 599, 4. 3599");
					System.out.println("Current balance: "+balance);
					plane=sc.nextInt();
					switch(plane){
						case 349:
						System.out.println("Details: Unlimited call's, 5G data, 28 days");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=349;
							System.out.println("Recharge done:");
							System.out.println("Updated balance: "+balance);
						}
						break;
						case 499:
						System.out.println("Details: Unlimited call's, 5G data, 42 days, ");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=499;
							System.out.println("Recharge done:");
							System.out.println("Updated balance: "+balance);
						}
						break;
						case 599:
						System.out.println("Details: Unlimited call's, 5G data, 56 days");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=599;
							System.out.println("Recharge done:");							
							System.out.println("Updated balance: "+balance);
						}
						break;
						case 3599:
						System.out.println("Details: Unlimited call's, 5G data, 365 days");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=3599;
							System.out.println("Recharge done:");
							System.out.println("Updated balance: "+balance);
						}
						break;
						default:
						System.out.println("Chouse correct plane");
					}
					
					case "Airtle":
					System.out.println("\nEnter your plane 1. 349, 2. 499, 3. 599, 4. 3599");
					System.out.println("Current balance: "+balance);
					plane=sc.nextInt();
					switch(plane){
						case 349:
						System.out.println("Details: Unlimited call's, 5G data, 28 days");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=349;
							System.out.println("Recharge done:");
							System.out.println("Updated balance: "+balance);
						}
						break;
						case 499:
						System.out.println("Details: Unlimited call's, 5G data, 42 days, ");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=499;
							System.out.println("Recharge done:");
							System.out.println("Updated balance: "+balance);
						}
						break;
						case 599:
						System.out.println("Details: Unlimited call's, 5G data, 56 days");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=599;
							System.out.println("Recharge done:");							
							System.out.println("Updated balance: "+balance);
						}
						break;
						case 3599:
						System.out.println("Details: Unlimited call's, 5G data, 365 days");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=3599;
							System.out.println("Recharge done:");
							System.out.println("Updated balance: "+balance);
						}
						break;
						default:
						System.out.println("Chouse correct plane");
					}
					
					case "VI":
					System.out.println("\nEnter your plane 1. 349, 2. 499, 3. 599, 4. 3599");
					System.out.println("Current balance: "+balance);
					plane=sc.nextInt();
					switch(plane){
						case 349:
						System.out.println("Details: Unlimited call's, 5G data, 28 days");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=349;
							System.out.println("Recharge done:");
							System.out.println("Updated balance: "+balance);
						}
						break;
						case 499:
						System.out.println("Details: Unlimited call's, 5G data, 42 days, ");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=499;
							System.out.println("Recharge done:");
							System.out.println("Updated balance: "+balance);
						}
						break;
						case 599:
						System.out.println("Details: Unlimited call's, 5G data, 56 days");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=599;
							System.out.println("Recharge done:");							
							System.out.println("Updated balance: "+balance);
						}
						break;
						case 3599:
						System.out.println("Details: Unlimited call's, 5G data, 365 days");
						System.out.println("Enter 'yes' for recharge");
						want=sc.next();
						if(want.equals("yes")){
							balance-=3599;
							System.out.println("Recharge done:");
							System.out.println("Updated balance: "+balance);
						}
						break;
						default:
						System.out.println("Chouse correct plane");
					}
					
				}
			}else{
				System.out.println("Low balance — recharge not allowed");
				break;
			}
		}
	}
}