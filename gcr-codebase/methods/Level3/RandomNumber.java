import java.util.*;
public class RandomNumber {
    public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int number=10;

		// Applying the required logic and printing the results
		int arr[]=generate6DigitRandomArray(number);
		System.out.println("Generated Numbers: ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		if(isUnique(number,arr)){
			System.out.println("All numbers are unique");
		}else{
			System.out.println("Have duplicate numbers");
		}
		sc.close();
	}
	
	// Method to generate array of 6-digit random numbers
    public static int[] generate6DigitRandomArray(int size){
        int[] arr=new int[size];
        for (int i=0; i<size;i++) {
            arr[i]=(int)(Math.random()*900000) +100000;
        }
        return arr;
    }
	
	// Method to check 6-digit random numbers are unique
	public static boolean isUnique(int size,int arr[]){
        HashSet<Integer> set= new HashSet<>();
		for(int i =0;i<size;i++){
			set.add(arr[i]);
		}
		if(set.size()==size){
			return true;
		}
        return false;
    }
}