import java.util.*;
public class LowerCaseCompare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.nextLine();

        // Applying the required logic
        String manualLower=convertToLower(text);
        String builtInLower=text.toLowerCase();
        boolean result=compareStrings(manualLower,builtInLower);

        // Printing the results
        System.out.println("Manual Lowercase : "+manualLower);
        System.out.println("Built-in Lowercase : "+builtInLower);
        System.out.println("Both results are same : "+result);
        sc.close();
    }

    // Method to convert uppercase characters to lowercase using ASCII logic
    static String convertToLower(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
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
