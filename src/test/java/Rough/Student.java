package Rough;

public class Student {
	
	int rollno;
	String name;
	
	public void scorecard() {
		System.out.println("This is scorcard of student:");
	}

	public static void main(String[] args) {
		Student s= new Student();
		System.out.println(s.name);
		System.out.println(s.rollno);
		s.scorecard();
		Student s1= new Student();
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		s1.scorecard();
	}

}
