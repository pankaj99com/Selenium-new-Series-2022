package generalLogic;

import java.util.*;

class getSubstring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str="";
		
		int startIndex,endIndex;

		//input string 
		System.out.print("Enter the string: ");
		str=sc.next();
		
		//input start index and end index
		System.out.print("Enter start index: ");
		startIndex=sc.nextInt();
		System.out.print("Enter end index: ");
		endIndex=sc.nextInt();

		/*get string from startIndex to endIndex*/
		String temp;
		temp= str.substring(startIndex, endIndex);
		//printing substring
		System.out.println("Substring is: "+temp);
	}
}