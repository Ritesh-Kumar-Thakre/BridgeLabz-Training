import java.util.*;
public class Anagrams{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1: ");
		String s1=sc.next();
		System.out.println("Enter string2: ");
		String s2=sc.next();
		
		// Printing the results
		if(checkAnagrams(s1,s2)){
			System.out.println("Anagrams");
		}else{
			System.out.println("Not anagrams");
		}
		sc.close();
	}
	
	// Method to check Most Frequent Character
	public static boolean checkAnagrams(String s1, String s2){
		int freq[]= new int[32];
		for(int i =0;i<s1.length();i++){
			char ch = s1.charAt(i);
			if(ch>='a'&&ch<='z'){
				freq[ch - 'a']++;
				
			}
		}
		for(int i =0;i<s2.length();i++){
			char ch = s2.charAt(i);
			if(ch>='a'&&ch<='z'){
				freq[ch - 'a']--;
				
			}
		}
        for(int i =0;i<freq.length;i++){
			if(freq[i]!=0){
				return false;
			}
		}
		return true;
	}
}