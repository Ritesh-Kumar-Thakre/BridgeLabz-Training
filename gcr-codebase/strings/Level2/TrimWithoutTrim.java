import java.util.*;
public class TrimWithoutTrim{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.nextLine();
		
		// Applying the required logic
        int[] idx=findTrimIndex(text);
        String custom=subString(text,idx[0],idx[1]);
        String built=text.trim();

		// Printing the results
        System.out.println("Trimmed text: "+custom);
        System.out.println("Match with trim(): "+compare(custom,built));
        sc.close();
    }

    // Method to Find start & end without spaces
    static int[] findTrimIndex(String s){
        int start=0,end=s.length()-1;
        while(start<s.length()&&s.charAt(start)==' '){
			start++;
		}
        while(end>=0&&s.charAt(end)==' '){
			end--;
		}
        return new int[]{start,end+1};
    }

    // Method to Build substring using charAt
    static String subString(String s,int start,int end){
        String r="";
        for(int i=start;i<end;i++){
			r+=s.charAt(i);
		}
        return r;
    }

    // Method to Compare two strings using charAt
    static boolean compare(String a,String b){
        if(a.length()!=b.length()){
			return false;
		}
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
				return false;
			}
		}
        return true;
    }
}
