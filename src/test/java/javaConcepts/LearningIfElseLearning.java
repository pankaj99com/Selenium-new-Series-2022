package javaConcepts;

public class LearningIfElseLearning {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c;
		System.out.println(a > b);// true
		System.out.println(a==b);//false

		if (a > b) {
			
			c=a-b;

			System.out.println("a is greater than b");
			System.out.println(c);
			
		} else {
			
			c=a+b;
			System.out.println("a is smaller than b");
			System.out.println(c);
		}
		if (a == b) {
			c=a*b;
			System.out.println("a and b both are equal");
			System.out.println(c);
		} else {
			c=a/b;
			System.out.println("a and b are not equal");
			System.out.println(c);
		}

	}

}
