import java.util.*;
public class EvenOddArrays{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs and initializing values
		System.out.println("Enter numbers:");
		int number=sc.nextInt();
		int size = number / 2 + 1;
		int arrEven[]=new int[size];
		int arrOdd[]=new int[size];
		int evenIndex=0;
		int oddIndex=0;
		
		
		// Applying the required logic
		if(number<=0){
			System.out.println("Not a natural number!!");
			return;
		}
		for(int i =1;i<=number;i++){
			if(i%2==0){
				arrEven[evenIndex++]=i;
			}else{
				arrOdd[oddIndex++]=i;
			}
		}
		
		//Printing the results
		System.out.println("Even numbers");
		for(int i =0;i<evenIndex;i++){
			System.out.println(arrEven[i]);
		}
		System.out.println("Odd numbers");
		for(int i =0;i<oddIndex;i++){
			System.out.println(arrOdd[i]);
		}
		sc.close();
	}
}