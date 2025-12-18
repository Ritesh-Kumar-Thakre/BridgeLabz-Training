import java.util.*;
public class  FindMultiplesOfNumber {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		// Applying the required logic
		if(number>0&&number<100){
			int counter=100;
			while(counter>=1){
				if(counter%number==0){
					System.out.println(counter);
				}
				counter--;
			}
		}else{
			System.out.println("Entered number should be between 1 and 99");
		}
		sc.close();
	}
}