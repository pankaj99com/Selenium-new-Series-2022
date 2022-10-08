package Rough;

public class Student1 {
	
	int rollno;
	String name;
	int marks;
	
	public void scorecard() {
		System.out.println("This is scorcard of student:");
	}
	public Student1(){
		
		System.out.println("this is default constructor");
		
	}
	public Student1(int rollno,String name){
		
		System.out.println("This is constructor of 2 args");
		this.name=name;
		this.rollno=rollno;
	}
	public Student1(int rollno,String name,int marks){
		this(101,"ravi");
		
		System.out.println("This is constructor of 3 args");
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
		
	}
	

	public static void main(String[] args) {
		Student1 s= new Student1(101,"pranjali");
		System.out.println(s.name);
		System.out.println(s.rollno);
		s.scorecard();
		Student1 s1= new Student1(102,"viswa",95);
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.marks);
		s1.scorecard();
		Student1 s2=new Student1();
		System.out.println(s2.name);
		System.out.println(s2.rollno);
		System.out.println(s2.marks);
		
	}

}
