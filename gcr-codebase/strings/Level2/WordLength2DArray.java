import java.util.*;
public class WordLength2DArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=sc.nextLine();

        // Applying required logic
        String[] words=splitWithoutSplit(text);
        String[][] result=wordWithLength(words);

        // Printing the result
        System.out.println("Word\tLength");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"\t"+Integer.parseInt(result[i][1]));
        }
        sc.close();
    }

    // Method to split text into words without using split()
    static String[] splitWithoutSplit(String text){
        int count=1;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ') count++;
        }
        String[] words=new String[count];
        int index=0,start=0;
        for(int i=0;i<=text.length();i++){
            if(i==text.length()||text.charAt(i)==' '){
                words[index++]=text.substring(start,i);
                start=i+1;
            }
        }
        return words;
    }

    // Method to find length without using length()
    static int findLength(String word){
        int count=0;
        try{
            while(true){
                word.charAt(count);
                count++;
            }
        }catch(Exception e){}
        return count;
    }

    // Method to return 2D array of word and its length
    static String[][] wordWithLength(String[] words){
        String[][] arr=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            arr[i][0]=words[i];
            arr[i][1]=String.valueOf(findLength(words[i]));
        }
        return arr;
    }
}
