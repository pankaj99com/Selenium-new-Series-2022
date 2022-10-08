package Rough;

public class TypesOfMethod {
	int a = 9;
//3 input parameter/args
	public int division(int x, int y) {
		System.out.println("division method");
		int res = x / y;
		//System.out.println(res);
		return res;
	}
	
	//type1:-no input -no output
	
	public void test() {
		System.out.println("test method");
	}
	
	//type2: -no input but some output
	
	public int multiply() {
		System.out.println("No input method--multiply");
		
		int a=5;
		int b=5;
		int c=a*b;
		System.out.println(c);
		return c;
	}

	
	public String getString(String str) {
		System.out.println("String method");
		String s=str;
		System.out.println(s);
		return s;
	}
	
	public static int getMarks(int m1,int m2) {
		System.out.println(" Static method to get marks");
		
		System.out.println(m1);
		System.out.println(m2);
		return m1&m2;
		
	}
	
	public static int getMarks(int m1) {
		System.out.println(" Static method to get marks");
		
		System.out.println(m1);
	
		return m1;
		
	}
	
	public static String getMarks(String m1) {
		System.out.println(" Static method to get marks");
		
		System.out.println(m1);
	
		return m1;
		
	}
	public static void main(String[] args) {
		TypesOfMethod obj=new  TypesOfMethod();
		System.out.println(obj.a);
		int d=obj.division(10, 5);
		System.out.println(d);
		obj.test();
		obj.multiply();
		obj.getString("Pankaj");
		TypesOfMethod.getMarks(10,90);
		TypesOfMethod.getMarks(100);
		TypesOfMethod.getMarks("100");
			}

}
