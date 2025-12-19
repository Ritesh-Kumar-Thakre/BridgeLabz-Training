import java.util.*;
public class MultiToSingleDimensionalArray{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs and initializing value
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		System.out.println("Enter columns");
		int columns=sc.nextInt();
		int twoD[][]=new int[rows][columns];
		int oneD[]=new int[rows*columns];
		int index =0;
		
		// Applying the required logic
		System.out.println("Enter the elements of the 2D Array:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				twoD[i][j] = sc.nextInt();
				oneD[index++]=twoD[i][j];
			}
		}

		//Printing the results
		System.out.println("2D Array:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(twoD[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("1D Array:");
			for (int i = 0; i < oneD.length; i++) {
				System.out.print(oneD[i]+" ");
			}
		sc.close();
	}
}