import java.util.*;
public class CompareToStrings{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s1="apple";
		String s2="banana";
	
		if(s1.equals(checkLexicographical(s1,s2))){
			System.out.println(s1+" comes before "+s2+" in lexicographical order");
		}else{
			System.out.println(s2+" comes before "+s1+" in lexicographical order");
		}
		sc.close();
	}
	
	// Method to check lexicographical order
	static String checkLexicographical(String s1,String s2){
		String grater = "";
		for(int i =0;i<s1.length();i++){
			if(s1.charAt(i)<s2.length()){
				grater=s2;
				break;
			}else{
				grater=s1;
				break;
			}
		}
		return grater;
	}
}