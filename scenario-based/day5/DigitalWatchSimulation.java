/*16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements*/

import java.util.*;
public class DigitalWatchSimulation{
	public static void main(String []args){
		int hours=24;
		int minutes=60;
		
		for(int i =0;i<hours;i++){
			for(int j=0;j<minutes;j++){
				if(i==13&&j==0){
					System.out.println("Power cut");
					return;
				}
				if(i<10 && j<10){
					System.out.println("0"+i+":0"+j);
				}else if(i<10){
					System.out.println("0"+i+":"+j);
				}else if (i>=10&&j<10){
					System.out.println(i+":0"+j);
				}else{
					System.out.println(i+":"+j);
				}
				
				// delay
				 try{
					Thread.sleep(10);
				}catch(Exception e){
				}
			}
		}
	}
}