import java.util.*;
public class Exception3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.next();
		
        // Applying the required logic
        try{
            generate(text,4,2);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Program stopped due to exception");
        }
        System.out.println(demonstrate(text));
        sc.close();
    }

    // Method to generate the Exception
    static String generate(String text,int start,int end){
        return text.substring(start,end);
    }

    // Method to demonstrate StringIndexOutOfBoundsException
    static String demonstrate(String text){
        String s="";
        try{
            s=generate(text,4,2);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException handled successfully");
            s=generate(text,1,text.length());
        }catch(RuntimeException e){
            System.out.println("Generic RuntimeException handled");
        }
        return s;
    }
}
