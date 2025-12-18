import java.util.*;
public class LeapYearChecker {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter year:");
		int year= sc.nextInt();
		boolean isLeapYear=false;
		
		// Applying the required logic
		if(year>=1582){
			if(year%400==0){
				isLeapYear=true;
			}else if(year%100==0){
				isLeapYear=false;
			}else if(year%4==0){
				isLeapYear=true;
			}else{
				isLeapYear=false;
			}
		}else{
			System.out.println("Enter year >= 1582");
		}
		
		// Printing the results
		if(isLeapYear){
			System.out.println("Year "+year+" is a Leap Year");
		}else{
			System.out.println("Year "+year+" is not a Leap Year");
		}
		sc.close();
	}
}