import java.util.*;
public class VowelConsonantTable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.nextLine();
		
		// Applying the required logic and Printing the results
        String[][] table=buildTable(text);
        display(table);
        sc.close();
    }

    // Method to Build 2D table of character & type
    static String[][] buildTable(String s){
        String[][] arr=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[i][0]=String.valueOf(ch);
            arr[i][1]=check(ch);
        }
        return arr;
    }

    // Method to Identify character type
    static String check(char ch){
        if(ch>='A'&&ch<='Z'){
			ch=(char)(ch+32);
		
		}
        if(ch<'a'||ch>'z') {
			return "Not a Letter";
		}
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return "Vowel";
		}
        return "Consonant";
    }

	// Method to display results
    static void display(String[][] a){
        System.out.println("Char\tType");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i][0]+"\t"+a[i][1]);
		}
    }
}
