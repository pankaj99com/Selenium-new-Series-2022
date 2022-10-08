package generalLogic;


public class JavaStringReplacePrg
{
	public static void main(String args[])
	{
		//string 1
		String str1="www.includehelp.com";
		//string 2
		String str2="Hello World!";

		//printing strings before replacing
		System.out.println("\nStrings before replacing:");
		System.out.println("str1: "+str1 +"\nstr2:" + str2);
		
		//replacing string str1 with str2
		str1=str1.replace(str1, str2);

		//printing strings after replacing
		System.out.println("\nStrings after replacing:");
		System.out.println("str1: "+str1 +"\nstr2:" + str2);
	}
}