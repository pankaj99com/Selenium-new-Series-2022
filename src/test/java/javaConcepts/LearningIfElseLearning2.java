package javaConcepts;

public class LearningIfElseLearning2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c=30;
		System.out.println(a > b);// true
		System.out.println(a==b);//false
		if(a>b && a>c) {
			System.out.println("a is largest");
		} else if(b>a && b>c){
			
			System.out.println("b is largest");
			
		} else {
			
			System.out.println("C is largest");
		}

	}
}
