import java.util.*;
public class Exception5 {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of names:");
        int size=sc.nextInt();
        String names[]=new String[size];

		// Applying the required logic
        System.out.println("Enter names:");
        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }
        try{
            generate(names);
        }catch(Exception e){
            System.out.println("Program stopped due to exception");
        }
        demonstrate(names);
        sc.close();
    }

    // Method to generate ArrayIndexOutOfBoundsException
    static void generate(String arr[]){
        System.out.println(arr[arr.length]);
    }

    // Method to demonstrate ArrayIndexOutOfBoundsException handling
    static void demonstrate(String arr[]){
        try{
            System.out.println(arr[arr.length]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException handled successfully");
        }
        catch(RuntimeException e){
            System.out.println("Generic RuntimeException handled");
        }
    }
}
