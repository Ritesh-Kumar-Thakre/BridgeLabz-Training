import java.util.*;
public class CompareToStrings{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s1=sc.next();
		System.out.println("Enter second string: ");
		String s2=sc.next();
		
		if(s1.equals(s2)){
			System.out.println("Strings are equal");
		}else{
			System.out.println("Strings are diffrent");
		}
	}
}