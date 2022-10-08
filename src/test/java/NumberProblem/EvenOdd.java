package NumberProblem;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int n=0;
		
		n=number;
		
		if(n%2!=0) {
			System.out.println("odd");
		}else {
			System.out.println("Even");
		}

	}

}
