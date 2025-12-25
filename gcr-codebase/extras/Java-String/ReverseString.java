import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter string input");
        String text=sc.next();
		
		// Applying the required logic and printing the result
		System.out.println(reverse(text));
        sc.close();
    }

    // Method to reverse string
    static String reverse(String text){
		String rev="";
		for(int i=text.length()-1;i>=0;i--){
			rev+=text.charAt(i);
		}
		return rev;
    }
}