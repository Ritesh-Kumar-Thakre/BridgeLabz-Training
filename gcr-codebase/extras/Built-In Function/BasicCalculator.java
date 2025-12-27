import java.util.*;
public class BasicCalculator {	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Choose operation: +  -  *  /");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("Result = " + add(a,b));
                break;
            case '-':
                System.out.println("Result = " + subtract(a,b));
                break;
            case '*':
                System.out.println("Result = " + multiply(a,b));
                break;
            case '/':
                if(b == 0)
                    System.out.println("Division not possible");
                else
                    System.out.println("Result = " + divide(a,b));
                break;
            default:
                System.out.println("Invalid Operation");
        }
        sc.close();
    }
	
	// Method for add
	static int add(int a,int b){
		return a + b; 
	}
	
	// Method for add
    static int subtract(int a,int b){
		return a - b;
	}
	
	// Method for add
    static int multiply(int a,int b){
		return a * b; 
	}
	
	// Method for add
    static double divide(int a,int b){
		return (double)a / b; 
	}
}
