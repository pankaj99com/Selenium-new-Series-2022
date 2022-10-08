package ReverseNumber;

public class ReverseString {

	public static void main(String[] args) {
		String a="pankaj is a good boy";
		int length=a.length();
		String rev="";
		for(int i=length-1;i>=0;i--){
			rev=rev+a.charAt(i);
		}
		System.out.print(rev);
		
		
		
		
		
		

	}

}
