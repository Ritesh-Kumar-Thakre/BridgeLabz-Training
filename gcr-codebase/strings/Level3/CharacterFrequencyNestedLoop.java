import java.util.*;
public class CharacterFrequencyNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] result = findFrequency(text);
        System.out.println("\nCharacter  Frequency");
        for(int i=0;i<result.length;i++){
            if(result[i]!=null)
                System.out.println(result[i]);
        }
        sc.close();
    }

    // Method to find frequency using nested loops + marking duplicates
    public static String[] findFrequency(String text){
        char[] chars = text.toCharArray();
        int[] freq = new int[text.length()];
        for(int i=0;i<chars.length;i++){
            freq[i] = 1;
            for(int j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j] && chars[i] != '0'){
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        // create result array (char + frequency)
        String[] result = new String[text.length()];
        for(int i=0;i<chars.length;i++){
            if(chars[i] != '0'){// skip duplicates
                result[i] = chars[i] + " -> " + freq[i];
            }
        }
        return result;
    }
}
