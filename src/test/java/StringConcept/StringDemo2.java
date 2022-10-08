package StringConcept;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s1=new String("My name is Pankaj");
		String s2=new String("My name is Pankaj");
		System.out.println(s2.equals(s1));
		
		System.out.println(s1==s2);//false answered
		
		String s3="My name is Pankaj";
		String s4= "My name is Pankaj";
		System.out.println(s1==s4);//false
		System.out.println(s1==s3);//false
		System.out.println(s3==s4);

		String s5="My name is "+"Pankaj";//scp
		System.out.println(s3==s5);//true
		
		String s6="My name is ";
		String s7=s6+"Pankaj";//heap
		System.out.println(s3==s7);
		System.out.println(s5==s7);
		
		final String s8="My name is ";
		String s9=s8+"Pankaj";//inside SCP
		
		System.out.println(s3==s9);
		System.out.println(s6==s8);
		StringBuffer sb= new StringBuffer("Pankaj");//mutable or changeable in nature
				sb.append("Pankaj");
				sb.append("Sandy");
				System.out.println(sb);
				System.out.println(sb.capacity());//5+16=22
				
		String str= new String(sb);
		
		System.out.println(str);
		
		String str1=new String("abcdefghijklmnopq");//(cc+1)*2=34 
	
		
		StringBuffer sb1= new StringBuffer("Pankaj");//cc+length of string
		StringBuffer sb2= new StringBuffer("Pankaj");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(100);
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		
		sb1.reverse();
	
	}

}
