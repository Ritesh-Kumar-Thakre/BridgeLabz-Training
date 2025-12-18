import java.util.*;
public class PrimeNumberChecker {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking User Inputs
		System.out.println("Enter number:");
		int number= sc.nextInt();
		boolean isPrime= true;
		
		// Applying the required logic
		if(number<=1){
			isPrime=false;
		}else{
			for(int i =2;i<number;i++){
				if (number%i==0){
					isPrime=false;
					break;
				}
			}
		}
		
		// Printing the result
		if(isPrime){
			System.out.println(number+" is a Prime Number");
		}else{
			System.out.println(number+" is not a Prime Number");
		}
		sc.close();
	}
}