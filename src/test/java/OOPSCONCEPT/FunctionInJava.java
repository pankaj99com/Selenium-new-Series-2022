package OOPSCONCEPT;

public class FunctionInJava {
	
	public static int add(int x,int y) {//1.takes ars and return type
		System.out.println("Int add method");
		int result=x+y;
		System.out.println(result);
		return result;
		
	}
	
	public static long add(long x,long y) {//1.takes ars and return type
		System.out.println(" long add method");
		long result=x+y;
		System.out.println(result);
		return result;
		
	}
	
	public void display() {//2.no args and no return type
		
		System.out.println("Welcome to java sessions");
	}
	 
	public int compute() {//3.no input some output
		
		System.out.println("Compute method");
		
		int a=100;
		int b=20;
		int c=30;
		int result=a*b*c;
		System.out.println(result);
		return result;
	}
	
	public String test() {//no input some output
		System.out.println("test method");
		
		String str="Hello";
		System.out.println(str);
		return str;
		
	}

	public static void main(String[] args) {
		
		FunctionInJava obj=new FunctionInJava();
		FunctionInJava.add(2147483647,344344334);
		obj.compute();
		obj.display();
		obj.test();	   
	}

}
