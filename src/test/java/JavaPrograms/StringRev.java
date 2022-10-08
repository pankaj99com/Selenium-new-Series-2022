package JavaPrograms;

public class StringRev {

	public static void main(String[] args) {
		String str = "i love cricket";

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		rev="";
System.out.println("Reversing only the string");
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.println(rev);
	}
}