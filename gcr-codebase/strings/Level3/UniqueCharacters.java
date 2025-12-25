import java.util.*;
public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        int len = findLength(text);
        char[] unique = findUniqueCharacters(text, len);
        System.out.println("Unique characters are:");
        for(int i=0;i<unique.length;i++){
            System.out.print(unique[i]+" ");
        }
        sc.close();
    }

    // Method to find length without using length()
    public static int findLength(String text){
        int count=0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text,int len){
        char[] unique = new char[len];
        int index=0;
        for(int i=0;i<len;i++){
            char ch = text.charAt(i);
            boolean isUnique = true;
            // check in previous characters
            for(int j=0;j<i;j++){
                if(text.charAt(j)==ch){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                unique[index++]=ch;
            }
        }

        // create trimmed array of actual unique characters
        char[] result = new char[index];
        for(int i=0;i<index;i++){
            result[i]=unique[i];
        }
        return result;
    }
}
