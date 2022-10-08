package Rough;

public class TestShapes extends shapes{
	@Override
public void square() {
	System.out.println(" This is square method in Testshapes");
}
	
	public void display() {
		System.out.println("This is display method in Testshapes");
	}
	
	
	public void circle() {
		System.out.println("This in circle method in TestShapes");
	}
	public static void main(String[] args) {
		//shapes s =new shapes();
		TestShapes t= new TestShapes();
		shapes s1 =new TestShapes();//dynamic polymorphism
		s1.color="red";
		System.out.println(s1.color);
	
		s1.display();//runtime mein child ko call karega
		s1.square();//runtime mein child ko call karega
		t.display();
		t.square();
		t.circle();
	}

}
