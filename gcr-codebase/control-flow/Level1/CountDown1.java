import java.util.*;
public class CountDown1{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter counter:");
		int counter=sc.nextInt();
		
		// Applying while loop and Printing results
		while(counter>=1){
			System.out.println(counter);
			counter--;
		}
		sc.close();
	}
}