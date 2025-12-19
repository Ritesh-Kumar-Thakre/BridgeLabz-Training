import java.util.*;
public class AgeProblem{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking user inputs
		System.out.println("Enter number of students:");
		int students=sc.nextInt();
		int arr[]=new int[students];
		int length=arr.length;
		
		// Applying the required logic and Printing the result
		for(int i =1;i<=length;i++){
			System.out.println("Enter student "+i+" age:");
			arr[i]=sc.nextInt();
			if(arr[i]<=0){
				System.out.println("Invalid age"+"\n");
			}else if(arr[i]<18){
				System.out.println("The student with the age "+arr[i]+" cannot vote"+"\n");
			}else{
				System.out.println("The student with the age "+arr[i]+" can vote"+"\n");
			}
		}
		sc.close();
	}
}