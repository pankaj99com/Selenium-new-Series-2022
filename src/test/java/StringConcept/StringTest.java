package StringConcept;

public class StringTest {

	public static void main(String[] args) {
		String str=new String("Pankaj");
		str.concat("Kumar");//new object is created and since we are not assigning it to any variable it will be automatically will be eligible for GC.
		System.out.println(str);//String is immutable
		
		
		StringBuffer sb=new StringBuffer("Pankaj");
		sb.append("Kumar");
		System.out.println(sb);//String buffer is mutable
		
		
		
	}

}
