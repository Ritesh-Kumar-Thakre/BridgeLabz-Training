import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        boolean logic1 = isPalindromeIterative(text);
        boolean logic2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean logic3 = isPalindromeUsingArray(text);

        System.out.println("\nPalindrome Check Results");
        System.out.println("Logic 1 (Iterative) : " + logic1);
        System.out.println("Logic 2 (Recursive) : " + logic2);
        System.out.println("Logic 3 (Array Based): " + logic3);
        sc.close();
    }

    // Method for Logic 1 — Compare start & end indexes iteratively
    public static boolean isPalindromeIterative(String text){
        int start = 0;
        int end = text.length() - 1;
        while(start < end){
            if(text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method for Logic 2 — Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end){
        if(start >= end){
            return true;
        }
        if(text.charAt(start) != text.charAt(end)){
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    public static char[] reverseText(String text){
        char[] reverse = new char[text.length()];
        int index = 0;
        for(int i=text.length()-1;i>=0;i--){
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }

    // Method for Logic 3 — Compare original char array with reversed array
    public static boolean isPalindromeUsingArray(String text){
        char[] original = text.toCharArray();
        char[] reverse = reverseText(text);
        for(int i=0;i<original.length;i++){
            if(original[i] != reverse[i]){
                return false;
            }
        }
        return true;
    }
}
