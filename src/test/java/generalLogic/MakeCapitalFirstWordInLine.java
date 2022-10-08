package generalLogic;

import java.util.Scanner;

public class MakeCapitalFirstWordInLine 
{
	public static void main(String[] args)
	{
		// create object of scanner class.
		Scanner in = new Scanner(System.in);

		// enter sentence here
		System.out.print("Enter sentence here : ");
		String line = in.nextLine();
		String upper_case_line = ""; 

		// this is for the new line which is generated after conversion.
		Scanner lineScan = new Scanner(line); 
		while(lineScan.hasNext())
		{
			String word = lineScan.next(); 
			upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
		}

		// print original line with output.
		System.out.println("Original sentence is : " +line); 
		System.out.println("Sentence after convert : " +upper_case_line.trim()); 
	}
}
