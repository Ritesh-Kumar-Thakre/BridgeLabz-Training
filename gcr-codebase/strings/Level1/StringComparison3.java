import java.util.*;
public class StringComparison3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.next();
        
		// Applying the required logic and printing the result
		Character arr1[]=userDefined(str);
		Character arr2[]=builtIn(str);
		compareArrays(arr1,arr2);
        sc.close();
    }

    // Method to return the characters in a string without using the toCharArray() 
    static Character[] userDefined(String str){
        Character arr[]= new Character[str.length()];
		int idx=0;
		for(char ch:str.toCharArray()){
			arr[idx]=ch;
			idx++;
		}
		return arr;
    }
	
	// Method to return the characters in a string with using the toCharArray() 
    static Character[] builtIn(String str){
        Character arr[]= new Character[str.length()];
		for(int i=0;i<str.length();i++){
			arr[i]=str.charAt(i);
		}
		return  arr;
    }
	
	// Method to compare both Arrays
	static void compareArrays(Character[] arr1, Character[] arr2) {
		if (arr1.length != arr2.length) {
			System.out.println("Both are not equal");
			return; 
		}
		for (int i = 0; i < arr1.length; i++) {
			if (!arr1[i].equals(arr2[i])) {
				System.out.println("Both are not equal");
				return; 
			} 		
		} 
		System.out.println("Both are equal"); 
	}
}
