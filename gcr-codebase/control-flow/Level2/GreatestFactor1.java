import java.util.*;
public class  GreatestFactor1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		// Applying the required logic
		for(int i =number-1;i>=1;i--){
			if(number%i==0){
				System.out.println("The greatest factor of a number is "+i);
				return;
			}
		}
		sc.close();
	}
}