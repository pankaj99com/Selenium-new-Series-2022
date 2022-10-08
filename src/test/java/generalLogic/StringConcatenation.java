package generalLogic;

import java.util.Scanner;

public class StringConcatenation 
{
	public static void main(String args[])
	{   // creating object of the string s1,s2.
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		// enter both the string one by one.
		System.out.print("Enter First String : ");
		s1=sc.nextLine();
		 
		System.out.print("Enter Second String : ");
		s2=sc.nextLine();
		
		// here we print the whole string after concatenation.
		System.out.println("String After Concatenation : " +s1.concat(s2));
	}
}