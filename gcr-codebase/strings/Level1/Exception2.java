import java.util.*;
public class Exception2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
        String text=sc.next();
        
		// Applying the required logic and printing the result
		try{
            generate(text);
        }catch(Exception e){
            System.out.println("Program stopped due to exception");
        }
        sc.close();
    }

    // Method to generate the Exception
    static void generate(String text){
		for (int i =0;i<=text.length();i++){
			System.out.println(text.charAt(i));
		}
		System.out.println(text);
    }
	
	// Method to demonstrate StringIndexOutOfBoundsException
    static void demonstrate(String text){
        try{
            for(int i=0;i<=text.length();i++){
                System.out.println(text.charAt(i));
            }
			System.out.println(text);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException handled successfully");
        }
    }
}