package generalLogic;


import java.util.Arrays;
import java.util.Scanner;

/**
 * program to check given strings are Anagram or not
 */
public class AnagramString {
    
    /**
     * Method to check two strings are anagram string or not
     * @param str1
     * @param str2
     * @return 
     */
    static boolean isAnagrams(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] strArray1 = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();
                
        Arrays.sort(strArray1);
        System.out.println(strArray1);
        Arrays.sort(strArray2);
        System.out.println(strArray2);
       
        String sortedStr1 = new String(strArray1);
        String sortedStr2 = new String(strArray2);
       
        if(sortedStr1.equals(sortedStr2)){
            return true;
        }
        else{
            return false;
        } 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1 : ");
        String str1 = sc.next();
        System.out.println("Enter String2 : ");
        String str2 = sc.next();
        
        
        if(isAnagrams(str1,str2)){
            System.out.println("Anagram Strings !!");
        }
        else{
            System.out.println("Strings are not Anagram !!");
        }
    }
}