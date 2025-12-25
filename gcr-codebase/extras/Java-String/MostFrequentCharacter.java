import java.util.*;
public class MostFrequentCharacter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s1=sc.next();
		
		// Printing the results
		System.out.println("Most Frequent Character: "+findMostFrequent(s1));
		sc.close();
	}
	
	// Method to check Most Frequent Character
	public static char findMostFrequent(String s){
		char plac[]=new char[26];
		int freq[]= new int[32];
		for(int i =0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch>='a'&&ch<='z'){
				freq[ch - 'a']++;
			}
		}
		int max = 0;
        char result =' ';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result =(char)(i + 'a');
            }
        }
        return result;
	}
}