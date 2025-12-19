import java.util.*;
public class MultiplicationTable2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs and initializing value
		System.out.println("Enter number:");
		int number=sc.nextInt();
		int arr[]=new int[4];
		int k=0;
		
		// Applying the required logic
		for(int i =6;i<=9;i++){
			arr[k]=number*i;
			k++;
		}
		
		//Printing the result
		System.out.println("Multiplication table from 6 to 9:");
		k=0;
		for(int i =6;i<=9;i++){
			System.out.println(number+" * "+i+" = "+arr[k]);
			k++;
		}
		sc.close();
	}
}