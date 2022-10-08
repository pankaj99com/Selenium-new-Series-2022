package generalLogic;
public class JavaStringSplitPrg
{
	public static void main(String []args)
	{
		try
		{
			String str1="www.includehelp.com";
			

			String [] arrStr1;

			/*split string by delimiter ., to do this
			* you have to provide \\. */
			arrStr1 = str1.split("\\.");
			// print substrings
			for(int i=0;i< arrStr1.length; i++)
			{
				System.out.println(arrStr1[i]);
			}
			System.out.println(arrStr1.length);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}