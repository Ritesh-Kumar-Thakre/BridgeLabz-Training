import java.util.*;
public class NumberChecker1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();

        // applying logic and printing results
        int count=countDigits(number);
        int digits[]=storeDigits(number,count);
        System.out.println("Digit Count: "+count);
        System.out.println("Is Duck Number: "+isDuckNumber(digits));
        System.out.println("Is Armstrong Number: "+isArmstrong(number , digits));
        int largest[]=findLargestAndSecondLargest(digits);
        System.out.println("Largest: "+largest[0]+" Second Largest: "+largest[1]);
        int smallest[]=findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: "+smallest[0]+" Second Smallest: "+smallest[1]);
        sc.close();
    }
	
	// Method to count digits
    public static int countDigits(int number){
        int count=0;
        while(number!=0){
            count++;
            number=number/10;
        }
        return count;
    }

	// Method to store digits
    public static int[] storeDigits(int number,int count){
        int digits[]=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=number%10;
            number=number/10;
        }
        return digits;
    }

	// Method to check DuckNumber
    public static boolean isDuckNumber(int digits[]){
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0){
                return true;
            }
        }
        return false;
    }

	// Method to check Armstrong
    public static boolean isArmstrong(int number,int digits[]){
        int sum=0;
        int power=digits.length;
        for(int i=0;i<digits.length;i++){
            sum+=Math.pow(digits[i],power);
        }
        return sum==number;
    }

	// Method to find Largest And Second Largest
    public static int[] findLargestAndSecondLargest(int digits[]){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<digits.length;i++){
            if(digits[i]>first){
                second=first;
                first=digits[i];
            }
            else if(digits[i]>second && digits[i]!=first){
                second=digits[i];
            }
        }
        return new int[]{first,second};
    }
	
	// Method to find Smallest And Second Smallest
    public static int[] findSmallestAndSecondSmallest(int digits[]){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++){
            if(digits[i]<first){
                second=first;
                first=digits[i];
            }
            else if(digits[i]<second && digits[i]!=first){
                second=digits[i];
            }
        }
        return new int[]{first,second};
    }
}

