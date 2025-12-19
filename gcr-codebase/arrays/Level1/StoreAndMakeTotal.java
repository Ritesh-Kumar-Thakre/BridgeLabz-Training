import java.util.*;
public class StoreAndMakeTotal{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs and initializing value
		double arr[]=new double[10];
		double total =0.0;
		int index=0;
		double number;
		
		// Applying the required logic
		while(true){
			System.out.println("Enter numbers:");
			arr[index]=sc.nextDouble();
			if(arr[index]<=0){
				break;
			}else{
				index++;
				if(index==10){
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			total+=arr[i];
		}
		
		//Printing the result
		System.out.println("Total value is "+total);
		sc.close();
	}
}