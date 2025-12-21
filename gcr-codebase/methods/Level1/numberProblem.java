import java.util.*;
public class numberProblem{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number =sc.nextInt();
		
		// Applying the required logic
		int status=numberIs(number);
		
		// Printing the result
		System.out.println("Entered number is "+status);
	}
	
	// Method to indentify number
	static int numberIs(int n){
		if(n==0){
			return 0;
		}else if(n>0){
			return 1;
		}else{
			return-1;
		}
	}
}