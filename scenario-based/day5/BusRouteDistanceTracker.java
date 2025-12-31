/*19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.*;
public class BusRouteDistanceTracker{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		double distance=10;
		
		// Applying the required logic
		while(true){
			System.out.println("Wants to get off at a stop (yes/no) :");
			String ask=sc.next();
			if(ask.equals("yes")){
				System.out.println("Total distance covered: "+distance);
				System.out.println("Have a nice day");
				return;
			}else{
				distance+=distance;
				System.out.println("Approching to next stop.....");
			}
		}
	}
}