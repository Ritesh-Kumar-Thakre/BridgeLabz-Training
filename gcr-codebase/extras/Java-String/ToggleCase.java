import java.util.*;
public class ToggleCase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter string input");
        String word=sc.next();
		
		// Applying the required logic and printing the result
		System.out.println("Toggled output: "+toggle(word));
        sc.close();
    }

    // Method to count Substring Occurrences
    static String toggle(String word){
		String temp="";
		for(char ch : word.toCharArray()){
			String s+=ch;
			if(s.isLowerCase()){
				temp+=s.toUpperCase();
			}else{
				temp+=s.toLowerCase();
			}
		}
		return temp;
    }
}