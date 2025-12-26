import java.util.*;
public class RecursiveFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

		// Applying the required logic and printing the results
        long result = factorial(n);
        System.out.println("Factorial = " + result);
        sc.close();
    }
	
	// Method to find factorial
	static long factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
