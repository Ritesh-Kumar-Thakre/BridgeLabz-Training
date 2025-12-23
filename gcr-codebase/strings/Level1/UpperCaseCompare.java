import java.util.*;
public class UpperCaseCompare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.nextLine();

        // Applying required logic
        String manualUpper=convertToUpper(text);
        String builtInUpper=text.toUpperCase();
        boolean result=compareStrings(manualUpper,builtInUpper);

        // Printing the results
        System.out.println("Manual Uppercase : "+manualUpper);
        System.out.println("Built-in Uppercase : "+builtInUpper);
        System.out.println("Both results are same : "+result);
        sc.close();
    }

    // Method to convert lowercase characters to uppercase using ASCII logic
    static String convertToUpper(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            result+=ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1,String s2){
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
