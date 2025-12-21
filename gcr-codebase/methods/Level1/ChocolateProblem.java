import java.util.*;
public class ChocolateProblem{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of chocolates:");
		int numberOfchocolates  =sc.nextInt();
		System.out.println("Enter number of Childrens:");
		int numberOfChildren =sc.nextInt();
		int arr[]=new int[2];
		
		// Applying the required logic and Printing the results
		chocolatesDistribution(numberOfchocolates ,numberOfChildren,arr);
		System.out.println("The number of chocolates each child will get are "+arr[0]);
		System.out.println("The remaining chocolates are "+arr[1]);
		sc.close();
	}
	
	// Method to find chocolates distribution
	public static int[] chocolatesDistribution(int chocolates, int childrens, int arr[]){
		arr[0] =chocolates/childrens;
		arr[1]=chocolates-(arr[0]*childrens);
		return arr;
	}
}