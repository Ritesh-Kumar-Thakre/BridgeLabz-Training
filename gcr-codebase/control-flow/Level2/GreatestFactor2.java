import java.util.*;
public class  GreatestFactor2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int greatestFactor =1;
		
		// Applying the required logic
		int counter=number-1;
		while(counter>=1){
			if(number%counter==0){
				greatestFactor= counter;
				break;
			}
			counter--;
		}
		
		// Printing the results
		System.out.println("The greatest factor of a "+number+" is "+greatestFactor);
		sc.close();
	}
}