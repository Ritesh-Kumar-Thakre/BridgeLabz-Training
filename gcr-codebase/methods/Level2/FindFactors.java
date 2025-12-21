import java.util.*;
public class FindFactors{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number= sc.nextInt();
		
		// Applying the required logic and Printing the results
		int factors[]=allFactors(number);
		System.out.println("Factors are:");
		for(int i=0;i<factors.length;i++){
			System.out.println(factors[i]);
		}
		System.out.println("Sum of all factors are: "+sumOfFactors(factors));
		System.out.println("The product of the factors are: "+productOfFactors(factors,number));
		System.out.println("The sum of square of the factors are: "+sumOfSquareOfFactors(factors));
		sc.close();
	}
	
	// Method to calculate all factors of number
	public static int[] allFactors(int number) {
		int index=0;
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}	
		}
		int[] factors = new int[count];
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors[index++]=i;
			}	
		}
		return factors;
	}
	
	// Method to calculate sum of all factors
	public static int sumOfFactors(int factors[]) {
		int sum=0;
		for(int i =0;i<factors.length;i++){
			sum+=factors[i];
		}
		return sum;
	}
	
	// Method to find the product of the factors 
	public static int productOfFactors(int factors[],int number) {
		int count=0;
		for (int i = 1; i <= factors.length; i++) {
			if (number % i == 0) {
				count++;
			}	
		}
		int product=number*(count/2);
		return product;
	}
	
	// Method to find the sum of square of the factors
	public static int sumOfSquareOfFactors(int factors[]) {
		int sum=0;
		for(int i =0;i<factors.length;i++){
			sum+= Math.pow(factors[i],2) ;
		}
		return sum;
	}

}