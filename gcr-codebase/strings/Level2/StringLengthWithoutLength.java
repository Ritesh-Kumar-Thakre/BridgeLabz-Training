import java.util.*;
public class StringLengthWithoutLength{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.next();

        // Applying the required logic
        int customLength=findLength(text);
        int builtInLength=text.length();

        // Printing the results
        System.out.println("Length using user method: "+customLength);
        System.out.println("Length using built-in method: "+builtInLength);
        sc.close();
    }

    // Method to find length without using length()
    static int findLength(String text){
        int count=0;
        try{
            for(;;){
                text.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){
            return count;
        }
    }
}
