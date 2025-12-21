import java.util.*;
public class NaturalNumberSum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number =sc.nextInt();
		
		// Printing the results
		sum(number);
		
	}
	
	// Method to calculate natural numbers sum
	static void sum(int n){
		int add=0;
		if(n<=0){
			System.out.println("Not a natural number");
		}else{
			for(int i =1;i<=n;i++){
				add+=i;
			}
			System.out.println("Sum of n natural numbers are "+add);
		}
	}
}