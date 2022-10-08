package OOPSCONCEPT;

class Employee {
	int id;//attributes--variables--class var
	String name;
	int salary;

	public void printDetails() {
		System.out.println("My id is " + id);
		System.out.println("and my name is " + name);
		System.out.println("salary is " + salary);
	}

	public int getSalary() {
		return salary;

	}
	
}

public class MyClass {

	public static void main(String[] args) {
		System.out.println("This is my class");
		Employee e = new Employee();//default constructor written bt compiler/jvm
		Employee e1 = new Employee();
		e.id=20;
		e.salary=50000;
		System.out.println("ID is"+ e.id + "Salary is "+ e.salary);
		
	
	

	}

}
