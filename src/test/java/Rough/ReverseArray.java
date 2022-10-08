package Rough;

public class ReverseArray {

	public static void main(String[] args) {
		String[] str = new String[] { "java", "c++", "selenium", "python" };

		// str=str+" ";
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			String rev = "";
			String w = "";
			s = s + "";
			for (int j = 0; j< s.length(); j++) {
				char c = s.charAt(j);
				w = w + c;
				rev = w + rev;
				
				w = "";
			}
			System.out.print(rev+" ");
		

		}

	}

}
