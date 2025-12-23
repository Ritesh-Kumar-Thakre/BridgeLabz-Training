import java.util.*;
public class StringComparison2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.next();
		int start=0;
		int end = str.length()-1;
        
		// Applying the required logic
        String subString[]=createSubstring(str,start,end);
		System.out.println("String first: "+subString[0]);
		System.out.println("String second: "+subString[1]);
		if(compareUsingCharAt(subString)){
			System.out.println("Both strings are same");
		}else{
			System.out.println("Both strings are diffrent");
		}
        sc.close();
    }

    // Method to create a substring from a string using the charAt()
    static String[] createSubstring(String s1,int start, int end){
        String arr[]=new String[2];
		arr[0]=s1.substring(start,end);
		arr[1]=s1.substring(start+1,end);
		return arr;
    }
	
	// Method to compare two strings using the charAt()
	static boolean compareUsingCharAt(String arr[]){
        if(arr[0].length()!=arr[1].length()){
            return false;
        }
        for(int i=0;i<arr[0].length();i++){
            if(arr[0].charAt(i)!=arr[1].charAt(i)){
                return false;
            }
        }
        return true;
    }
}
