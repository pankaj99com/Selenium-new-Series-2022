package Factorial;

public class FactorialDemo {

	public static void main(String[] args) {
		FactorialDemo.factorial(5);

	}

	public static void factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.print("Factorial of " + num + " is " + fact);

	}
}