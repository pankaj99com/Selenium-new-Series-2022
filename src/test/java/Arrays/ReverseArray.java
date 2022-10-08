package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		String[] str = new String[] { "java", "c++", "selenium", "python" };

		// str=str+" ";
		System.out.println("Original Array:");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
		System.out.println("After reversing each world in an Array");
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			//System.out.print(s+" ");
			String rev = "";
			String w = "";
			
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				w = w + c;
				//System.out.println("w is"+w);
				rev = w + rev;//avaj

				w = "";
				
			}

			System.out.print(rev + " ");

		}

	}

}
