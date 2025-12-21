import java.util.*;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a, b and c:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        // Applying the required logic and Printing results
        double[] roots =findRoots(a, b, c);
        if(roots.length==2) {
            System.out.println("Two real roots:");
            System.out.println("Root 1 = "+ roots[0]);
            System.out.println("Root 2 = "+ roots[1]);
        } else if(roots.length==1) {
            System.out.println("One real root:");
            System.out.println("Root = "+ roots[0]);
        } else{
            System.out.println("No real roots");
        }
        sc.close();
    }

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c){
        double delta=Math.pow(b, 2)- 4*a*c;
        if(delta >0) {
            double root1=(-b + Math.sqrt(delta))/(2 * a);
            double root2=(-b - Math.sqrt(delta))/(2 * a);
            return new double[]{root1, root2};
        }else if(delta==0) {
            double root= -b /(2* a);
            return new double[]{root};
        }
		return new double[0];
    }
}
