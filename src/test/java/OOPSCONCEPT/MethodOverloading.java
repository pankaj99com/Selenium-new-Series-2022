package OOPSCONCEPT;

public class MethodOverloading {
	
	public void sum() {
		
		System.out.println("Sum method with zero input paramters");
		sum(10);
	}

	public void sum(int a) {
		
		System.out.println("Sum method with single input parameters");
		
		sum(10,20,30);
	}
	public void sum(int a,int b) {
		
		int sum=a+b;
		System.out.println("Sum method with 2 input parameters"+sum);
		
		
	}
	
	public void sum(int a,int b,int c) {
		
		int sum=a+b+c;
		System.out.println("Sum method with 2 input parameters"+sum);
		
		
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading obj= new MethodOverloading();
		obj.sum();

		

	}

}
