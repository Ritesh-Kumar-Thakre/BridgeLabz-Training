import java.util.*;
public class CheckDivisibility{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter a Number:");
		int number=sc.nextInt();
		String result="";
		
		// Appling conditional statements
		if(number%5==0){
			result="Yes";
		}else{
			result="No";
		}
		
		// Printing the results and close the Scanner Stream
		System.out.println("Is the number "+number+" divisible by 5? "+result);
		sc.close();
	}

}