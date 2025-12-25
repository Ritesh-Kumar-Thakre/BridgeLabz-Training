import java.util.*;
public class VowelsAndConsonants{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter string input");
        String text=sc.next();
		
		// Applying the required logic and printing the result
		check(text);
        sc.close();
    }

    // Method to Count Vowels and Consonants
    static void check(String text){
		int vowels=0;
		int consonants=0;
		for (char ch : text.toCharArray()){
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				vowels++;
			}else{
				consonants++;
			}
		}
		System.out.println("Vowels count: "+vowels);
		System.out.println("Consonants count: "+consonants);
    }
}