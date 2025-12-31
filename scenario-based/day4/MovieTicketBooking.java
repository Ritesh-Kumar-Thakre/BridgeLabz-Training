/*14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.*/

import java.util.*;
public class MovieTicketBooking{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String movies[]={"Avatar","Avengers","Dhurandhar"};
		String languages[]={"hindi","english","native"};
		String allSnacks[]={"popcorn","nachos","hot dog","samosa","tea","coffee"};
		int snacksPrice[]={399,299,150,40,30,50};
		int silverSeat[]={200,200,200};
		int silverPrice=300;
		int goldSeat[]={100,100,100};
		int goldPrice=500;
		
		// User inputs
		String customers="";
		int movieIndex =0;
		String selectedMovie ="";
		int languageIndex =0;
		String selectedLanguage="";
		String seat="";
		int num=0;
		int cost=0;
		String wantSnacks ="";
		int snacksIndex =0;
		String selectedSnacks = "";
		String more ="";
		
		// Applying the required logic
		while(true){
			System.out.println("Enter your name:");
			customers=sc.next();
			cost = 0;
			selectedSnacks = "None";
			// Movie selection
			System.out.println("Select movie:");
			for (int i = 0; i < movies.length; i++) {
        		System.out.println((i+1) + ". " + movies[i]);
			}
			movieIndex = sc.nextInt() - 1;
			selectedMovie = movies[movieIndex];
			switch(selectedMovie){
				case "Avatar":
				// Language selection
				System.out.println("Select language:");
				for (int i = 0; i < languages.length; i++) {
					System.out.println((i+1) + ". " + languages[i]);
				}
				languageIndex = sc.nextInt() - 1;
				selectedLanguage = languages[languageIndex];
				
				// Seat selection
				System.out.println("Select seat type: silver or gold");
				seat=sc.next();
				if(seat.equals("silver")){
					System.out.println("Value: 300rs");
					System.out.println("Avalable seats: "+silverSeat[movieIndex]);
					System.out.println("Enter number of seats:");
					num=sc.nextInt();
					if(num > silverSeat[movieIndex]) {
						System.out.println("Not enough seats available");
						break;
					}
					silverSeat[movieIndex]-=num;
					System.out.println("Remaining Seats: " + silverSeat[movieIndex]);
					cost=silverPrice*num;
				}else if(seat.equals("gold")){
					System.out.println("Value: 500rs");
					System.out.println("Avalable seats: "+goldSeat[movieIndex]);
					System.out.println("Enter number of seats:");
					num=sc.nextInt();
					if(num > goldSeat[movieIndex]) {
						System.out.println("Not enough seats available");
						break;
					}
					goldSeat[movieIndex]-=num;
					System.out.println("Remaining Seats: " + goldSeat[movieIndex]);
					cost=goldPrice*num;
				}else{
					System.out.println("Not a seat type");
					break;
				}
				
				// Snacks selection
				System.out.println("Want snacks? (yes/no)");
				wantSnacks = sc.next();
				if(wantSnacks.equals("yes")){
					for (int i = 0; i < allSnacks.length; i++) {
						System.out.println((i+1) + ". " + allSnacks[i] + " - " + snacksPrice[i]);
					}
					snacksIndex = sc.nextInt() - 1;
					selectedSnacks = allSnacks[snacksIndex];
					cost += snacksPrice[snacksIndex];
					
					// Print Ticket
					System.out.println("----- Movie Ticket -----");
					System.out.println("Name: " + customers);
					System.out.println("Movie: " + selectedMovie);
					System.out.println("Language: " + selectedLanguage);
					System.out.println("Seat Type: " + seat);
					System.out.println("No. of Seats: " + num);
					System.out.println("Snacks: " + selectedSnacks);
					System.out.println("Total Cost: " + cost);
					System.out.println("-----------------------");
					
					System.out.println("Do you want to book another ticket? (yes/no)");
					more = sc.next();

					if(!more.equals("yes")){
						System.out.println("Thank you for booking. Enjoy your movie!");
					return;
					}
					continue;
				}else{
					selectedSnacks = "None";
					// Print Ticket
					System.out.println("----- Movie Ticket -----");
					System.out.println("Name: " + customers);
					System.out.println("Movie: " + selectedMovie);
					System.out.println("Language: " + selectedLanguage);
					System.out.println("Seat Type: " + seat);
					System.out.println("No. of Seats: " + num);
					System.out.println("Snacks: " + selectedSnacks);
					System.out.println("Total Cost: " + cost);
					System.out.println("-----------------------");
					
					System.out.println("\nDo you want to book another ticket? (yes/no)");
					more = sc.next();

					if(!more.equals("yes")){
						System.out.println("Thank you for booking. Enjoy your movie!");
					return;
					}
					continue;
				}
				
				case "Avengers":
				// Language selection
				System.out.println("Select language:");
				for (int i = 0; i < languages.length; i++) {
					System.out.println((i+1) + ". " + languages[i]);
				}
				languageIndex = sc.nextInt() - 1;
				selectedLanguage = languages[languageIndex];
				
				// Seat selection
				System.out.println("Select seat type: silver or gold");
				seat=sc.next();
				if(seat.equals("silver")){
					System.out.println("Value: 300rs");
					System.out.println("Avalable seats: "+silverSeat[movieIndex]);
					System.out.println("Enter number of seats:");
					num=sc.nextInt();
					if(num > silverSeat[movieIndex]) {
						System.out.println("Not enough seats available");
						break;
					}
					silverSeat[movieIndex]-=num;
					System.out.println("Remaining Seats: " + silverSeat[movieIndex]);
					cost=silverPrice*num;
				}else if(seat.equals("gold")){
					System.out.println("Value: 500rs");
					System.out.println("Avalable seats: "+goldSeat[movieIndex]);
					System.out.println("Enter number of seats:");
					num=sc.nextInt();
					if(num > goldSeat[movieIndex]) {
						System.out.println("Not enough seats available");
						break;
					}
					goldSeat[movieIndex]-=num;
					System.out.println("Remaining Seats: " + goldSeat[movieIndex]);
					cost=goldPrice*num;
				}else{
					System.out.println("Not a seat type");
					break;
				}
				
				// Snacks selection
				System.out.println("Want snacks? (yes/no)");
				wantSnacks = sc.next();
				if(wantSnacks.equals("yes")){
					for (int i = 0; i < allSnacks.length; i++) {
						System.out.println((i+1) + ". " + allSnacks[i] + " - " + snacksPrice[i]);
					}
					snacksIndex = sc.nextInt() - 1;
					selectedSnacks = allSnacks[snacksIndex];
					cost += snacksPrice[snacksIndex];
					
					// Print Ticket
					System.out.println("----- Movie Ticket -----");
					System.out.println("Name: " + customers);
					System.out.println("Movie: " + selectedMovie);
					System.out.println("Language: " + selectedLanguage);
					System.out.println("Seat Type: " + seat);
					System.out.println("No. of Seats: " + num);
					System.out.println("Snacks: " + selectedSnacks);
					System.out.println("Total Cost: " + cost);
					System.out.println("-----------------------");
					
					System.out.println("\nDo you want to book another ticket? (yes/no)");
					more = sc.next();

					if(!more.equals("yes")){
						System.out.println("Thank you for booking. Enjoy your movie!");
					return;
					}
					continue;
				}else{
					selectedSnacks = "None";
					// Print Ticket
					System.out.println("----- Movie Ticket -----");
					System.out.println("Name: " + customers);
					System.out.println("Movie: " + selectedMovie);
					System.out.println("Language: " + selectedLanguage);
					System.out.println("Seat Type: " + seat);
					System.out.println("No. of Seats: " + num);
					System.out.println("Snacks: " + selectedSnacks);
					System.out.println("Total Cost: " + cost);
					System.out.println("-----------------------");
					
					System.out.println("\nDo you want to book another ticket? (yes/no)");
					more = sc.next();

					if(!more.equals("yes")){
						System.out.println("Thank you for booking. Enjoy your movie!");
					return;
					}
					continue;
				}
				//break; no need after return it will not reachable code stops there only
				
				case "Dhurandhar":
				// Language selection
				System.out.println("Select language:");
				for (int i = 0; i < languages.length; i++) {
					System.out.println((i+1) + ". " + languages[i]);
				}
				languageIndex = sc.nextInt() - 1;
				selectedLanguage = languages[languageIndex];
				
				// Seat selection
				System.out.println("Select seat type: silver or gold");
				seat=sc.next();
				if(seat.equals("silver")){
					System.out.println("Value: 300rs");
					System.out.println("Avalable seats: "+silverSeat[movieIndex]);
					System.out.println("Enter number of seats:");
					num=sc.nextInt();
					if(num > silverSeat[movieIndex]) {
						System.out.println("Not enough seats available");
						break;
					}
					silverSeat[movieIndex]-=num;
					System.out.println("Remaining Seats: " + silverSeat[movieIndex]);
					cost=silverPrice*num;
				}else if(seat.equals("gold")){
					System.out.println("Value: 500rs");
					System.out.println("Avalable seats: "+goldSeat[movieIndex]);
					System.out.println("Enter number of seats:");
					num=sc.nextInt();
					if(num > goldSeat[movieIndex]) {
						System.out.println("Not enough seats available");
						break;
					}
					goldSeat[movieIndex]-=num;
					System.out.println("Remaining Seats: " + goldSeat[movieIndex]);
					cost=goldPrice*num;
				}else{
					System.out.println("Not a seat type");
					break;
				}
				
				// Snacks selection
				System.out.println("Want snacks? (yes/no)");
				wantSnacks = sc.next();
				if(wantSnacks.equals("yes")){
					for (int i = 0; i < allSnacks.length; i++) {
						System.out.println((i+1) + ". " + allSnacks[i] + " - " + snacksPrice[i]);
					}
					snacksIndex = sc.nextInt() - 1;
					selectedSnacks = allSnacks[snacksIndex];
					cost += snacksPrice[snacksIndex];
					
					// Print Ticket
					System.out.println("----- Movie Ticket -----");
					System.out.println("Name: " + customers);
					System.out.println("Movie: " + selectedMovie);
					System.out.println("Language: " + selectedLanguage);
					System.out.println("Seat Type: " + seat);
					System.out.println("No. of Seats: " + num);
					System.out.println("Snacks: " + selectedSnacks);
					System.out.println("Total Cost: " + cost);
					System.out.println("-----------------------");
					
					System.out.println("\nDo you want to book another ticket? (yes/no)");
					more = sc.next();

					if(!more.equals("yes")){
						System.out.println("Thank you for booking. Enjoy your movie!");
					return;
					}
					continue;
				}else{
					selectedSnacks = "None";
					
					// Print Ticket
					System.out.println("----- Movie Ticket -----");
					System.out.println("Name: " + customers);
					System.out.println("Movie: " + selectedMovie);
					System.out.println("Language: " + selectedLanguage);
					System.out.println("Seat Type: " + seat);
					System.out.println("No. of Seats: " + num);
					System.out.println("Snacks: " + selectedSnacks);
					System.out.println("Total Cost: " + cost);
					System.out.println("-----------------------");
					
					System.out.println("\nDo you want to book another ticket? (yes/no)");
					more = sc.next();

					if(!more.equals("yes")){
						System.out.println("Thank you for booking. Enjoy your movie!");
					return;
					}
					continue;
				}
				//break; no need after return it will not reachable code stops there only
				default:
				System.out.println("No screens for this movie");
				break;
			}
		}
	}
}