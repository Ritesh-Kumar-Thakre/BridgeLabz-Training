import java.util.*;
public class Exception1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=null;
        
		// Applying the required logic and printing the result
		try{
            generate(text);
        }catch(Exception e){
            System.out.println("Program terminated due to exception");
        }
        demonstrate(text);
        sc.close();
    }

    // Method to generate the Exception
    static void generate(String text){
        if(text.equals("ritesh")){
			System.out.println("Both are same");
		}else{
		System.out.println("Both are diffrent");
		}
    }
	
	// Method to demonstrate NullPointerException
    static void demonstrate(String text){
        try{
			generate(text);
		}catch(NullPointerException e){
			System.out.println("NullPointerException Handled succesfully");
			text="ritesh";
			generate(text);
		}
    }
}