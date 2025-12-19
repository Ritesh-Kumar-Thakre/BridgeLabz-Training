import java.util.*;
public class FizzBuzz{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs and initializing value
		System.out.println("Enter number:");
		int number=sc.nextInt();
		int arr[]=new int[number];
		int index=0;
		
		// Applying the required logic and Printing the result
		for(int i =1;i<=number;i++){
			arr[index]=i;
			if(arr[index]%3==0&&arr[index]%5==0){
				System.out.println("FizzBuzz");
			}else if(arr[index]%5==0){
				System.out.println("Buzz");
			}else if(arr[index]%3==0){
				System.out.println("Fizz");
			}else{
				System.out.println(arr[index]);
			}
			index++;
		}
		sc.close();
	}
}