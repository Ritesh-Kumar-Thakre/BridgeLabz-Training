import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
		
		// Applying the required logic and printing the results
        if(isPalindrome(text))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
	
	// Method to check palindrome
	static boolean isPalindrome(String text){
        int i = 0;
        int j = text.length() - 1;
        while(i < j){
            if(text.charAt(i) != text.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
