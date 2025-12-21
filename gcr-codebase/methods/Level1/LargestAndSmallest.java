import java.util.*;
public class LargestAndSmallest{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int number1 =sc.nextInt();
		int number2=sc.nextInt();
		int number3= sc.nextInt();
		int arr[]=new int[2];
		
		// Applying the required logic and Printing the results
		findSmallestAndLargest(number1,number2,number3,arr);
		System.out.println("The largest number is "+arr[0]);
		System.out.println("The smallest number is "+arr[1]);
		sc.close();
	}
	
	// Method to find smallest and largest numbers
	static int[] findSmallestAndLargest(int number1,int number2,int number3,int arr[]){
		if(number1>number2&&number1>number3){
			arr[0]=number1;
		}else if(number2>number3&& number2>number1){
			arr[0]=number2;
		}else{
			arr[0]=number3;
		}
		if(number1<number2&&number1<number3){
			arr[1]=number1;
		}else if(number2<number3&& number2<number1){
			arr[1]=number2;
		}else{
			arr[1]=number3;
		}
		return arr;
	}
}