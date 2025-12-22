import java.util.*;
public class NumberChecker5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();
		
		// Applying the required logic and Printing the results
        System.out.println("Is Perfect Number: "+isPerfect(number));
        System.out.println("Is Abundant Number: "+isAbundant(number));
        System.out.println("Is Deficient Number: "+isDeficient(number));
        System.out.println("Is Strong Number: "+isStrong(number));
        sc.close();
    }

    // Method to check whether a number is a Perfect number
    public static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }

    // Method to check whether a number is an Abundant number
    public static boolean isAbundant(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum>n;
    }

    // Method to check whether a number is a Deficient number
    public static boolean isDeficient(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum<n;
    }

    // Method to check whether a number is a Strong number
    public static boolean isStrong(int n){
        int temp=n;
        int sum=0;
        while(temp!=0){
            sum+=factorial(temp%10);
            temp=temp/10;
        }
        return sum==n;
    }

    // Method to calculate factorial of a digit
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
