package generalLogic;

public class JavaStringStartsWithPrg{
	public static void main(String args[])
	{
		String str="www.includehelp.com";

		if(str.startsWith("www")==true)
			System.out.println("String starts with www");
		else
			System.out.println("String does not start with www");
	}
}