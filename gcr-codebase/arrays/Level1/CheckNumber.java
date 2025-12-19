import java.util.*;
public class CheckNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs and initializing values
		int numbers=5;
		int arr[]=new int[numbers];
		int length=arr.length;
		int first;
		int last;
		
		// Applying the required logic and Printing the results
		System.out.println("Add numbers in array:");
		for(int i =0;i<length;i++){
			arr[i]=sc.nextInt();
		}
		first=arr[0];
		last = arr[length-1];
		for(int i =0;i<length;i++){
			if(arr[i]==0){
				System.out.println("Entered number is zero");
			}else if(arr[i]<0){
				System.out.println("Entered number is negative number");
			}else{
				System.out.println("Entered number is positive number");
				if(arr[i]%2==0){
					System.out.println("And it is a even number");
				}else{
					System.out.println("And it is a odd number");
				}
			}
		}
		if(first==last){
			System.out.println("Both the numbers are equal");
		}else if (first>last){
			System.out.println("first number is greater");
		}else{
			System.out.println("last number is greater");
		}
		sc.close();
	}
}