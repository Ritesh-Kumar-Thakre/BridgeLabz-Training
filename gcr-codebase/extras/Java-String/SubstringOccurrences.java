import java.util.*;
public class SubstringOccurrences{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter string input");
        String word=sc.next();
		System.out.println("Enter substring input");
		String substring=sc.next();
		
		// Applying the required logic and printing the result
		System.out.println("Substring occcurred "+checkOccurrences(word,substring)+" time.");
        sc.close();
    }

    // Method to count Substring Occurrences
    static int checkOccurrences(String word,String substring){
		int count=0;
		int subLen = substring.length();
		for (int i = 0; i <= word.length() - subLen; i++) {
            if (word.substring(i, i + subLen).equals(substring)) {
                count++;
            }
        }
		return count;
    }
}