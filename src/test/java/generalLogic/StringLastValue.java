package generalLogic;

import java.util.Scanner;

public class StringLastValue 
{
	public static void main(String[] arg)
	{
		// create object of string and scanner class.
		String S;
		Scanner SC=new Scanner(System.in);

		// enter the string.
		System.out.print("Enter the string : ");
		S=SC.nextLine();
		int index = 0;      

		// enter the element for last occurence.
		index = S.lastIndexOf('j');         

		System.out.println("Last index is : " +index);
	}
}