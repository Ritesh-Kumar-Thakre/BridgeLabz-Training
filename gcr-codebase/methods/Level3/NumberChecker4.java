import java.util.*;
public class NumberChecker4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();
		
		// Applying the required logic and Printing the results
        System.out.println("Is Prime Number: "+isPrime(number));
        System.out.println("Is Neon Number: "+isNeon(number));
        System.out.println("Is Spy Number: "+isSpy(number));
        System.out.println("Is Automorphic Number: "+isAutomorphic(number));
        System.out.println("Is Buzz Number: "+isBuzz(number));
        sc.close();
    }

    // Method to check whether a number is prime
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // Method to check whether a number is a Neon number
    public static boolean isNeon(int n){
        int square=n*n;
        int sum=0;
        while(square!=0){
            sum+=square%10;
            square=square/10;
        }
        return sum==n;
    }

    // Method to check whether a number is a Spy number
    public static boolean isSpy(int n){
        int sum=0;
        int prod=1;
        while(n!=0){
            int d=n%10;
            sum+=d;
            prod*=d;
            n=n/10;
        }
        return sum==prod;
    }

    // Method to check whether a number is an Automorphic number
    public static boolean isAutomorphic(int n){
        int square=n*n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }

    // Method to check whether a number is a Buzz number
    public static boolean isBuzz(int n){
        return n%7==0 || n%10==7;
    }
}
