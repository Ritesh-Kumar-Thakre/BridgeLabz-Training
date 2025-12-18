import java.util.*;
public class CompareNaturalNumberSum2{
	public static void main(String[]args){
		Scanner  sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a number:");
		int number= sc.nextInt();
		int forSum=0;
		int formulaeSum=0;
		
		// Appling for loop to calculate sum
		if(!check(number)){
			System.out.println("Entered number is not a natural number");
			return;
		}
		for(int i=0;i<=number;i++){
			forSum+=i;
		}
		//calculateing sum using formulae
		formulaeSum=number*(number+1)/2;
		
		// Compare both results and printing the result
		if(forSum==formulaeSum){
			System.out.println("Both have same output "+forSum);
		}else{
			System.out.println("Both have different output "+forSum+" and "+formulaeSum);
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