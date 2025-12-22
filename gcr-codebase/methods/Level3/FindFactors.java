import java.util.*;
public class FindFactors {
    public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number:");
		int number=sc.nextInt();
		
		// Applying the required logic and printing the results
		int fact[]=factors(number);
		System.out.print("Factors = " );
		for(int i=0;i<fact.length;i++){
			System.out.print(fact[i]+" ");
		}
        System.out.println("\nGreatest Factor = " + greatestfactor(fact));
        System.out.println("Sum of Factors = " + sum(fact,number));
        System.out.println("Product of Factors = " + product(number));
        System.out.println("Product of Cube of Factors = " +productCube(number));
		sc.close();
	}
	
	// Method to find factors of a number
    static int[] factors(int number) {
		int count=0;
		for (int i = 1; i <= number; i++){ 
			if(number%i==0){
				count++;
			}
		}
		int fact[] = new int[count];
		int idx=0;
        for (int i = 1; i <= number; i++){ 
			if(number%i==0){
				fact[idx++]=i;
			}
		}
        return fact;
    }
	
	// Method to find the greatest factor
	static int greatestfactor(int fact[]) {
        return fact[fact.length-1];
    }
	
	// Method to find the sum of the factors
	static int sum(int fact[],int number) {
		int sum=0;
		for (int i = 1; i <= number; i++){ 
			if(number%i==0){
				sum+=i;
			}
		}
		return sum;
    }
	
	// Method to find the product of the factors
	static double product(int number){
		int count=0;
		for (int i = 1; i <= number; i++){ 
			if(number%i==0){
				count++;
			}
		}
        return Math.pow(number, (double) count / 2);
    }
	
	// Method to  find the product of the cube of the factors
	static double productCube(int number) {
        int count=0;
		for (int i = 1; i <= number; i++){ 
			if(number%i==0){
				count++;
			}
		}
        return Math.pow(number, (double) (3 * count) / 2);
    }
}