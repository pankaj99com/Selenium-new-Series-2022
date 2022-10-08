package sessions2022;

public class StringManipulations {

	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		
		
		String str= "Hellopankpaj";//non primitive datatype and its a seperate class in java
		
		String str1="HelloPANKAJ";
		int len=str.length();

		System.out.println(len);//12
		
		System.out.println(str.charAt(4));//o
		
		System.out.println(str.substring(4, 8));//opan
		
		System.out.println(str.substring(5));
		
		System.out.println(str.compareTo(str1));
		
		System.out.println(str.contains("pankaj"));
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(String.valueOf(str));
		
		System.out.println(str.toString());
		
		System.out.println(str.indexOf('p'));
		
		System.out.println(str.lastIndexOf('p'));
		
		System.out.println(a+b);//50
		
		System.out.println(str+str1);//HellopankpajHelloPANKAJ
		
		System.out.println(a+b+str+str1);//50HellopankpajHelloPANKAJ
		
		System.out.println(str+str1+a+b);//HellopankpajHelloPANKAJ3020
		
		System.out.println(str+str1+(a+b));//HellopankpajHelloPANKAJ50
		
		System.out.println(a+b+ str+ str1+ a+b );//50HellopankpajHelloPANKAJ3020
		
		System.out.println(str.startsWith("Pankaj"));
		System.out.println(str1.toLowerCase());
		
	    System.out.println(str1);
	    
	   String str3="Tutorial by Pankaj";
	   
	  String str4= str3.replace(" ", "_");
	  System.out.println(str4);
	    
		
		
		
		

	}

}
