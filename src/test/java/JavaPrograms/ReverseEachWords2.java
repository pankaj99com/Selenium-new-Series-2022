package JavaPrograms;

public class ReverseEachWords2 {

	public static void main(String[] args) {
		
		String str="India Java";
		String reverse="";
		String result="";
		String[] arr=str.split(" ");
		
		for(String word:arr) {
			int j=word.length()-1;
			while(j>=0) {
				char ch=word.charAt(j);
				reverse=reverse+ch;
				j--;
			}
		}
		System.out.println(reverse);
	}
		
}
