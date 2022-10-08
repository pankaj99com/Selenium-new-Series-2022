package StringConcept;

public class StringDemo1 {
	
	

	public static void main(String[] args) {
		
		String str="Pranjali";//String constant pool(SCP) and one object will be created inside SCP
		
		String str1="Pranjali";//no object will be created and same object from the SCP area will be utilized internally
		
		String str3="Pranjali";//no object will be created
		String str4="Pranjali";
		str4.concat("Pandrekar");//Pandrekar will be created under SCP and PranjaliPandrekar will be created in Heap area;
		//Since no variable is holding it will be applicable for GC.
		String str5=str4.concat("Pandrekar");//PranjaliPandrekar will be created in heap area
		System.out.println(str5);
		
		String str6="Pranjali"+new String("Pranjali");
		System.out.println(str6);
		
		String str7="Pranjali"+new String("PP");
		System.out.println(str7);
		String str8="PP";
		System.out.println(str6.intern());
		
		//String str2=new String("Pranjali");
		
		System.out.println("*********************************");
		

	    System.out.println(str==str1); // both references are ponting to same object
	    
	   // System.out.println(str6==str7);//pointing tio difference object
	    
		System.out.println("*********************************");
//		String s1=new String("Sandeep");//1 in heap and 1 in SCP
//		
//		String s2=new String("Sandeep");//
//		s1=s2;
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
	    String str11="Pankaj";
		
		String s1=new String("Pankaj");//1 in heap   and 1 in SCP  but s1 pointing to heap object
		s1.concat("kumar");//kumar will be added to SCP and one new object "Pankajkumar" will be created and Eligible for GC
		s1.concat("Bangalore");//Bangalore will be added to SCP and one new object will be created with name "PankajBangalore" and eligible for GC
		
		String s2=s1.concat("Whitefield");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3=s2.intern();
		System.out.println(s3);
		
		
		String str9= new String("Pank");
		 System.out.println(str9.toString());
		 
		 char[] ch= { 'P','a','n','k'};
		String str10= new String(ch);
		System.out.println(ch);
	    String str12=new String("Pank");
	    System.out.println(str10==str12);
	    str10=str12;
	    System.out.println(str10==str12);
	    System.out.println(str10.equals(str12));
	    
	    String str13=str10.toUpperCase();
	    System.out.println(str13);
		
		

	}

}
