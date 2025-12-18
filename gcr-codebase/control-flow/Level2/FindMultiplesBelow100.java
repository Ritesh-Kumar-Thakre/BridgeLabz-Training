import java.util.*;
public class  FindMultiplesBelow100 {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		// Applying the required logic
		if(number>0&&number<100){
			for(int i =100;i>0;i--){
				if(i%number==0){
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Entered number should be between 1 and 99");
		}
		sc.close();
	}
}