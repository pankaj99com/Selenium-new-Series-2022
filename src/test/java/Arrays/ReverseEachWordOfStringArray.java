package Arrays;

public class ReverseEachWordOfStringArray {

	public static void main(String[] args) {
		int a[]= {2,3,4,4,4};
		String[] str=new String[] {"java","TestNg","Selenium","Jenkins","Cucumber","Postman"};
		
		String[] str1=new String[str.length];
		
		System.out.println("Elements of Array");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		for(int j=0;j<str.length;j++) {
			String s=str[j];//java
			String w="";
			String rev="";
			
			for(int k=0;k<s.length();k++) {
				
				char c=s.charAt(k);//j
				w=w+c;//java
				
				rev=c+rev;//avaj 
				
				w="";
				
			}
			
			System.out.print(rev+" ");
			
		}
	}

}
