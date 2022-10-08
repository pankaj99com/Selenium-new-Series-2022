package OOPSCONCEPT;

public class Car {
	
	static String color="Red";//static variables:-Heap memory
	int model;//non-static variables:-Stack area of memory
	int wheels;
	String price;
	
	public Car(int model,int wheels,String price){
		this(10,78);
		this.model=model;
		this.wheels=wheels;
		this.price=price;
	
		System.out.println("my constructor1");
		System.out.println("Model is "+ model+" wheels are "+wheels+"and price is"+ price);
	}
	
	public Car(int model,int wheels){
		this(90);
		this.model=model;
		this.wheels=wheels;
		
	
		System.out.println("my constructor2");
		System.out.println("Model is "+ model+" wheels are "+wheels);
	}
	public Car(int model){
		
		this.model=model;
		
		
	
		System.out.println("my constructor3");
		System.out.println("Model is "+ model);
	}

	public static void main(String[] args) {
		
		System.out.println(Car.color);//Classname.variablename--for static
		
		Car c=new Car(2021,4,"1LAKHS");
		
		
//		System.out.println(c.model);
//		System.out.println(c.price);
//		
		
		
		
		

	}

}
