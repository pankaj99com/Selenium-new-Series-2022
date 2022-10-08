package StringConcept;

public class StringTest2 {

	public static void main(String[] args) {
		String str = new String("Pankaj");// 2 object created 1 in heap and
											// another one in String constant
											// pool for future use.
		String s = "Pankaj";// since object is present in SCP same object will
							// be utilized and no new object will be created.
		str.concat("kumar");// one object will be created in SCP and another new
							// object i.e pankajkumar will be created in heap
							// area and since no variable is storing this object
							// automatically this object will be eligible for GC
		String s1=s.concat("kumar");
		System.out.println(s1);
		String s2 = "kumar";// no object will be created since same object is present in SCP
		System.out.println(s2);

	}

}
