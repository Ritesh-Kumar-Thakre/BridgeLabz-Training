import java.util.*;
public class CompareNaturalNumberSum1{
	public static void main(String[]args){
		Scanner  sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a number:");
		int number= sc.nextInt();
		int whileSum=0;
		int formulaeSum=0;
		
		// Applying while loop to calculate sum
		if(!check(number)){
			System.out.println("Entered number is not a natural number");
			return;
		}
		int temp=number;
		while(temp!=0){
			whileSum+=temp;
			temp--;
		}
		//calculateing sum using formulae
		formulaeSum=number*(number+1)/2;
		
		// Compare both results and printing the result
		if(whileSum==formulaeSum){
			System.out.println("Both have same output "+whileSum);
		}else{
			System.out.println("Both have different output "+whileSum+" and "+formulaeSum);
		}
		sc.close();
	}
	
	// Method to check natural number
	public static boolean check(int num){
		if(num<=0){
			return false;
		}
		return true;
	}
}