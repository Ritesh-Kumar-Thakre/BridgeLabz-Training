import java.util.*;
public class PrimeChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
		
		// Applying the required logic and printing the results
        if(isPrime(n))
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");

        sc.close();
    }
	
	// Method to check prime number
	static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2;i<=n/2;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
