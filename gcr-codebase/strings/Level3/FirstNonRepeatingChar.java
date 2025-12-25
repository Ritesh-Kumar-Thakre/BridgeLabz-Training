import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);
		// '\0' it is a character literal prints nothing, but it exists
        if(result=='\0'){
            System.out.println("No non-repeating character found");
        }else{
            System.out.println("First non-repeating character is: "+result);
		}
        sc.close();
    }

    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text){
        int[] freq = new int[256];
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            freq[ch]++;
        }
        // Find first character with frequency = 1
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(freq[ch]==1){
                return ch;
            }
        }
        return '\0';
    }
}
