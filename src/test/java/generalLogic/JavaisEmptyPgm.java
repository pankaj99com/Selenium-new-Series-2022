package generalLogic;

public class JavaisEmptyPgm
{
	public static void main(String args[])
	{
		String str1="www.includehelp.com";
		String str2="";

		if(str1.isEmpty()==true)
		System.out.println("Str1 is an empty string.");
		else
		System.out.println("Str1 is not an empty string.");

		if(str2.isEmpty()==true)
			System.out.println("Str2 is an empty string.");
		else
			System.out.println("Str2 is not an empty string.");
	}
}