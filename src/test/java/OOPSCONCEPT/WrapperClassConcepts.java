package OOPSCONCEPT;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		String x="1000";
		System.out.println(x+500);//1000500
		
		int i=Integer.parseInt(x);//classname.methodname
		System.out.println(i+500);
		
		String y="12.12";
		double d=Double.parseDouble(y);
		System.out.println(d+12.12);
		
		String z="true";
		boolean b=Boolean.parseBoolean(z);
		System.out.println(b);
		
		int k=55;
		String str=String.valueOf(k);
		System.out.println(str+55);
		
		String str1="100$";
		System.out.println(str1+10);
	
	    String ss=str1.substring(0,3);
	    System.out.println(ss+10);
	    int h=Integer.parseInt(ss);
	    System.out.println(h+80);
	
	}

}
