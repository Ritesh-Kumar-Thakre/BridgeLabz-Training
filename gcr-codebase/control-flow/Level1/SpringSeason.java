import java.util.*;
public class SpringSeason{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs
		System.out.println("Enter Month and Day:");
		int month= sc.nextInt();
		int day= sc.nextInt();
		boolean isSpring=false;
		
		// Applying Conditional Statements
		if((month==3&&(day>=20&&day<=31))||(month==4&&(day>=1&&day<=30))||
			(month==5&&(day>=1&&day<=31))||(month==6&&(day>=1&&day<=20))){
			isSpring=true;
		}
		
		// Printing the result and close the Scanner Stream
		if(isSpring){
			System.out.println("It's a Spring Season");
		}else{
			System.out.println("Not a Spring Season");
		}
		sc.close();
	}
}