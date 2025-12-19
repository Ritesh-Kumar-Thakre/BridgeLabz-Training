import java.util.*;
public class FindFactors{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs and initializing value
		System.out.println("Enter number:");
		int number=sc.nextInt();
		int maxFactor =10;
		int arrFactors[]=new int[maxFactor];
		int index=0;
		
		// Applying the required logic
		for(int i =1;i<=number;i++){
			if(number%i==0){
				// Resize array if full
				if(index==maxFactor){
					maxFactor*=2;
					int temp[]=new int [maxFactor];
					for(int j =0;j<arrFactors.length;j++){
						temp[j]=arrFactors[j];
					}
					arrFactors=temp;
				}
				arrFactors[index++]=i;
			}
		}
		
		//Printing the results
		System.out.println("The factors of the number are:");
		for(int i =0;i<index;i++){
			System.out.println(arrFactors[i]);
		}
		sc.close();
	}
}