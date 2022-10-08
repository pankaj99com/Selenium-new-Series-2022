package OOPSCONCEPT;

public class MethodOverloadingTest {

	public static void main(String[] args) {

		System.out.println("pankaj");
		main(10, 20);
	}

	public static void main(int a, int b) {
		System.out.println("My second main");
		main(10);
	}

	public static void main(int a) {
		System.out.println("My 3rd main");
	}
}
