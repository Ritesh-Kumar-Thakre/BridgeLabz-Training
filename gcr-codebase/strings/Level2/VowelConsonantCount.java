import java.util.*;
public class VowelConsonantCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.nextLine();
		
		// Applying the required logic and Printing the results
        int[] res=countVC(text);
        System.out.println("Vowels: "+res[0]);
        System.out.println("Consonants: "+res[1]);
        sc.close();
    }

    // Method to Count vowels & consonants
    static int[] countVC(String s){
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
				ch=(char)(ch+32);
			}
            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
					v++;
				}else c++;
            }
        }
        return new int[]{v,c};
    }
}
