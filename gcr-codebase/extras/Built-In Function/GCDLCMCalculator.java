import java.util.*;
public class GCDLCMCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
		
		// Applying the required logic and printing the results
        System.out.println("GCD = " + gcd(a,b));
        System.out.println("LCM = " + lcm(a,b));
        sc.close();
    }
	
	// Method for gcd
	static int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	
	// Method for lcm
    static int lcm(int a,int b){
        return (a * b) / gcd(a,b);
    }
}
