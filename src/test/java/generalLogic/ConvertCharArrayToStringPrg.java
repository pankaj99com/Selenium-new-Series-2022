package generalLogic;

import java.lang.*;

public class ConvertCharArrayToStringPrg
{
	public static void main(String []args)
	{
		// declare String object
		String str="";     
		// declare character array
		char [] chrArr= new char[]{'H','e','l','l','o'};
		//System.out.println("Converting to string "+chrArr.toString());

		 // convert char array to string
		str= new String(chrArr);  

		//print string
		System.out.println("str : "+str);
	}
}