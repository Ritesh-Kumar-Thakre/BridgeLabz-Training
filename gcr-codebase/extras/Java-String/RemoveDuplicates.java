import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter string input");
        String text=sc.next();
		
		// Applying the required logic and printing the result
		System.out.println(text);
		System.out.println("modified string is: "+modify(text));
        sc.close();
    }

    // Method to Remove Duplicates
    public static String modify(String text){
		String s="";
		Set<Character> set=new LinkedHashSet<>();
		for (char ch : text.toCharArray()){
			set.add(ch);
		}
		for(char ch : set){
			s+=ch;
		}
		return s;
    }
}