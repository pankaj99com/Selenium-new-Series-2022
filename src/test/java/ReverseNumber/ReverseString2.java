package ReverseNumber;

public class ReverseString2 {
static String temp="";
	public static void main(String[] args) {
		String a="pankaj";
		int length=a.length();
		System.out.println(length);
		for(int i=length-1;i>=0;i--)
		
		{
			temp=temp+a.charAt(i);
			
			
			
		}
		System.out.print(temp);
	}

}
