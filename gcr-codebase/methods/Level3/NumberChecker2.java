import java.util.*;
public class NumberChecker2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();
		
		// Applying the required logic and printing the results
        int count=countDigits(number);
        int digits[]=storeDigits(number,count);
        System.out.println("Sum of digits: "+sumOfDigits(digits));
        System.out.println("Sum of squares: "+sumOfSquares(digits));
        System.out.println("Is Harshad Number: "+isHarshad(number , digits));
        int freq[][]=digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for(int i=0;i<10;i++){
            System.out.println(freq[i][0]+" -> "+freq[i][1]);
        }
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

    // Method to find sum of digits
    public static int sumOfDigits(int digits[]){
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum+=digits[i];
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int digits[]){
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum+=Math.pow(digits[i],2);
        }
        return sum;
    }

    // Method to check whether number is Harshad number
    public static boolean isHarshad(int number,int digits[]){
        return number%sumOfDigits(digits)==0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int digits[]){
        int freq[][]=new int[10][2];
        for(int i=0;i<10;i++){
            freq[i][0]=i;
        }
        for(int i=0;i<digits.length;i++){
            freq[digits[i]][1]++;
        }
        return freq;
    }
}
