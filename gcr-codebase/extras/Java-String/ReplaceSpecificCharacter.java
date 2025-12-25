import java.util.*;
public class ReplaceSpecificCharacter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence:: ");
		String s1=sc.nextLine();
		System.out.println("Enter given word: ");
		String givenWord=sc.next();
		System.out.println("Enter another word: ");
		String anotherWord=sc.next();
		
		// Printing the results
		System.out.println("Sentence after replace: "+replaceWord(s1,givenWord,anotherWord));
		sc.close();
	}
	
	// Method to replaces a given word with another word
	public static String replaceWord(String s,String s2,String s3){
		String s1="";
		String arr[]=s.split(" ");
		for(String word: arr){
			if(word.equals(s2)){
				s1+=s3+" ";
			}else{
				s1+=word+" ";
			}
		}
        return s1.trim();
	}
}