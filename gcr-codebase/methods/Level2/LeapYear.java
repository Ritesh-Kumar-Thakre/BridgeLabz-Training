import java.util.*;
public class LeapYear{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int year= sc.nextInt();
		
		// Applying the required logic and Printing the results
		if(isLeapYear(year)){
			System.out.println("The Year "+year+" is a Leap Year");
		}else{
			System.out.println("The Year "+year+" is not a Leap Year");
		}
		sc.close();
	}
	
	// Method to identify Leap Year
	public static boolean isLeapYear(int year){
		if(year>=1582){
			if(year%400==0){
				return true;
			}else if(year%100==0){
				return false;
			}else if(year%4==0){
				return true;
			}
		}else{
			System.out.println("Enter year >= 1582");
		}
		return false;
	}
}