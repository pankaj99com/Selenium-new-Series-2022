package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class AnaGram {

	public static void main(String[] args) {
		
		AnaGram obj=new AnaGram();
		System.out.println(obj.CheckAnaGram("Mon day","nomday"));
	

	}
	
	public boolean CheckAnaGram(String s1,String s2) {
		if(s1.contains(" ")) {
			System.out.println(s1+ ": There is extra spaces in the string and we will remove it before processing");
			
		}
		if(s2.contains(" ")) {
			System.out.println(s2+ ":There is extra spaces in the string and we will remove it before processing");
	
		}
		String str1=s1.replaceAll("\\s","");
		String str2=s2.replaceAll("\\s","");
		if(str1.length()==str2.length()) {
			char ch1[]=str1.toLowerCase().toCharArray();
			char ch2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean result=Arrays.equals(ch1,ch2);
			System.out.println("Both String are Anagrams!!!");
			return result;
		}
		
		System.out.println("Not Anagrams!!");
		return false;
		
		
		

}
}