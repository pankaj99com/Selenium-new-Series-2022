package JavaPrograms;

public class ReverseString4 {

	public static void main(String[] args) {
		String str = "hello";
		String rev="";
		System.out.println("*********Easy way******************");
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			rev=c+rev;
			
		}
		System.out.println(rev);
	}

}
