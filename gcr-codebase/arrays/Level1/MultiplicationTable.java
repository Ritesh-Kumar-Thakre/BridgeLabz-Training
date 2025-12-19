import java.util.*;
public class MultiplicationTable{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs and initializing value
		System.out.println("Enter number:");
		int number=sc.nextInt();
		int arr[]=new int[10];
		int length=arr.length;
		
		// Applying the required logic
		for(int i =1;i<=10;i++){
			arr[i-1]=number*i;
		}
		
		//Printing the result
		System.out.println("Multiplication Table:");
		for(int i =1;i<=length;i++){
			System.out.println(number+" * "+i+" = "+arr[i-1]);
		}
		sc.close();
	}
}