package Revision;

public class Javaconcepts {

	int ch = 'p';
	char ch1 = '~';

	static String str = "Hello World";

	static String str1 = "Hello World";

	String str2 = "Hello Pankaj";
	String str3 = "Hello Pankaj";

	static int a = 50;
	int b = 40;

	public void test() {
		System.out.println("This is a Test method");
		display();
	}

	public static void display() {
		System.out.println("Static print method");

	}

	public static void main(String[] args) {
		String str4 = new String("Hello Pankaj kumar");
		String str5 = "Helloo Pankaj kumar";
		int c = 40;
	    System.out.println(int.class);
		Integer d=90;
		System.out.println(c+d);
		Javaconcepts obj = new Javaconcepts();
		System.out.println(c);
		System.out.println(a);

		// display();
		obj.test();
		System.out.println(obj.ch);
		System.out.println((int) obj.ch1);
		System.out.println(obj.ch1);
		System.out.println(obj.str);

		System.out.println("*****************************");

		System.out.println(str.length());
		System.out.println(str.indexOf('p'));// -1

		System.out.println(str == str1);// false

		System.out.println(str.equals(str1));// true

		System.out.println(str.compareTo(str1));// 0

		System.out.println(obj.str2 == obj.str3);// false

		System.out.println(obj.str2.equals(obj.str3));// true

		System.out.println(obj.str2.compareTo(obj.str3));// 0

		System.out.println(str4 == str5);// false

		System.out.println(str4.equals(str5));// true

		System.out.println(str4.compareTo(str5));// 0
		
		System.out.println(str4.substring(1));//it will print part of string
		
		System.out.println(str4.valueOf(str5));
		System.out.println(c+d);
		System.out.println(str4+c+d);
		System.out.println(str4+(c+d));//
		System.out.println(c+d+str4+str5);
		String arr[]=str4.split(" ");
		
		System.out.println(arr.length);
		String rev="";
		for(int i=0;i<str4.length();i++) {
			
			rev=str4.charAt(i)+rev;
			System.out.println(rev);
		}
		System.out.println(rev);
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
String str6[][]=new String[2][5];
str6[0][0]="pank";
str6[0][1]="Anand";
str6[0][2]="Abhi";
str6[0][3]="NO DATA";
str6[0][4]="pran";
str6[1][0]="Vishwa";
str6[1][1]="Sandy";
str6[1][2]="Abhi";
str6[1][3]="NO DATA";
str6[1][4]="Anuj";

System.out.println(str6.length);//to find no.of rows

System.out.println(str6[1].length);//no of cols

for(int i=0;i<str6.length;i++) {
	
	
	for(int j=0;j<str6[1].length;j++) {
		
		
		System.out.print(str6[i][j]+" || ");//0,0 -->pank
	}
	
	System.out.println();
}
	}

}
