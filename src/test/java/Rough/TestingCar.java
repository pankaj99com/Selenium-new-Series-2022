package Rough;

public class TestingCar {

	public static void main(String[] args) {
		
		Maruti m=new Maruti();
		m.start();//own method--->static polymorphism/compile time
		m.stop();//parent method
		m.safety();//own method
		m.refuel();//parent method
		m.engine();//gp method
		System.out.println("********************************************");
		
		Car c=new Car();//own method--->static polymorphism/compile time
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//c.safety();parent cannot access the property of child
		System.out.println("********************************************");
		
		Car c1 =new Maruti();
		
		c1.start();//runtime polymorphism
		c1.stop();
		c1.refuel();
		//c1.safety();parent cannot access the property of child
		c1.engine();
		
		Maruti m1=(Maruti) new Car();//illegal in java
		m1.start();
		

	}

}
