import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter string input");
        String text=sc.next();
		
		// Applying the required logic and printing the result
		if(text.equals(reverse(text))){
			System.out.println("It is palindrome");
		}else{
			System.out.println("It is not palindrome");
		}
        sc.close();
    }

    // Method to check palindrome
    static String reverse(String text){
		String rev="";
		for(int i=text.length()-1;i>=0;i--){
			rev+=text.charAt(i);
		}
		return rev;
    }
}