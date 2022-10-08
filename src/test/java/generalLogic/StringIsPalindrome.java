package generalLogic;
import java.util.Scanner;
public class StringIsPalindrome {


	/**
	 * Easiest way to check Given String is Palindrome String or not
	 * @author includehelp
	 */
	
	    
	    static boolean isPalindromString(String inputStr){
	        StringBuilder sb  = new StringBuilder(inputStr);
	        String reverseStr = sb.reverse().toString();
	 
	        return (inputStr.equalsIgnoreCase(reverseStr));              
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter String : ");
	        String inString = sc.next();
	        
	        if(isPalindromString(inString)){
	            System.out.println(inString +" is a Palindrom String");
	        }
	        else{
	            System.out.println(inString +" is not a Palindrom String");
	        }
	    }
}