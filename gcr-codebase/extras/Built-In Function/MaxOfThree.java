import java.util.*;
public class MaxOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		
		// Applying the required logic and printing the results
        int result = max(a,b,c);
        System.out.println("Maximum number is: " + result);
        sc.close();
    }
	
	// Method to get max
	static int max(int a,int b,int c){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        return max;
    }
}
