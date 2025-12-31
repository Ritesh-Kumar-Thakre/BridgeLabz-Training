/*12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).*/

import java.util.*;
public class TrainReservation{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int seats=50;
		int balance=10000;
		String place="";
		int price=0;
		int totalTicket=0;
		String buy="";
		String ticket ="";
		String exit="";
		
		// Applying the required logic
		while(true){
			// Train selection
			System.out.println("Select Train: Sampta, RajRani");
			String train=sc.next();
			if(seats == 0){
				System.out.println("All seats booked — Booking closed.");
				break;
			}
			if(train.equals("Sampta")|| train.equals("RajRani")){
			// Tickit selection
			switch(train){
				case "Sampta":
				System.out.println("\nEnter your destination \nLike 'Bhopal-Seoni': ");
				System.out.println("Places: Bhopal, Seoni, Balaghat");
				place=sc.next();
			 	System.out.println("\nEnter ticket you want");
			 	System.out.println("1st-AC(1900), 2nd-AC(1200), 3rd-AC(900)");
			 	ticket = sc.next();
				switch(ticket){
					case "1st-AC":
					price=1900;
					System.out.println("\nEnter total tickets you want");
					totalTicket =sc.nextInt();
					if(totalTicket*price<balance){
					if(totalTicket<=seats){
						System.out.println("\nEnter 'buy' for booking");
						buy=sc.next();
						if(buy.equals("buy")){
							balance-=price * totalTicket;
							seats -= totalTicket;
							
							// Tickit Print
							System.out.println("\nEnjoy you tripe");
							System.out.println("Tickit: "+place+" Tickit of: "+ticket+" \nTotal Tickits :x"+totalTicket+" \nTotal Amount: "+totalTicket*price);
							System.out.println("\nUpdated Balnce : "+balance);
							
							System.out.println("\nEnter 'EXIT' to leave or Enter 'No'");
							exit=sc.next();
							if(exit.equals("EXIT")){
								break;
							}else{
								continue;
							}
							
						}
					}else{
						System.out.println("Train is full. Remaning seets: "+seats);
						break;
					}
					}else{
						System.out.println("Low Balnce");
						break;
					}
					break;
					case "2nd-AC":
					price=1200;
					System.out.println("\nEnter total tickets you want");
					totalTicket =sc.nextInt();
					if(totalTicket*price<balance){
					if(totalTicket<=seats){
						System.out.println("\nEnter 'buy' for booking");
						buy=sc.next();
						if(buy.equals("buy")){
							balance-=price * totalTicket;
							seats -= totalTicket;
							
							// Tickit Print
							System.out.println("\nEnjoy you tripe");
							System.out.println("Tickit: "+place+" Tickit of: "+ticket+" \nTotal Tickits :x"+totalTicket+" \nTotal Amount: "+totalTicket*price);
							System.out.println("\nUpdated Balnce : "+balance);
							
							System.out.println("\nEnter 'EXIT' to leave or Enter 'No'");
							exit=sc.next();
							if(exit.equals("EXIT")){
								break;
							}else{
								continue;
							}
						
						}
					}else{
						System.out.println("Train is full. Remaning seets: "+seats);
						break;
					}
					}else{
						System.out.println("Low Balnce");
						break;
					}
					break;
					case "3rd-AC":
					price=900;
					System.out.println("\nEnter total tickets you want");
					totalTicket =sc.nextInt();
					if(totalTicket*price<balance){
					if(totalTicket<=seats){
						System.out.println("\nEnter 'buy' for booking");
						buy=sc.next();
						if(buy.equals("buy")){
							balance-=price * totalTicket;
							seats -= totalTicket;
							
							// Tickit Print
							System.out.println("\nEnjoy you tripe");
							System.out.println("Tickit: "+place+" Tickit of: "+ticket+" \nTotal Tickits :x"+totalTicket+" \nTotal Amount: "+totalTicket*price);
							System.out.println("\nUpdated Balnce : "+balance);
							
							System.out.println("\nEnter 'EXIT' to leave or Enter 'No'");
							exit=sc.next();
							if(exit.equals("EXIT")){
								break;
							}else{
								continue;
							}
						
						}
					}else{
						System.out.println("Train is full. Remaning seets: "+seats);
						break;
					}
					}else{
						System.out.println("Low Balnce");
						break;
					}
					break;
				}
					
			break;		
				
			// Tickit selection
			case "RajRani":
			System.out.println("\nEnter your destination \nLike 'Bhopal-Sagar': ");
			System.out.println("Places: Bhopal, Sagar");
			place=sc.next();
				System.out.println("\nEnter ticket you want");
				System.out.println("1st-AC(1900), 2nd-AC(1200), 3rd-AC(900)");
				ticket = sc.next();
				switch(ticket){
					case "1st-AC":
					price=1900;
					System.out.println("\nEnter total tickets you want");
					totalTicket =sc.nextInt();
					if(totalTicket*price<balance){
					if(totalTicket<=seats){
						System.out.println("\nEnter 'buy' for booking");
						buy=sc.next();
						if(buy.equals("buy")){
							balance-=price * totalTicket;
							seats -= totalTicket;
							
							// Tickit Print
							System.out.println("\nEnjoy you tripe");
							System.out.println("Tickit: "+place+" Tickit of: "+ticket+" \nTotal Tickits :x"+totalTicket+" \nTotal Amount: "+totalTicket*price);
							System.out.println("\nUpdated Balnce : "+balance);
							
							System.out.println("\nEnter 'EXIT' to leave or Enter 'No'");
							exit=sc.next();
							if(exit.equals("EXIT")){
								break;
							}else{
								continue;
							}
						
						}
					}else{
						System.out.println("Train is full. Remaning seets: "+seats);
						break;
					}
					}else{
						System.out.println("Low Balnce");
						break;
					}
					break;
					case "2nd-AC":
					price=1200;
					System.out.println("\nEnter total tickets you want");
					totalTicket =sc.nextInt();
					if(totalTicket*price<balance){
					if(totalTicket<=seats){
						System.out.println("\nEnter 'buy' for booking");
						buy=sc.next();
						if(buy.equals("buy")){
							balance-=price * totalTicket;
							seats -= totalTicket;
							
							// Tickit Print
							System.out.println("\nEnjoy you tripe");
							System.out.println("Tickit: "+place+" Tickit of: "+ticket+" \nTotal Tickits :x"+totalTicket+" \nTotal Amount: "+totalTicket*price);
							System.out.println("\nUpdated Balnce : "+balance);
							
							System.out.println("\nEnter 'EXIT' to leave or Enter 'No'");
							exit=sc.next();
							if(exit.equals("EXIT")){
								break;
							}else{
								continue;
							}
						
						}
					}else{
						System.out.println("Train is full. Remaning seets: "+seats);
						break;
					}
					}else{
						System.out.println("Low Balnce");
						break;
					}
					break;
					case "3rd-AC":
					price=900;
					System.out.println("\nEnter total tickets you want");
					totalTicket =sc.nextInt();
					if(totalTicket*price<balance){
					if(totalTicket<=seats){
						System.out.println("\nEnter 'buy' for booking");
						buy=sc.next();
						if(buy.equals("buy")){
							balance-=price * totalTicket;
							seats -= totalTicket;
							
							// Tickit Print
							System.out.println("\nEnjoy you tripe");
							System.out.println("Tickit: "+place+" Tickit of: "+ticket+" \nTotal Tickits :x"+totalTicket+" \nTotal Amount: "+totalTicket*price);
							System.out.println("\nUpdated Balnce : "+balance);
						
							System.out.println("\nEnter 'EXIT' to leave or Enter 'No'");
							exit=sc.next();
							if(exit.equals("EXIT")){
								break;
							}else{
								continue;
							}
							
						}
					}else{
						System.out.println("Train is full. Remaning seets: "+seats);
						break;
					}
					}else{
						System.out.println("Low Balnce");
						break;
					}
					break;
				}
				
			}
			}else{
				System.out.println("Not a train");
				break;
			}
		}
			
	}
}
