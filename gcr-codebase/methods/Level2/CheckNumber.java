import java.util.*;
public class CheckNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number=5;
		int numbers[]=new int[number];
		
		// Applying the required logic and Printing the results
		System.out.println("Add 5 numbers in array:");
		for(int i =0;i<numbers.length;i++){
			numbers[i]=sc.nextInt();
			if(isPositive(numbers[i])){
				if(isEven(numbers[i])){
					System.out.println("Number is positive and even");
				}else{
					System.out.println("Number is positive and odd");
				}
			}else{
				System.out.println("Number is negative");
			}
		}
		System.out.println(compare(numbers));
		sc.close();
	}
	
	// Method to Check whether the number is positive or negative
	public static boolean isPositive(int number){
		if(number<0){
			return false;
		}
		return true;
	}
	
	// Method to check whether the number is even or odd
	public static boolean isEven(int number){
           if (number%2==0) {
              return true;
           }
		return false;
	}
	
	// Method to compare the first and last element of the array
	public static int compare(int numbers[]){
		int first=numbers[0];
		int last=numbers[numbers.length-1];
		if(first==last){
			return 0;
		}else if (first>last){
			return 1;
		}else{
			return -1;
		}
	}
}