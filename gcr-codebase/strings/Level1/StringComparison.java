import java.util.*;
public class StringComparison {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1=sc.next();
        System.out.println("Enter second string:");
        String str2=sc.next();
        
		// Applying the required logic
        boolean charAtResult=compareUsingCharAt(str1,str2);
        boolean equalsResult=str1.equals(str2);
		
        // Printing results
        System.out.println("Result using charAt(): "+charAtResult);
        System.out.println("Result using equals(): "+equalsResult);
        if(charAtResult==equalsResult){
            System.out.println("Both methods give the same result");
        }else{
            System.out.println("Results are different");
        }
        sc.close();
    }

    // Method to compare two strings using charAt()
    static boolean compareUsingCharAt(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
