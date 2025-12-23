import java.util.*;
public class Exception4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value:");
        String text=sc.next();

        // Applying the required logic
        try{
            generate(text);
        }catch(Exception e){
            System.out.println("Program stopped due Number Format Exception");
        }
        demonstrate(text);
        sc.close();
    }

    // Method to generate NumberFormatException
    static int generate(String text){
        return Integer.parseInt(text);
    }

    // Method to demonstrate NumberFormatException handling
    static int demonstrate(String text){
        int num=0;
        try{
            num=generate(text);
            System.out.println("Converted number: "+num);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException caught: Invalid input");
        }
        catch(RuntimeException e){
            System.out.println("Generic RuntimeException caught");
        }
        return num;
    }
}

