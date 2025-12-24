import java.util.*;
public class SplitTextWithoutSplit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.nextLine();

        // Applying the required logic
        String[] userWords=splitWithoutSplit(text);
        String[] builtInWords=text.split(" ");
        boolean result=compareArrays(userWords,builtInWords);

        // Printing the results
        System.out.println("Words using user method:");
        for(String w:userWords){
            System.out.println(w);
        }
        System.out.println("Comparison Result: "+result);
        sc.close();
    }

    // Method to split text into words without split()
    static String[] splitWithoutSplit(String text){
        int count=1;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ') count++;
        }
        String[] words=new String[count];
        int index=0;
        int start=0;
        for(int i=0;i<=text.length();i++){
            if(i==text.length() || text.charAt(i)==' '){
                words[index++]=text.substring(start,i);
                start=i+1;
            }
        }
        return words;
    }

    // Method to compare two string arrays using charAt()
    static boolean compareArrays(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(!compareStrings(a[i],b[i])) {
				return false;
			}
        }
        return true;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()){
			return false;
		}
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
}
