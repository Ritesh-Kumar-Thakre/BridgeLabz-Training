import java.util.*;
public class CompareSum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number= sc.nextInt();
		
		// Applying the required logic and Printing the results
		int recursive=rSum(number);
		int formulae=fSum(number);
		if(recursive==formulae){
			System.out.println("Both methods print the same result "+recursive);
		}else{
			System.out.println("Both methods print different results "+recursive+" and "+formulae);
		}
		sc.close();
	}
	
	// Recursive method to calculate sum of all natural numbes 
	public static int rSum(int n){
		if(n==0){
			return 0;
		}
		return n+rSum(n-1);
	}
	
	// Method to calculate sum of all natural numbes by formulae 
	public static int fSum(int n){
		int sum = n*(n+1)/2;
		return sum;
	}
}