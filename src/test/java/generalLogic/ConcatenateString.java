package generalLogic;

import java.util.Scanner;

class ConcatenateString{
	public static void main(String[] args){
		/* create Scanner class object */
		Scanner sc = new Scanner(System.in);
		
		/* Display message for user to take first 
		string input from keyboard */
		System.out.println("Enter First String :");
		String firstStr = sc.next();
		
		/* Display message for user to take first 
		string input from keyboard */
		System.out.println("Enter Second String :");
		String secondStr = sc.next();
		
		/* Display message for displaying result */
		System.out.println("Result after concatenation:");
		
		/* '+' operator concatenate string */
		System.out.println(firstStr+ " " + secondStr);
	}
}