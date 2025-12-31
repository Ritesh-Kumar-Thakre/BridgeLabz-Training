/*11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.*/

import java.util.*;
public class Temperature{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		String days[]=new String[7];
		double temp[]=new double[7];
		double totalTemp=0.0;
		double maxTemp=0.0;
		
		// Applying the required logic
		System.out.println("Enter day and temperature");
		for(int i =0;i<7;i++){
			days[i]=sc.next();
			temp[i]=sc.nextDouble();
			totalTemp+=temp[i];
			if(temp[i]>maxTemp){
				maxTemp=temp[i];
			}
		}
		double average=totalTemp/7;
		
		// Printing the results
		System.out.println("\n------- Temperature -------");
        System.out.printf("%-5s %-15s %-10s%n", "No", "Days", "Temperature");
        System.out.println("---------------------------------------------");

        for(int i = 0; i < 7; i++) {
            System.out.printf("%-5d %-15s %-10s%n",
                    (i+1), days[i], temp[i]);
        }
		System.out.println("---------------------------------------------");
		System.out.println("---------------- Average Temperature: average");
		System.out.println("---------------- Max Temperature: maxTemp");
	}
}