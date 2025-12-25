import java.util.*;
public class CharacterFrequencyWithUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[][] freqTable = findFrequency(text);
        System.out.println("\nCharacter\tFrequency");
        for(int i=0;i<freqTable.length;i++){
            System.out.println(freqTable[i][0]+"\t\t"+freqTable[i][1]);
        }
        sc.close();
    }

    // Method to find unique characters using nested loops + charAt()
    public static char[] uniqueCharacters(String text){
        char[] temp = new char[text.length()];
        int index = 0;
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            boolean isUnique = true;
            // check if character already appeared
            for(int j=0;j<i;j++){
                if(text.charAt(j)==ch){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                temp[index++] = ch;
            }
        }
        char[] unique = new char[index];
        for(int i=0;i<index;i++){
            unique[i] = temp[i];
        }
        return unique;
    }

    // Method to find frequency using ASCII bucket + unique chars
    public static String[][] findFrequency(String text){
        int[] freq = new int[256];
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            freq[ch]++;
        }
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for(int i=0;i<unique.length;i++){
            char ch = unique[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }
        return result;
    }
}
