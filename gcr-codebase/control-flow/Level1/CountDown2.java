import java.util.*;
public class CountDown2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter counter:");
		int counter= sc.nextInt();
		
		// Applying for loop and Printing results
		for(int i=counter;i>=1;i--){
			System.out.println(i);
		}
		sc.close();
	}
}