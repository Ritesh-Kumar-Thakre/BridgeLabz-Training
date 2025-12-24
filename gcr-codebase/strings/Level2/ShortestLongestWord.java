import java.util.*;
public class ShortestLongestWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.nextLine();

		// Applying the required logic
        String[] words=splitText(text);
        int[] idx=findShortestLongest(words);

		// Printing the results
        System.out.println("Shortest word: "+words[idx[0]]);
        System.out.println("Longest word: "+words[idx[1]]);
        sc.close();
    }

    // Method to Split text without using split()
    static String[] splitText(String text){
        int count=1;
        for(int i=0;i<text.length();i++)
            if(text.charAt(i)==' '){
				count++;
			}
        String[] arr=new String[count];
        int k=0,start=0;
        for(int i=0;i<=text.length();i++){
            if(i==text.length()||text.charAt(i)==' '){
                arr[k++]=text.substring(start,i);
                start=i+1;
            }
        }
        return arr;
    }

    // Method to Find shortest & longest indexes
    static int[] findShortestLongest(String[] words){
        int min=0,max=0;
        for(int i=1;i<words.length;i++){
            if(words[i].length()<words[min].length()){
				min=i;
			}
            if(words[i].length()>words[max].length()){
				max=i;
			}
        }
        return new int[]{min,max};
    }
}
