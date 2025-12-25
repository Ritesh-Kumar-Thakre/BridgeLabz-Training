import java.util.*;
public class RemoveSpecificCharacter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s1=sc.next();
		System.out.println("Enter character: ");
		char ch=sc.next().charAt(0);
		
		// Printing the results
		System.out.println("Modified String: "+removeCharacter(s1,ch));
		sc.close();
	}
	
	// Method to check Most Frequent Character
	public static String removeCharacter(String s,char ch){
		String s1="";
		for(int i =0;i<s.length();i++){
			if(s.charAt(i)!=ch){
				s1+=s.charAt(i);
			}
		}
        return s1;
	}
}