import java.util.*;
public class NumberChecker3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();

		// Applying the required logic and printing the results
        int digits[]=storeDigits(number , countDigits(number));
        int reversed[]=reverseArray(digits);
        System.out.println("Is Palindrome: "+isPalindrome(digits , reversed));
        System.out.println("Is Duck Number: "+isDuckNumber(digits));
        sc.close();
    }

    // Method to count number of digits in a number
    public static int countDigits(int number){
        int count=0;
        while(number!=0){
            count++;
            number=number/10;
        }
        return count;
    }

    // Method to store digits of a number in an array
    public static int[] storeDigits(int number,int count){
        int digits[]=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=number%10;
            number=number/10;
        }
        return digits;
    }

    // Method to reverse the elements of an array
    public static int[] reverseArray(int arr[]){
        int rev[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rev[i]=arr[arr.length-1-i];
        }
        return rev;
    }

    // Method to check whether two arrays are equal (Palindrome check)
    public static boolean isPalindrome(int a[],int b[]){
        return Arrays.equals(a , b);
    }

    // Method to check whether a number is a Duck number
    public static boolean isDuckNumber(int digits[]){
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0){
                return true;
            }
        }
        return false;
    }
}

