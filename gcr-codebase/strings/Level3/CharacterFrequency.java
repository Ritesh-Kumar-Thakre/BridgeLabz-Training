import java.util.*;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);
        System.out.println("\nCharacter\tFrequency");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"\t\t"+result[i][1]);
        }
        sc.close();
    }

    // Method to find frequency of characters using charAt()
    public static String[][] findFrequency(String text){
        int[] freq = new int[256];
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            freq[ch]++;
        }
        int uniqueCount = 0;
        for(int i=0;i<256;i++){
            if(freq[i]>0)
                uniqueCount++;
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        // Store char + frequency in 2D array
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(freq[ch]>0){ // store only once
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;// reset to avoid duplicates
                index++;
            }
        }
        return result;
    }
}
