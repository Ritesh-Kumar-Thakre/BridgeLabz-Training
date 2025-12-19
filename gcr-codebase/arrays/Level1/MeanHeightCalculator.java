import java.util.*;
public class MeanHeightCalculator{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs and initializing value
		double arr[]=new double[11];
		double sum = 0.0;
		double mean=0.0;
		
		// Applying the required logic
		System.out.println("Enter heights:");
		for(int i =0;i<arr.length;i++){
			double height=sc.nextDouble();
			arr[i]=height;
			sum+=arr[i];
		}
		mean=sum/arr.length;
		
		
		//Printing the result
		System.out.println("The mean height of the football team is "+mean);
		sc.close();
	}
}