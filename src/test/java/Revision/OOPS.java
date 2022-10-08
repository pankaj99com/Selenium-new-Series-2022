package Revision;

public class OOPS {

	static String color="orange";//static variable is loade first
	
	int model;
	int wheels;//non static variables
	String mode;
	

	static public  void main(String...pankaj) {//then main
		System.out.println(OOPS.color);
		OOPS obj=new OOPS();
		System.out.println(obj.wheels);//0
		System.out.println(obj.model);//0
		System.out.println(obj.mode);//null
		obj.model=89;
		obj.wheels=4;
		obj.mode="Automatic";
		System.out.println(obj.wheels);
		System.out.println(obj.model);
		System.out.println(obj.mode);
		OOPS obj1=new OOPS();
		obj1.model=92;
		obj1.wheels=4;
		obj1.mode="Dual";
		System.out.println(obj1.wheels);
		System.out.println(obj1.model);
		System.out.println(obj1.mode);
		
		
	}

}
