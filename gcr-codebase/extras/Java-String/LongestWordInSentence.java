import java.util.*;
public class LongestWordInSentence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter string input");
        String sentence=sc.next();
		
		// Applying the required logic and printing the result
		System.out.println("Longest word in sentence is :"+findLongestSentence(sentence));
        sc.close();
    }

    // Method to Count Vowels and Consonants
    static String findLongestSentence(String sentence){
		String longest="";
		int count=0;
		String[] words = sentence.split(" ");
		for (String word : words){
			String temp=word;
			int tempCount=0;
			for(int i =0;i<temp.length();i++){
				tempCount++;
			}
			if(tempCount>count){
				longest=temp;
			}
		}
		return longest;
    }
}