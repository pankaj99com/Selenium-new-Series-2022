package StringConcept;

public class StringTest1 {

	public static void main(String[] args) {
		String str = new String("Pankaj");
		String str1 = new String("Pankaj");
		System.out.println("****************String***************************************");
		System.out.println(str == str1);// Always used for reference comparison
		str = str1;// Now both object pointing to same object

		System.out.println(str == str1);
		System.out.println(str.equals(str1));// Always used for content
												// comparison in the String
												// class but in the Object class
												// .equals method is used for
												// address comparison

		System.out.println("****************String buffer********************************");
		StringBuffer sb = new StringBuffer("Pankaj");
		StringBuffer sb1 = new StringBuffer("Pankaj");
		// In case of String buffer equals method is not meant for content
		// comparison
		// No overridden method is present in String buffer so Object class
		// method will be called and its property is to do address comparison.
		System.out.println(sb == sb1);
		System.out.println(sb.equals(sb1));
		System.out.println(sb.getClass().getName());
		System.out.println(str.getClass().getName());

	}

}
